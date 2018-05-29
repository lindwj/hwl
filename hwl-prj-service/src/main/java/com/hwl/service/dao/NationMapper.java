package com.hwl.service.dao;

import java.util.*;

import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface NationMapper {
	
	public abstract List<Nation> getNationListPage(Nation nation);
	
	public abstract Nation getNationById(int id);
	
	public abstract List<Nation> getNationForStreet(int id);
	
	public abstract Nation getNationByCode(String code);
	
	public abstract List<Nation> getNationByCodeWx(String code);
	
	public abstract List<Nation> getNationByParentId(int parentId);

	public abstract int insertNation(Nation nation);

	public abstract void updateNation(Nation nation);

	public abstract void deleteNation(int id);
	
}
