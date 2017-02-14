package com.softbistro.declarations.jparser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="stagingDeclaration")
public class StagingDeclaration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
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

	private String status;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString(){
		return new StringBuilder()+getLastName()+" "+getFirstName()+" "+getDeclarationId();
		
	}
}