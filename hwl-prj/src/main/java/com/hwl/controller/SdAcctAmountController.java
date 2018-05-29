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

import com.hwl.service.model.SdAcctAmount;
import com.hwl.service.model.SdAcctAmountForm;
import com.hwl.service.SdAcctAmountService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdAcctAmount")
public class SdAcctAmountController {
	
	// 业务逻辑对象
	@Autowired
	private SdAcctAmountService sdAcctAmountService;
	
	// 查询结果
	private List<SdAcctAmount> sdAcctAmountList;
	
	private SdAcctAmountForm sdAcctAmountForm=new SdAcctAmountForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdAcctAmountListPage.do")
	@ResponseBody
	public String sdAcctAmountListPage() throws Exception{
		//sdAcctAmountForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdAcctAmount sdAcctAmount=sdAcctAmountForm.getSdAcctAmount();
		sdAcctAmountList = sdAcctAmountService.getSdAcctAmountListPage(sdAcctAmount);
		sdAcctAmountForm.setSdAcctAmount(sdAcctAmount);
		request.setAttribute("page", sdAcctAmountForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdAcctAmountAddEditIni.do")
	@ResponseBody
	public String sdAcctAmountAddEditIni() throws Exception{
		SdAcctAmount sdAcctAmount=sdAcctAmountForm.getSdAcctAmount();
		if ("edit".equals(doWhat)) {
			sdAcctAmount = this.sdAcctAmountService.getSdAcctAmountById(sdAcctAmount.getSdAcctAmountId());
			sdAcctAmountForm.setSdAcctAmount(sdAcctAmount);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdAcctAmountDetail.do")
	@ResponseBody
	public String sdAcctAmountDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdAcctAmount sdAcctAmount=sdAcctAmountForm.getSdAcctAmount();
		sdAcctAmount = this.sdAcctAmountService.getSdAcctAmountById(sdAcctAmount.getSdAcctAmountId());
		sdAcctAmountForm.setSdAcctAmount(sdAcctAmount);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdAcctAmount sdAcctAmount=sdAcctAmountForm.getSdAcctAmount();
		sdAcctAmount = this.sdAcctAmountService.getSdAcctAmountById(sdAcctAmount.getSdAcctAmountId());
		sdAcctAmountForm.setSdAcctAmount(sdAcctAmount);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdAcctAmountAddEdit.do")
	@ResponseBody
	public String sdAcctAmountAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdAcctAmountForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdAcctAmount sdAcctAmount=sdAcctAmountForm.getSdAcctAmount();
		this.sdAcctAmountService.saveSdAcctAmount(sdAcctAmount, this.doWhat);
		sdAcctAmountForm.setSdAcctAmount(sdAcctAmount);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdAcctAmountDelete.do")
	@ResponseBody
	public String sdAcctAmountDelete() throws Exception {	
		SdAcctAmount sdAcctAmount=sdAcctAmountForm.getSdAcctAmount();
		this.sdAcctAmountService.deleteSdAcctAmount(sdAcctAmount.getSdAcctAmountId());
		return "list";
	}	

	public SdAcctAmountForm getModel() {
		return sdAcctAmountForm;
	}
	
	public List<SdAcctAmount> getSdAcctAmountList() {
		return this.sdAcctAmountList;
	}

	public void setSdAcctAmountList(List<SdAcctAmount> sdAcctAmountList) {
		this.sdAcctAmountList = sdAcctAmountList;
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
