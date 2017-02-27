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

	
	private static ParsingThreds parsingThreds;
	
	private static ApplicationContext context;

	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		
		context = SpringApplication.run(JParserApplication.class, args);
		
		runThreads();
		
	}

	// @Scheduled(fixedDelay = 15000)
	public static void runThreads() {

		/*ParsingThreds parsingThreds1 = context.getBean(ParsingThreds.class);		
		parsingThreds1.start();

		ParsingThreds parsingThreds2 = context.getBean(ParsingThreds.class);	
		parsingThreds2.start();
		
		ParsingThreds parsingThreds3 = context.getBean(ParsingThreds.class);	
		parsingThreds3.start();
		
		ParsingThreds parsingThreds4 = context.getBean(ParsingThreds.class);	
		parsingThreds4.start();
		
		ParsingThreds parsingThreds5 = context.getBean(ParsingThreds.class);	
		parsingThreds5.start();*/

		parsingThreds = new ParsingThreds();		
		parsingThreds.start();

		parsingThreds = new ParsingThreds();		
		parsingThreds.start();
		
		parsingThreds = new ParsingThreds();		
		parsingThreds.start();
		
		parsingThreds = new ParsingThreds();		
		parsingThreds.start();
		
		parsingThreds = new ParsingThreds();		
		parsingThreds.start();
	}

}