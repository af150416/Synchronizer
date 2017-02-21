package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.entity.SubjectFamily;

public interface ISubjectFamily {

	public SubjectFamily getSubjectFamily(Declaration declaration, Integer id);
}
