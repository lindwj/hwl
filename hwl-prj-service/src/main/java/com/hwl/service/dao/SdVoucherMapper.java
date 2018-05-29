package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface SdVoucherMapper {
	
	public abstract List<SdVoucher> getSdVoucherListPage(SdVoucher sdVoucher);
	
	public abstract SdVoucher getSdVoucherById(int sdVoucherId);

	public abstract int insertSdVoucher(SdVoucher sdVoucher);
	
	public abstract int insertSdVoucherList(List<SdVoucher> sdVoucherList);
	
	public abstract void updateSdVoucher(SdVoucher sdVoucher);

	public abstract void deleteSdVoucher(int sdVoucherId);
	
}
