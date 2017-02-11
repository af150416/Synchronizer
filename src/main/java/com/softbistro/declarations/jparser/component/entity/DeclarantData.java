package com.softbistro.declarations.jparser.component.entity;

import java.util.List;

public class DeclarantData {
	private DeclarationType declarationType;
	private SubjectInfo subjectInfo;
	private List<SubjectFamily> subjectFamilys;
	private List<Realty> realties;
	private List<Movable> movables;
	private List<MoneyGifts> moneyGifts;
	private List<CashAssets> cashAssets;

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

	public List<SubjectFamily> getSubjectFamilys() {
		return subjectFamilys;
	}

	public void setSubjectFamilys(List<SubjectFamily> subjectFamilys) {
		this.subjectFamilys = subjectFamilys;
	}

	public List<Realty> getRealties() {
		return realties;
	}

	public void setRealties(List<Realty> realties) {
		this.realties = realties;
	}

	public List<Movable> getMovables() {
		return movables;
	}

	public void setMovables(List<Movable> movables) {
		this.movables = movables;
	}

	public List<MoneyGifts> getMoneyGifts() {
		return moneyGifts;
	}

	public void setMoneyGifts(List<MoneyGifts> moneyGifts) {
		this.moneyGifts = moneyGifts;
	}

	public List<CashAssets> getCashAssets() {
		return cashAssets;
	}

	public void setCashAssets(List<CashAssets> cashAssets) {
		this.cashAssets = cashAssets;
	}

}
