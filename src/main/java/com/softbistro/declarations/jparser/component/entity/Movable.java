package com.softbistro.declarations.jparser.component.entity;

import java.sql.Date;
import java.util.List;

public class Movable {
	private int id;
	private String barnd;
	private String model;
	private String person;
	private List<Rights> rights;
	private double costDate;
	private String objectType;
	private Date owningDate;
	private String typeProperty;
	private int graduationYear;
	private String otherTypeProperty;
	private String costDateExtendedStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarnd() {
		return barnd;
	}

	public void setBarnd(String barnd) {
		this.barnd = barnd;
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

	public List<Rights> getRights() {
		return rights;
	}

	public void setRights(List<Rights> rights) {
		this.rights = rights;
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

}
