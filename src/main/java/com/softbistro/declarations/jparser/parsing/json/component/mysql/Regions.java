package com.softbistro.declarations.jparser.parsing.json.component.mysql;

/**
 * Entity for regions
 * 
 * @author cortes
 *
 */
public class Regions {

	private int id;
	private String regionName;
	private String regionId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

}
