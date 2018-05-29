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

@Service("ManagerRoleService")
public class ManagerRoleServiceImpl implements ManagerRoleService{
	@Autowired
	private ManagerRoleMapper managerRoleMapper;
	
	@Override
	public List<ManagerRole> getManagerRoleListPage(ManagerRole managerRole){
		return managerRoleMapper.getManagerRoleListPage(managerRole);
	}
	
	@Override
	public ManagerRole getManagerRoleById(int managerRoleId){
		return managerRoleMapper.getManagerRoleById(managerRoleId);
	}

	@Override
	public int saveManagerRole(ManagerRole managerRole,String doWhat){
		if("add".equals(doWhat)){
			return managerRoleMapper.insertManagerRole(managerRole);
		}else if("edit".equals(doWhat)){
			managerRoleMapper.updateManagerRole(managerRole);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteManagerRole(int managerRoleId){
		managerRoleMapper.deleteManagerRole(managerRoleId);
	}
	
}