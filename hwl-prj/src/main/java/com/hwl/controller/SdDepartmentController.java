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

import com.hwl.service.model.SdDepartment;
import com.hwl.service.model.SdDepartmentForm;
import com.hwl.service.SdDepartmentService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdDepartment")
public class SdDepartmentController {
	
	// 业务逻辑对象
	@Autowired
	private SdDepartmentService sdDepartmentService;
	
	// 查询结果
	private List<SdDepartment> sdDepartmentList;
	
	private SdDepartmentForm sdDepartmentForm=new SdDepartmentForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdDepartmentListPage.do")
	@ResponseBody
	public String sdDepartmentListPage() throws Exception{
		//sdDepartmentForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdDepartment sdDepartment=sdDepartmentForm.getSdDepartment();
		sdDepartmentList = sdDepartmentService.getSdDepartmentListPage(sdDepartment);
		sdDepartmentForm.setSdDepartment(sdDepartment);
		request.setAttribute("page", sdDepartmentForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdDepartmentAddEditIni.do")
	@ResponseBody
	public String sdDepartmentAddEditIni() throws Exception{
		SdDepartment sdDepartment=sdDepartmentForm.getSdDepartment();
		if ("edit".equals(doWhat)) {
			sdDepartment = this.sdDepartmentService.getSdDepartmentById(sdDepartment.getSdDepartmentId());
			sdDepartmentForm.setSdDepartment(sdDepartment);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdDepartmentDetail.do")
	@ResponseBody
	public String sdDepartmentDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdDepartment sdDepartment=sdDepartmentForm.getSdDepartment();
		sdDepartment = this.sdDepartmentService.getSdDepartmentById(sdDepartment.getSdDepartmentId());
		sdDepartmentForm.setSdDepartment(sdDepartment);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdDepartment sdDepartment=sdDepartmentForm.getSdDepartment();
		sdDepartment = this.sdDepartmentService.getSdDepartmentById(sdDepartment.getSdDepartmentId());
		sdDepartmentForm.setSdDepartment(sdDepartment);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdDepartmentAddEdit.do")
	@ResponseBody
	public String sdDepartmentAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdDepartmentForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdDepartment sdDepartment=sdDepartmentForm.getSdDepartment();
		this.sdDepartmentService.saveSdDepartment(sdDepartment, this.doWhat);
		sdDepartmentForm.setSdDepartment(sdDepartment);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdDepartmentDelete.do")
	@ResponseBody
	public String sdDepartmentDelete() throws Exception {	
		SdDepartment sdDepartment=sdDepartmentForm.getSdDepartment();
		this.sdDepartmentService.deleteSdDepartment(sdDepartment.getSdDepartmentId());
		return "list";
	}	

	public SdDepartmentForm getModel() {
		return sdDepartmentForm;
	}
	
	public List<SdDepartment> getSdDepartmentList() {
		return this.sdDepartmentList;
	}

	public void setSdDepartmentList(List<SdDepartment> sdDepartmentList) {
		this.sdDepartmentList = sdDepartmentList;
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
