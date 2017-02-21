package com.softbistro.declarations.jparser.parsing.json.component.mysql;

import java.sql.Date;

/**
 * Entity for vechicles of officials
 * 
 * @author cortes
 *
 */
public class Vechicles {

	private int id;
	private String brand;
	private String model;
	private Long personId;
	private String rightsId;
	private Double costDate;
	private String iteration;
	private String objectType;
	private Date owningDate;
	private Integer graduationYear;
	private String otherObjectType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getRightsId() {
		return rightsId;
	}
	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}
	public Double getCostDate() {
		return costDate;
	}
	public void setCostDate(Double costDate) {
		this.costDate = costDate;
	}
	public String getIteration() {
		return iteration;
	}
	public void setIteration(String iteration) {
		this.iteration = iteration;
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
	public Integer getGraduationYear() {
		return graduationYear;
	}
	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}
	public String getOtherObjectType() {
		return otherObjectType;
	}
	public void setOtherObjectType(String otherObjectType) {
		this.otherObjectType = otherObjectType;
	}

	
}
