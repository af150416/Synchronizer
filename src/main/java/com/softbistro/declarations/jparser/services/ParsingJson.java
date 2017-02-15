package com.softbistro.declarations.jparser.services;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softbistro.declarations.jparser.component.entity.Declaration;
import com.softbistro.declarations.jparser.component.service.JparserDao;

@Service
public class ParsingJson {
	@Autowired
	JparserDao jparserDao;

	public void getingInformationFromDeclaration() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		String pathForDeclaration = "https://public-api.nazk.gov.ua/v1/declaration/2dec5cbc-627b-4b7b-a369-ab6ab97ab2fe";
		try {
			URL url = new URL(pathForDeclaration);
			URLConnection conn = url.openConnection();

			Declaration declaration = mapper.readValue(url, Declaration.class);

			 System.out.println(declaration.getId());
			 System.out.println(declaration.getDeclarantDatas().get(0).getDeclarationType().getTypeOfDeclaration());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
