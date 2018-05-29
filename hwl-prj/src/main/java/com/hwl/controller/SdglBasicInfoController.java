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

import com.hwl.service.model.SdglBasicInfo;
import com.hwl.service.model.SdglBasicInfoForm;
import com.hwl.service.SdglBasicInfoService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdglBasicInfo")
public class SdglBasicInfoController {
	
	// 业务逻辑对象
	@Autowired
	private SdglBasicInfoService sdglBasicInfoService;
	
	// 查询结果
	private List<SdglBasicInfo> sdglBasicInfoList;
	
	private SdglBasicInfoForm sdglBasicInfoForm=new SdglBasicInfoForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdglBasicInfoListPage.do")
	@ResponseBody
	public String sdglBasicInfoListPage() throws Exception{
		//sdglBasicInfoForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdglBasicInfo sdglBasicInfo=sdglBasicInfoForm.getSdglBasicInfo();
		sdglBasicInfoList = sdglBasicInfoService.getSdglBasicInfoListPage(sdglBasicInfo);
		sdglBasicInfoForm.setSdglBasicInfo(sdglBasicInfo);
		request.setAttribute("page", sdglBasicInfoForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdglBasicInfoAddEditIni.do")
	@ResponseBody
	public String sdglBasicInfoAddEditIni() throws Exception{
		SdglBasicInfo sdglBasicInfo=sdglBasicInfoForm.getSdglBasicInfo();
		if ("edit".equals(doWhat)) {
			sdglBasicInfo = this.sdglBasicInfoService.getSdglBasicInfoById(sdglBasicInfo.getSdglBasicInfoId());
			sdglBasicInfoForm.setSdglBasicInfo(sdglBasicInfo);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdglBasicInfoDetail.do")
	@ResponseBody
	public String sdglBasicInfoDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdglBasicInfo sdglBasicInfo=sdglBasicInfoForm.getSdglBasicInfo();
		sdglBasicInfo = this.sdglBasicInfoService.getSdglBasicInfoById(sdglBasicInfo.getSdglBasicInfoId());
		sdglBasicInfoForm.setSdglBasicInfo(sdglBasicInfo);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdglBasicInfo sdglBasicInfo=sdglBasicInfoForm.getSdglBasicInfo();
		sdglBasicInfo = this.sdglBasicInfoService.getSdglBasicInfoById(sdglBasicInfo.getSdglBasicInfoId());
		sdglBasicInfoForm.setSdglBasicInfo(sdglBasicInfo);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdglBasicInfoAddEdit.do")
	@ResponseBody
	public String sdglBasicInfoAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdglBasicInfoForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdglBasicInfo sdglBasicInfo=sdglBasicInfoForm.getSdglBasicInfo();
		this.sdglBasicInfoService.saveSdglBasicInfo(sdglBasicInfo, this.doWhat);
		sdglBasicInfoForm.setSdglBasicInfo(sdglBasicInfo);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdglBasicInfoDelete.do")
	@ResponseBody
	public String sdglBasicInfoDelete() throws Exception {	
		SdglBasicInfo sdglBasicInfo=sdglBasicInfoForm.getSdglBasicInfo();
		this.sdglBasicInfoService.deleteSdglBasicInfo(sdglBasicInfo.getSdglBasicInfoId());
		return "list";
	}	

	public SdglBasicInfoForm getModel() {
		return sdglBasicInfoForm;
	}
	
	public List<SdglBasicInfo> getSdglBasicInfoList() {
		return this.sdglBasicInfoList;
	}

	public void setSdglBasicInfoList(List<SdglBasicInfo> sdglBasicInfoList) {
		this.sdglBasicInfoList = sdglBasicInfoList;
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
