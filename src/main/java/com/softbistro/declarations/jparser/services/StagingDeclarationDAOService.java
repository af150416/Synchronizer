package com.softbistro.declarations.jparser.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.entity.StagingDeclaration;

/**
 * Saving list with declarations to data base
 * 
 * @author af150416
 *
 */
@Repository
public class StagingDeclarationDAOService {

	@Autowired
	private Environment environment;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	final static Logger logger = Logger.getLogger(StagingDeclarationDAOService.class.getName());

	/**
	 * Method for inserting batch of declarations to data base
	 */
	public void save(List<StagingDeclaration> declarations) {
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(declarations.toArray());
		namedParameterJdbcTemplate.batchUpdate(environment.getProperty("sql.insert.batch.of.declarations"), params);
	}
}
