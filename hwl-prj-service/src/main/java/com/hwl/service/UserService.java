package com.hwl.service;

import java.util.*;

import com.hwl.service.model.*;
/**
 * @author lind
 *
 */
public abstract interface UserService {
	
	public abstract List<User> getUserListPage(User user);
	
	public abstract List<User> getUserByAgent(User user);
	
	public abstract List<User> getUserByAgents(User user);
	
	public abstract User getUserById(int userId);
	
	public abstract User getUserByOpenid(User user);
	
	public abstract int saveUser(User user,String doWhat);
	
	public abstract User login(User user);
	
	public abstract User getUserByMobile(User user);

	public abstract void deleteUser(int userId);
	
	public abstract User getMoneys(User user);

	public abstract User getMoneysOpenid(User user);
	
}