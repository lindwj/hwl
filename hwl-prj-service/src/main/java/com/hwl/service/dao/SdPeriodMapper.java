package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdPeriodMapper {
	
	public abstract List<SdPeriod> getSdPeriodListPage(SdPeriod sdPeriod);
	
	public abstract List<SdPeriod> getSdPeriodById(SdPeriod sdPeriod);

	public abstract int insertSdPeriod(SdPeriod sdPeriod);
	
	public abstract int insertSdPeriodList(List<SdPeriod> sdPeriodList);
	
	public abstract void updateSdPeriod(SdPeriod sdPeriod);

	public abstract void deleteSdPeriod(int sdPeriodId);
	
}
