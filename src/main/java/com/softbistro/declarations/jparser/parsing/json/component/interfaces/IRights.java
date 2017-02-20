package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import java.util.Map;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Rights;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;

public interface IRights {

	public ShortRights getRights(Map.Entry<String, Rights> right, Integer id);
}
