package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface RecoveryService {
	
	
	public abstract int recovery(String fileSourcePath ,String fileTargetPath , String fileName,int fRule);
	
	public abstract int intelligentMatch(Gaccount gaccount);
	
	public abstract int manualMatch(Gaccount gaccount);
	
	public abstract int std_amt(Gaccount gaccount);
	
	public abstract int initAcct(List<Gaccount> gaccountInitList);

	
}