package com.softbistro.declarations.jparser.parsing.json.component.dao.mysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.entity.SubjectFamily;
import com.softbistro.declarations.jparser.parsing.json.component.interfaces.IPersonInfo;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.PersonInfo;

@Repository
public class PersonInfoDao implements IPersonInfo {

	@Override
	public PersonInfo getPersonInfo(Declaration declaration, Integer personId) {

		PersonInfo personInfo = new PersonInfo();
		if (declaration.getDeclarantDatas().getSubjectInfo() != null) {

			personInfo.setCountry(declaration.getDeclarantDatas().getSubjectInfo().getCountry());
			personInfo.setLastName(declaration.getDeclarantDatas().getSubjectInfo().getLastName());
			personInfo.setFirstName(declaration.getDeclarantDatas().getSubjectInfo().getFirstName());
			personInfo.setMiddleName(declaration.getDeclarantDatas().getSubjectInfo().getMiddleName());
			personInfo.setPostType(declaration.getDeclarantDatas().getSubjectInfo().getPostType());
			personInfo.setWorkPost(declaration.getDeclarantDatas().getSubjectInfo().getWorkPost());
			personInfo.setWorkPlace(declaration.getDeclarantDatas().getSubjectInfo().getWorkPlase());
			personInfo.setPostCategory(declaration.getDeclarantDatas().getSubjectInfo().getPostCategory());
			personInfo.setChangedName(declaration.getDeclarantDatas().getSubjectInfo().isChangedName());
			personInfo.setCountryPath(declaration.getDeclarantDatas().getSubjectInfo().getCountryPath());
			personInfo.setCorruptionPost(declaration.getDeclarantDatas().getSubjectInfo().getCorruptionAffected());
			personInfo.setPreviousLastName(declaration.getDeclarantDatas().getSubjectInfo().getPreviousLastName());
			personInfo.setPreviousFirstName(declaration.getDeclarantDatas().getSubjectInfo().getPreviousFirstName());
			personInfo.setPreviousMiddleName(declaration.getDeclarantDatas().getSubjectInfo().getPreviousMiddleName());
			personInfo
					.setResponsiblePosition(declaration.getDeclarantDatas().getSubjectInfo().getResponsiblePosition());
			
			personInfo.setActualCity(declaration.getCityDeclarant());
			personInfo.setActualDistrict(declaration.getDistrictDeclarant());
			personInfo.setActualRegion(declaration.getRegionNameDeclarant());
			personInfo.setActualCountry(declaration.getCountryDeclarant());
			personInfo.setId(personId);
		}
		return personInfo;
	}

	@Override
	public List<PersonInfo> getSubjectFamily(Declaration declaration, Integer personId) {

		List<PersonInfo> batchFamilyInfo = new ArrayList<>();
		if (declaration.getDeclarantDatas().getSubjectFamily() == null) {
			return batchFamilyInfo;
		}
		for (Map.Entry<String, SubjectFamily> entry : declaration.getDeclarantDatas().getSubjectFamily().entrySet()) {
			PersonInfo personFamily = new PersonInfo();
			if (declaration.getDeclarantDatas().getSubjectFamily() != null) {
				personFamily.setLastName(entry.getValue().getLastName());
				personFamily.setFirstName(entry.getValue().getFirstName());
				personFamily.setMiddleName(entry.getValue().getMiddleName());
				personFamily.setChangedName(entry.getValue().isChangedName());
				personFamily.setPreviousLastName(entry.getValue().getPreviousLastName());
				personFamily.setPreviousFirstName(entry.getValue().getPreviousFirstName());
				personFamily.setPreviousMiddleName(entry.getValue().getPreviousMiddleName());
				personFamily.setFamilySubjectId(entry.getKey());
				personFamily.setDeclarantId(personId);
				personFamily.setCitizenship(entry.getValue().getCitizenship());
				personFamily.setSubjectRelation(entry.getValue().getSubjectRelation());
			}

			batchFamilyInfo.add(personFamily);
		}
		return batchFamilyInfo;
	}

}
