package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Working with securities declaration
 * 
 * @author zviproject
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Securities implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cost;

	private double amount;

	private String person;

	@JsonProperty("rights")
	private Map<String, Rights> rights;

	private String emitent;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
	private Date owningDate;

	@JsonProperty("emitent_type")
	private String emitentType;

	private String typeProperty;

	private String otherObjectType;

	private String subTypeProperty1;

	private String subTypeProperty2;

	@JsonProperty("emitent_ua_lastname")
	private String emitentUaLastname;

	@JsonProperty("emitent_ua_company_name")
	private String emitentUaCompanyName;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public Map<String, Rights> getRights() {
		return rights;
	}

	public void setRights(Map<String, Rights> rights) {
		this.rights = rights;
	}

	public String getEmitent() {
		return emitent;
	}

	public void setEmitent(String emitent) {
		this.emitent = emitent;
	}

	public Date getOwningDate() {
		return owningDate;
	}

	public void setOwningDate(Date owningDate) {
		this.owningDate = owningDate;
	}

	public String getEmitentType() {
		return emitentType;
	}

	public void setEmitentType(String emitentType) {
		this.emitentType = emitentType;
	}

	public String getTypeProperty() {
		return typeProperty;
	}

	public void setTypeProperty(String typeProperty) {
		this.typeProperty = typeProperty;
	}

	public String getOtherObjectType() {
		return otherObjectType;
	}

	public void setOtherObjectType(String otherObjectType) {
		this.otherObjectType = otherObjectType;
	}

	public String getSubTypeProperty1() {
		return subTypeProperty1;
	}

	public void setSubTypeProperty1(String subTypeProperty1) {
		this.subTypeProperty1 = subTypeProperty1;
	}

	public String getSubTypeProperty2() {
		return subTypeProperty2;
	}

	public void setSubTypeProperty2(String subTypeProperty2) {
		this.subTypeProperty2 = subTypeProperty2;
	}

	public String getEmitentUaLastname() {
		return emitentUaLastname;
	}

	public void setEmitentUaLastname(String emitentUaLastname) {
		this.emitentUaLastname = emitentUaLastname;
	}

	public String getEmitentUaCompanyName() {
		return emitentUaCompanyName;
	}

	public void setEmitentUaCompanyName(String emitentUaCompanyName) {
		this.emitentUaCompanyName = emitentUaCompanyName;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}
