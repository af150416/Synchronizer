package com.softbistro.declarations.jparser.receiving.declaration.id.entity;

import java.util.List;

public class Response {
	public Page page;
	public List<StagingDeclaration> items;
	
	public Response(){
	}
	
	public Response(Page page, List<StagingDeclaration> items) {
		super();
		this.page = page;
		this.items = items;
	}
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<StagingDeclaration> getItems() {
		return items;
	}
	public void setItems(List<StagingDeclaration> items) {
		this.items = items;
	}
}