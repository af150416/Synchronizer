package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.parsing.json.component.entity.CorporateLaw;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.entity.RecipientPay;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Rights;
import com.softbistro.declarations.jparser.parsing.json.component.entity.Securities;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IRights;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IShares;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Shares;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;

/**
 * Dao for work with entity Shares
 * @author cortes
 *
 */
@Repository
public class SharesDao implements IShares {

	private IRights iRights;
	private List<ShortRights> batchRights;

	@Override
	public List<Shares> getSecurities(Declaration declaration, Integer personId) {
		iRights = new RightsDao();
		List<Shares> batchSecurities = new ArrayList<>();
		batchRights = new ArrayList<>();
		if (declaration.getDeclarantDatas().getSecurities() == null) {
			return batchSecurities;
		}
		for (Map.Entry<String, Securities> entry : declaration.getDeclarantDatas().getSecurities().entrySet()) {

			if (entry.getValue().getRights() != null) {

				for (Map.Entry<String, Rights> right : entry.getValue().getRights().entrySet()) {
					Shares share = new Shares();
					ShortRights rights = iRights.getRights(right, personId);
					batchRights.add(rights);

					if (declaration.getDeclarantDatas().getSecurities() != null) {
						if (StringUtils.isNotBlank(entry.getValue().getCost())) {
							share.setCost(entry.getValue().getCost());
						}
						share.setPerson(entry.getValue().getPerson());
						share.setAmount(entry.getValue().getAmount());
						share.setPersonId(Long.valueOf(personId));
						share.setEmitent(entry.getValue().getEmitent());
						share.setIteration(entry.getKey());
						share.setOwningDate(entry.getValue().getOwningDate());
						share.setEmitentType(entry.getValue().getEmitentType());
						share.setTypeProperty(entry.getValue().getTypeProperty());
						share.setEmitentUaConmpanyName(entry.getValue().getEmitentUaCompanyName());
					}
					batchSecurities.add(share);
				}
			}
		}

		return batchSecurities;
	}

	@Override
	public List<ShortRights> getRights() {
		return batchRights;
	}

	@Override
	public List<Shares> getCorporateLaw(Declaration declaration, Integer personId) {
		iRights = new RightsDao();
		List<Shares> batchCorporateLaw = new ArrayList<>();
		batchRights = new ArrayList<>();
		if (declaration.getDeclarantDatas().getCorporateLaw() == null) {
			return batchCorporateLaw;
		}
		for (Map.Entry<String, CorporateLaw> entry : declaration.getDeclarantDatas().getCorporateLaw().entrySet()) {

			if (entry.getValue().getRights() != null) {

				for (Map.Entry<String, Rights> right : entry.getValue().getRights().entrySet()) {
					Shares corporateLaw = new Shares();
					ShortRights rights = iRights.getRights(right, personId);
					batchRights.add(rights);

					if (declaration.getDeclarantDatas().getCorporateLaw() != null) {
						corporateLaw.setPersonId(Long.valueOf(personId));
						corporateLaw.setCost(entry.getValue().getCost());
						corporateLaw.setName(entry.getValue().getName());
						corporateLaw.setIteration(entry.getKey());
						corporateLaw.setLegalForm(entry.getValue().getLegalForm());
						if (entry.getValue().getCountry() != null) {
							corporateLaw.setCountry(entry.getValue().getCountry().toString());
						}
						if (StringUtils.isNotBlank(entry.getValue().getCostPercent())) {
							corporateLaw.setCostPercent(entry.getValue().getCostPercent());
						}

					}
					batchCorporateLaw.add(corporateLaw);
				}
			}
		}

		return batchCorporateLaw;
	}

	@Override
	public List<Shares> getRepicientPay(Declaration declaration, Integer personId) {
		List<Shares> batchRecipientPay = new ArrayList<>();
		if (declaration.getDeclarantDatas().getRecipientPay() == null) {
			return batchRecipientPay;
		}
		for (Map.Entry<String, RecipientPay> entry : declaration.getDeclarantDatas().getRecipientPay().entrySet()) {

			Shares recipientPay = new Shares();

			if (declaration.getDeclarantDatas().getRecipientPay() != null) {
				recipientPay.setPersonId(Long.parseLong(entry.getValue().getPerson()));
				recipientPay.setName(entry.getValue().getName());
				recipientPay.setIteration(entry.getKey());
				recipientPay.setLegalForm(entry.getValue().getLegalForm());
				recipientPay.setCountry(entry.getValue().getCountry());
				recipientPay.setEnName(entry.getValue().getEnName());
				recipientPay.setLocation(entry.getValue().getLocation());
			}
			batchRecipientPay.add(recipientPay);
		}

		return batchRecipientPay;
	}

}
