package com.hwl.service.dao;

import java.util.*;

import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface ManagerRoleMapper {
	
	public abstract List<ManagerRole> getManagerRoleListPage(ManagerRole managerRole);
	
	public abstract ManagerRole getManagerRoleById(int managerRoleId);

	public abstract int insertManagerRole(ManagerRole managerRole);

	public abstract void updateManagerRole(ManagerRole managerRole);

	public abstract void deleteManagerRole(int managerRoleId);
	
}
