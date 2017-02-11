package com.softbistro.declarations.jparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.softbistro.declarations.jparser.component.service.JparserDao;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.softbistro.declarations.jparser")
public class JParserApplication {
	private int getingPage = 0;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JParserApplication.class, args);
		// ParserService parserService = context.getBean(ParserService.class);
		// parserService.getStagingDeclaration();

	}

	// @Scheduled(fixedDelay = 1000)
	public void show() {
		JparserDao jparserDao = new JparserDao();
		jparserDao.getListIdDeclaration(getingPage++);
	}
}