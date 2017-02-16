package com.softbistro.declarations.jparser.component.entity;

public class SubjectFamily {
	private int Id;
	private String lastName;
	private String firstName;
	private String middleName;
	private boolean changedName;
	private String engLastName;
	private String engFirstName;
	private String subjectRelation;
	private String previousLastName;
	private String previousFirstName;
	private String previousMiddleName;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

}
