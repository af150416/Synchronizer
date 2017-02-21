package com.softbistro.declarations.jparser.parsing.json.component.mysql;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Entity for data about person
 * 
 * @author cortes
 *
 */
public class PersonInfo {

	private int id;
	private String country;
	private String lastName;
	private String firstName;
	private String middleName;
	private String postType;
	private String workPost;
	private String workPlace;
	private String postCategory;
	private String actualStreet;
	private boolean changedName;
	private String countryPath;
	private String actualCountry;
	private String actualRegion;
	private String actualCity;
	private String actualDistrict;
	private String corruptionPost;
	private String responsiblePosition;
	private String previousLastName;
	private String previousFirstName;
	private String previousMiddleName;
	private String citizenship;
	private String subjectRelation;
	private String familySubjectId;
	private Status status;
	private int declarantId;

	public enum Status {
		DECLARANT, FAMILY
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getWorkPost() {
		return workPost;
	}

	public void setWorkPost(String workPost) {
		this.workPost = workPost;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getPostCategory() {
		return postCategory;
	}

	public void setPostCategory(String postCategory) {
		this.postCategory = postCategory;
	}

	public String getActualStreet() {
		return actualStreet;
	}

	public void setActualStreet(String actualStreet) {
		this.actualStreet = actualStreet;
	}

	public boolean isChangedName() {
		return changedName;
	}

	public void setChangedName(boolean changedName) {
		this.changedName = changedName;
	}

	public String getCountryPath() {
		return countryPath;
	}

	public void setCountryPath(String countryPath) {
		this.countryPath = countryPath;
	}

	public String getActualCountry() {
		return actualCountry;
	}

	public void setActualCountry(String actualCountry) {
		this.actualCountry = actualCountry;
	}

	public String getActualRegion() {
		return actualRegion;
	}

	public void setActualRegion(String actualRegion) {
		this.actualRegion = actualRegion;
	}

	public String getActualCity() {
		return actualCity;
	}

	public void setActualCity(String actualCity) {
		this.actualCity = actualCity;
	}

	public String getActualDistrict() {
		return actualDistrict;
	}

	public void setActualDistrict(String actualDistrict) {
		this.actualDistrict = actualDistrict;
	}

	public String getCorruptionPost() {
		return corruptionPost;
	}

	public void setCorruptionPost(String corruptionPost) {
		this.corruptionPost = corruptionPost;
	}

	public String getResponsiblePosition() {
		return responsiblePosition;
	}

	public void setResponsiblePosition(String responsiblePosition) {
		this.responsiblePosition = responsiblePosition;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getDeclarantId() {
		return declarantId;
	}

	public void setDeclarantId(int declarantId) {
		this.declarantId = declarantId;
	}

	public String getFamilySubjectId() {
		return familySubjectId;
	}

	public void setFamilySubjectId(String familySubjectId) {
		this.familySubjectId = familySubjectId;
	}

}
