package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdAcctAmountService {
	
	public abstract List<SdAcctAmount> getSdAcctAmountListPage(SdAcctAmount sdAcctAmount);
	
	public abstract SdAcctAmount getSdAcctAmountById(int sdAcctAmountId);
	
	public abstract int saveSdAcctAmount(SdAcctAmount sdAcctAmount,String doWhat);

	public abstract void deleteSdAcctAmount(int sdAcctAmountId);
	
}