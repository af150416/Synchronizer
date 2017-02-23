package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import java.util.List;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Shares;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;

public interface IShares {
	
	public List<Shares> getSecurities(Declaration declaration, Integer personId, Integer rightId);
	
	public List<Shares> getCorporateLaw(Declaration declaration, Integer personId, Integer rightId);
	
	public List<Shares> getRepicientPay(Declaration declaration, Integer personId, Integer rightId);
	
	public List<ShortRights> getRights();
}
