package com.softbistro.declarations.jparser.services;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

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
	JparserDao jparserDao;

	private Collection<Declaration> collectionGetingDeclaration;

	/**
	 * Geting information for
	 */
	public void getingInformationFromDeclaration(List<String> collectionId) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		collectionGetingDeclaration = new ArrayList<>();

		for (int numberOfIdDeclaration = 0; numberOfIdDeclaration < collectionId.size(); numberOfIdDeclaration++) {

			String pathForDeclaration = "https://public-api.nazk.gov.ua/v1/declaration/"
					+ collectionId.get(numberOfIdDeclaration);

			try {
				URL url = new URL(pathForDeclaration);
				HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

				Declaration declaration = mapper.readValue(url, Declaration.class);

				collectionGetingDeclaration.add(declaration);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("============================================================>"
				+ collectionGetingDeclaration.size() + "\n\n");

	}

}
