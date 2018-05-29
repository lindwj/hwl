package com.hwl.service.dao;

import java.util.*;

import org.apache.ibatis.annotations.Param;

import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface ManagerMapper {
	
	public abstract List<Manager> getManagerListPage(Manager manager);
	
	public abstract Manager getManagerById(int managerId);
	
	
	public abstract List<Manager> getManagerForMess(int shopId);
	
	public abstract List<Manager> getManagerByShop(int shopId);
	
	public abstract List<Manager> findRoles(int managerId);
	
	public abstract List<Manager> findAllRoles(int i);
	
	public abstract List<Manager> findPermissions(@Param("roleids") String roleids);
	
	public abstract Manager login (Manager manager);

	public abstract int insertManager(Manager manager);

	public abstract void updateManager(Manager manager);
	
	public abstract void updateManagerPwd(Manager manager);

	public abstract void deleteManager(int managerId);
	
	public abstract Manager getManager(Manager manager);
	
	public abstract Manager getManagerId(Manager manager);
	
	public abstract Manager getManagerAcc(Manager manager);
	
}
