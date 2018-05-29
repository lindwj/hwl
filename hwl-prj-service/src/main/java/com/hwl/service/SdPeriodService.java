package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdPeriodService {
	
	public abstract List<SdPeriod> getSdPeriodListPage(SdPeriod sdPeriod);
	
	public abstract List<SdPeriod> getSdPeriodById(SdPeriod sdPeriod);
	
	public abstract int saveSdPeriod(SdPeriod sdPeriod,String doWhat);

	public abstract void deleteSdPeriod(int sdPeriodId);
	
}