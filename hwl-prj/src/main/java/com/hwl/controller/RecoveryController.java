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

import com.hwl.service.model.Gaccount;
import com.hwl.service.model.SdElectResAcc;
import com.hwl.service.model.SdElectResAccForm;
import com.hwl.service.RecoveryService;
import com.hwl.service.SdElectResAccService;




/**
 * @author lind
 */

@Controller
@RequestMapping("/recovery")
public class RecoveryController {
	
	// 业务逻辑对象
	@Autowired
	private SdElectResAccService sdElectResAccService;
	
	@Autowired
	private RecoveryService recoveryService;
	
	// 查询结果
	private List<SdElectResAcc> sdElectResAccList;
	
	private SdElectResAccForm sdElectResAccForm=new SdElectResAccForm();
	
	private Map<String, Object> session;
	private HttpServletRequest request;
	private String doWhat;
	private int pare_moduleid;
	
	
	@RequestMapping("/recoveryAcc.do")
	@ResponseBody
	public String recoveryAcc() throws Exception {	
		//账套恢复  增加了企业会计准则  1 小企业 2 企业会计准则
		int sdElectResAccId = recoveryService.recovery("D:/ziptest/", "D:/ziptarget/", "软件通(2018).zip",1);
		
		if(sdElectResAccId<0) {
			//恢复失败
			return "001";
		}
		
		
		
		//智能对应	未区分会计准则
		Gaccount gaccount =new Gaccount();
		gaccount.setSdElectResAccId(sdElectResAccId);
		//小企业会计准则
		gaccount.setfRule(1);
//		gaccount.setSdElectResAccId(30);
		
		int status = recoveryService.intelligentMatch(gaccount);
		
		if(status<0) {
			//部分科目未对应上
			
			return "002";
		}
		
		
		
		
		//科目手动对应
//		gaccount.setFcode("");
//		gaccount.setFstdCode("");
//		
//		recoveryService.manualMatch(gaccount);
		
		
		
		//总账报表生成	未区分会计准则
		status=recoveryService.std_amt(gaccount);
		if(status<0) {
			//会计期间为空，总账生成失败
			
			return "003";
		}
//		recoveryService.std_amt(gaccount);
		
		
		return "000";
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
