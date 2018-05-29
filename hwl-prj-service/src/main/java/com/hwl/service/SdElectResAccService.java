package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdElectResAccService {
	
	public abstract List<SdElectResAcc> getSdElectResAccListPage(SdElectResAcc sdElectResAcc);
	
	public abstract SdElectResAcc getSdElectResAccById(int sdElectResAccId);
	
	public abstract int saveSdElectResAcc(SdElectResAcc sdElectResAcc,String doWhat);

	public abstract void deleteSdElectResAcc(int sdElectResAccId);
	
}