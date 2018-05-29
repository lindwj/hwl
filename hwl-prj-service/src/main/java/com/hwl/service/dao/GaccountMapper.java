package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface GaccountMapper {
	
	public abstract List<Gaccount> getGaccountListPage(Gaccount gaccount);
	
	public abstract Gaccount getGaccountById(int gaccountId);
	
	public abstract Gaccount getGaccountUnMatch(Gaccount gaccount);
	

	public abstract int insertGaccount(Gaccount gaccount);
	
	public abstract int insertGaccountList(List<Gaccount> gaccountList);
	

	public abstract void updateGaccount(Gaccount gaccount);
	
	public abstract void batchUpdate(Gaccount gaccount);
	
	public abstract void batchParentUpdate(Gaccount gaccount);
	
	public abstract void batchParent2Update(Gaccount gaccount);
	
	

	public abstract void deleteGaccount(int gaccountId);
	
}
