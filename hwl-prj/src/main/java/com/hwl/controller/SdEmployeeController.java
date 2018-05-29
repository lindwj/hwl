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

import com.hwl.service.model.SdEmployee;
import com.hwl.service.model.SdEmployeeForm;
import com.hwl.service.SdEmployeeService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdEmployee")
public class SdEmployeeController {
	
	// 业务逻辑对象
	@Autowired
	private SdEmployeeService sdEmployeeService;
	
	// 查询结果
	private List<SdEmployee> sdEmployeeList;
	
	private SdEmployeeForm sdEmployeeForm=new SdEmployeeForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdEmployeeListPage.do")
	@ResponseBody
	public String sdEmployeeListPage() throws Exception{
		//sdEmployeeForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdEmployee sdEmployee=sdEmployeeForm.getSdEmployee();
		sdEmployeeList = sdEmployeeService.getSdEmployeeListPage(sdEmployee);
		sdEmployeeForm.setSdEmployee(sdEmployee);
		request.setAttribute("page", sdEmployeeForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdEmployeeAddEditIni.do")
	@ResponseBody
	public String sdEmployeeAddEditIni() throws Exception{
		SdEmployee sdEmployee=sdEmployeeForm.getSdEmployee();
		if ("edit".equals(doWhat)) {
			sdEmployee = this.sdEmployeeService.getSdEmployeeById(sdEmployee.getSdEmployeeId());
			sdEmployeeForm.setSdEmployee(sdEmployee);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdEmployeeDetail.do")
	@ResponseBody
	public String sdEmployeeDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdEmployee sdEmployee=sdEmployeeForm.getSdEmployee();
		sdEmployee = this.sdEmployeeService.getSdEmployeeById(sdEmployee.getSdEmployeeId());
		sdEmployeeForm.setSdEmployee(sdEmployee);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdEmployee sdEmployee=sdEmployeeForm.getSdEmployee();
		sdEmployee = this.sdEmployeeService.getSdEmployeeById(sdEmployee.getSdEmployeeId());
		sdEmployeeForm.setSdEmployee(sdEmployee);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdEmployeeAddEdit.do")
	@ResponseBody
	public String sdEmployeeAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdEmployeeForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdEmployee sdEmployee=sdEmployeeForm.getSdEmployee();
		this.sdEmployeeService.saveSdEmployee(sdEmployee, this.doWhat);
		sdEmployeeForm.setSdEmployee(sdEmployee);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdEmployeeDelete.do")
	@ResponseBody
	public String sdEmployeeDelete() throws Exception {	
		SdEmployee sdEmployee=sdEmployeeForm.getSdEmployee();
		this.sdEmployeeService.deleteSdEmployee(sdEmployee.getSdEmployeeId());
		return "list";
	}	

	public SdEmployeeForm getModel() {
		return sdEmployeeForm;
	}
	
	public List<SdEmployee> getSdEmployeeList() {
		return this.sdEmployeeList;
	}

	public void setSdEmployeeList(List<SdEmployee> sdEmployeeList) {
		this.sdEmployeeList = sdEmployeeList;
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
