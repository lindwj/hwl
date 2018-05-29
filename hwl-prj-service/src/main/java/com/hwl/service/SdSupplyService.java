package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdSupplyService {
	
	public abstract List<SdSupply> getSdSupplyListPage(SdSupply sdSupply);
	
	public abstract SdSupply getSdSupplyById(int sdSupplyId);
	
	public abstract int saveSdSupply(SdSupply sdSupply,String doWhat);

	public abstract void deleteSdSupply(int sdSupplyId);
	
}