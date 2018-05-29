package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdCustomerService {
	
	public abstract List<SdCustomer> getSdCustomerListPage(SdCustomer sdCustomer);
	
	public abstract SdCustomer getSdCustomerById(int sdCustomerId);
	
	public abstract int saveSdCustomer(SdCustomer sdCustomer,String doWhat);

	public abstract void deleteSdCustomer(int sdCustomerId);
	
}