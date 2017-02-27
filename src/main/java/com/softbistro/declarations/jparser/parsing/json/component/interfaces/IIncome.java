package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import java.util.List;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Income;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;

public interface IIncome {
	
	public List<Income> getIncomeGifts(Declaration declaration, Integer personId);
	public List<Income> getIncomeCashAssets(Declaration declaration, Integer personId);
	
	public List<ShortRights> getRights();
}
