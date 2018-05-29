package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdVoucherService {
	
	public abstract List<SdVoucher> getSdVoucherListPage(SdVoucher sdVoucher);
	
	public abstract SdVoucher getSdVoucherById(int sdVoucherId);
	
	public abstract int saveSdVoucher(SdVoucher sdVoucher,String doWhat);

	public abstract void deleteSdVoucher(int sdVoucherId);
	
}