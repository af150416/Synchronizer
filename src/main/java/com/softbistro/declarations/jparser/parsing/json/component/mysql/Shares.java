package com.softbistro.declarations.jparser.parsing.json.component.mysql;

import java.sql.Date;

/**
 * Entity for information about shares, securities
 * 
 * @author cortes
 *
 */
public class Shares {

	private int id;
	private String cost;
	private Double amount;
	private Long personId;
	private Long rightsId;
	private String emitent;
	private String iteration;
	private Date owningDate;
	private String emitentType;
	private String typeProperty;
	private String emitentUaConmpanyName;
	private String name;
	private String country;
	private String enName;
	private String legalForm;
	private String costPercent;
	private String location;
	private int costDateOrigin;
	private String descriptionObject;
	private String person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Long getRightsId() {
		return rightsId;
	}

	public void setRightsId(Long rightsId) {
		this.rightsId = rightsId;
	}

	public String getEmitent() {
		return emitent;
	}

	public void setEmitent(String emitent) {
		this.emitent = emitent;
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

	public String getEmitentUaConmpanyName() {
		return emitentUaConmpanyName;
	}

	public void setEmitentUaConmpanyName(String emitentUaConmpanyName) {
		this.emitentUaConmpanyName = emitentUaConmpanyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getLegalForm() {
		return legalForm;
	}

	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}

	public String getCostPercent() {
		return costPercent;
	}

	public void setCostPercent(String costPercent) {
		this.costPercent = costPercent;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCostDateOrigin() {
		return costDateOrigin;
	}

	public void setCostDateOrigin(int costDateOrigin) {
		this.costDateOrigin = costDateOrigin;
	}

	public String getDescriptionObject() {
		return descriptionObject;
	}

	public void setDescriptionObject(String descriptionObject) {
		this.descriptionObject = descriptionObject;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

}
