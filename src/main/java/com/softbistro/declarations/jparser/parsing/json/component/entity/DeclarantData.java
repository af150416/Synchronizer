package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeclarantData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("step_0")
	private DeclarationType declarationType;

	@JsonProperty("step_1")
	private SubjectInfo subjectInfo;

	@JsonProperty("step_2")
	private Map<String, SubjectFamily> subjectFamily;

	@JsonProperty("step_3")
	private Map<String, Realty> realties;

	@JsonProperty("step_5")
	private Map<String, PersonalPropertyExceptVehicles> personalPropertyExceptVehicles;

	@JsonProperty("step_6")
	private Map<String, Movable> movables;

	@JsonProperty("step_7")
	private Map<String, Securities> securities;

	@JsonProperty("step_8")
	private Map<String, CorporateLaw> corporateLaw;

	@JsonProperty("step_9")
	private Map<String, RecipientPay> recipientPay;
	@JsonProperty("step_11")
	private Map<String, MoneyGifts> moneyGifts;

	@JsonProperty("step_12")
	private Map<String, CashAssets> cashAssets;

	public DeclarationType getDeclarationType() {
		return declarationType;
	}

	public void setDeclarationType(DeclarationType declarationType) {
		this.declarationType = declarationType;
	}

	public SubjectInfo getSubjectInfo() {
		return subjectInfo;
	}

	public void setSubjectInfo(SubjectInfo subjectInfo) {
		this.subjectInfo = subjectInfo;
	}

	public Map<String, Realty> getRealties() {
		return realties;
	}

	public void setRealties(Map<String, Realty> realties) {
		this.realties = realties;
	}

	public Map<String, Movable> getMovables() {
		return movables;
	}

	public void setMovables(Map<String, Movable> movables) {
		this.movables = movables;
	}

	public Map<String, SubjectFamily> getSubjectFamily() {
		return subjectFamily;
	}

	public void setSubjectFamily(Map<String, SubjectFamily> subjectFamily) {
		this.subjectFamily = subjectFamily;
	}

	public Map<String, CashAssets> getCashAssets() {
		return cashAssets;
	}

	public void setCashAssets(Map<String, CashAssets> cashAssets) {
		this.cashAssets = cashAssets;
	}

	public Map<String, MoneyGifts> getMoneyGifts() {
		return moneyGifts;
	}

	public void setMoneyGifts(Map<String, MoneyGifts> moneyGifts) {
		this.moneyGifts = moneyGifts;
	}

	public Map<String, PersonalPropertyExceptVehicles> getPersonalPropertyExceptVehicles() {
		return personalPropertyExceptVehicles;
	}

	public void setPersonalPropertyExceptVehicles(
			Map<String, PersonalPropertyExceptVehicles> personalPropertyExceptVehicles) {
		this.personalPropertyExceptVehicles = personalPropertyExceptVehicles;
	}

	public Map<String, Securities> getSecurities() {
		return securities;
	}

	public void setSecurities(Map<String, Securities> securities) {
		this.securities = securities;
	}

	public Map<String, CorporateLaw> getCorporateLaw() {
		return corporateLaw;
	}

	public void setCorporateLaw(Map<String, CorporateLaw> corporateLaw) {
		this.corporateLaw = corporateLaw;
	}

	public Map<String, RecipientPay> getRecipientPay() {
		return recipientPay;
	}

	public void setRecipientPay(Map<String, RecipientPay> recipientPay) {
		this.recipientPay = recipientPay;
	}

}