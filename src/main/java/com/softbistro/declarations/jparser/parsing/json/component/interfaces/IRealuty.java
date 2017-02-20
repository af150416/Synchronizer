package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import java.util.List;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Realuty;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;

public interface IRealuty {
	
	public List<Realuty> getRealuty(Declaration declaration, Integer personId, Integer rightId);
	
	public List<ShortRights> getRights();
}
