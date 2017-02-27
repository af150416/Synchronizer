package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Rights;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IRights;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;
/**
 * Dao for work with entity Rights
 * @author cortes
 *
 */
@Repository
public class RightsDao implements IRights {

	@Override
	public ShortRights getRights(Entry<String, Rights> right, Integer personId) {

		ShortRights rights = new ShortRights();
		if (right.getKey().equals("1")) {
			rights.setPersonId(personId + "");
		} else {
			rights.setPersonId(right.getKey());
		}
		rights.setCitizen(right.getValue().getCitizen());
		rights.setCity(right.getValue().getUaCity());
		rights.setUaLastName(right.getValue().getUaLastName());
		rights.setUaFirstName(right.getValue().getUaFirstName());
		rights.setUaMiddleName(right.getValue().getUaFirstName());
		rights.setEngLastName(right.getValue().getEngLastName());
		rights.setOwnershipType(right.getValue().getOwnerShipType());
		rights.setOtherOwnership(right.getValue().getOtherOwnerShip());
		rights.setUaCompanyName(right.getValue().getUaCompanyName());
		rights.setEngCompanyName(right.getValue().getEngCompanyName());
		rights.setPercentOwnership(right.getValue().getPercentOwnerShip());

		return rights;
	}

}
