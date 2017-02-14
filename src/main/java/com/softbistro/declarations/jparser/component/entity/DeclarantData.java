package com.softbistro.declarations.jparser.component.entity;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeclarantData {

	@JsonProperty("step_0")
	private DeclarationType declarationType;

	@JsonProperty("step_1")
	private SubjectInfo subjectInfo;

	@JsonProperty("step_2")
	private Map<String, SubjectFamily> familys;

	@JsonProperty("step_3")
	private Map<String, Realty> realties;

	@JsonProperty("step_6")
	private Map<String, Movable> movables;

	@JsonProperty("step_11")
	private Map<String, MoneyGifts> moneyGifts;

	@JsonProperty("step_12")
	private Map<String, CashAssets> cashAssets;

	/**
	 * Checking case on null
	 * 
	 * @param object
	 * @return
	 */
	private boolean objectIsNull(Map<String, Object> checkinMap) {
		return checkinMap.isEmpty();
	}

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

	public Map<String, SubjectFamily> getFamilys() {
		return familys;
	}

	public void setFamilys(Map<String, SubjectFamily> familys) {
		if (!familys.isEmpty()) {
			this.familys = familys;
		}

	}

	public Map<String, Realty> getRealties() {
		return realties;
	}

	public void setRealties(Map<String, Realty> realties) {
		// if (objectIsNull(realties))
		this.realties = realties;
	}

	public Map<String, Movable> getMovables() {
		return movables;
	}

	public void setMovables(Map<String, Movable> movables) {
		// if (objectIsNull(movables))
		this.movables = movables;
	}

	public Map<String, MoneyGifts> getMoneyGifts() {
		return moneyGifts;
	}

	public void setMoneyGifts(Map<String, MoneyGifts> moneyGifts) {
		// if (objectIsNull(moneyGifts))
		this.moneyGifts = moneyGifts;
	}

	public Map<String, CashAssets> getCashAssets() {
		return cashAssets;
	}

	public void setCashAssets(Map<String, CashAssets> cashAssets) {
		// if (objectIsNull(cashAssets))
		this.cashAssets = cashAssets;
	}

}
