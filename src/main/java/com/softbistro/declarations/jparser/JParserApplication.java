package com.softbistro.declarations.jparser;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import org.springframework.scheduling.annotation.Scheduled;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.softbistro.declarations.jparser.parsing.json.component.service.ParsingThreds;


/**
 * Starting spring boot project
 * 
 * @author zviproject
 *
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.softbistro.declarations.jparser")
public class JParserApplication {


	private ParsingThreds parsingThreds;


	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		ApplicationContext context = SpringApplication.run(JParserApplication.class, args);

		// ParserService parserService = context.getBean(ParserService.class);
		// parserService.getStagingDeclaration();

	}

	@Scheduled(fixedDelay = 15000)
	public void runThreads() {
		parsingThreds = new ParsingThreds();
		parsingThreds.start();

		parsingThreds = new ParsingThreds();
		parsingThreds.start();

		parsingThreds = new ParsingThreds();
		parsingThreds.start();

	}


}