package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CashAssets {

	@JsonProperty("person")
	private String personId;

	private Map<String, Rights> rights;

	private String objectType;

	private double sizeAssets;

	private String organization;

	private String assetsCurrency;

	private String otherObjectType;

	@JsonProperty("organization_type")
	private String organizationType;

	@JsonProperty("debtor_ua_lastname")
	private String deptorUaLastName;

	@JsonProperty("debtor_eng_lastname")
	private String deptorEngLastName;

	@JsonProperty("debtor_ua_firstname")
	private String deptorUaFirstName;

	@JsonProperty("debtor_ukr_lastname")
	private String deptorUkrLastName;

	@JsonProperty("debtor_eng_firstname")
	private String deptorEngFirstName;

	@JsonProperty("debtor_ua_middlename")
	private String deptorUaMiddleName;

	@JsonProperty("debtor_ukr_firstname")
	private String deptorUkrFirstName;

	@JsonProperty("debtor_eng_middlename")
	private String deptorEngMiddleName;

	@JsonProperty("debtor_ukr_middlename")
	private String deptorUkrMiddleName;

	@JsonProperty("organization_ua_company_name")
	private String organizationUaCompanyName;

	@JsonProperty("organization_eng_company_name")
	private String organizationEngCompanyName;

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public double getSizeAssets() {
		return sizeAssets;
	}

	public void setSizeAssets(double sizeAssets) {
		this.sizeAssets = sizeAssets;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getAssetsCurrency() {
		return assetsCurrency;
	}

	public void setAssetsCurrency(String assetsCurrency) {
		this.assetsCurrency = assetsCurrency;
	}

	public String getOtherObjectType() {
		return otherObjectType;
	}

	public void setOtherObjectType(String otherObjectType) {
		this.otherObjectType = otherObjectType;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getDeptorUaLastName() {
		return deptorUaLastName;
	}

	public void setDeptorUaLastName(String deptorUaLastName) {
		this.deptorUaLastName = deptorUaLastName;
	}

	public String getDeptorEngLastName() {
		return deptorEngLastName;
	}

	public void setDeptorEngLastName(String deptorEngLastName) {
		this.deptorEngLastName = deptorEngLastName;
	}

	public String getDeptorUaFirstName() {
		return deptorUaFirstName;
	}

	public void setDeptorUaFirstName(String deptorUaFirstName) {
		this.deptorUaFirstName = deptorUaFirstName;
	}

	public String getDeptorUkrLastName() {
		return deptorUkrLastName;
	}

	public void setDeptorUkrLastName(String deptorUkrLastName) {
		this.deptorUkrLastName = deptorUkrLastName;
	}

	public String getDeptorEngFirstName() {
		return deptorEngFirstName;
	}

	public void setDeptorEngFirstName(String deptorEngFirstName) {
		this.deptorEngFirstName = deptorEngFirstName;
	}

	public String getDeptorUaMiddleName() {
		return deptorUaMiddleName;
	}

	public void setDeptorUaMiddleName(String deptorUaMiddleName) {
		this.deptorUaMiddleName = deptorUaMiddleName;
	}

	public String getDeptorUkrFirstName() {
		return deptorUkrFirstName;
	}

	public void setDeptorUkrFirstName(String deptorUkrFirstName) {
		this.deptorUkrFirstName = deptorUkrFirstName;
	}

	public String getDeptorEngMiddleName() {
		return deptorEngMiddleName;
	}

	public void setDeptorEngMiddleName(String deptorEngMiddleName) {
		this.deptorEngMiddleName = deptorEngMiddleName;
	}

	public String getDeptorUkrMiddleName() {
		return deptorUkrMiddleName;
	}

	public void setDeptorUkrMiddleName(String deptorUkrMiddleName) {
		this.deptorUkrMiddleName = deptorUkrMiddleName;
	}

	public String getOrganizationUaCompanyName() {
		return organizationUaCompanyName;
	}

	public void setOrganizationUaCompanyName(String organizationUaCompanyName) {
		this.organizationUaCompanyName = organizationUaCompanyName;
	}

	public String getOrganizationEngCompanyName() {
		return organizationEngCompanyName;
	}

	public void setOrganizationEngCompanyName(String organizationEngCompanyName) {
		this.organizationEngCompanyName = organizationEngCompanyName;
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

}
