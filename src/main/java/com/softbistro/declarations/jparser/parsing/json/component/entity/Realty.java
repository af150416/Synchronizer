package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Realty implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("person")
	private String personId;

	@JsonProperty("iteration")
	private String iteration;

	@JsonProperty("rights")
	private Map<String, Rights> rights;

	@JsonProperty("country")
	private Integer country;

	@JsonProperty("costDate")
	private String cost;

	@JsonProperty("totalArea")
	private String totalArea;

	@JsonProperty("objectType")
	private String objectType;

	@JsonProperty("owningDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
	private Date owningDate;

	@JsonProperty("ua_cityType")
	private String cityType;

	@JsonProperty("ua_postCode")
	private Integer postCode;

	@JsonProperty("costAssessment")
	private String costAssessment;

	@JsonProperty("otherObjectType")
	private String otherObjectTyope;

	@JsonProperty("regNumber_extendedstatus")
	private Integer regNumberExtendedStatus;

	@JsonProperty("costAssessment_extendedstatus")
	private Integer costAssessmentExtendedStatus;

	@JsonProperty("ua_housePartNum_extendedstatus")
	private Integer housePartNumExtendedStatus;

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Date getGainDate() {
		return getOwningDate();
	}

	public void setGainDate(Date gainDate) {
		this.setOwningDate(gainDate);
	}

	public String getCityType() {
		return cityType;
	}

	public void setCityType(String cityType) {
		this.cityType = cityType;
	}

	public Integer getPostCode() {
		return postCode;
	}

	public void setPostCode(Integer postCode) {
		this.postCode = postCode;
	}

	public String getCostAssessment() {
		return costAssessment;
	}

	public void setCostAssessment(String costAssessment) {
		this.costAssessment = costAssessment;
	}

	public String getOtherObjectTyope() {
		return otherObjectTyope;
	}

	public void setOtherObjectTyope(String otherObjectTyope) {
		this.otherObjectTyope = otherObjectTyope;
	}

	public Integer getRegNumberExtendedStatus() {
		return regNumberExtendedStatus;
	}

	public void setRegNumberExtendedStatus(Integer regNumberExtendedStatus) {
		this.regNumberExtendedStatus = regNumberExtendedStatus;
	}

	public Integer getCostAssessmentExtendedStatus() {
		return costAssessmentExtendedStatus;
	}

	public void setCostAssessmentExtendedStatus(Integer costAssessmentExtendedStatus) {
		this.costAssessmentExtendedStatus = costAssessmentExtendedStatus;
	}

	public Integer getHousePartNumExtendedStatus() {
		return housePartNumExtendedStatus;
	}

	public void setHousePartNumExtendedStatus(Integer housePartNumExtendedStatus) {
		this.housePartNumExtendedStatus = housePartNumExtendedStatus;
	}

	public Map<String, Rights> getRights() {
		return rights;
	}

	public void setRights(Map<String, Rights> rights) {
		this.rights = rights;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(String totalArea) {
		this.totalArea = totalArea;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getIteration() {
		return iteration;
	}

	public void setIteration(String iteration) {
		this.iteration = iteration;
	}

	public Date getOwningDate() {
		return owningDate;
	}

	public void setOwningDate(Date owningDate) {
		this.owningDate = owningDate;
	}

}
