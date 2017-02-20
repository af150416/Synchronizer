package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import java.util.List;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.PersonInfo;

public interface IPersonInfo {
	
	public PersonInfo getPersonInfo(Declaration declaration);
	
	public List<PersonInfo> getSubjectFamily(Declaration declaration, Integer id);
}
