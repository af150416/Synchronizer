package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IType;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Type;
/**
 * Dao for work with entity Type
 * @author cortes
 *
 */
@Repository
public class TypeDao implements IType {

	@Override
	public Type getType(Declaration declaration, Integer personId) {

		Type declarationType = new Type();
		declarationType.setDeclarationId(declaration.getId());
		declarationType.setPersonId(personId++);

		if (declaration.getDeclarantDatas().getDeclarationType() == null) {
			return declarationType;
		}

		declarationType.setDeclarationType(declaration.getDeclarantDatas().getDeclarationType().getTypeOfDeclaration());
		if (declaration.getDeclarantDatas().getDeclarationType().getYearOfDeclaration() != null) {
			declarationType
					.setDeclarationYear(declaration.getDeclarantDatas().getDeclarationType().getYearOfDeclaration());
		}

		return declarationType;
	}

}
