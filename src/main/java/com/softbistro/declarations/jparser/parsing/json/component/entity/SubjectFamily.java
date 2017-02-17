package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubjectFamily implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	@JsonProperty("lastname")
	private String lastName;

	@JsonProperty("firstname")
	private String firstName;

	@JsonProperty("middlename")
	private String middleName;

	@JsonProperty("changedName")
	private boolean changedName;

	@JsonProperty("eng_lastname")
	private String engLastName;

	@JsonProperty("eng_firstname")
	private String engFirstName;

	@JsonProperty("subjectRelation")
	private String subjectRelation;

	@JsonProperty("previous_lastname")
	private String previousLastName;

	@JsonProperty("previous_firstname")
	private String previousFirstName;

	@JsonProperty("previous_middlename")
	private String previousMiddleName;

	@JsonProperty("citizenship")
	private String citizenship;

	@JsonProperty("relation_subject")
	private String relationSubject;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public boolean isChangedName() {
		return changedName;
	}

	public void setChangedName(boolean changedName) {
		this.changedName = changedName;
	}

	public String getEngLastName() {
		return engLastName;
	}

	public void setEngLastName(String engLastName) {
		this.engLastName = engLastName;
	}

	public String getEngFirstName() {
		return engFirstName;
	}

	public void setEngFirstName(String engFirstName) {
		this.engFirstName = engFirstName;
	}

	public String getSubjectRelation() {
		return subjectRelation;
	}

	public void setSubjectRelation(String subjectRelation) {
		this.subjectRelation = subjectRelation;
	}

	public String getPreviousLastName() {
		return previousLastName;
	}

	public void setPreviousLastName(String previousLastName) {
		this.previousLastName = previousLastName;
	}

	public String getPreviousFirstName() {
		return previousFirstName;
	}

	public void setPreviousFirstName(String previousFirstName) {
		this.previousFirstName = previousFirstName;
	}

	public String getPreviousMiddleName() {
		return previousMiddleName;
	}

	public void setPreviousMiddleName(String previousMiddleName) {
		this.previousMiddleName = previousMiddleName;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getRelationSubject() {
		return relationSubject;
	}

	public void setRelationSubject(String relationSubject) {
		this.relationSubject = relationSubject;
	}

}
