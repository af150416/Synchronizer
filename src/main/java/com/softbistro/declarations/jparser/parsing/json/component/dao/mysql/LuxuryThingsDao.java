package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.entity.PersonalPropertyExceptVehicles;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Rights;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.ILuxuryThings;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IRights;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.LuxuryThings;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;
/**
 * Dao for work with entity LuxuryThings
 * @author cortes
 *
 */
@Repository
public class LuxuryThingsDao implements ILuxuryThings {

	private IRights iRights;
	private List<ShortRights> batchRights;

	@Override
	public List<LuxuryThings> getLuxuryThings(Declaration declaration, Integer personId) {

		iRights = new RightsDao();
		List<LuxuryThings> batchLuxuryThings = new ArrayList<>();
		batchRights = new ArrayList<>();
		if (declaration.getDeclarantDatas().getPersonalPropertyExceptVehicles() == null) {
			return batchLuxuryThings;
		}
		for (Map.Entry<String, PersonalPropertyExceptVehicles> entry : declaration.getDeclarantDatas()
				.getPersonalPropertyExceptVehicles().entrySet()) {

			if (entry.getValue().getRights() != null) {

				for (Map.Entry<String, Rights> right : entry.getValue().getRights().entrySet()) {
					LuxuryThings thing = new LuxuryThings();
					ShortRights rights = iRights.getRights(right, personId);
					batchRights.add(rights);

					if (declaration.getDeclarantDatas().getPersonalPropertyExceptVehicles() != null) {
						thing.setPersonId(Long.valueOf(personId));
						thing.setIteration(entry.getKey());
						thing.setDateUse(entry.getValue().getDateUse());
						thing.setTrademark(entry.getValue().getTrademark());
						thing.setObjectType(entry.getValue().getObjectType());
						thing.setPropertyDescr(entry.getValue().getPropertyDescr());
						thing.setOtherObjectType(entry.getValue().getOtherObjectType());
						thing.setManufacturerName(entry.getValue().getManuFacturerName());
					}
					batchLuxuryThings.add(thing);
				}
			}
		}

		return batchLuxuryThings;
	}

	@Override
	public List<ShortRights> getRights() {
		return batchRights;
	}

}
