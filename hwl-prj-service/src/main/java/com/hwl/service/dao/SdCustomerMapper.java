package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdCustomerMapper {
	
	public abstract List<SdCustomer> getSdCustomerListPage(SdCustomer sdCustomer);
	
	public abstract SdCustomer getSdCustomerById(int sdCustomerId);

	public abstract int insertSdCustomer(SdCustomer sdCustomer);
	
	public abstract int insertSdCustomerList(List<SdCustomer> sdCustomerList);

	public abstract void updateSdCustomer(SdCustomer sdCustomer);

	public abstract void deleteSdCustomer(int sdCustomerId);
	
}
