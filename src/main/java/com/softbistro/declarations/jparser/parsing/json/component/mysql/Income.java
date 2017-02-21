package com.softbistro.declarations.jparser.parsing.json.component.mysql;

/**
 * Entity for information about income of officials
 * 
 * @author cortes
 *
 */
public class Income {

	private int id;
	private Long personId;
	private Long rightsId;
	private String iteration;
	private String objectType;
	private Double incomeSize;
	private String incomeSource;
	private String sourceCitizen;
	private String sourceUaCompanyName;
	private Double sizeAssets;
	private String organization;
	private String organizationType;
	private String organizationUaCompanyName;
	private String assetsCurrency;
	private TypeIncome typeIncome;

	private enum TypeIncome {
		GIFT, ASSETS
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Long getRightsId() {
		return rightsId;
	}

	public void setRightsId(Long rightsId) {
		this.rightsId = rightsId;
	}

	public String getIteration() {
		return iteration;
	}

	public void setIteration(String iteration) {
		this.iteration = iteration;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Double getIncomeSize() {
		return incomeSize;
	}

	public void setIncomeSize(Double incomeSize) {
		this.incomeSize = incomeSize;
	}

	public String getIncomeSource() {
		return incomeSource;
	}

	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}

	public String getSourceCitizen() {
		return sourceCitizen;
	}

	public void setSourceCitizen(String sourceCitizen) {
		this.sourceCitizen = sourceCitizen;
	}

	public String getSourceUaCompanyName() {
		return sourceUaCompanyName;
	}

	public void setSourceUaCompanyName(String sourceUaCompanyName) {
		this.sourceUaCompanyName = sourceUaCompanyName;
	}

	public Double getSizeAssets() {
		return sizeAssets;
	}

	public void setSizeAssets(Double sizeAssets) {
		this.sizeAssets = sizeAssets;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getAssetsCurrency() {
		return assetsCurrency;
	}

	public void setAssetsCurrency(String assetsCurrency) {
		this.assetsCurrency = assetsCurrency;
	}

	public TypeIncome getTypeIncome() {
		return typeIncome;
	}

	public void setTypeIncome(TypeIncome typeIncome) {
		this.typeIncome = typeIncome;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getOrganizationUaCompanyName() {
		return organizationUaCompanyName;
	}

	public void setOrganizationUaCompanyName(String organizationUaCompanyName) {
		this.organizationUaCompanyName = organizationUaCompanyName;
	}

}
