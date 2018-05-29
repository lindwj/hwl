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

import com.hwl.service.model.SdElectResAcc;
import com.hwl.service.model.SdElectResAccForm;
import com.hwl.service.SdElectResAccService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdElectResAcc")
public class SdElectResAccController {
	
	// 业务逻辑对象
	@Autowired
	private SdElectResAccService sdElectResAccService;
	
	// 查询结果
	private List<SdElectResAcc> sdElectResAccList;
	
	private SdElectResAccForm sdElectResAccForm=new SdElectResAccForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdElectResAccListPage.do")
	@ResponseBody
	public String sdElectResAccListPage() throws Exception{
		//sdElectResAccForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdElectResAcc sdElectResAcc=sdElectResAccForm.getSdElectResAcc();
		sdElectResAccList = sdElectResAccService.getSdElectResAccListPage(sdElectResAcc);
		sdElectResAccForm.setSdElectResAcc(sdElectResAcc);
		request.setAttribute("page", sdElectResAccForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdElectResAccAddEditIni.do")
	@ResponseBody
	public String sdElectResAccAddEditIni() throws Exception{
		SdElectResAcc sdElectResAcc=sdElectResAccForm.getSdElectResAcc();
		if ("edit".equals(doWhat)) {
			sdElectResAcc = this.sdElectResAccService.getSdElectResAccById(sdElectResAcc.getSdElectResAccId());
			sdElectResAccForm.setSdElectResAcc(sdElectResAcc);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdElectResAccDetail.do")
	@ResponseBody
	public String sdElectResAccDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdElectResAcc sdElectResAcc=sdElectResAccForm.getSdElectResAcc();
		sdElectResAcc = this.sdElectResAccService.getSdElectResAccById(sdElectResAcc.getSdElectResAccId());
		sdElectResAccForm.setSdElectResAcc(sdElectResAcc);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdElectResAcc sdElectResAcc=sdElectResAccForm.getSdElectResAcc();
		sdElectResAcc = this.sdElectResAccService.getSdElectResAccById(sdElectResAcc.getSdElectResAccId());
		sdElectResAccForm.setSdElectResAcc(sdElectResAcc);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdElectResAccAddEdit.do")
	@ResponseBody
	public String sdElectResAccAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdElectResAccForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdElectResAcc sdElectResAcc=sdElectResAccForm.getSdElectResAcc();
		this.sdElectResAccService.saveSdElectResAcc(sdElectResAcc, this.doWhat);
		sdElectResAccForm.setSdElectResAcc(sdElectResAcc);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdElectResAccDelete.do")
	@ResponseBody
	public String sdElectResAccDelete() throws Exception {	
		SdElectResAcc sdElectResAcc=sdElectResAccForm.getSdElectResAcc();
		this.sdElectResAccService.deleteSdElectResAcc(sdElectResAcc.getSdElectResAccId());
		return "list";
	}	

	public SdElectResAccForm getModel() {
		return sdElectResAccForm;
	}
	
	public List<SdElectResAcc> getSdElectResAccList() {
		return this.sdElectResAccList;
	}

	public void setSdElectResAccList(List<SdElectResAcc> sdElectResAccList) {
		this.sdElectResAccList = sdElectResAccList;
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
