package com.softbistro.declarations.jparser.receiving.declaration.id.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stagingDeclaration")
public class StagingDeclaration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer uid;
	
	@Column(name = "declaration_id")
	private String id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "last_name")
	private String lastname;
	
	@Column(name = "work_place")
	private String placeOfWork;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "pdf_link")
	private String linkPDF;
	
	@Column(name = "status")
	private String status;
	
	public StagingDeclaration(){
		
	}

	public StagingDeclaration(String id, String firstname, String lastname, String placeOfWork, String position,
			String linkPDF) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.placeOfWork = placeOfWork;
		this.position = position;
		this.linkPDF = linkPDF;
		this.status = "new";
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPlaceOfWork() {
		return placeOfWork;
	}

	public void setPlaceOfWork(String placeOfWork) {
		this.placeOfWork = placeOfWork;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLinkPDF() {
		return linkPDF;
	}

	public void setLinkPDF(String linkPDF) {
		this.linkPDF = linkPDF;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString(){
		return new StringBuilder()+getLastname()+" "+getFirstname()+" "+getId();
		
	}
}