package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.entity.MoneyGifts;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Rights;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IRights;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IVechicles;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Income;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Vechicles;

public class VechiclesDao implements IVechicles{
	
	private IRights IRights;
	private List<ShortRights> batchRights;

	@Override
	public List<Vechicles> getVechicles(Declaration declaration, Integer personId, Integer rightId) {

		IRights = new RightsDao();
		List<Vechicles> batchVechicles = new ArrayList<>();
		batchRights = new ArrayList<>();
		if(declaration.getDeclarantDatas().getMovables() == null) {
			return batchVechicles;
		}
		for (Map.Entry<String, MoneyGifts> entry : declaration.getDeclarantDatas().getMoneyGifts().entrySet()) {

			if (entry.getValue().getRights() != null) {

				for (Map.Entry<String, Rights> right : entry.getValue().getRights().entrySet()) {
					Vechicles vechicle = new Vechicles();
					ShortRights rights = IRights.getRights(right, rightId);
					batchRights.add(rights);

					if (declaration.getDeclarantDatas().getMovables() != null) {
						vechicle.setPersonId(Long.valueOf(personId));
						vechicle.setRightsId(Long.valueOf(rights.getPersonId()));
						vechicle.setIteration(entry.getKey());
						vechicle.setObjectType(entry.getValue().getObjectType());
						vechicle.setIncomeSize(entry.getValue().getSizeIncome());
						vechicle.setIncomeSource(entry.getValue().getIncomeSource());
						vechicle.setSourceCitizen(entry.getValue().getSourceCitizen());
						vechicle.setSourceUaCompanyName(entry.getValue().getSourseUaCompanyName());
					}
					batchVechicles.add(vechicle);
				}
			}
		}

		
		return null;
	}

	@Override
	public List<ShortRights> getRights() {
		// TODO Auto-generated method stub
		return null;
	}

}
