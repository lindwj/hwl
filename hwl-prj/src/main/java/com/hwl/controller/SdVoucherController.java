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

import com.hwl.service.model.SdVoucher;
import com.hwl.service.model.SdVoucherForm;
import com.hwl.service.SdVoucherService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdVoucher")
public class SdVoucherController {
	
	// 业务逻辑对象
	@Autowired
	private SdVoucherService sdVoucherService;
	
	// 查询结果
	private List<SdVoucher> sdVoucherList;
	
	private SdVoucherForm sdVoucherForm=new SdVoucherForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdVoucherListPage.do")
	@ResponseBody
	public String sdVoucherListPage() throws Exception{
		//sdVoucherForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdVoucher sdVoucher=sdVoucherForm.getSdVoucher();
		sdVoucherList = sdVoucherService.getSdVoucherListPage(sdVoucher);
		sdVoucherForm.setSdVoucher(sdVoucher);
		request.setAttribute("page", sdVoucherForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdVoucherAddEditIni.do")
	@ResponseBody
	public String sdVoucherAddEditIni() throws Exception{
		SdVoucher sdVoucher=sdVoucherForm.getSdVoucher();
		if ("edit".equals(doWhat)) {
			sdVoucher = this.sdVoucherService.getSdVoucherById(sdVoucher.getSdVoucherId());
			sdVoucherForm.setSdVoucher(sdVoucher);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdVoucherDetail.do")
	@ResponseBody
	public String sdVoucherDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdVoucher sdVoucher=sdVoucherForm.getSdVoucher();
		sdVoucher = this.sdVoucherService.getSdVoucherById(sdVoucher.getSdVoucherId());
		sdVoucherForm.setSdVoucher(sdVoucher);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdVoucher sdVoucher=sdVoucherForm.getSdVoucher();
		sdVoucher = this.sdVoucherService.getSdVoucherById(sdVoucher.getSdVoucherId());
		sdVoucherForm.setSdVoucher(sdVoucher);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdVoucherAddEdit.do")
	@ResponseBody
	public String sdVoucherAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdVoucherForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdVoucher sdVoucher=sdVoucherForm.getSdVoucher();
		this.sdVoucherService.saveSdVoucher(sdVoucher, this.doWhat);
		sdVoucherForm.setSdVoucher(sdVoucher);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdVoucherDelete.do")
	@ResponseBody
	public String sdVoucherDelete() throws Exception {	
		SdVoucher sdVoucher=sdVoucherForm.getSdVoucher();
		this.sdVoucherService.deleteSdVoucher(sdVoucher.getSdVoucherId());
		return "list";
	}	

	public SdVoucherForm getModel() {
		return sdVoucherForm;
	}
	
	public List<SdVoucher> getSdVoucherList() {
		return this.sdVoucherList;
	}

	public void setSdVoucherList(List<SdVoucher> sdVoucherList) {
		this.sdVoucherList = sdVoucherList;
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
