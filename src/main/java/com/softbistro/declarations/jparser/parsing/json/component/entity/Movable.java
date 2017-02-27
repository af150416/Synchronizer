package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.sql.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movable {

	private String brand;

	private String model;

	private String person;

	@JsonProperty("rights")
	private Map<String, Rights> rights;

	private double costDate;

	private String objectType;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
	private Date owningDate;

	private String typeProperty;

	private int graduationYear;

	private String otherTypeProperty;

	@JsonProperty("costDate_extendedstatus")
	private String costDateExtendedStatus;

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public double getCostDate() {
		return costDate;
	}

	public void setCostDate(double costDate) {
		this.costDate = costDate;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Date getOwningDate() {
		return owningDate;
	}

	public void setOwningDate(Date owningDate) {
		this.owningDate = owningDate;
	}

	public String getTypeProperty() {
		return typeProperty;
	}

	public void setTypeProperty(String typeProperty) {
		this.typeProperty = typeProperty;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getOtherTypeProperty() {
		return otherTypeProperty;
	}

	public void setOtherTypeProperty(String otherTypeProperty) {
		this.otherTypeProperty = otherTypeProperty;
	}

	public String getCostDateExtendedStatus() {
		return costDateExtendedStatus;
	}

	public void setCostDateExtendedStatus(String costDateExtendedStatus) {
		this.costDateExtendedStatus = costDateExtendedStatus;
	}

	public Map<String, Rights> getRights() {
		return rights;
	}

	public void setRights(Map<String, Rights> rights) {
		this.rights = rights;
	}

}
