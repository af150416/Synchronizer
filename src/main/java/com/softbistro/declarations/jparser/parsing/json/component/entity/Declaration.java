package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Declaration implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;

	@JsonProperty("created_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
	private Date createdDate;

	@JsonProperty("lastmodified_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
	private Date lastModifiedDate;

	@JsonProperty("data")
	private DeclarantData declarantDatas;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DeclarantData getDeclarantDatas() {
		return declarantDatas;
	}

	public void setDeclarantDatas(DeclarantData declarantDatas) {
		this.declarantDatas = declarantDatas;
	}

}
