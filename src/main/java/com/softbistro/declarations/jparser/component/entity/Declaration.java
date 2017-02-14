package com.softbistro.declarations.jparser.component.entity;

import java.sql.Date;
import java.util.List;

public class Declaration {
	private String id;
	private Date createdDate;
	private Date lastModifiedDate;
	private List<DeclarantData> declarantDatas;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public List<DeclarantData> getDeclarantDatas() {
		return declarantDatas;
	}

	public void setDeclarantDatas(List<DeclarantData> declarantDatas) {
		this.declarantDatas = declarantDatas;
	}

}
