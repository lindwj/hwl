package com.hwl.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.hwl.service.model.*;
import com.hwl.service.dao.*;
import com.hwl.service.*;

/**
 * @author lind
 *
 */

@Service("GstdAmtService")
public class GstdAmtServiceImpl implements GstdAmtService{
	@Autowired
	private GstdAmtMapper gstdAmtMapper;
	
	@Override
	public List<GstdAmt> getGstdAmtListPage(GstdAmt gstdAmt){
		return gstdAmtMapper.getGstdAmtListPage(gstdAmt);
	}
	
	@Override
	public GstdAmt getGstdAmtById(int gstdAmtId){
		return gstdAmtMapper.getGstdAmtById(gstdAmtId);
	}

	@Override
	public int saveGstdAmt(GstdAmt gstdAmt,String doWhat){
		if("add".equals(doWhat)){
			return gstdAmtMapper.insertGstdAmt(gstdAmt);
		}else if("edit".equals(doWhat)){
			gstdAmtMapper.updateGstdAmt(gstdAmt);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteGstdAmt(int gstdAmtId){
		gstdAmtMapper.deleteGstdAmt(gstdAmtId);
	}
	
}