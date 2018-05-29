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

import com.hwl.service.model.SdCustomer;
import com.hwl.service.model.SdCustomerForm;
import com.hwl.service.SdCustomerService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdCustomer")
public class SdCustomerController {
	
	// 业务逻辑对象
	@Autowired
	private SdCustomerService sdCustomerService;
	
	// 查询结果
	private List<SdCustomer> sdCustomerList;
	
	private SdCustomerForm sdCustomerForm=new SdCustomerForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdCustomerListPage.do")
	@ResponseBody
	public String sdCustomerListPage() throws Exception{
		//sdCustomerForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdCustomer sdCustomer=sdCustomerForm.getSdCustomer();
		sdCustomerList = sdCustomerService.getSdCustomerListPage(sdCustomer);
		sdCustomerForm.setSdCustomer(sdCustomer);
		request.setAttribute("page", sdCustomerForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdCustomerAddEditIni.do")
	@ResponseBody
	public String sdCustomerAddEditIni() throws Exception{
		SdCustomer sdCustomer=sdCustomerForm.getSdCustomer();
		if ("edit".equals(doWhat)) {
			sdCustomer = this.sdCustomerService.getSdCustomerById(sdCustomer.getSdCustomerId());
			sdCustomerForm.setSdCustomer(sdCustomer);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdCustomerDetail.do")
	@ResponseBody
	public String sdCustomerDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdCustomer sdCustomer=sdCustomerForm.getSdCustomer();
		sdCustomer = this.sdCustomerService.getSdCustomerById(sdCustomer.getSdCustomerId());
		sdCustomerForm.setSdCustomer(sdCustomer);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdCustomer sdCustomer=sdCustomerForm.getSdCustomer();
		sdCustomer = this.sdCustomerService.getSdCustomerById(sdCustomer.getSdCustomerId());
		sdCustomerForm.setSdCustomer(sdCustomer);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdCustomerAddEdit.do")
	@ResponseBody
	public String sdCustomerAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdCustomerForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdCustomer sdCustomer=sdCustomerForm.getSdCustomer();
		this.sdCustomerService.saveSdCustomer(sdCustomer, this.doWhat);
		sdCustomerForm.setSdCustomer(sdCustomer);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdCustomerDelete.do")
	@ResponseBody
	public String sdCustomerDelete() throws Exception {	
		SdCustomer sdCustomer=sdCustomerForm.getSdCustomer();
		this.sdCustomerService.deleteSdCustomer(sdCustomer.getSdCustomerId());
		return "list";
	}	

	public SdCustomerForm getModel() {
		return sdCustomerForm;
	}
	
	public List<SdCustomer> getSdCustomerList() {
		return this.sdCustomerList;
	}

	public void setSdCustomerList(List<SdCustomer> sdCustomerList) {
		this.sdCustomerList = sdCustomerList;
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
