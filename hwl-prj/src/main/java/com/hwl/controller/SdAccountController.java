package com.hwl.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwl.service.model.SdAccount;
import com.hwl.service.model.SdAccountForm;
import com.hwl.service.SdAccountService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdAccount")
public class SdAccountController {
	
	// 业务逻辑对象
	@Autowired
	private SdAccountService sdAccountService;
	
	// 查询结果
	private List<SdAccount> sdAccountList;
	
	private SdAccountForm sdAccountForm=new SdAccountForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdAccountListPage.do")
	@ResponseBody
	public String sdAccountListPage() throws Exception{
		//sdAccountForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdAccount sdAccount=sdAccountForm.getSdAccount();
		sdAccountList = sdAccountService.getSdAccountListPage(sdAccount);
		sdAccountForm.setSdAccount(sdAccount);
		request.setAttribute("page", sdAccountForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdAccountAddEditIni.do")
	@ResponseBody
	public String sdAccountAddEditIni() throws Exception{
		SdAccount sdAccount=sdAccountForm.getSdAccount();
		if ("edit".equals(doWhat)) {
			sdAccount = this.sdAccountService.getSdAccountById(sdAccount.getSdAccountId());
			sdAccountForm.setSdAccount(sdAccount);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdAccountDetail.do")
	@ResponseBody
	public String sdAccountDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdAccount sdAccount=sdAccountForm.getSdAccount();
		sdAccount = this.sdAccountService.getSdAccountById(sdAccount.getSdAccountId());
		sdAccountForm.setSdAccount(sdAccount);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdAccount sdAccount=sdAccountForm.getSdAccount();
		sdAccount = this.sdAccountService.getSdAccountById(sdAccount.getSdAccountId());
		sdAccountForm.setSdAccount(sdAccount);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdAccountAddEdit.do")
	@ResponseBody
	public String sdAccountAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdAccountForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdAccount sdAccount=sdAccountForm.getSdAccount();
		this.sdAccountService.saveSdAccount(sdAccount, this.doWhat);
		sdAccountForm.setSdAccount(sdAccount);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdAccountDelete.do")
	@ResponseBody
	public String sdAccountDelete() throws Exception {	
		SdAccount sdAccount=sdAccountForm.getSdAccount();
		this.sdAccountService.deleteSdAccount(sdAccount.getSdAccountId());
		return "list";
	}	

	public SdAccountForm getModel() {
		return sdAccountForm;
	}
	
	public List<SdAccount> getSdAccountList() {
		return this.sdAccountList;
	}

	public void setSdAccountList(List<SdAccount> sdAccountList) {
		this.sdAccountList = sdAccountList;
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
