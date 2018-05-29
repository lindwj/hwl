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

@Service("SdVoucherService")
public class SdVoucherServiceImpl implements SdVoucherService{
	@Autowired
	private SdVoucherMapper sdVoucherMapper;
	
	@Override
	public List<SdVoucher> getSdVoucherListPage(SdVoucher sdVoucher){
		return sdVoucherMapper.getSdVoucherListPage(sdVoucher);
	}
	
	@Override
	public SdVoucher getSdVoucherById(int sdVoucherId){
		return sdVoucherMapper.getSdVoucherById(sdVoucherId);
	}

	@Override
	public int saveSdVoucher(SdVoucher sdVoucher,String doWhat){
		if("add".equals(doWhat)){
			return sdVoucherMapper.insertSdVoucher(sdVoucher);
		}else if("edit".equals(doWhat)){
			sdVoucherMapper.updateSdVoucher(sdVoucher);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdVoucher(int sdVoucherId){
		sdVoucherMapper.deleteSdVoucher(sdVoucherId);
	}
	
}