package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdglBasicInfoService {
	
	public abstract List<SdglBasicInfo> getSdglBasicInfoListPage(SdglBasicInfo sdglBasicInfo);
	
	public abstract SdglBasicInfo getSdglBasicInfoById(int sdglBasicInfoId);
	
	public abstract int saveSdglBasicInfo(SdglBasicInfo sdglBasicInfo,String doWhat);

	public abstract void deleteSdglBasicInfo(int sdglBasicInfoId);
	
}