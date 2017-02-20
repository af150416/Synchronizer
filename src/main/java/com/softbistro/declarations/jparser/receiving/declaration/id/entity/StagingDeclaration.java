package com.softbistro.declarations.jparser.receiving.declaration.id.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StagingDeclaration {

	@JsonProperty("id")
	private String declarationId;

	@JsonProperty("firstname")
	private String firstName;

	@JsonProperty("lastname")
	private String lastName;

	private String placeOfWork;

	private String position;

	@JsonProperty("linkPDF")
	private String linkPdf;

	private enum Status {
		NEW, UPDATE, IN_PROGRESS, DONE
	};

	public String getDeclarationId() {
		return declarationId;
	}

	public void setDeclarationId(String declarationId) {
		this.declarationId = declarationId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPlaceOfWork() {
		return placeOfWork;
	}

	public void setPlaceOfWork(String placeOfWork) {
		this.placeOfWork = placeOfWork;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLinkPdf() {
		return linkPdf;
	}

	public void setLinkPdf(String linkPdf) {
		this.linkPdf = linkPdf;
	}

	@Override
	public String toString() {
		return new StringBuilder() + getLastName() + " " + getFirstName() + " " + getDeclarationId();

	}
}