package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.entity.SubjectFamily;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.ISubjectFamily;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.PersonFamily;
/**
 * Dao for work with entity PersonFamily
 * @author cortes
 *
 */
@Repository
public class PersonFamilyDao implements ISubjectFamily {

	@Override
	public List<PersonFamily> getSubjectFamily(Declaration declaration, Integer personId) {

		List<PersonFamily> batchFamilyInfo = new ArrayList<>();
		if (declaration.getDeclarantDatas().getSubjectFamily() == null) {
			return batchFamilyInfo;
		}
		for (Map.Entry<String, SubjectFamily> entry : declaration.getDeclarantDatas().getSubjectFamily().entrySet()) {
			PersonFamily personFamily = new PersonFamily();
			if (declaration.getDeclarantDatas().getSubjectFamily() != null) {

				personFamily.setLastName(entry.getValue().getLastName());
				personFamily.setFirstName(entry.getValue().getFirstName());
				personFamily.setMiddleName(entry.getValue().getMiddleName());
				personFamily.setChangedName(entry.getValue().isChangedName());
				personFamily.setPreviousLastName(entry.getValue().getPreviousLastName());
				personFamily.setPreviousFirstName(entry.getValue().getPreviousFirstName());
				personFamily.setPreviousMiddleName(entry.getValue().getPreviousMiddleName());
				personFamily.setFamilySubjectId(entry.getKey());
				personFamily.setDeclarantId(Long.valueOf(personId));
				personFamily.setCitizenship(entry.getValue().getCitizenship());
				personFamily.setSubjectRelation(entry.getValue().getSubjectRelation());
			}

			batchFamilyInfo.add(personFamily);
		}
		return batchFamilyInfo;
	}

}
