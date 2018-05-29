package com.hwl.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hwl.service.model.Manager;
import com.hwl.service.model.User;
import com.hwl.service.util.Common;
import com.hwl.service.UserService;

/**
 * @author lind
 */

@Controller
@RequestMapping("/user")
public class UserController {

	// 业务逻辑对象
	@Autowired
	private UserService userService;
	
	@Autowired
	private  HttpServletRequest request;
	
	@Autowired
	private  HttpServletResponse response;
	

	// 查询结果
	private List<User> userList;

	private Map<String, Object> session;
	private String doWhat;
	private int pare_moduleid;
	
	//用户是否被绑定
	@RequestMapping("/bindUser.do")
	@ResponseBody
	public int bindUser(User user) {
		Date now=new Date();
		User u=userService.getUserById(user.getUserId());
		if(u.getAgentId()!=null&&u.getBindState()==0){
			u.setBindState(1);
			u.setSuccessDate(now);
			userService.saveUser(u, "edit");
			return 1;
		}else{
			return 0;
		}
	}
	
	//用户是否被绑定
	@RequestMapping("/bindUserOpen.do")
	@ResponseBody
	public int bindUserOpen(User user) {
		Date now=new Date();
		User u=userService.getUserByOpenid(user);
		if(u.getAgentId()!=null&&u.getBindState()==0){
			u.setBindState(1);
			u.setSuccessDate(now);
			userService.saveUser(u, "edit");
			return 1;
		}else{
			return 0;
		}
	}

	@RequestMapping("/userList.do")
	public String userList(User user,Model model)throws Exception{
		List<User> list=userService.getUserListPage(user);
		user.setUsers(list);
		Subject subject = SecurityUtils.getSubject();
		if(user.getMenuId()!=null&&user.getMenuId()>0){
			subject.getSession().setAttribute("menuId", user.getMenuId());
		}
		model.addAttribute("page", user.getPage());
		model.addAttribute("user", user);
		return "/jsp/user/userIndex";
	}
	

	public List<User> getUserList() {
		return this.userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public String getDoWhat() {
		return doWhat;
	}

	public void setDoWhat(String doWhat) {
		this.doWhat = doWhat;
	}

	public void setPare_moduleid(int pareModuleid) {
		pare_moduleid = pareModuleid;
	}
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

}
