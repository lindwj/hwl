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

@Service("SdCustomerService")
public class SdCustomerServiceImpl implements SdCustomerService{
	@Autowired
	private SdCustomerMapper sdCustomerMapper;
	
	@Override
	public List<SdCustomer> getSdCustomerListPage(SdCustomer sdCustomer){
		return sdCustomerMapper.getSdCustomerListPage(sdCustomer);
	}
	
	@Override
	public SdCustomer getSdCustomerById(int sdCustomerId){
		return sdCustomerMapper.getSdCustomerById(sdCustomerId);
	}

	@Override
	public int saveSdCustomer(SdCustomer sdCustomer,String doWhat){
		if("add".equals(doWhat)){
			return sdCustomerMapper.insertSdCustomer(sdCustomer);
		}else if("edit".equals(doWhat)){
			sdCustomerMapper.updateSdCustomer(sdCustomer);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdCustomer(int sdCustomerId){
		sdCustomerMapper.deleteSdCustomer(sdCustomerId);
	}
	
}