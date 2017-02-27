package com.softbistro.declarations.jparser.parsing.json.component.interfaces;

import java.util.List;

import com.softbistro.declarations.jparser.parsing.json.component.entity.Declaration;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.ShortRights;
import com.softbistro.declarations.jparser.parsing.json.component.mysql.Vechicles;

public interface IVechicles {

	public List<Vechicles> getVechicles(Declaration declaration, Integer personId);

	public List<ShortRights> getRights();
}
