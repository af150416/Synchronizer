package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import java.util.List;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.PersonFamily;


public interface ISubjectFamily {

	public List<PersonFamily> getSubjectFamily(Declaration declaration, Integer id);
}
