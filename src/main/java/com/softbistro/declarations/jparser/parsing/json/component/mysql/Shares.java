package com.softbistro.declarations.jparser.parsing.json.component.mysql;

import java.sql.Date;
/**
 * Entity for information about shares, securities
 * @author cortes
 *
 */
public class Shares {

	private int id;
	private int cost;
	private int amount;
	private int personId;
	private int rightsId;
	private String emitent;
	private int iteration;
	private Date owningDate;
	private String emitentType;
	private String typeProperty;
	private String emitentUaConmpanyName;
	private String name;
	private int country;
	private String enName;
	private String legalForm;
	private double costPercent;
	private String location;
	private int costDateOrigin;
	private String descriptionObject;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getRightsId() {
		return rightsId;
	}

	public void setRightsId(int rightsId) {
		this.rightsId = rightsId;
	}

	public String getEmitent() {
		return emitent;
	}

	public void setEmitent(String emitent) {
		this.emitent = emitent;
	}

	public int getIteration() {
		return iteration;
	}

	public void setIteration(int iteration) {
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

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
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

	public double getCostPercent() {
		return costPercent;
	}

	public void setCostPercent(double costPercent) {
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

}
