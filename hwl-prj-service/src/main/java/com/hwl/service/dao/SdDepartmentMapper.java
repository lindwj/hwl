package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdDepartmentMapper {
	
	public abstract List<SdDepartment> getSdDepartmentListPage(SdDepartment sdDepartment);
	
	public abstract SdDepartment getSdDepartmentById(int sdDepartmentId);

	public abstract int insertSdDepartment(SdDepartment sdDepartment);
	
	public abstract int insertSdDepartmentList(List<SdDepartment> sdDepartmentList);
	
	public abstract void updateSdDepartment(SdDepartment sdDepartment);

	public abstract void deleteSdDepartment(int sdDepartmentId);
	
}
