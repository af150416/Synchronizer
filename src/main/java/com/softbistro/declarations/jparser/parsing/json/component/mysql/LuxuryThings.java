package com.softbistro.declarations.jparser.parsing.json.component.mysql;

import java.sql.Date;

/**
 * Entity for information about luxury things of officials
 * 
 * @author cortes
 *
 */
public class LuxuryThings {

	private int id;
	private Long personId;
	private String rightsId;
	private Date dateUse;
	private String iteration;
	private String trademark;
	private String objectType;
	private String propertyDescr;
	private String otherObjectType;
	private String manufacturerName;

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

	public Date getDateUse() {
		return dateUse;
	}

	public void setDateUse(Date dateUse) {
		this.dateUse = dateUse;
	}

	public String getIteration() {
		return iteration;
	}

	public void setIteration(String iteration) {
		this.iteration = iteration;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getPropertyDescr() {
		return propertyDescr;
	}

	public void setPropertyDescr(String propertyDescr) {
		this.propertyDescr = propertyDescr;
	}

	public String getOtherObjectType() {
		return otherObjectType;
	}

	public void setOtherObjectType(String otherObjectType) {
		this.otherObjectType = otherObjectType;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

}
