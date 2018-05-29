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

@Service("SdDepartmentService")
public class SdDepartmentServiceImpl implements SdDepartmentService{
	@Autowired
	private SdDepartmentMapper sdDepartmentMapper;
	
	@Override
	public List<SdDepartment> getSdDepartmentListPage(SdDepartment sdDepartment){
		return sdDepartmentMapper.getSdDepartmentListPage(sdDepartment);
	}
	
	@Override
	public SdDepartment getSdDepartmentById(int sdDepartmentId){
		return sdDepartmentMapper.getSdDepartmentById(sdDepartmentId);
	}

	@Override
	public int saveSdDepartment(SdDepartment sdDepartment,String doWhat){
		if("add".equals(doWhat)){
			return sdDepartmentMapper.insertSdDepartment(sdDepartment);
		}else if("edit".equals(doWhat)){
			sdDepartmentMapper.updateSdDepartment(sdDepartment);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdDepartment(int sdDepartmentId){
		sdDepartmentMapper.deleteSdDepartment(sdDepartmentId);
	}
	
}