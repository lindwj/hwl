package com.hwl.service;

import java.util.*;

import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface ManagerService {
	
	public abstract List<Manager> getManagerListPage(Manager manager);
	
	public abstract Manager getManagerById(int managerId);
	
	public abstract List<Manager> getManagerByShop(int shopId);
	
	public abstract List<Manager> getManagerForMess(int shopId);
	
	public abstract Map<String,Object> findRoles(int managerId);
	
	public abstract List<Manager> findAllRoles(int i);
	
	public abstract Set<String> findPermissions(String roleids);
	
	public abstract Manager login (Manager manager);
	
	public abstract int saveManager(Manager manager,String doWhat);
	
	public abstract int updateManager(Manager manager);

	public abstract int updateManagerPwd(Manager manager);

	public abstract void deleteManager(int managerId);
	
	public abstract Manager getManager(Manager manager);
	
	public abstract Manager getManagerId(Manager manager);
	
	public abstract Manager getManagerAcc(Manager manager);
	
}