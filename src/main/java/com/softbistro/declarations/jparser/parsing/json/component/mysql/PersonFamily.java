package com.softbistro.declarations.jparser.parsing.json.component.mysql;

public class PersonFamily {
	
	private int id;	
	private String lastName;
	private String firstName;
	private String middleName;
	private boolean changedName;
	private String previousLastName;
	private String previousFirstName;
	private String previousMiddleName;
	private String citizenship;
	private String subjectRelation;
	private String familySubjectId;
	private Long declarantId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSubjectRelation() {
		return subjectRelation;
	}
	public void setSubjectRelation(String subjectRelation) {
		this.subjectRelation = subjectRelation;
	}
	public String getFamilySubjectId() {
		return familySubjectId;
	}
	public void setFamilySubjectId(String familySubjectId) {
		this.familySubjectId = familySubjectId;
	}
	public Long getDeclarantId() {
		return declarantId;
	}
	public void setDeclarantId(Long declarantId) {
		this.declarantId = declarantId;
	}	

	
}
