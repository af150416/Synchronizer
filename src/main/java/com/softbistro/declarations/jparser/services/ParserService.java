package com.softbistro.declarations.jparser.services;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softbistro.declarations.jparser.entity.Response;
import com.softbistro.declarations.jparser.entity.StagingDeclaration;

@Service
public class ParserService {

	public void getStagingDeclaration() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		for (int page = 439;; page++) {
			try {
				String url = String.format("https://public-api.nazk.gov.ua/v1/declaration/?page=%d", page);
				Response response = mapper.readValue(new URL(url), Response.class);
				for (StagingDeclaration dec : response.getItems()) {
					saveStagingDeclaration(dec);
					System.out.println("id:" + dec.getId() + "wsa saved");
				}

				if (response.page.totalItems < (response.page.currentPage * response.page.batchSize)) {
					break;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void saveStagingDeclaration(StagingDeclaration dec) {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		try {
			dataSource.setDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dataSource.setUrl("jdbc:mysql://sb-db01.softbistro.online/declaration?useUnicode=yes&characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("rotrotrot");

		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
		String sqlInsert = "INSERT INTO stagingDeclaration (declaration_id, first_name, last_name, work_place, position, pdf_link, status)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			jdbc.update(sqlInsert, dec.getId(), new String(dec.getFirstname().getBytes(), "UTF-8"), dec.getLastname(),
					dec.getPlaceOfWork(), dec.getPosition(), dec.getLinkPDF(), "new");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
