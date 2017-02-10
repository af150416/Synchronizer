package com.softbistro.declarations.jparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.softbistro.declarations.jparser.services.ParserService;

@SpringBootApplication
@ComponentScan(basePackages="com.softbistro.declarations.jparser")
public class JParserApplication {
	public static void main(String[] args) {
		SpringApplication.run(JParserApplication.class, args);
		new ParserService().getStagingDeclaration();		
  }
}