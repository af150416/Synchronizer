package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rights implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String citizen;

	@JsonProperty("ua_city")
	private String uaCity;

	@JsonProperty("ua_lastname")
	private String uaLastName;

	@JsonProperty("ua_postCode")
	private String uaPostCode;

	@JsonProperty("eng_lastname")
	private String engLastName;

	@JsonProperty("eng_postCode")
	private String engPostCode;

	private String rightBelongs;

	@JsonProperty("ua_firstname")
	private String uaFirstName;

	@JsonProperty("ukr_lastname")
	private String ukrLastName;

	private String ownerShipType;

	@JsonProperty("ua_middlename")
	private String uaMiddleName;

	private String otherOwnerShip;

	@JsonProperty("rights_cityPath")
	private String rightsCityPath;

	@JsonProperty("ua_company_name")
	private String uaCompanyName;

	@JsonProperty("eng_company_name")
	private String engCompanyName;

	@JsonProperty("percent-ownership")
	private String percentOwnerShip;

	public String getCitizen() {
		return citizen;
	}

	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}

	public String getUaCity() {
		return uaCity;
	}

	public void setUaCity(String uaCity) {
		this.uaCity = uaCity;
	}

	public String getUaLastName() {
		return uaLastName;
	}

	public void setUaLastName(String uaLastName) {
		this.uaLastName = uaLastName;
	}

	public String getUaPostCode() {
		return uaPostCode;
	}

	public void setUaPostCode(String uaPostCode) {
		this.uaPostCode = uaPostCode;
	}

	public String getEngLastName() {
		return engLastName;
	}

	public void setEngLastName(String engLastName) {
		this.engLastName = engLastName;
	}

	public String getEngPostCode() {
		return engPostCode;
	}

	public void setEngPostCode(String engPostCode) {
		this.engPostCode = engPostCode;
	}

	public String getUaFirstName() {
		return uaFirstName;
	}

	public void setUaFirstName(String uaFirstName) {
		this.uaFirstName = uaFirstName;
	}

	public String getUkrLastName() {
		return ukrLastName;
	}

	public void setUkrLastName(String ukrLastName) {
		this.ukrLastName = ukrLastName;
	}

	public String getOwnerShipType() {
		return ownerShipType;
	}

	public void setOwnerShipType(String ownerShipType) {
		this.ownerShipType = ownerShipType;
	}

	public String getUaMiddleName() {
		return uaMiddleName;
	}

	public void setUaMiddleName(String uaMiddleName) {
		this.uaMiddleName = uaMiddleName;
	}

	public String getOtherOwnerShip() {
		return otherOwnerShip;
	}

	public void setOtherOwnerShip(String otherOwnerShip) {
		this.otherOwnerShip = otherOwnerShip;
	}

	public String getRightsCityPath() {
		return rightsCityPath;
	}

	public void setRightsCityPath(String rightsCityPath) {
		this.rightsCityPath = rightsCityPath;
	}

	public String getUaCompanyName() {
		return uaCompanyName;
	}

	public void setUaCompanyName(String uaCompanyName) {
		this.uaCompanyName = uaCompanyName;
	}

	public String getEngCompanyName() {
		return engCompanyName;
	}

	public void setEngCompanyName(String engCompanyName) {
		this.engCompanyName = engCompanyName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRightBelongs() {
		return rightBelongs;
	}

	public void setRightBelongs(String rightBelongs) {
		this.rightBelongs = rightBelongs;
	}

	public String getPercentOwnerShip() {
		return percentOwnerShip;
	}

	public void setPercentOwnerShip(String percentOwnerShip) {
		this.percentOwnerShip = percentOwnerShip;
	}

}
