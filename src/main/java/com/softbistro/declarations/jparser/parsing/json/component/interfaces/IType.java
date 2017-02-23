package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Type;

public interface IType {
	
	public Type getType(Declaration declaration, Integer id);
}
