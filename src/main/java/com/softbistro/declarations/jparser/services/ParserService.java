package com.softbistro.declarations.jparser.services;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
	private Environment environment;

	@Autowired
	private StagingDeclarationDAOService stagingDeclarationDAOService;

	private Logger logger = Logger.getLogger(ParserService.class.getName());

	/**
	 * Scheduled method for regular parsing declaration by cron job task
	 */
	@Scheduled(cron = "0 0 1 * * *")
	public void parseDeclaration() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		Response response = null;
		int page = 1;
		do {
			try {
				response = mapper.readValue(new URL(environment.getProperty("parsed.url") + page), Response.class);
				logger.log(Level.INFO,
						String.format("Page %d writing to Data Base...", response.page.getCurrentPage()));
				stagingDeclarationDAOService.save(response.getItems());
				page++;
			} catch (IOException e) {
				logger.log(Level.SEVERE, e.toString(), e);
			}
		} while (response.page.totalItems > (response.page.currentPage * response.page.batchSize));
		logger.log(Level.INFO, String.format(" <<< All pages was writing to Data Base >>> "));
	}
}
