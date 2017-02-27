package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Realty;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Rights;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IRealuty;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IRights;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Realuty;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;
/**
 * Dao for work with entity Realuty
 * @author cortes
 *
 */
@Repository
public class RealutyDao implements IRealuty {

	private IRights iRights;
	private List<ShortRights> batchRights;

	@Override
	public List<Realuty> getRealuty(Declaration declaration, Integer personId) {

		iRights = new RightsDao();
		List<Realuty> batchRealuty = new ArrayList<>();
		batchRights = new ArrayList<>();
		if (declaration.getDeclarantDatas().getRealties() == null) {
			return batchRealuty;
		}
		for (Map.Entry<String, Realty> entry : declaration.getDeclarantDatas().getRealties().entrySet()) {

			if (entry.getValue().getRights() != null) {

				for (Map.Entry<String, Rights> right : entry.getValue().getRights().entrySet()) {
					Realuty subjectRealuty = new Realuty();
					ShortRights rights = iRights.getRights(right, personId);
					batchRights.add(rights);

					if (declaration.getDeclarantDatas().getRealties() != null) {
						subjectRealuty.setPersonId(Long.valueOf(personId));
						if (StringUtils.isNotBlank(entry.getValue().getCost())) {
							subjectRealuty.setCostDate(entry.getValue().getCost());
						}
						subjectRealuty.setIteration(entry.getKey());
						subjectRealuty.setOwningDate(entry.getValue().getOwningDate());
						if (StringUtils.isNotBlank(entry.getValue().getTotalArea())) {
							subjectRealuty.setTotalArea(entry.getValue().getTotalArea());
						}
						subjectRealuty.setObjectType(entry.getValue().getObjectType());
						if (entry.getValue().getPostCode() != null) {
							subjectRealuty.setUaPostCode(entry.getValue().getPostCode());
						}
						subjectRealuty.setOtherObjectType(entry.getValue().getOtherObjectTyope());
						subjectRealuty.setCityType(entry.getValue().getCityType());
					}
					batchRealuty.add(subjectRealuty);
				}
			}
		}

		return batchRealuty;
	}

	@Override
	public List<ShortRights> getRights() {
		return batchRights;
	}

}
