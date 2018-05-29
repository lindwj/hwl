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

@Service("UserService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getUserListPage(User user){
		return userMapper.getUserListPage(user);
	}
	
	@Override
	public User getUserById(int userId){
		return userMapper.getUserById(userId);
	}
	@Override
	public User login(User user){
		return userMapper.login(user);
	}
	
	@Override
	public User getUserByMobile(User user){
		return userMapper.getUserByMobile(user);
	}

	@Override
	public int saveUser(User user,String doWhat){
		if("add".equals(doWhat)){
			return userMapper.insertUser(user);
		}else if("edit".equals(doWhat)){
			userMapper.updateUser(user);
		}		
		return 0;
  	
	}
	
	@Override
	public void deleteUser(int userId){
		userMapper.deleteUser(userId);
	}

	@Override
	public User getUserByOpenid(User user) {
		return userMapper.getUserByOpenid(user);
	}

	@Override
	public List<User> getUserByAgent(User user) {
		return userMapper.getUserByAgent(user);
	}

	@Override
	public List<User> getUserByAgents(User user) {
		return userMapper.getUserByAgents(user);
	}
	
	@Override
	public User getMoneys(User user) {
		return userMapper.getMoneys(user);
	}

	@Override
	public User getMoneysOpenid(User user) {
		return userMapper.getMoneysOpenid(user);
	}
	
}