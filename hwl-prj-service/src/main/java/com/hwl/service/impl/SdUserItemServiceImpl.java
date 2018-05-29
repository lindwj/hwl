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

@Service("SdUserItemService")
public class SdUserItemServiceImpl implements SdUserItemService{
	@Autowired
	private SdUserItemMapper sdUserItemMapper;
	
	@Override
	public List<SdUserItem> getSdUserItemListPage(SdUserItem sdUserItem){
		return sdUserItemMapper.getSdUserItemListPage(sdUserItem);
	}
	
	@Override
	public SdUserItem getSdUserItemById(int sdUserItemId){
		return sdUserItemMapper.getSdUserItemById(sdUserItemId);
	}

	@Override
	public int saveSdUserItem(SdUserItem sdUserItem,String doWhat){
		if("add".equals(doWhat)){
			return sdUserItemMapper.insertSdUserItem(sdUserItem);
		}else if("edit".equals(doWhat)){
			sdUserItemMapper.updateSdUserItem(sdUserItem);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteSdUserItem(int sdUserItemId){
		sdUserItemMapper.deleteSdUserItem(sdUserItemId);
	}
	
}