package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.entity.MoneyGifts;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Movable;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Rights;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IRights;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IVechicles;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Income;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Vechicles;

public class VechiclesDao implements IVechicles {

	private IRights iRights;
	private List<ShortRights> batchRights;

	@Override
	public List<Vechicles> getVechicles(Declaration declaration, Integer personId, Integer rightId) {

		iRights = new RightsDao();
		List<Vechicles> batchVechicles = new ArrayList<>();
		batchRights = new ArrayList<>();
		if (declaration.getDeclarantDatas().getMovables() == null) {
			return batchVechicles;
		}
		for (Map.Entry<String, Movable> entry : declaration.getDeclarantDatas().getMovables().entrySet()) {

			if (entry.getValue().getRights() != null) {

				for (Map.Entry<String, Rights> right : entry.getValue().getRights().entrySet()) {
					Vechicles vechicle = new Vechicles();
					ShortRights rights = iRights.getRights(right, rightId);
					batchRights.add(rights);

					if (declaration.getDeclarantDatas().getMovables() != null) {
						vechicle.setPersonId(Long.valueOf(personId));
						vechicle.setRightsId(Long.valueOf(rights.getPersonId()));
						vechicle.setIteration(entry.getKey());
						vechicle.setObjectType(entry.getValue().getObjectType());
						vechicle.setBrand(entry.getValue().getBarnd());
						vechicle.setModel(entry.getValue().getModel());
						vechicle.setCostDate(entry.getValue().getCostDate());
						vechicle.setGraduationYear(entry.getValue().getGraduationYear());
						vechicle.setObjectType(entry.getValue().getOtherTypeProperty());
						vechicle.setOwningDate(entry.getValue().getOwningDate());
					}
					batchVechicles.add(vechicle);
				}
			}
		}

		return batchVechicles;
	}

	@Override
	public List<ShortRights> getRights() {
		return batchRights;
	}

}
