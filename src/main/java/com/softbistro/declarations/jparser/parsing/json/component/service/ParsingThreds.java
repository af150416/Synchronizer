package com.softbistro.declarations.jparser.parsing.json.component.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.Driver;
import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.JparserDao;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;

@Service
public class ParsingThreds extends Thread {

	private static int pageDeclarationId = 0;

	private static Integer personId = 0;
	private static Integer step = 0;

	private JdbcTemplate jdbcTemplate = new JdbcTemplate(connectToDB());

	/*@Autowired
	JparserDao jparserDao;
	@Autowired
	ParsingJson parsingJson;
	@Autowired
	MigrationToDatabase migrationToDatabase;*/

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
	 * Starting thread with method
	 * 
	 * @see show
	 */
	@Override
	public void run() {
		show();
	}

	/**
	 * Start parsing declaration from URL
	 */
	public void show() {

		JparserDao jparserDao = new JparserDao();
		ParsingJson parsingJson = new ParsingJson();
		MigrationToDatabase migrationToDatabase = new MigrationToDatabase();
		if (jdbcTemplate.queryForObject("SELECT MAX(`id`) FROM declaration.subject_info", Integer.class) != null) {
			personId = jdbcTemplate.queryForObject("SELECT MAX(`id`) FROM declaration.subject_info", Integer.class);
		}

		List<Declaration> list = parsingJson.getingInformationFromDeclaration(jparserDao.getListIdDeclaration(pageDeclarationId++));

		migrationToDatabase.writeToDB(list, (personId + (list.size() * step++)));

	}

}
