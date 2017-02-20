package com.softbistro.declarations.jparser.receiving.declaration.id.service;

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
<<<<<<< HEAD:src/main/java/com/softbistro/declarations/jparser/receiving/declaration/id/service/ParserService.java
import com.softbistro.declarations.jparser.receiving.declaration.id.entity.Response;
import com.softbistro.declarations.jparser.receiving.declaration.id.entity.StagingDeclaration;
=======
import com.softbistro.declarations.jparser.entity.Response;
>>>>>>> origin/parser:src/main/java/com/softbistro/declarations/jparser/services/ParserService.java

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
<<<<<<< HEAD:src/main/java/com/softbistro/declarations/jparser/receiving/declaration/id/service/ParserService.java
				String url = String.format("https://public-api.nazk.gov.ua/v1/declaration/?page=%d", page);
				Response response = mapper.readValue(new URL(url), Response.class);
				for (StagingDeclaration dec : response.getItems()) {
					saveStagingDeclaration(dec);
					System.out.println("id:" + dec.getId() + "wsa saved");
				}

				if (response.page.totalItems < (response.page.currentPage * response.page.batchSize)) {
					break;
				}

=======
				response = mapper.readValue(new URL(environment.getProperty("parsed.url") + page), Response.class);
				logger.log(Level.INFO,
						String.format("Page %d writing to Data Base...", response.page.getCurrentPage()));
				stagingDeclarationDAOService.save(response.getItems());
				page++;
>>>>>>> origin/parser:src/main/java/com/softbistro/declarations/jparser/services/ParserService.java
			} catch (IOException e) {
				logger.log(Level.SEVERE, e.toString(), e);
			}
<<<<<<< HEAD:src/main/java/com/softbistro/declarations/jparser/receiving/declaration/id/service/ParserService.java
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
=======
		} while (response.page.totalItems > (response.page.currentPage * response.page.batchSize));
		logger.log(Level.INFO, String.format(" <<< All pages was writing to Data Base >>> "));
>>>>>>> origin/parser:src/main/java/com/softbistro/declarations/jparser/services/ParserService.java
	}
}
