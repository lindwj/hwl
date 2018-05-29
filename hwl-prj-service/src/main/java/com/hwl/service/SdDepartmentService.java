package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdDepartmentService {
	
	public abstract List<SdDepartment> getSdDepartmentListPage(SdDepartment sdDepartment);
	
	public abstract SdDepartment getSdDepartmentById(int sdDepartmentId);
	
	public abstract int saveSdDepartment(SdDepartment sdDepartment,String doWhat);

	public abstract void deleteSdDepartment(int sdDepartmentId);
	
}