package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Working with recipient pay declaration
 * @author zviproject
 *
 */
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipientPay implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("name")
	private String name;

	@JsonProperty("person")
	private String person;

	@JsonProperty("country")
	private String country;

	@JsonProperty("en_name")
	private String enName;

	@JsonProperty("location")
	private String location;

	@JsonProperty("legalForm")
	private String legalForm;

	@JsonProperty("uafirm_reestrCode")
	private String uafirmReestrCode;

	@JsonProperty("fax_extendedstatus")
	private Integer faxExtendedstatus;

	@JsonProperty("mail_extendedstatus")
	private Integer mailExtendedstatus;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLegalForm() {
		return legalForm;
	}

	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}

	public String getUafirmReestrCode() {
		return uafirmReestrCode;
	}

	public void setUafirmReestrCode(String uafirmReestrCode) {
		this.uafirmReestrCode = uafirmReestrCode;
	}

	public Integer getFaxExtendedstatus() {
		return faxExtendedstatus;
	}

	public void setFaxExtendedstatus(Integer faxExtendedstatus) {
		this.faxExtendedstatus = faxExtendedstatus;
	}

	public Integer getMailExtendedstatus() {
		return mailExtendedstatus;
	}

	public void setMailExtendedstatus(Integer mailExtendedstatus) {
		this.mailExtendedstatus = mailExtendedstatus;
	}

}
