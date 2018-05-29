package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdAccountMapper {
	
	public abstract List<SdAccount> getSdAccountListPage(SdAccount sdAccount);
	
	public abstract SdAccount getSdAccountById(int sdAccountId);
	
	public abstract List<SdAccount> getSdAccountChild(SdAccount sdAccount);

	public abstract int insertSdAccount(SdAccount sdAccount);
	
	public abstract int insertSdAccountList(List<SdAccount> sdAccountList);
	

	public abstract void updateSdAccount(SdAccount sdAccount);

	public abstract void deleteSdAccount(int sdAccountId);
	
}
