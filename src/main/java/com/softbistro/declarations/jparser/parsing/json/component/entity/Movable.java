package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.sql.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movable {
	private int id;

	@JsonProperty("brand")
	private String brand;

	@JsonProperty("model")
	private String model;

	@JsonProperty("person")
	private String person;

	@JsonProperty("rights")
	private Map<String, Rights> rights;

	@JsonProperty("costDate")
	private double costDate;

	@JsonProperty("objectType")
	private String objectType;

	@JsonProperty("owningDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
	private Date owningDate;

	@JsonProperty("typeProperty")
	private String typeProperty;

	@JsonProperty("graduationYear")
	private int graduationYear;

	@JsonProperty("otherTypeProperty")
	private String otherTypeProperty;

	@JsonProperty("costDate_extendedstatus")
	private String costDateExtendedStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarnd() {
		return brand;
	}

	public void setBarnd(String barnd) {
		this.brand = barnd;
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
