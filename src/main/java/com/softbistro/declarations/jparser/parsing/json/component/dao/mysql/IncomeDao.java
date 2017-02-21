package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.softbistro.declarations.jparser.parsing.json.component.entity.CashAssets;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.entity.MoneyGifts;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Rights;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IIncome;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IRights;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Income;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;

public class IncomeDao implements IIncome {

	private IRights iRights;
	private List<ShortRights> batchRights;

	@Override
	public List<Income> getIncomeGifts(Declaration declaration, Integer personId, Integer rightId) {

		iRights = new RightsDao();
		List<Income> batchIncome = new ArrayList<>();
		batchRights = new ArrayList<>();
		if (declaration.getDeclarantDatas().getMoneyGifts() == null) {
			return batchIncome;
		}
		for (Map.Entry<String, MoneyGifts> entry : declaration.getDeclarantDatas().getMoneyGifts().entrySet()) {

			if (entry.getValue().getRights() != null) {

				for (Map.Entry<String, Rights> right : entry.getValue().getRights().entrySet()) {
					Income income = new Income();
					ShortRights rights = iRights.getRights(right, rightId);
					batchRights.add(rights);

					if (declaration.getDeclarantDatas().getRealties() != null) {
						income.setPersonId(Long.valueOf(personId));
						income.setRightsId(Long.valueOf(rights.getPersonId()));
						income.setIteration(entry.getKey());
						income.setObjectType(entry.getValue().getObjectType());
						income.setIncomeSize(entry.getValue().getSizeIncome());
						income.setIncomeSource(entry.getValue().getIncomeSource());
						income.setSourceCitizen(entry.getValue().getSourceCitizen());
						income.setSourceUaCompanyName(entry.getValue().getSourseUaCompanyName());
					}
					batchIncome.add(income);
				}
			}
		}

		return batchIncome;
	}

	@Override
	public List<ShortRights> getRights() {
		return batchRights;
	}

	@Override
	public List<Income> getIncomeCashAssets(Declaration declaration, Integer personId, Integer rightId) {

		iRights = new RightsDao();
		List<Income> batchIncome = new ArrayList<>();
		batchRights = new ArrayList<>();
		if (declaration.getDeclarantDatas().getCashAssets() == null) {
			return batchIncome;
		}
		for (Map.Entry<String, CashAssets> entry : declaration.getDeclarantDatas().getCashAssets().entrySet()) {

			if (entry.getValue().getRights() != null) {

				for (Map.Entry<String, Rights> right : entry.getValue().getRights().entrySet()) {
					Income income = new Income();
					ShortRights rights = iRights.getRights(right, rightId);
					batchRights.add(rights);

					if (declaration.getDeclarantDatas().getRealties() != null) {
						income.setPersonId(Long.valueOf(personId));
						income.setRightsId(Long.valueOf(rights.getPersonId()));
						income.setObjectType(entry.getValue().getObjectType());
						income.setSizeAssets(entry.getValue().getSizeAssets());
						income.setOrganization(entry.getValue().getOrganization());
						income.setOrganizationType(entry.getValue().getOrganizationType());
						income.setAssetsCurrency(entry.getValue().getAssetsCurrency());
						income.setOrganizationUaCompanyName(entry.getValue().getOrganizationUaCompanyName());
					}
					batchIncome.add(income);
				}
			}
		}
		return batchIncome;
	}

}
