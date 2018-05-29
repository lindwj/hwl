package com.hwl.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import com.hwl.service.model.ManagerForm;
import com.hwl.service.model.Nation;
import com.hwl.service.model.User;
import com.hwl.service.util.Common;
import com.hwl.service.ManagerService;
import com.hwl.service.dao.ManagerMapper;



/**
 * @author lind
 */

@Controller
@RequestMapping("/manager")
public class ManagerController{
	
	// 业务逻辑对象
	@Autowired
	private ManagerService managerService;
	@Autowired
	private ManagerMapper managerMapper;
	
	// 查询结果
	private List<Manager> managerList;
	
	private ManagerForm managerForm=new ManagerForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	@RequestMapping("/getMobileCaptcha.do")
	@ResponseBody
	public int getMobileCaptcha(Manager manager) throws Exception {
		Manager m=this.managerService.getManagerAcc(manager);
		if(m!=null){
			int ret = 0;
			try {
				String rets = Common.getMobileCaptcha(m.getMobile());
	
				if (rets.contains("ok")) {
					ret = 0;
				} else {
					ret = 1;
				}
			} catch (Exception e) {
				e.printStackTrace();
				ret = 1;
			}
			return ret;
		}else{
			return -1;
		}
	}
	
	
	/** 保存新增对象 */
	@RequestMapping("/mngAddEdit.do")
	@ResponseBody
	public Manager mngAddEdit(Manager manager) throws Exception {
		String validate = null;

		if (true) {

			// 后端校验 账号 密码 验证码 等不能为空

			if (manager.getMobile() == null || manager.getMobile().length() != 11) {
				validate = "101";
			}

			if (manager.getCaptcha() == null || manager.getCaptcha().length() != 4) {
				validate = "101";
			}
			if (manager.getPassword() == null || manager.getPassword().length() == 0) {
				validate = "101";
			}
			if ("101".equals(validate)) {
				manager.setPassword("");
				//参数为空
				manager.setErrcode("013");
				return manager;
			}

			// 验证码校验
			List<String> sList = null;
			Subject subject = SecurityUtils.getSubject();
			Object ob = subject.getSession().getAttribute("captcha");
			if (ob != null) {
				sList = (List<String>) ob;
				// 验证不通过
				if (!manager.getCaptcha().equals(sList.get(1))) {
					manager.setPassword("");
					//验证码错误
					manager.setErrcode("011");
					return manager;
				}

				subject.getSession().removeAttribute("captcha");

			} else {
				// 未获取验证码
				manager.setPassword("");
				manager.setErrcode("012");
				return manager;

			}

			// 校验结束


			// 加盐 md5加密
			manager.setPassword(Common.Md5(manager.getPassword() + Common.salt));

		}

		try {
			
			Subject subject = SecurityUtils.getSubject();
			
			if(!subject.isAuthenticated()){
				// 未登陆
				manager.setPassword("");
				manager.setErrcode("014");
				return manager;
			}
			
			Manager mg = (Manager) subject.getPrincipal();

			manager.setManagerId(mg.getManagerId());
			
			this.managerService.updateManager(manager);
		} catch (DuplicateKeyException be) {

		}
		// 成功
		manager.setPassword("");
		manager.setErrcode("010");
		return manager;
	}
	
	/** 保存新增对象 */
	@RequestMapping("/mngUpdate.do")
	@ResponseBody
	public int mngUpdate(Manager manager) throws Exception {
		String validate = null;
			// 后端校验 账号 密码 验证码 等不能为空
			if (manager.getAccount() == null) {
				validate = "101";
			}
			
			if (manager.getCaptcha() == null || manager.getCaptcha().length() != 4) {
				validate = "101";
			}
			if (manager.getPassword() == null || manager.getPassword().length() == 0) {
				validate = "101";
			}
			if ("101".equals(validate)) {
				manager.setPassword("");
				//参数为空
				manager.setErrcode("013");
				return -1;
			}else{
			
			Manager m=this.managerService.getManagerAcc(manager);
			if(m!=null){
				
			// 验证码校验
			List<String> sList = null;
			Subject subject = SecurityUtils.getSubject();
			Object ob = subject.getSession().getAttribute("captcha");
			if (ob != null) {
				sList = (List<String>) ob;
				// 验证不通过
				if (!manager.getCaptcha().equals(sList.get(1))) {
					manager.setPassword("");
					//验证码错误
					return -2;
				}else{
					// 加盐 md5加密
					manager.setPassword(Common.Md5(manager.getPassword() + Common.salt));
					this.managerService.updateManagerPwd(manager);
					subject.getSession().removeAttribute("captcha");
					Subject sub = SecurityUtils.getSubject();
					if (sub.isAuthenticated()) {
						sub.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
						// 成功
						return 1;
					}else{
						// 成功
						return 1;
					}
				}
			} else {
				// 未获取验证码
				manager.setPassword("");
				manager.setErrcode("012");
				return -3;
				
			}
			
			}else{
				return -4;
			}
		}
	}
	
