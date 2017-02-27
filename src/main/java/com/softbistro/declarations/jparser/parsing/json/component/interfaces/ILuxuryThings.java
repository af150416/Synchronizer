package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import java.util.List;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.LuxuryThings;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;

public interface ILuxuryThings {
	
	public List<LuxuryThings> getLuxuryThings(Declaration declaration, Integer personId);

	public List<ShortRights> getRights();

}
