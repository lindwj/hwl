package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdSupplyMapper {
	
	public abstract List<SdSupply> getSdSupplyListPage(SdSupply sdSupply);
	
	public abstract SdSupply getSdSupplyById(int sdSupplyId);

	public abstract int insertSdSupply(SdSupply sdSupply);
	
	public abstract int insertSdSupplyList(List<SdSupply> sdSupplyList);
	

	public abstract void updateSdSupply(SdSupply sdSupply);

	public abstract void deleteSdSupply(int sdSupplyId);
	
}
