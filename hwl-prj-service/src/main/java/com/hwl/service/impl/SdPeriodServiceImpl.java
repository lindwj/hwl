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

@Service("SdPeriodService")
public class SdPeriodServiceImpl implements SdPeriodService{
	@Autowired
	private SdPeriodMapper sdPeriodMapper;
	
	@Override
	public List<SdPeriod> getSdPeriodListPage(SdPeriod sdPeriod){
		return sdPeriodMapper.getSdPeriodListPage(sdPeriod);
	}
	
	@Override
	public List<SdPeriod> getSdPeriodById(SdPeriod sdPeriod){
		return sdPeriodMapper.getSdPeriodById(sdPeriod);
	}

	@Override
	public int saveSdPeriod(SdPeriod sdPeriod,String doWhat){
		if("add".equals(doWhat)){
			return sdPeriodMapper.insertSdPeriod(sdPeriod);
		}else if("edit".equals(doWhat)){
			sdPeriodMapper.updateSdPeriod(sdPeriod);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdPeriod(int sdPeriodId){
		sdPeriodMapper.deleteSdPeriod(sdPeriodId);
	}
	
}