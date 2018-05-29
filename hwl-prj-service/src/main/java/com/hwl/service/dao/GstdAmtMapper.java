package com.hwl.service.dao;

import java.util.*;
import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface GstdAmtMapper {
	
	public abstract List<GstdAmt> getGstdAmtListPage(GstdAmt gstdAmt);
	
	public abstract GstdAmt getGstdAmtById(int gstdAmtId);

	public abstract int insertGstdAmt(GstdAmt gstdAmt);
	
	public abstract int insertGstdAmtFirst(GstdAmt gstdAmt);
	
	public abstract int insertGstdAmtNext(GstdAmt gstdAmt);
	
	public abstract void updateGstdAmt(GstdAmt gstdAmt);

	public abstract void deleteGstdAmt(int gstdAmtId);
	
	
}
