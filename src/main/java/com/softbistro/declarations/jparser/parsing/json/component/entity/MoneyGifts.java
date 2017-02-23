package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoneyGifts {
	private Integer id;

	@JsonProperty("person")
	private String personId;

	@JsonProperty("rights")
	private Map<String, Rights> rights;

	private String objectType;

	private double sizeIncome;

	private String incomeSource;

	@JsonProperty("source_citizen")
	private String sourceCitizen;

	private String otherObjectType;

	@JsonProperty("source_ua_lastname")
	private String sourceUaLastName;

	@JsonProperty("source_eng_lastname")
	private String sourceEngLastName;

	@JsonProperty("source_ua_firstname")
	private String sourceUaFirstName;

	@JsonProperty("source_ukr_lastname")
	private String sourseUkrLastName;

	@JsonProperty("source_eng_firstname")
	private String sourseEngFirstName;

	@JsonProperty("source_ua_middlename")
	private String sourseUaMiddleName;

	@JsonProperty("source_ukr_firstname")
	private String sourseUkrFirstName;

	@JsonProperty("source_eng_middlename")
	private String sourseEngMiddleName;

	@JsonProperty("source_ukr_middlename")
	private String sourseUkrMiddleName;

	@JsonProperty("source_ua_company_name")
	private String sourseUaCompanyName;

	@JsonProperty("source_eng_company_name")
	private String sourseEngCompanyName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getIncomeSource() {
		return incomeSource;
	}

	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}

	public String getSourceCitizen() {
		return sourceCitizen;
	}

	public void setSourceCitizen(String sourceCitizen) {
		this.sourceCitizen = sourceCitizen;
	}

	public String getOtherObjectType() {
		return otherObjectType;
	}

	public void setOtherObjectType(String otherObjectType) {
		this.otherObjectType = otherObjectType;
	}

	public String getSourceUaLastName() {
		return sourceUaLastName;
	}

	public void setSourceUaLastName(String sourceUaLastName) {
		this.sourceUaLastName = sourceUaLastName;
	}

	public String getSourceEngLastName() {
		return sourceEngLastName;
	}

	public void setSourceEngLastName(String sourceEngLastName) {
		this.sourceEngLastName = sourceEngLastName;
	}

	public String getSourceUaFirstName() {
		return sourceUaFirstName;
	}

	public void setSourceUaFirstName(String sourceUaFirstName) {
		this.sourceUaFirstName = sourceUaFirstName;
	}

	public String getSourseUkrLastName() {
		return sourseUkrLastName;
	}

	public void setSourseUkrLastName(String sourseUkrLastName) {
		this.sourseUkrLastName = sourseUkrLastName;
	}

	public String getSourseEngFirstName() {
		return sourseEngFirstName;
	}

	public void setSourseEngFirstName(String sourseEngFirstName) {
		this.sourseEngFirstName = sourseEngFirstName;
	}

	public String getSourseUaMiddleName() {
		return sourseUaMiddleName;
	}

	public void setSourseUaMiddleName(String sourseUaMiddleName) {
		this.sourseUaMiddleName = sourseUaMiddleName;
	}

	public String getSourseUkrFirstName() {
		return sourseUkrFirstName;
	}

	public void setSourseUkrFirstName(String sourseUkrFirstName) {
		this.sourseUkrFirstName = sourseUkrFirstName;
	}

	public String getSourseEngMiddleName() {
		return sourseEngMiddleName;
	}

	public void setSourseEngMiddleName(String sourseEngMiddleName) {
		this.sourseEngMiddleName = sourseEngMiddleName;
	}

	public String getSourseUkrMiddleName() {
		return sourseUkrMiddleName;
	}

	public void setSourseUkrMiddleName(String sourseUkrMiddleName) {
		this.sourseUkrMiddleName = sourseUkrMiddleName;
	}

	public String getSourseUaCompanyName() {
		return sourseUaCompanyName;
	}

	public void setSourseUaCompanyName(String sourseUaCompanyName) {
		this.sourseUaCompanyName = sourseUaCompanyName;
	}

	public String getSourseEngCompanyName() {
		return sourseEngCompanyName;
	}

	public void setSourseEngCompanyName(String sourseEngCompanyName) {
		this.sourseEngCompanyName = sourseEngCompanyName;
	}

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

	public double getSizeIncome() {
		return sizeIncome;
	}

	public void setSizeIncome(double sizeIncome) {
		this.sizeIncome = sizeIncome;
	}

}
