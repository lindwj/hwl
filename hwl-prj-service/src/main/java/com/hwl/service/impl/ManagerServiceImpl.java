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

@Service("ManagerService")
public class ManagerServiceImpl implements ManagerService{
	@Autowired
	private ManagerMapper managerMapper;
	
	@Autowired
	private ManagerRoleService managerRoleService;
	
	@Override
	public List<Manager> getManagerListPage(Manager manager){
		return managerMapper.getManagerListPage(manager);
	}
	
	@Override
	public Manager getManagerById(int managerId){
		return managerMapper.getManagerById(managerId);
	}
	@Override
	public List<Manager> getManagerByShop(int shopId){
		return managerMapper.getManagerByShop(shopId);
	}
	
	@Override
	public List<Manager> getManagerForMess(int shopId){
		return managerMapper.getManagerForMess(shopId);
	}
	
	
	@Override
	public List<Manager> findAllRoles(int i){
		return managerMapper.findAllRoles(i);
	}

	@Override
	public Map<String,Object> findRoles(int managerId){
		
		Map<String,Object> mso=new HashMap<String,Object>(); 
				
		List<Manager> mgs =	managerMapper.findRoles(managerId);
		
		//没有设定角色
		if(mgs==null){
			mso.put("set", null);
			mso.put("roleids", null);
			return mso;
		}
		
		
		Set<String> roles=new HashSet<String>();
		
		String roleids="";
		
		
		
		
		int len=mgs.size();
		
		int i=1;
		
		for(Manager mg:mgs)
		{
			//借用code 传 role角色值
			roles.add(mg.getCode());
			
			if(i==len){
				roleids=roleids+mg.getRoleId();
			}else{
				roleids=roleids+mg.getRoleId()+",";
			}
			
			i++;
			
		}
		
		mso.put("set", roles);
		mso.put("roleids", roleids);
		
		return mso;
	}
	
	@Override
	public Set<String> findPermissions(String roleids){
		
		Set<String> permissions=new HashSet<String>();
		
		List<Manager> mgs =managerMapper.findPermissions(roleids);
		
		if(mgs==null){
			return null;
		}
		
		
		for(Manager mg:mgs)
		{
			//借用code 传 权限 值
			permissions.add(mg.getCode());
		}
		
		return permissions;
		
	}
	
	@Override
	public Manager login (Manager manager){
		return managerMapper.login(manager);
	}
	
	@Override
	public int saveManager(Manager manager,String doWhat){
		if("add".equals(doWhat)){
			
			managerMapper.insertManager(manager);
			
			ManagerRole mr =new ManagerRole();
			mr.setManagerId(manager.getManagerId());
			mr.setRoleId(manager.getRoleId());
			
			return managerRoleService.saveManagerRole(mr, "add");
			
		}else if("edit".equals(doWhat)){
			managerMapper.updateManager(manager);
			
			ManagerRole mr =new ManagerRole();
			mr.setManagerId(manager.getManagerId());
			mr.setRoleId(manager.getRoleId());
			
			return managerRoleService.saveManagerRole(mr, "edit");
		}		
		return 0;
  	
	}
	
	@Override
	public int updateManager(Manager manager){
		 managerMapper.updateManager(manager);
		 return 0;
	}
	
	@Override
	public void deleteManager(int managerId){
		managerMapper.deleteManager(managerId);
	}

	@Override
	public int updateManagerPwd(Manager manager) {
		managerMapper.updateManagerPwd(manager);
		return 0;
	}

	@Override
	public Manager getManager(Manager manager) {
		return managerMapper.getManager(manager);
	}

	@Override
	public Manager getManagerId(Manager manager) {
		return managerMapper.getManagerId(manager);
	}

	@Override
	public Manager getManagerAcc(Manager manager) {
		return managerMapper.getManagerAcc(manager);
	}

	
}