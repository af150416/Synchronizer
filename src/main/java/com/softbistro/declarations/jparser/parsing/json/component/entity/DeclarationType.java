package com.softbistro.declarations.jparser.parsing.json.component.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeclarationType {
	@JsonProperty("declarationType")
	private Integer typeOfDeclaration;

	@JsonProperty("declarationYear1")
	private Integer yearOfDeclaration;

	public int getTypeOfDeclaration() {
		return typeOfDeclaration;
	}

	public void setTypeOfDeclaration(int typeOfDeclaration) {
		this.typeOfDeclaration = typeOfDeclaration;
	}

	public int getYearOfDeclaration() {
		return yearOfDeclaration;
	}

	public void setYearOfDeclaration(int yearOfDeclaration) {
		this.yearOfDeclaration = yearOfDeclaration;
	}

}
