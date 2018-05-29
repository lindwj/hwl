package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdAccountService {
	
	public abstract List<SdAccount> getSdAccountListPage(SdAccount sdAccount);
	
	public abstract SdAccount getSdAccountById(int sdAccountId);
	
	public abstract int saveSdAccount(SdAccount sdAccount,String doWhat);

	public abstract void deleteSdAccount(int sdAccountId);
	
}