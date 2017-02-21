package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class for working with personal property except vehicles declaration
 * 
 * @author zviproject
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalPropertyExceptVehicles implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("person")
	private String personId;

	private Map<String, Rights> rights;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
	private Date dateUse;

	@JsonProperty("acqPeriod")
	private String whenTakeProperty;

	private String iteration;

	private String trademark;

	private String objectType;

	private boolean acqBeforeFD;

	private String costDateUse;

	private String propertyDescr;

	private String otherObjectType;

	@JsonProperty("manufacturerName")
	private String manuFacturerName;

	@JsonProperty("dateUse_extendedstatus")
	private Integer dateUseExtendedStatus;

	@JsonProperty("trademark_extendedstatus")
	private Integer tradeMarkExtendedStatus;

	@JsonProperty("costDateUse_extendedstatus")
	private Integer costDateUseExtendedStatus;

	@JsonProperty("manufacturerName_extendedstatus")
	private Integer manuFacturerNameExtendedStatus;

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public Map<String, Rights> getRights() {
		return rights;
	}

	public void setRights(Map<String, Rights> rights) {
		this.rights = rights;
	}

	public Date getDateUse() {
		return dateUse;
	}

	public void setDateUse(Date dateUse) {
		this.dateUse = dateUse;
	}

	public String getWhenTakeProperty() {
		return whenTakeProperty;
	}

	public void setWhenTakeProperty(String whenTakeProperty) {
		this.whenTakeProperty = whenTakeProperty;
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

	public boolean isAcqBeforeFD() {
		return acqBeforeFD;
	}

	public void setAcqBeforeFD(boolean acqBeforeFD) {
		this.acqBeforeFD = acqBeforeFD;
	}

	public String getCostDateUse() {
		return costDateUse;
	}

	public void setCostDateUse(String costDateUse) {
		this.costDateUse = costDateUse;
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

	public String getManuFacturerName() {
		return manuFacturerName;
	}

	public void setManuFacturerName(String manuFacturerName) {
		this.manuFacturerName = manuFacturerName;
	}

	public Integer getDateUseExtendedStatus() {
		return dateUseExtendedStatus;
	}

	public void setDateUseExtendedStatus(Integer dateUseExtendedStatus) {
		this.dateUseExtendedStatus = dateUseExtendedStatus;
	}

	public Integer getTradeMarkExtendedStatus() {
		return tradeMarkExtendedStatus;
	}

	public void setTradeMarkExtendedStatus(Integer tradeMarkExtendedStatus) {
		this.tradeMarkExtendedStatus = tradeMarkExtendedStatus;
	}

	public Integer getCostDateUseExtendedStatus() {
		return costDateUseExtendedStatus;
	}

	public void setCostDateUseExtendedStatus(Integer costDateUseExtendedStatus) {
		this.costDateUseExtendedStatus = costDateUseExtendedStatus;
	}

	public Integer getManuFacturerNameExtendedStatus() {
		return manuFacturerNameExtendedStatus;
	}

	public void setManuFacturerNameExtendedStatus(Integer manuFacturerNameExtendedStatus) {
		this.manuFacturerNameExtendedStatus = manuFacturerNameExtendedStatus;
	}

}
