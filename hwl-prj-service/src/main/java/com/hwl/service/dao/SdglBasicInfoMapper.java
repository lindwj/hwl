package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdglBasicInfoMapper {
	
	public abstract List<SdglBasicInfo> getSdglBasicInfoListPage(SdglBasicInfo sdglBasicInfo);
	
	public abstract SdglBasicInfo getSdglBasicInfoById(int sdglBasicInfoId);

	public abstract int insertSdglBasicInfo(SdglBasicInfo sdglBasicInfo);

	public abstract void updateSdglBasicInfo(SdglBasicInfo sdglBasicInfo);

	public abstract void deleteSdglBasicInfo(int sdglBasicInfoId);
	
}
