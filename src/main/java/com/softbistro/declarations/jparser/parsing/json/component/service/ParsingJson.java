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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
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

	private final String PATH_FOR_READING_DECLARATION = "https://public-api.nazk.gov.ua/v1/declaration/";

	private static final String LINE_FOR_CHECKING_STEP_ON_EMPTY_VALUE = "{\"empty\":\"У суб'єкта декларування відсутні об'єкти для декларування в цьому розділі.\"}";

	private final String OBJECT_THAT_CONTAIN_STEPS = "data";

	/**
	 * step for start checkng response information
	 */
	private final Integer START_STEP = 2;

	/**
	 * step for finish checkng response information
	 */
	private final Integer FINISH_STEP = 13;

	private static final Logger log = LogManager.getLogger(ParsingJson.class);

	private List<Declaration> collectionGetingDeclaration;

	/**
	 * Geting information from response URL
	 */
	public List<Declaration> getingInformationFromDeclaration(List<String> collectionId) {
		ObjectMapper mapper = new ObjectMapper();

		boolean failOnUnknownProporties = false;
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, failOnUnknownProporties);

		collectionGetingDeclaration = new ArrayList<>();
		RuleFindRegisteredAddress ruleFindRegisteredAddress = new RuleFindRegisteredAddress();
		for (int numberPageOfIdDeclaration = 0; numberPageOfIdDeclaration < collectionId
				.size(); numberPageOfIdDeclaration++) {

			String pathForDeclaration = PATH_FOR_READING_DECLARATION + collectionId.get(numberPageOfIdDeclaration);

			System.out.println(collectionId.get(numberPageOfIdDeclaration));

			try {
				ruleFindRegisteredAddress.parse(collectionId.get(numberPageOfIdDeclaration), PATH_FOR_GETTING_REGION);
				String checkingStep;
				JSONObject json = readJsonFromUrl(pathForDeclaration);
				JSONObject jsonObjectWithData = json.getJSONObject(OBJECT_THAT_CONTAIN_STEPS);

				for (int i = START_STEP; i < FINISH_STEP; i++) {
					checkingStep = String.format("step_%d", i);

					if (jsonObjectWithData.get(checkingStep).toString().equals(LINE_FOR_CHECKING_STEP_ON_EMPTY_VALUE)
							|| (jsonObjectWithData.get(checkingStep).toString().equals("[]"))) {

						jsonObjectWithData.remove(checkingStep);
					}
				}

				collectionGetingDeclaration
						.add(addingInformationIntoDeclaration(mapper, json, ruleFindRegisteredAddress));
			} catch (IOException | JSONException e) {
				e.printStackTrace();
			}

		}

		log.info(String.format("Size array with declaration :%d from %d", collectionGetingDeclaration.size(),
				collectionId.size()));
		return collectionGetingDeclaration;

	}

	private Declaration addingInformationIntoDeclaration(ObjectMapper mapper, JSONObject json,
			RuleFindRegisteredAddress ruleFindRegisteredAddress) {
		try {
			Declaration declaration = mapper.readValue(json.toString(), Declaration.class);

			declaration.setRegionNameDeclarant(ruleFindRegisteredAddress.getDeclarantRegisteredAddress().getRegion());
			declaration.setCityDeclarant(ruleFindRegisteredAddress.getDeclarantRegisteredAddress().getCity());
			declaration.setCountryDeclarant(ruleFindRegisteredAddress.getDeclarantRegisteredAddress().getCountry());
			declaration.setDistrictDeclarant(ruleFindRegisteredAddress.getDeclarantRegisteredAddress().getDistrict());

			return declaration;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		try (InputStream is = new URL(url).openStream()) {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		}
	}

	private String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

}
