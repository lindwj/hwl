package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdEmployeeService {
	
	public abstract List<SdEmployee> getSdEmployeeListPage(SdEmployee sdEmployee);
	
	public abstract SdEmployee getSdEmployeeById(int sdEmployeeId);
	
	public abstract int saveSdEmployee(SdEmployee sdEmployee,String doWhat);

	public abstract void deleteSdEmployee(int sdEmployeeId);
	
}