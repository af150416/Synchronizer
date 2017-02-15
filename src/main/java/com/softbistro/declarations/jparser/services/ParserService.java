package com.softbistro.declarations.jparser.services;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softbistro.declarations.jparser.entity.Response;


/**
 * Parsing JSON with declaration
 * 
 * @author af150416
 *
 */
@Service
public class ParserService {

	@Autowired
	ParserDao writer;
	
	/**
	 * URL to parsing declaration
	 */
	private final static String PARSED_URL = "https://public-api.nazk.gov.ua/v1/declaration/?page=";
	
	/**
	 * Scheduling time in milliseconds
	 */
	private final static long SCHEDULED_RATE = 86400000l;
	Logger LOGGER = Logger.getLogger(ParserService.class.getName());
	
	/**
	 * Method to parsing declaration
	 */
	@Scheduled(fixedRate = SCHEDULED_RATE)
	public void getStagingDeclaration() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		boolean hasData = true;
		for (int page = 1; hasData; page++) {
			try {
				Response response = mapper.readValue(new URL(PARSED_URL + page), Response.class);
				writer.saveListOfStagingDeclaration(response.getItems(), response.page.getCurrentPage());
				if (response.page.totalItems < (response.page.currentPage * response.page.batchSize)) {
					hasData = false;
				}
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, e.toString(), e);
			}
		}
		LOGGER.log(Level.INFO, String.format(" <<< All pages was writing to Data Base >>> "));
	}
}
