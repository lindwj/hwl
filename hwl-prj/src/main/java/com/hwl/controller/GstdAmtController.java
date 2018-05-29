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

import com.hwl.service.model.GstdAmt;
import com.hwl.service.model.GstdAmtForm;
import com.hwl.service.GstdAmtService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/gstdAmt")
public class GstdAmtController {
	
	// 业务逻辑对象
	@Autowired
	private GstdAmtService gstdAmtService;
	
	// 查询结果
	private List<GstdAmt> gstdAmtList;
	
	private GstdAmtForm gstdAmtForm=new GstdAmtForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/gstdAmtListPage.do")
	@ResponseBody
	public String gstdAmtListPage() throws Exception{
		//gstdAmtForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		GstdAmt gstdAmt=gstdAmtForm.getGstdAmt();
		gstdAmtList = gstdAmtService.getGstdAmtListPage(gstdAmt);
		gstdAmtForm.setGstdAmt(gstdAmt);
		request.setAttribute("page", gstdAmtForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/gstdAmtAddEditIni.do")
	@ResponseBody
	public String gstdAmtAddEditIni() throws Exception{
		GstdAmt gstdAmt=gstdAmtForm.getGstdAmt();
		if ("edit".equals(doWhat)) {
			gstdAmt = this.gstdAmtService.getGstdAmtById(gstdAmt.getGstdAmtId());
			gstdAmtForm.setGstdAmt(gstdAmt);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/gstdAmtDetail.do")
	@ResponseBody
	public String gstdAmtDetail() throws Exception {
//		this.setPare_moduleid(14);	
		GstdAmt gstdAmt=gstdAmtForm.getGstdAmt();
		gstdAmt = this.gstdAmtService.getGstdAmtById(gstdAmt.getGstdAmtId());
		gstdAmtForm.setGstdAmt(gstdAmt);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		GstdAmt gstdAmt=gstdAmtForm.getGstdAmt();
		gstdAmt = this.gstdAmtService.getGstdAmtById(gstdAmt.getGstdAmtId());
		gstdAmtForm.setGstdAmt(gstdAmt);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/gstdAmtAddEdit.do")
	@ResponseBody
	public String gstdAmtAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //gstdAmtForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        GstdAmt gstdAmt=gstdAmtForm.getGstdAmt();
		this.gstdAmtService.saveGstdAmt(gstdAmt, this.doWhat);
		gstdAmtForm.setGstdAmt(gstdAmt);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/gstdAmtDelete.do")
	@ResponseBody
	public String gstdAmtDelete() throws Exception {	
		GstdAmt gstdAmt=gstdAmtForm.getGstdAmt();
		this.gstdAmtService.deleteGstdAmt(gstdAmt.getGstdAmtId());
		return "list";
	}	

	public GstdAmtForm getModel() {
		return gstdAmtForm;
	}
	
	public List<GstdAmt> getGstdAmtList() {
		return this.gstdAmtList;
	}

	public void setGstdAmtList(List<GstdAmt> gstdAmtList) {
		this.gstdAmtList = gstdAmtList;
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
