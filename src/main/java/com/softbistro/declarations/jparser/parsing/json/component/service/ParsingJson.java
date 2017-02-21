package com.softbistro.declarations.jparser.parsing.json.component.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.JparserDao;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.service.officialaddress.components.service.RuleFindRegisteredAddress;

/**
 * Class for parsing json declaration API
 * 
 * @author zviproject
 *
 */
@Service
public class ParsingJson {
	private static final String PATH_FOR_GETTING_REGION = "body > div:nth-child(3) > fieldset > div:nth-child(4) > div:nth-child(1)";

	private static final String PATH_FOR_READING_DECLARATION = "https://public-api.nazk.gov.ua/v1/declaration/";

	private static final String LINE_FOR_CHECKING_STEP_ON_EMPTY_VALUE = "{\"empty\":\"У суб'єкта декларування відсутні об'єкти для декларування в цьому розділі.\"}";

	private static Logger log = Logger.getLogger(JparserDao.class.getName());

	private ArrayList<Declaration> collectionGetingDeclaration;

	/**
	 * Geting information from response URL
	 */
	public List<Declaration> getingInformationFromDeclaration(List<String> collectionId) {
		long startTime = System.currentTimeMillis();

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		collectionGetingDeclaration = new ArrayList<>();
		RuleFindRegisteredAddress ruleFindRegisteredAddress = new RuleFindRegisteredAddress();
		for (int numberPageOfIdDeclaration = 0; numberPageOfIdDeclaration < collectionId
				.size(); numberPageOfIdDeclaration++) {

			String pathForDeclaration = PATH_FOR_READING_DECLARATION + collectionId.get(numberPageOfIdDeclaration);

			System.out.println(collectionId.get(numberPageOfIdDeclaration));

			try {
				ruleFindRegisteredAddress.parse(collectionId.get(numberPageOfIdDeclaration), PATH_FOR_GETTING_REGION);
				JSONObject json = readJsonFromUrl(pathForDeclaration);

				for (int i = 2; i < 13; i++) {
					if (json.getJSONObject("data").get(String.format("step_%d", i)).toString()
							.equals(LINE_FOR_CHECKING_STEP_ON_EMPTY_VALUE)
							|| (json.getJSONObject("data").get(String.format("step_%d", i)).toString().equals("[]"))) {

						json.getJSONObject("data").remove(String.format("step_%d", i));
					}
				}

				Declaration declaration = mapper.readValue(json.toString(), Declaration.class);
				declaration
						.setRegionNameDeclarant(ruleFindRegisteredAddress.getDeclarantRegisteredAddress().getRegion());
				declaration.setCityDeclarant(ruleFindRegisteredAddress.getDeclarantRegisteredAddress().getCity());
				declaration.setCountryDeclarant(ruleFindRegisteredAddress.getDeclarantRegisteredAddress().getCountry());
				declaration
						.setDistrictDeclarant(ruleFindRegisteredAddress.getDeclarantRegisteredAddress().getDistrict());

				collectionGetingDeclaration.add(declaration);
			} catch (IOException | JSONException e) {
				e.printStackTrace();
			}

		}

		log.info(
				"Size array with declaration :" + collectionGetingDeclaration.size() + "  from:" + collectionId.size());
		long timeSpent = System.currentTimeMillis() - startTime;
		log.info("Working parsing : " + timeSpent + " mls");
		return collectionGetingDeclaration;

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
