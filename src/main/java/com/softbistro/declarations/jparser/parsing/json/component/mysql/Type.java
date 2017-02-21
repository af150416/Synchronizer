package com.softbistro.declarations.jparser.parsing.json.component.mysql;

/**
 * Entity where store short data about decaration
 * 
 * @author cortes
 *
 */
public class Type {

	private int id;
	private String declarationId;
	private Integer personId;
	private Integer declarationType;
	private Integer declarationYear;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeclarationId() {
		return declarationId;
	}

	public void setDeclarationId(String declarationId) {
		this.declarationId = declarationId;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Integer getDeclarationType() {
		return declarationType;
	}

	public void setDeclarationType(Integer declarationType) {
		this.declarationType = declarationType;
	}

	public Integer getDeclarationYear() {
		return declarationYear;
	}

	public void setDeclarationYear(Integer declarationYear) {
		this.declarationYear = declarationYear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
