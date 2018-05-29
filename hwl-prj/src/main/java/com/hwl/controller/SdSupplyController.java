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

import com.hwl.service.model.SdSupply;
import com.hwl.service.model.SdSupplyForm;
import com.hwl.service.SdSupplyService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdSupply")
public class SdSupplyController {
	
	// 业务逻辑对象
	@Autowired
	private SdSupplyService sdSupplyService;
	
	// 查询结果
	private List<SdSupply> sdSupplyList;
	
	private SdSupplyForm sdSupplyForm=new SdSupplyForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdSupplyListPage.do")
	@ResponseBody
	public String sdSupplyListPage() throws Exception{
		//sdSupplyForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdSupply sdSupply=sdSupplyForm.getSdSupply();
		sdSupplyList = sdSupplyService.getSdSupplyListPage(sdSupply);
		sdSupplyForm.setSdSupply(sdSupply);
		request.setAttribute("page", sdSupplyForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdSupplyAddEditIni.do")
	@ResponseBody
	public String sdSupplyAddEditIni() throws Exception{
		SdSupply sdSupply=sdSupplyForm.getSdSupply();
		if ("edit".equals(doWhat)) {
			sdSupply = this.sdSupplyService.getSdSupplyById(sdSupply.getSdSupplyId());
			sdSupplyForm.setSdSupply(sdSupply);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdSupplyDetail.do")
	@ResponseBody
	public String sdSupplyDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdSupply sdSupply=sdSupplyForm.getSdSupply();
		sdSupply = this.sdSupplyService.getSdSupplyById(sdSupply.getSdSupplyId());
		sdSupplyForm.setSdSupply(sdSupply);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdSupply sdSupply=sdSupplyForm.getSdSupply();
		sdSupply = this.sdSupplyService.getSdSupplyById(sdSupply.getSdSupplyId());
		sdSupplyForm.setSdSupply(sdSupply);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdSupplyAddEdit.do")
	@ResponseBody
	public String sdSupplyAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdSupplyForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdSupply sdSupply=sdSupplyForm.getSdSupply();
		this.sdSupplyService.saveSdSupply(sdSupply, this.doWhat);
		sdSupplyForm.setSdSupply(sdSupply);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdSupplyDelete.do")
	@ResponseBody
	public String sdSupplyDelete() throws Exception {	
		SdSupply sdSupply=sdSupplyForm.getSdSupply();
		this.sdSupplyService.deleteSdSupply(sdSupply.getSdSupplyId());
		return "list";
	}	

	public SdSupplyForm getModel() {
		return sdSupplyForm;
	}
	
	public List<SdSupply> getSdSupplyList() {
		return this.sdSupplyList;
	}

	public void setSdSupplyList(List<SdSupply> sdSupplyList) {
		this.sdSupplyList = sdSupplyList;
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
