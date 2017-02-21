package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IType;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Type;

@Repository
public class TypeDao implements IType {

	@Override
	public Type getType(Declaration declaration, Integer personId) {

		Type type = new Type();
		type.setDeclarationId(declaration.getId());
		type.setPersonId(personId++);

		if (declaration.getDeclarantDatas().getDeclarationType() != null) {

			type.setDeclarationType(declaration.getDeclarantDatas().getDeclarationType().getTypeOfDeclaration());
			if (declaration.getDeclarantDatas().getDeclarationType().getYearOfDeclaration() != null) {
				type.setDeclarationYear(declaration.getDeclarantDatas().getDeclarationType().getYearOfDeclaration());
			}
		}

		return type;
	}

}
