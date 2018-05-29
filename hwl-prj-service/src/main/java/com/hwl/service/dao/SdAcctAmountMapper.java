package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdAcctAmountMapper {
	
	public abstract List<SdAcctAmount> getSdAcctAmountListPage(SdAcctAmount sdAcctAmount);
	
	public abstract SdAcctAmount getSdAcctAmountById(int sdAcctAmountId);

	public abstract int insertSdAcctAmount(SdAcctAmount sdAcctAmount);
	
	public abstract int insertSdAcctAmountList(List<SdAcctAmount> sdAcctAmountList);
	

	public abstract void updateSdAcctAmount(SdAcctAmount sdAcctAmount);

	public abstract void deleteSdAcctAmount(int sdAcctAmountId);
	
}
