package com.hwl.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.hwl.service.model.*;
import com.hwl.service.dao.*;
import com.hwl.service.*;

/**
 * @author lind
 *
 */

@Service("SdglBasicInfoService")
public class SdglBasicInfoServiceImpl implements SdglBasicInfoService{
	@Autowired
	private SdglBasicInfoMapper sdglBasicInfoMapper;
	
	@Override
	public List<SdglBasicInfo> getSdglBasicInfoListPage(SdglBasicInfo sdglBasicInfo){
		return sdglBasicInfoMapper.getSdglBasicInfoListPage(sdglBasicInfo);
	}
	
	@Override
	public SdglBasicInfo getSdglBasicInfoById(int sdglBasicInfoId){
		return sdglBasicInfoMapper.getSdglBasicInfoById(sdglBasicInfoId);
	}

	@Override
	public int saveSdglBasicInfo(SdglBasicInfo sdglBasicInfo,String doWhat){
		if("add".equals(doWhat)){
			return sdglBasicInfoMapper.insertSdglBasicInfo(sdglBasicInfo);
		}else if("edit".equals(doWhat)){
			sdglBasicInfoMapper.updateSdglBasicInfo(sdglBasicInfo);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdglBasicInfo(int sdglBasicInfoId){
		sdglBasicInfoMapper.deleteSdglBasicInfo(sdglBasicInfoId);
	}
	
}