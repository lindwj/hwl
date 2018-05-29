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

import com.hwl.service.model.SdUserItem;
import com.hwl.service.model.SdUserItemForm;
import com.hwl.service.SdUserItemService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/sdUserItem")
public class SdUserItemController {
	
	// 业务逻辑对象
	@Autowired
	private SdUserItemService sdUserItemService;
	
	// 查询结果
	private List<SdUserItem> sdUserItemList;
	
	private SdUserItemForm sdUserItemForm=new SdUserItemForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	/** 执行搜索 */
	@RequestMapping("/sdUserItemListPage.do")
	@ResponseBody
	public String sdUserItemListPage() throws Exception{
		//sdUserItemForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
		SdUserItem sdUserItem=sdUserItemForm.getSdUserItem();
		sdUserItemList = sdUserItemService.getSdUserItemListPage(sdUserItem);
		sdUserItemForm.setSdUserItem(sdUserItem);
		request.setAttribute("page", sdUserItemForm.getPage());
		return "list";
	}
	
	/** 编辑前初始化对象*/
	@RequestMapping("/sdUserItemAddEditIni.do")
	@ResponseBody
	public String sdUserItemAddEditIni() throws Exception{
		SdUserItem sdUserItem=sdUserItemForm.getSdUserItem();
		if ("edit".equals(doWhat)) {
			sdUserItem = this.sdUserItemService.getSdUserItemById(sdUserItem.getSdUserItemId());
			sdUserItemForm.setSdUserItem(sdUserItem);
		}		
		return "addedit";
	}
	
	/** 查看对象*/
	@RequestMapping("/sdUserItemDetail.do")
	@ResponseBody
	public String sdUserItemDetail() throws Exception {
//		this.setPare_moduleid(14);	
		SdUserItem sdUserItem=sdUserItemForm.getSdUserItem();
		sdUserItem = this.sdUserItemService.getSdUserItemById(sdUserItem.getSdUserItemId());
		sdUserItemForm.setSdUserItem(sdUserItem);
		return "detail";
	}

	@RequestMapping("/editCancel.do")
	@ResponseBody
	public String editCancel() throws Exception {	
//		this.setPare_moduleid(14);		
		SdUserItem sdUserItem=sdUserItemForm.getSdUserItem();
		sdUserItem = this.sdUserItemService.getSdUserItemById(sdUserItem.getSdUserItemId());
		sdUserItemForm.setSdUserItem(sdUserItem);
		return "detail";
	}
	/** 保存新增对象 */
	@RequestMapping("/sdUserItemAddEdit.do")
	@ResponseBody
	public String sdUserItemAddEdit() throws Exception {		
		//this.setPare_moduleid(14);
        //sdUserItemForm.setStaffId(String.valueOf(session.get("STAFF_ID")));
        SdUserItem sdUserItem=sdUserItemForm.getSdUserItem();
		this.sdUserItemService.saveSdUserItem(sdUserItem, this.doWhat);
		sdUserItemForm.setSdUserItem(sdUserItem);
		return "detail";
	}
	/**删除对象*/
	@RequestMapping("/sdUserItemDelete.do")
	@ResponseBody
	public String sdUserItemDelete() throws Exception {	
		SdUserItem sdUserItem=sdUserItemForm.getSdUserItem();
		this.sdUserItemService.deleteSdUserItem(sdUserItem.getSdUserItemId());
		return "list";
	}	

	public SdUserItemForm getModel() {
		return sdUserItemForm;
	}
	
	public List<SdUserItem> getSdUserItemList() {
		return this.sdUserItemList;
	}

	public void setSdUserItemList(List<SdUserItem> sdUserItemList) {
		this.sdUserItemList = sdUserItemList;
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
