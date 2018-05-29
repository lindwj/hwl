package com.hwl.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.hwl.service.*;
import com.hwl.service.dao.*;
import com.hwl.service.model.*;

/**
 * @author lind
 *
 */

@Service("NationService")
public class NationServiceImpl implements NationService{
	@Autowired
	private NationMapper nationMapper;
	
	@Override
	public List<Nation> getNationListPage(Nation nation){
		return nationMapper.getNationListPage(nation);
	}
	
	@Override
	public Nation getNationById(int id){
		return nationMapper.getNationById(id);
	}
	
	@Override
	public List<Nation> getNationForStreet(int id){
		return nationMapper.getNationForStreet(id);
	}
	
	@Override
	public Nation getNationByCode(String code){
		return nationMapper.getNationByCode(code);
	}
	
	@Override
	public List<Nation> getNationByParentId(int parentId){
		return nationMapper.getNationByParentId(parentId);
	}

	@Override
	public int saveNation(Nation nation,String doWhat){
		if("add".equals(doWhat)){
			return nationMapper.insertNation(nation);
		}else if("edit".equals(doWhat)){
			nationMapper.updateNation(nation);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteNation(int id){
		nationMapper.deleteNation(id);
	}

	@Override
	public List<Nation> getNationByCodeWx(String code) {
		return nationMapper.getNationByCodeWx(code);
	}
	
}