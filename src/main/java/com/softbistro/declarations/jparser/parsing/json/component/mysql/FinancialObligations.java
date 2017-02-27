package com.softbistro.declarations.jparser.parsing.json.component.mysql;

import java.sql.Date;

/**
 * Entity for information credits
 * 
 * @author cortes
 *
 */
public class FinancialObligations {

	private int id;
	private Long personId;
	private String currency;
	private String guarantor;
	private Date dateOrigin;
	private String objectType;
	private double sizeObligation;
	private String emitentCitizen;
	private String otherObjectType;
	private boolean guarantorExist;
	private String emitentCompanyName;
	private String emitentFirstName;
	private String emitentLastName;
	private String emitentMiddleName;
	private String financialObligationsCol;
	private int subjectId;

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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(String guarantor) {
		this.guarantor = guarantor;
	}

	public Date getDateOrigin() {
		return dateOrigin;
	}

	public void setDateOrigin(Date dateOrigin) {
		this.dateOrigin = dateOrigin;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public double getSizeObligation() {
		return sizeObligation;
	}

	public void setSizeObligation(double sizeObligation) {
		this.sizeObligation = sizeObligation;
	}

	public String getEmitentCitizen() {
		return emitentCitizen;
	}

	public void setEmitentCitizen(String emitentCitizen) {
		this.emitentCitizen = emitentCitizen;
	}

	public String getOtherObjectType() {
		return otherObjectType;
	}

	public void setOtherObjectType(String otherObjectType) {
		this.otherObjectType = otherObjectType;
	}

	public boolean isGuarantorExist() {
		return guarantorExist;
	}

	public void setGuarantorExist(boolean guarantorExist) {
		this.guarantorExist = guarantorExist;
	}

	public String getEmitentCompanyName() {
		return emitentCompanyName;
	}

	public void setEmitentCompanyName(String emitentCompanyName) {
		this.emitentCompanyName = emitentCompanyName;
	}

	public String getEmitentFirstName() {
		return emitentFirstName;
	}

	public void setEmitentFirstName(String emitentFirstName) {
		this.emitentFirstName = emitentFirstName;
	}

	public String getEmitentLastName() {
		return emitentLastName;
	}

	public void setEmitentLastName(String emitentLastName) {
		this.emitentLastName = emitentLastName;
	}

	public String getEmitentMiddleName() {
		return emitentMiddleName;
	}

	public void setEmitentMiddleName(String emitentMiddleName) {
		this.emitentMiddleName = emitentMiddleName;
	}

	public String getFinancialObligationsCol() {
		return financialObligationsCol;
	}

	public void setFinancialObligationsCol(String financialObligationsCol) {
		this.financialObligationsCol = financialObligationsCol;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

}
