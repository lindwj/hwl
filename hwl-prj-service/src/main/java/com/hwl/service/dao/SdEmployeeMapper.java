package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdEmployeeMapper {
	
	public abstract List<SdEmployee> getSdEmployeeListPage(SdEmployee sdEmployee);
	
	public abstract SdEmployee getSdEmployeeById(int sdEmployeeId);

	public abstract int insertSdEmployee(SdEmployee sdEmployee);
	
	public abstract int insertSdEmployeeList(List<SdEmployee> sdEmployeeList);

	public abstract void updateSdEmployee(SdEmployee sdEmployee);

	public abstract void deleteSdEmployee(int sdEmployeeId);
	
}
