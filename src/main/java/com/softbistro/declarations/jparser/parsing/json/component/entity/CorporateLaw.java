package com.softbistro.declarations.jparser.parsing.json.component.entity;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Working with Corporate law declaration
 * 
 * @author zviproject
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CorporateLaw implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cost;

	private String name;

	@JsonProperty("rights")
	private Map<String, Rights> rights;

	private Integer country;

	@JsonProperty("en_name")
	private String enName;

	private String iteration;

	private String legalForm;

	@JsonProperty("cost_percent")
	private String costPercent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Rights> getRights() {
		return rights;
	}

	public void setRights(Map<String, Rights> rights) {
		this.rights = rights;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getIteration() {
		return iteration;
	}

	public void setIteration(String iteration) {
		this.iteration = iteration;
	}

	public String getLegalForm() {
		return legalForm;
	}

	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}

	public String getCostPercent() {
		return costPercent;
	}

	public void setCostPercent(String costPercent) {
		this.costPercent = costPercent;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}
