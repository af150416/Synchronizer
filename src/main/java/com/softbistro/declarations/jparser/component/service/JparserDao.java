package com.softbistro.declarations.jparser.component.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Driver;

/**
 * Geting information from database
 * 
 * @author zviproject
 *
 */
@Repository
@Component
public class JparserDao {
	@Value("${count.of.records.for.list}")
	private String str;

	private int countOfRecords = 5; // properties.getProperty("countOfRecordsForList");
	/**
	 * Get 400 records from DB with Id Declarations
	 */
	private static final String SQL_GET_LIST_ID_DECLARATIONS = "SELECT declaration_id FROM stagingDeclaration LIMIT ? OFFSET ?";

	/**
	 * Update status in database
	 */
	private static final String SQL_UPDATE_VALUE_STATUS = "UPDATE stagingDeclaration SET status = ? WHERE status = ? LIMIT 400 ";

	/**
	 * Variable for working with database
	 */
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(connectToDB());

	/**
	 * Connecting to DB on server<br>
	 * Neaded for JDBC Template
	 * 
	 * @return SimpleDriverDataSource
	 */
	private SimpleDriverDataSource connectToDB() {

		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		try {
			dataSource.setDriver(new Driver());
			dataSource.setUrl(
					"jdbc:mysql://sb-db01.softbistro.online/declaration?useUnicode=yes&characterEncoding=UTF-8");
			dataSource.setUsername("root");
			dataSource.setPassword("rotrotrot");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dataSource;
	}

	/**
	 * Method for collection results from database
	 * 
	 * @author zviproject
	 *
	 */
	public static class WorkingWithData implements RowMapper<String> {

		@Override
		public String mapRow(ResultSet rs, int rowNum) throws SQLException {
			String declarationId = rs.getString(1);
			return declarationId;
		}
	}

	/**
	 * Get list id declaration with limit 400 records
	 * 
	 * @param page
	 */
	public List<String> getListIdDeclaration(int page) {
		List<String> listIdDeclarations = new ArrayList<>();
		page *= countOfRecords;

		String statusForChange = "new";
		String statusWillBeChaged = "in progress";

		listIdDeclarations = jdbcTemplate.query(SQL_GET_LIST_ID_DECLARATIONS, new WorkingWithData(), countOfRecords,
				page);
		// jdbcTemplate.update(SQL_UPDATE_VALUE_STATUS, statusWillBeChaged,
		// statusForChange);

		for (String show : listIdDeclarations) {
			System.out.println("====================================================================");
			System.out.println(String.format("============%s=======", show));

		}

		System.out.println(str);

		return listIdDeclarations;

	}

}
