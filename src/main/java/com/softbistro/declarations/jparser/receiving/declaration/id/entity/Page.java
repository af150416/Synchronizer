package com.softbistro.declarations.jparser.receiving.declaration.id.entity;

public class Page {
	public Integer currentPage;
	public Integer batchSize;
	public Integer totalItems;
	
	public Page(){
		
	}
	
	public Page(Integer currentPage, Integer batchSize, Integer totalItems) {
		super();
		this.currentPage = currentPage;
		this.batchSize = batchSize;
		this.totalItems = totalItems;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}
	public Integer getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}	
}
