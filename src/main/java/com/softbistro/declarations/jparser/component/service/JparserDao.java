package com.softbistro.declarations.jparser.component.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;

/**
 * Geting information from database
 * 
 * @author zviproject
 *
 */
@Repository
public class JparserDao {

	/**
	 * Get 400 records from DB with Id Declarations
	 */
	private static final String SQL_GET_LIST_ID_DECLARATIONS = "SELECT declaration_id FROM stagingDeclaration LIMIT 400 OFFSET ?";
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
			dataSource.setDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dataSource.setUrl("jdbc:mysql://sb-db01.softbistro.online/declaration?useUnicode=yes&characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("rotrotrot");
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
	public void getListIdDeclaration(int page) {
		List<String> listIdDeclarations = new ArrayList<>();
		page *= 400;

		String statusForChange = "new";
		String statusWillBeChaged = "in progress";

		listIdDeclarations = jdbcTemplate.query(SQL_GET_LIST_ID_DECLARATIONS, new WorkingWithData(), page);
		jdbcTemplate.update(SQL_UPDATE_VALUE_STATUS, statusWillBeChaged, statusForChange);

		for (String show : listIdDeclarations) {
			System.out.println("====================================================================");
			System.out.println(String.format("============%s=======", show));
		}

	}

}
