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

@Service("SdElectResAccService")
public class SdElectResAccServiceImpl implements SdElectResAccService{
	@Autowired
	private SdElectResAccMapper sdElectResAccMapper;
	
	@Override
	public List<SdElectResAcc> getSdElectResAccListPage(SdElectResAcc sdElectResAcc){
		return sdElectResAccMapper.getSdElectResAccListPage(sdElectResAcc);
	}
	
	@Override
	public SdElectResAcc getSdElectResAccById(int sdElectResAccId){
		return sdElectResAccMapper.getSdElectResAccById(sdElectResAccId);
	}

	@Override
	public int saveSdElectResAcc(SdElectResAcc sdElectResAcc,String doWhat){
		if("add".equals(doWhat)){
			return sdElectResAccMapper.insertSdElectResAcc(sdElectResAcc);
		}else if("edit".equals(doWhat)){
			sdElectResAccMapper.updateSdElectResAcc(sdElectResAcc);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdElectResAcc(int sdElectResAccId){
		sdElectResAccMapper.deleteSdElectResAcc(sdElectResAccId);
	}
	
}