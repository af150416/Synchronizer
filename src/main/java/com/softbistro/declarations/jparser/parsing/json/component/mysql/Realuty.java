package com.softbistro.declarations.jparser.parsing.json.component.mysql;

import java.sql.Date;

/**
 * Entity for information about realuty of officials
 * 
 * @author cortes
 *
 */
public class Realuty {

	private int id;
	private Long personId;
	private String rightsId;
	private String costDate;
	private String iteration;
	private String totalArea;
	private String objectType;
	private Date owningDate;
	private Integer uaPostCode;
	private String otherObjectType;
	private String cityType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCostDate() {
		return costDate;
	}

	public void setCostDate(String costDate) {
		this.costDate = costDate;
	}

	public String getIteration() {
		return iteration;
	}

	public void setIteration(String iteration) {
		this.iteration = iteration;
	}

	public String getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(String totalArea) {
		this.totalArea = totalArea;
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

	public Integer getUaPostCode() {
		return uaPostCode;
	}

	public void setUaPostCode(Integer uaPostCode) {
		this.uaPostCode = uaPostCode;
	}

	public String getOtherObjectType() {
		return otherObjectType;
	}

	public void setOtherObjectType(String otherObjectType) {
		this.otherObjectType = otherObjectType;
	}

	public String getCityType() {
		return cityType;
	}

	public void setCityType(String cityType) {
		this.cityType = cityType;
	}

}
