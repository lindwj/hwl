package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdElectResAccMapper {
	
	public abstract List<SdElectResAcc> getSdElectResAccListPage(SdElectResAcc sdElectResAcc);
	
	public abstract SdElectResAcc getSdElectResAccById(int sdElectResAccId);

	public abstract int insertSdElectResAcc(SdElectResAcc sdElectResAcc);

	public abstract void updateSdElectResAcc(SdElectResAcc sdElectResAcc);

	public abstract void deleteSdElectResAcc(int sdElectResAccId);
	
}
