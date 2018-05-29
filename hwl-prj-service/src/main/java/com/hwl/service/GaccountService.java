package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface GaccountService {
	
	public abstract List<Gaccount> getGaccountListPage(Gaccount gaccount);
	
	public abstract Gaccount getGaccountById(int gaccountId);
	
	public abstract int saveGaccount(Gaccount gaccount,String doWhat);

	public abstract void deleteGaccount(int gaccountId);
	
}