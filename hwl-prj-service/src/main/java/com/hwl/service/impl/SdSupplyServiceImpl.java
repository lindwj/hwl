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

@Service("SdSupplyService")
public class SdSupplyServiceImpl implements SdSupplyService{
	@Autowired
	private SdSupplyMapper sdSupplyMapper;
	
	@Override
	public List<SdSupply> getSdSupplyListPage(SdSupply sdSupply){
		return sdSupplyMapper.getSdSupplyListPage(sdSupply);
	}
	
	@Override
	public SdSupply getSdSupplyById(int sdSupplyId){
		return sdSupplyMapper.getSdSupplyById(sdSupplyId);
	}

	@Override
	public int saveSdSupply(SdSupply sdSupply,String doWhat){
		if("add".equals(doWhat)){
			return sdSupplyMapper.insertSdSupply(sdSupply);
		}else if("edit".equals(doWhat)){
			sdSupplyMapper.updateSdSupply(sdSupply);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdSupply(int sdSupplyId){
		sdSupplyMapper.deleteSdSupply(sdSupplyId);
	}
	
}