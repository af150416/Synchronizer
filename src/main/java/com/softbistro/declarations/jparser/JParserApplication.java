package com.softbistro.declarations.jparser;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.softbistro.declarations.jparser.component.service.JparserDao;
import com.softbistro.declarations.jparser.services.ParserService;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.softbistro.declarations.jparser")
public class JParserApplication {
	private int getingPage = 0;

	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		ApplicationContext context = SpringApplication.run(JParserApplication.class, args);

		ParserService parserService = context.getBean(ParserService.class);
		parserService.parseDeclaration();

		// ParsingJson parsingJson = new ParsingJson();
		// parsingJson.getingInformationFromDeclaration();

	}

	// @Scheduled(fixedDelay = 1000)
	public void show() {
		JparserDao jparserDao = new JparserDao();
		jparserDao.getListIdDeclaration(getingPage++);
	}
}