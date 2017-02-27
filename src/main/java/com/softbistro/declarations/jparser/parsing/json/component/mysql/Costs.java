package com.softbistro.declarations.jparser.parsing.json.component.mysql;

/**
 * Entity for information about costs of officials
 * 
 * @author cortes
 *
 */
public class Costs {

	private int id;
	private String specExpenses;
	private String specOtherExpenses;
	private String specExpensesSubject;
	private String specExpensesOtherSubject;
	private String specExpensesAssetsSubject;
	private String specExpensesRealtySubject;
	private String specExpensesMovableSubject;
	private String specExpensesOtherRealtySubject;
	private String specExpensesOtherMovableSubject;
	private Long personId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecExpenses() {
		return specExpenses;
	}

	public void setSpecExpenses(String specExpenses) {
		this.specExpenses = specExpenses;
	}

	public String getSpecOtherExpenses() {
		return specOtherExpenses;
	}

	public void setSpecOtherExpenses(String specOtherExpenses) {
		this.specOtherExpenses = specOtherExpenses;
	}

	public String getSpecExpensesSubject() {
		return specExpensesSubject;
	}

	public void setSpecExpensesSubject(String specExpensesSubject) {
		this.specExpensesSubject = specExpensesSubject;
	}

	public String getSpecExpensesOtherSubject() {
		return specExpensesOtherSubject;
	}

	public void setSpecExpensesOtherSubject(String specExpensesOtherSubject) {
		this.specExpensesOtherSubject = specExpensesOtherSubject;
	}

	public String getSpecExpensesAssetsSubject() {
		return specExpensesAssetsSubject;
	}

	public void setSpecExpensesAssetsSubject(String specExpensesAssetsSubject) {
		this.specExpensesAssetsSubject = specExpensesAssetsSubject;
	}

	public String getSpecExpensesRealtySubject() {
		return specExpensesRealtySubject;
	}

	public void setSpecExpensesRealtySubject(String specExpensesRealtySubject) {
		this.specExpensesRealtySubject = specExpensesRealtySubject;
	}

	public String getSpecExpensesMovableSubject() {
		return specExpensesMovableSubject;
	}

	public void setSpecExpensesMovableSubject(String specExpensesMovableSubject) {
		this.specExpensesMovableSubject = specExpensesMovableSubject;
	}

	public String getSpecExpensesOtherRealtySubject() {
		return specExpensesOtherRealtySubject;
	}

	public void setSpecExpensesOtherRealtySubject(String specExpensesOtherRealtySubject) {
		this.specExpensesOtherRealtySubject = specExpensesOtherRealtySubject;
	}

	public String getSpecExpensesOtherMovableSubject() {
		return specExpensesOtherMovableSubject;
	}

	public void setSpecExpensesOtherMovableSubject(String specExpensesOtherMovableSubject) {
		this.specExpensesOtherMovableSubject = specExpensesOtherMovableSubject;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

}
