package com.softbistro.declarations.jparser.services;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softbistro.declarations.jparser.entity.Response;
import com.softbistro.declarations.jparser.entity.StagingDeclaration;

@Service
public class ParserService {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	JdbcTemplate jdbcTemplate;

	private final static String PARSED_URL = "https://public-api.nazk.gov.ua/v1/declaration/?page=%d";
	private final static String SQL_REQUEST = "INSERT INTO stagingDeclaration (declaration_id, first_name, last_name, work_place, position, pdf_link, status)"
			+ " VALUES (:declarationId, :firstName, :lastName, :placeOfWork, :position, :linkPdf, \"new\")";

	public void getStagingDeclaration() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		boolean hasData = true;
		for (int page = 1; hasData; page++) {
			try {
				Response response = mapper.readValue(new URL(String.format(PARSED_URL, page)), Response.class);
				saveListOfStagingDeclaration(response.getItems());
				if (response.page.totalItems < (response.page.currentPage * response.page.batchSize)) {
					hasData = false;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void saveListOfStagingDeclaration(List<StagingDeclaration> rawDeclarations) {
		List<StagingDeclaration> declarations = new ArrayList<>();
//		for (StagingDeclaration dec : rawDeclarations) {
//			if (!isDuplicate(dec)) {
//				declarations.add(dec);
//				System.out.println(dec.getDeclarationId() + " Was add to save list");
//			}
//			else{System.out.println(dec.getDeclarationId() + " Already in Data Base");}
//		}

		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(rawDeclarations.toArray());
		System.out.println("writing to Data Base...");
		namedParameterJdbcTemplate.batchUpdate(SQL_REQUEST, params);
		System.out.println("Done");
	}

	// public boolean isDuplicate(StagingDeclaration dec) throws SQLException {
	// Connection conn =
	// DriverManager.getConnection("jdbc:mysql://sb-db01.softbistro.online/declaration?useuseUnicode=yes&characterEncoding=UTF-8"
	// , "root", "rotrotrot");
	// Statement stmt = conn.createStatement();
	// ResultSet result = null;
	// result = stmt.executeQuery("select * from stagingDeclaration where
	// declaration_id="+("'"+dec.getDeclarationId()+"'"));
	// if
	// (result.isBeforeFirst()){System.out.println(dec.getDeclarationId()+"already
	// in DataBase");}
	// return result.isBeforeFirst();
	// }

	public boolean isDuplicate(StagingDeclaration dec) {
		String sql = "select id from stagingDeclaration where declaration_id=?";
		
		return (Integer)jdbcTemplate.queryForObject(sql, new Object[] { dec.getDeclarationId() }, Integer.class) != null;
	}
}
