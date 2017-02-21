package com.softbistro.declarations.jparser.parsing.json.component.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubjectInfo {

	private String country;

	@JsonProperty("lastname")
	private String lastName;

	@JsonProperty("actual_city")
	private String actualCity;

	@JsonProperty("actual_district")
	private String actualDistrict;

	@JsonProperty("actual_region")
	private String actualRegion;

	@JsonProperty("actual_country")
	private String actualCountry;

	private String postType;

	private String workPost;

	@JsonProperty("firstname")
	private String firstName;

	@JsonProperty("workPlace")
	private String workPlase;

	@JsonProperty("middlename")
	private String middleName;

	private boolean changedName;

	private String countryPath;

	private String postCategory;

	@JsonProperty("previous_lastname")
	private String previousLastName;

	private String corruptionAffected;

	@JsonProperty("previous_firstname")
	private String previousFirstName;

	@JsonProperty("previous_middlename")
	private String previousMiddleName;

	private String responsiblePosition;

	@JsonProperty("housePartNum_extendedstatus")
	private String housePartNum;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getWorkPlase() {
		return workPlase;
	}

	public void setWorkPlase(String workPlase) {
		this.workPlase = workPlase;
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

	public String getCountryPath() {
		return countryPath;
	}

	public void setCountryPath(String countryPath) {
		this.countryPath = countryPath;
	}

	public String getPostCategory() {
		return postCategory;
	}

	public void setPostCategory(String postCategory) {
		this.postCategory = postCategory;
	}

	public String getPreviousLastName() {
		return previousLastName;
	}

	public void setPreviousLastName(String previousLastName) {
		this.previousLastName = previousLastName;
	}

	public String getCorruptionAffected() {
		return corruptionAffected;
	}

	public void setCorruptionAffected(String corruptionAffected) {
		this.corruptionAffected = corruptionAffected;
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

	public String getResponsiblePosition() {
		return responsiblePosition;
	}

	public void setResponsiblePosition(String responsiblePosition) {
		this.responsiblePosition = responsiblePosition;
	}

	public String getHousePartNum() {
		return housePartNum;
	}

	public void setHousePartNum(String housePartNum) {
		this.housePartNum = housePartNum;
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

	public String getActualRegion() {
		return actualRegion;
	}

	public void setActualRegion(String actualRegion) {
		this.actualRegion = actualRegion;
	}

	public String getActualCountry() {
		return actualCountry;
	}

	public void setActualCountry(String actualCountry) {
		this.actualCountry = actualCountry;
	}

}
