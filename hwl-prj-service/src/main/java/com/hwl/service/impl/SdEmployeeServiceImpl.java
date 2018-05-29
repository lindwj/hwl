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

@Service("SdEmployeeService")
public class SdEmployeeServiceImpl implements SdEmployeeService{
	@Autowired
	private SdEmployeeMapper sdEmployeeMapper;
	
	@Override
	public List<SdEmployee> getSdEmployeeListPage(SdEmployee sdEmployee){
		return sdEmployeeMapper.getSdEmployeeListPage(sdEmployee);
	}
	
	@Override
	public SdEmployee getSdEmployeeById(int sdEmployeeId){
		return sdEmployeeMapper.getSdEmployeeById(sdEmployeeId);
	}

	@Override
	public int saveSdEmployee(SdEmployee sdEmployee,String doWhat){
		if("add".equals(doWhat)){
			return sdEmployeeMapper.insertSdEmployee(sdEmployee);
		}else if("edit".equals(doWhat)){
			sdEmployeeMapper.updateSdEmployee(sdEmployee);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdEmployee(int sdEmployeeId){
		sdEmployeeMapper.deleteSdEmployee(sdEmployeeId);
	}
	
}