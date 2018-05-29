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

@Service("SdAcctAmountService")
public class SdAcctAmountServiceImpl implements SdAcctAmountService{
	@Autowired
	private SdAcctAmountMapper sdAcctAmountMapper;
	
	@Override
	public List<SdAcctAmount> getSdAcctAmountListPage(SdAcctAmount sdAcctAmount){
		return sdAcctAmountMapper.getSdAcctAmountListPage(sdAcctAmount);
	}
	
	@Override
	public SdAcctAmount getSdAcctAmountById(int sdAcctAmountId){
		return sdAcctAmountMapper.getSdAcctAmountById(sdAcctAmountId);
	}

	@Override
	public int saveSdAcctAmount(SdAcctAmount sdAcctAmount,String doWhat){
		if("add".equals(doWhat)){
			return sdAcctAmountMapper.insertSdAcctAmount(sdAcctAmount);
		}else if("edit".equals(doWhat)){
			sdAcctAmountMapper.updateSdAcctAmount(sdAcctAmount);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdAcctAmount(int sdAcctAmountId){
		sdAcctAmountMapper.deleteSdAcctAmount(sdAcctAmountId);
	}
	
}