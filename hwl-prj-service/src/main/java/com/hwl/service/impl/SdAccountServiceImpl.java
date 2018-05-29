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

@Service("SdAccountService")
public class SdAccountServiceImpl implements SdAccountService{
	@Autowired
	private SdAccountMapper sdAccountMapper;
	
	@Override
	public List<SdAccount> getSdAccountListPage(SdAccount sdAccount){
		return sdAccountMapper.getSdAccountListPage(sdAccount);
	}
	
	@Override
	public SdAccount getSdAccountById(int sdAccountId){
		return sdAccountMapper.getSdAccountById(sdAccountId);
	}

	@Override
	public int saveSdAccount(SdAccount sdAccount,String doWhat){
		if("add".equals(doWhat)){
			return sdAccountMapper.insertSdAccount(sdAccount);
		}else if("edit".equals(doWhat)){
			sdAccountMapper.updateSdAccount(sdAccount);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdAccount(int sdAccountId){
		sdAccountMapper.deleteSdAccount(sdAccountId);
	}
	
}