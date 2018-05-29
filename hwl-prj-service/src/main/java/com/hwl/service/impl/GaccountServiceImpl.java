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

@Service("GaccountService")
public class GaccountServiceImpl implements GaccountService{
	@Autowired
	private GaccountMapper gaccountMapper;
	
	@Override
	public List<Gaccount> getGaccountListPage(Gaccount gaccount){
		return gaccountMapper.getGaccountListPage(gaccount);
	}
	
	@Override
	public Gaccount getGaccountById(int gaccountId){
		return gaccountMapper.getGaccountById(gaccountId);
	}

	@Override
	public int saveGaccount(Gaccount gaccount,String doWhat){
		if("add".equals(doWhat)){
			return gaccountMapper.insertGaccount(gaccount);
		}else if("edit".equals(doWhat)){
			gaccountMapper.updateGaccount(gaccount);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteGaccount(int gaccountId){
		gaccountMapper.deleteGaccount(gaccountId);
	}
	
}