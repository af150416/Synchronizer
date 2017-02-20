package com.softbistro.declarations.jparser.parsing.json.component.service.officialaddress.components.entity;

/**
 * Entity that store location of official
 * 
 * @author cortes
 *
 */
public class WorkPlace {

	private String workPlace;

	public WorkPlace(String workPlace) {

		this.workPlace = workPlace;

	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String parsedMessage) {
		this.workPlace = parsedMessage;
	}

}
