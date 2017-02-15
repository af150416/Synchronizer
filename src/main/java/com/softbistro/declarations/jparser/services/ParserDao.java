package com.softbistro.declarations.jparser.services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.entity.StagingDeclaration;

/**
 * Saving list with declaration to data base
 * 
 * @author af150416
 *
 */
@Repository
public class ParserDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	/**
	 * SQL request for inserting to data base
	 */
	private final static String SQL_REQUEST = "INSERT INTO stagingDeclaration (declaration_id, first_name, last_name, work_place, position, pdf_link, status)"
			+ " VALUES (:declarationId, :firstName, :lastName, :placeOfWork, :position, :linkPdf, \"new\")ON DUPLICATE KEY UPDATE status=\"update\"";
	final static Logger LOGGER = Logger.getLogger(ParserDao.class.getName());
	
	/**
	 * Method for inserting to data base
	 */	
	public void saveListOfStagingDeclaration(List<StagingDeclaration> declarations, Integer page) {
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(declarations.toArray());
		LOGGER.log(Level.INFO, String.format("Page %d writing to Data Base...", page));
		namedParameterJdbcTemplate.batchUpdate(SQL_REQUEST, params);
	}
}
