package com.hwl.service;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface GstdAmtService {
	
	public abstract List<GstdAmt> getGstdAmtListPage(GstdAmt gstdAmt);
	
	public abstract GstdAmt getGstdAmtById(int gstdAmtId);
	
	public abstract int saveGstdAmt(GstdAmt gstdAmt,String doWhat);

	public abstract void deleteGstdAmt(int gstdAmtId);
	
}