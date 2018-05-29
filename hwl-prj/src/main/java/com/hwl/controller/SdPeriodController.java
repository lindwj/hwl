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

import com.hwl.service.model.SdPeriod;
import com.hwl.service.model.SdPeriodForm;
import com.hwl.service.SdPeriodService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdPeriod")
public class SdPeriodController {
	
	// 业务逻辑对象
	@Autowired
	private SdPeriodService sdPeriodService;
	
	// 查询结果
	private List<SdPeriod> sdPeriodList;
	
	private SdPeriodForm sdPeriodForm=new SdPeriodForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdPeriodListPage.do")
	@ResponseBody
	public String sdPeriodListPage() throws Exception{
		//sdPeriodForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdPeriod sdPeriod=sdPeriodForm.getSdPeriod();
		sdPeriodList = sdPeriodService.getSdPeriodListPage(sdPeriod);
		sdPeriodForm.setSdPeriod(sdPeriod);
		request.setAttribute("page", sdPeriodForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdPeriodAddEditIni.do")
	@ResponseBody
	public String sdPeriodAddEditIni() throws Exception{
		SdPeriod sdPeriod=sdPeriodForm.getSdPeriod();
		if ("edit".equals(doWhat)) {
//			sdPeriod = this.sdPeriodService.getSdPeriodById(sdPeriod.getSdPeriodId());
			sdPeriodForm.setSdPeriod(sdPeriod);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdPeriodDetail.do")
	@ResponseBody
	public String sdPeriodDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdPeriod sdPeriod=sdPeriodForm.getSdPeriod();
//		sdPeriod = this.sdPeriodService.getSdPeriodById(sdPeriod.getSdPeriodId());
		sdPeriodForm.setSdPeriod(sdPeriod);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdPeriod sdPeriod=sdPeriodForm.getSdPeriod();
//		sdPeriod = this.sdPeriodService.getSdPeriodById(sdPeriod.getSdPeriodId());
		sdPeriodForm.setSdPeriod(sdPeriod);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdPeriodAddEdit.do")
	@ResponseBody
	public String sdPeriodAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdPeriodForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdPeriod sdPeriod=sdPeriodForm.getSdPeriod();
		this.sdPeriodService.saveSdPeriod(sdPeriod, this.doWhat);
		sdPeriodForm.setSdPeriod(sdPeriod);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdPeriodDelete.do")
	@ResponseBody
	public String sdPeriodDelete() throws Exception {	
		SdPeriod sdPeriod=sdPeriodForm.getSdPeriod();
		this.sdPeriodService.deleteSdPeriod(sdPeriod.getSdPeriodId());
		return "list";
	}	

	public SdPeriodForm getModel() {
		return sdPeriodForm;
	}
	
	public List<SdPeriod> getSdPeriodList() {
		return this.sdPeriodList;
	}

	public void setSdPeriodList(List<SdPeriod> sdPeriodList) {
		this.sdPeriodList = sdPeriodList;
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
