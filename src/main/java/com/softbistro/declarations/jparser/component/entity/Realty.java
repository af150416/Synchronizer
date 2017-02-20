package com.softbistro.declarations.jparser.component.entity;

import java.sql.Date;
import java.util.List;

public class Realty {
	private int id;
	private List<Rights> rights;
	private int country;
	private double cost;
	private double totalArea;
	private String objectType;
	private Date gainDate;
	private String cityType;
	private int postCode;
	private String costAssessment;
	private String otherObjectTyope;
	private int regNumberExtendedStatus;
	private int costAssessmentExtendedStatus;
	private int housePartNumExtendedStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Rights> getRights() {
		return rights;
	}

	public void setRights(List<Rights> rights) {
		this.rights = rights;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Date getGainDate() {
		return gainDate;
	}

	public void setGainDate(Date gainDate) {
		this.gainDate = gainDate;
	}

	public String getCityType() {
		return cityType;
	}

	public void setCityType(String cityType) {
		this.cityType = cityType;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
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

	public int getRegNumberExtendedStatus() {
		return regNumberExtendedStatus;
	}

	public void setRegNumberExtendedStatus(int regNumberExtendedStatus) {
		this.regNumberExtendedStatus = regNumberExtendedStatus;
	}

	public int getCostAssessmentExtendedStatus() {
		return costAssessmentExtendedStatus;
	}

	public void setCostAssessmentExtendedStatus(int costAssessmentExtendedStatus) {
		this.costAssessmentExtendedStatus = costAssessmentExtendedStatus;
	}

	public int getHousePartNumExtendedStatus() {
		return housePartNumExtendedStatus;
	}

	public void setHousePartNumExtendedStatus(int housePartNumExtendedStatus) {
		this.housePartNumExtendedStatus = housePartNumExtendedStatus;
	}

}
