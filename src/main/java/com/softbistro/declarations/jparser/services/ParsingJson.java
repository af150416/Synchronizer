package com.softbistro.declarations.jparser.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softbistro.declarations.jparser.component.entity.Declaration;
import com.softbistro.declarations.jparser.component.service.JparserDao;

/**
 * Class for parsing json declaration API
 * 
 * @author zviproject
 *
 */
@Service
public class ParsingJson {
	@Autowired
	private JparserDao jparserDao;

	private static final String PATH_FOR_READING_DECLARATION = "https://public-api.nazk.gov.ua/v1/declaration/";

	private static final String LINE_FOR_CHECKING_STEP_ON_EMPTY_VALUE = "{\"empty\":\"У суб'єкта декларування відсутні об'єкти для декларування в цьому розділі.\"}";

	private Collection<Declaration> collectionGetingDeclaration;

	/**
	 * Geting information for
	 */
	public void getingInformationFromDeclaration(List<String> collectionId) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);

		collectionGetingDeclaration = new ArrayList<>();

		for (int numberOfIdDeclaration = 0; numberOfIdDeclaration < collectionId.size(); numberOfIdDeclaration++) {

			String pathForDeclaration = PATH_FOR_READING_DECLARATION + collectionId.get(numberOfIdDeclaration);
			System.out.println(collectionId.get(numberOfIdDeclaration));

			try {
				URL url = new URL(pathForDeclaration);
				HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

				JSONObject json = readJsonFromUrl(pathForDeclaration);

				for (int i = 2; i < 13; i++) {
					if (json.getJSONObject("data").get(String.format("step_%d", i)).toString()
							.equals(LINE_FOR_CHECKING_STEP_ON_EMPTY_VALUE)
							|| (json.getJSONObject("data").get(String.format("step_%d", i)).toString().equals("[]"))) {

						json.getJSONObject("data").remove(String.format("step_%d", i));
					}
				}

				Declaration declaration = mapper.readValue(json.toString(), Declaration.class);

				collectionGetingDeclaration.add(declaration);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("============================================================>"
				+ collectionGetingDeclaration.size() + "\n\n");

	}

	private static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

}