	@RequestMapping("/logout.do")
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
			
		}
		return "redirect:/resource/jsp/login.jsp";
	}
	
	
	@RequestMapping("/logoutSvc.do")
	@ResponseBody
	public int logoutSvc() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
			
		}
		return 0;
	}
	
	/**
	   * 用户登录
	   * @param currUser
	   * @return
	   */
	  @RequestMapping("/login.do")
	  public String login(Manager manager){
	    Subject user = SecurityUtils.getSubject();
	    
	    //加盐  md5加密
	    manager.setPassword(Common.Md5(manager.getPassword()+Common.salt));
	    
	    UsernamePasswordToken token = new UsernamePasswordToken(manager.getAccount(),manager.getPassword());
	    
	    
//	    token.setRememberMe(true);
	    try {
	      user.login(token);
//	      return "/jsp/index";
	      return "redirect:/nation/getNationListPage.do?menuId=881";
	    }catch (AuthenticationException e) {
	      e.printStackTrace();
	      token.clear();
	      return "redirect:/resource/jsp/login.jsp";
	    }
	  }
	  
	  
	  
	  
	  
	  @RequestMapping("/loginSvc.do")
	  @ResponseBody
	  public Manager loginSvc(Manager manager){
		  
		Manager m=this.managerService.getManagerAcc(manager);
	    Subject user = SecurityUtils.getSubject();
	    //加盐  md5加密
	    manager.setPassword(Common.Md5(manager.getPassword()+Common.salt));
	    
	    UsernamePasswordToken token = new UsernamePasswordToken(manager.getAccount(),manager.getPassword());
//	    token.setRememberMe(true);
	    try {
	      user.login(token);
	      
	      //返回数据
	      m.setErrcode("000");
	      m.setPassword("");
	      return m;
	    }catch (Exception e) {
	      e.printStackTrace();
	      token.clear();
	      
	      
	    //返回数据
	      m.setErrcode("001"); //登陆失败
	      m.setPassword("");
	      return m;
	    }
	  }
	  
	  
	  @RequestMapping("/test.do")
	  public String test(Model model,@RequestParam int managerid){
	    
		  Manager manager =managerService.getManagerById(managerid);
	      model.addAttribute("manager", manager);
		  return "/test/test";
	  }
	
	/** 执行搜索 */
	@RequestMapping("/managerListPage.do")
	public String managerListPage(Manager manager, Model model) throws Exception{
		//managerForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		
		Subject subject = SecurityUtils.getSubject();
		Manager mg = (Manager) subject.getPrincipal();

		manager.setCreateByAdm(mg.getManagerId());

		managerList = managerService.getManagerListPage(manager);
		
		
		model.addAttribute("managerList", managerList);
		
		model.addAttribute("page", manager.getPage());
		model.addAttribute("errcode", manager.getErrcode());
		
		if(manager.getMenuId()!=null&&manager.getMenuId()>0){
			subject.getSession().setAttribute("menuId", manager.getMenuId());
			}
		
		return "/jsp/manager/managerIndex";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/managerAddEditIni.do")
	public String managerAddEditIni(Manager manager,Model model) throws Exception{
		model.addAttribute("errcode", manager.getErrcode());
		manager = this.managerService.getManagerById(manager.getManagerId());
		
		//查询角色
		List<Manager> roleList= managerService.findAllRoles(0);
		model.addAttribute("roleList", roleList);		
				
		model.addAttribute("manager", manager);
		return "/jsp/manager/managerEdit";
	}
	
	@RequestMapping("/managerEditIni.do")
	public String managerEditIni(Manager manager,Model model) throws Exception{
		model.addAttribute("errcode", manager.getErrcode());
		model.addAttribute("manager", manager);
		return "/jsp/manager/managerEditPWD";
	}
	
	@RequestMapping("/managerAdd.do")
	public String managerAdd(Manager manager,Model model) throws Exception{
		model.addAttribute("errcode", manager.getErrcode());
				
		
		//查询角色
		List<Manager> roleList= managerService.findAllRoles(0);
				
		model.addAttribute("roleList", roleList);
		model.addAttribute("manager", manager);
		return "/jsp/manager/managerAdd";
	}
	
	/** 查看对象*/
	public String managerDetail() throws Exception {
//		this.setPare_moduleid(14);	
		Manager manager=null;
		manager = this.managerService.getManagerById(manager.getManagerId());
		managerForm.setManager(manager);
		return "detail";
	}
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		Manager manager=null;
		manager = this.managerService.getManagerById(manager.getManagerId());
		managerForm.setManager(manager);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/saveManager.do")
	public ModelAndView managerAddEdit(Manager manager, ModelAndView model) throws Exception {		
		String validate = null;
		// add 新增 edit 修改
		if ("add".equals(manager.getDowhat())) {

			// 后端校验 101 省市县 街道 名称 编号 等不能为空

			if (manager.getProvince() == null || manager.getProvince() <= 0) {
				validate = "101";
			}
			if (manager.getCity() == null || manager.getCity() <= 0) {
				validate = "101";
			}
			if (manager.getDistrict() == null || manager.getDistrict() <= 0) {
				validate = "101";
			}

			if (manager.getName() == null || manager.getName().length() == 0) {
				validate = "101";
			}

//			if (manager.getIdNo() == null || manager.getIdNo().length() == 0) {
//				validate = "101";
//			}
//			if (manager.getMobile() == null || manager.getMobile().length() == 0) {
//				validate = "101";
//			}
			if (manager.getAccount() == null || manager.getAccount().length() == 0) {
				validate = "101";
			}
			if (manager.getPassword() == null || manager.getPassword().length() == 0) {
				validate = "101";
			}
			if (manager.getRoleId() == null || manager.getRoleId()<= 0) {
				validate = "101";
			}
			
			
			if ("101".equals(validate)) {
				model.addObject("errcode", "101");
				model.setViewName("redirect:/manager/managerAdd.do");
				return model;
			}

			// 校验结束

			// 1 表示 激活 ，这里直接赋予 激活状态
			manager.setStatus(1);

			Subject subject = SecurityUtils.getSubject();
			Manager mg = (Manager) subject.getPrincipal();

			manager.setCreateByAdm(mg.getManagerId());
			
			//加盐  md5加密
		    manager.setPassword(Common.Md5(manager.getPassword()+Common.salt));

		} else if ("edit".equals(manager.getDowhat())) {
			if (manager.getName() == null || manager.getName().length() == 0) {
				validate = "101";
			}

//			if (manager.getIdNo() == null || manager.getIdNo().length() == 0) {
//				validate = "101";
//			}
//			if (manager.getMobile() == null || manager.getMobile().length() == 0) {
//				validate = "101";
//			}
			if (manager.getAccount() == null || manager.getAccount().length() == 0) {
				validate = "101";
			}
//			if (manager.getPassword() == null || manager.getPassword().length() == 0) {
//				validate = "101";
//			}
			if (manager.getRoleId() == null || manager.getRoleId()<= 0) {
				validate = "101";
			}

			if ("101".equals(validate)) {
				model.addObject("errcode", "101");
				model.addObject("managerId", manager.getManagerId());
				model.setViewName("redirect:/manager/managerAddEditIni.do");
				return model;
			}
		}

		try {
			
			this.managerService.saveManager(manager, manager.getDowhat());
			
			
		} catch (DuplicateKeyException be) {
			// 重复值
			model.addObject("errcode", "100");
			
			if("edit".equals(manager.getDowhat())){
				model.addObject("managerId", manager.getManagerId());
				model.setViewName("redirect:/manager/managerAddEditIni.do");
				return model;
			}else{
				
				model.setViewName("redirect:/manager/managerAdd.do");
				return model;
			}

		}
		
		

		model.setViewName("redirect:/manager/managerListPage.do");
		return model;
	}
	
	@RequestMapping("/saveManagerPWD.do")
	public ModelAndView saveManagerPWD(Manager manager, ModelAndView model) throws Exception {		
		String validate = null;
		if ("edit".equals(manager.getDowhat())) {
			if (manager.getPassword() == null || manager.getPassword().length() == 0) {
				validate = "101";
			}
			if ("101".equals(validate)) {
				model.addObject("errcode", "101");
				model.addObject("managerId", manager.getManagerId());
				model.setViewName("redirect:/manager/managerAddEditIni.do");
				return model;
			}
			
			//修改密码
			if(manager.getPassword()!=null&&manager.getPassword().length()>0){
				//加盐  md5加密
			    manager.setPassword(Common.Md5(manager.getPassword()+Common.salt));
			}
		}

		try {
			this.managerMapper.updateManagerPwd(manager);
		} catch (DuplicateKeyException be) {
			// 重复值
			model.addObject("errcode", "100");
			
			if("edit".equals(manager.getDowhat())){
				model.addObject("managerId", manager.getManagerId());
				model.setViewName("redirect:/manager/managerEditIni.do");
				return model;
			}
		}
		model.setViewName("redirect:/manager/managerListPage.do");
		return model;
	}
	/**删除对象*/
	@RequestMapping("/delManager.do")
	public String managerDelete(Manager manager) throws Exception {	
		this.managerService.deleteManager(manager.getManagerId());
		return "redirect:/manager/managerListPage.do";
	}	

	public ManagerForm getModel() {
		return managerForm;
	}
	
	public List<Manager> getManagerList() {
		return this.managerList;
	}

	public void setManagerList(List<Manager> managerList) {
		this.managerList = managerList;
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
}
