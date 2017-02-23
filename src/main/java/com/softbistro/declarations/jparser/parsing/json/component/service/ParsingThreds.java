package com.softbistro.declarations.jparser.parsing.json.component.service;

import com.softbistro.declarations.jparser.parsing.json.component.dao.mysql.JparserDao;

public class ParsingThreds extends Thread {
	private static int pageDeclarationId = 0;

	/**
	 * Starting thread with method
	 * 
	 * @see show
	 */
	@Override
	public void run() {
		show();
	}

	/**
	 * Start parsing declaration from URL
	 */
	public void show() {
		JparserDao jparserDao = new JparserDao();
		ParsingJson parsingJson = new ParsingJson();
		parsingJson.getingInformationFromDeclaration(jparserDao.getListIdDeclaration(pageDeclarationId++));
	}

}
