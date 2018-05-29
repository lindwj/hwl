package com.hwl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hwl.service.RecoveryService;
import com.hwl.service.common.StringUtil;
import com.hwl.service.dao.GaccountMapper;
import com.hwl.service.dao.GstdAmtMapper;
import com.hwl.service.dao.SdAccountMapper;
import com.hwl.service.dao.SdAcctAmountMapper;
import com.hwl.service.dao.SdCustomerMapper;
import com.hwl.service.dao.SdDepartmentMapper;
import com.hwl.service.dao.SdElectResAccMapper;
import com.hwl.service.dao.SdEmployeeMapper;
import com.hwl.service.dao.SdPeriodMapper;
import com.hwl.service.dao.SdSupplyMapper;
import com.hwl.service.dao.SdUserItemMapper;
import com.hwl.service.dao.SdVoucherMapper;
import com.hwl.service.dao.SdglBasicInfoMapper;
import com.hwl.service.model.Gaccount;
import com.hwl.service.model.GstdAmt;
import com.hwl.service.model.SdAccount;
import com.hwl.service.model.SdAcctAmount;
import com.hwl.service.model.SdCustomer;
import com.hwl.service.model.SdDepartment;
import com.hwl.service.model.SdElectResAcc;
import com.hwl.service.model.SdEmployee;
import com.hwl.service.model.SdPeriod;
import com.hwl.service.model.SdSupply;
import com.hwl.service.model.SdUserItem;
import com.hwl.service.model.SdVoucher;
import com.hwl.service.model.SdglBasicInfo;
import com.hwl.service.util.Common;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author lind
 * 
 *
 */

@Service("RecoveryService")
public class RecoveryServiceImpl implements RecoveryService {
	
	
	List<Gaccount> gaccountAllList =new ArrayList<Gaccount>(500); 
	
	
	@Autowired
	private SdElectResAccMapper sdElectResAccMapper;
	
	@Autowired
	private SdglBasicInfoMapper sdglBasicInfoMapper;
	
	@Autowired
	private SdPeriodMapper sdPeriodMapper;
	
	@Autowired
	private SdAccountMapper sdAccountMapper;
	
	@Autowired
	private SdAcctAmountMapper sdAcctAmountMapper;
	
	@Autowired
	private SdDepartmentMapper sdDepartmentMapper;
	
	@Autowired
	private SdEmployeeMapper sdEmployeeMapper;
	
	@Autowired
	private SdCustomerMapper sdCustomerMapper;
	
	@Autowired
	private SdSupplyMapper sdSupplyMapper;
	
	@Autowired
	private SdUserItemMapper sdUserItemMapper;
	
	@Autowired
	private SdVoucherMapper sdVoucherMapper;
	
	@Autowired
	private GaccountMapper gaccountMapper;
	
	@Autowired
	private GstdAmtMapper gstdAmtMapper;
	
	
		//标准总账计算
		@Override
		public int std_amt(Gaccount gaccount) {
			//获取账套会计年度和 期间
			
			SdPeriod sdPeriod =new SdPeriod();
			sdPeriod.setSdElectResAccId(gaccount.getSdElectResAccId());
			
			List<SdPeriod> sdPeriodList = sdPeriodMapper.getSdPeriodById(sdPeriod);
			
			if(sdPeriodList==null||sdPeriodList.size()<=0) {
				return -1;	
			}
			
			//遍历每个期间生成总账
			
			
			GstdAmt gstdAmt =new GstdAmt();
			gstdAmt.setfRule(gaccount.getfRule());
			
			for(SdPeriod sdPeriodtemp:sdPeriodList) {
				
				//获取上一期间 参数
				gstdAmt.setFcasePreYear(gstdAmt.getFcaseYear());
				gstdAmt.setFprePeriod(gstdAmt.getFperiod());
				
				//获取当前期间 参数
				gstdAmt.setFcaseYear(sdPeriodtemp.getFyear());
				gstdAmt.setFperiod(sdPeriodtemp.getPerdNumber());
				gstdAmt.setSdElectResAccId(sdPeriodtemp.getSdElectResAccId());
				
				//第一次生成期间总账
				if(gstdAmt.getFcasePreYear()==null || gstdAmt.getFcasePreYear().length()<=0) {
				gstdAmtMapper.insertGstdAmtFirst(gstdAmt);
				}else {
					//生成后续期间总账报表
				gstdAmtMapper.insertGstdAmtNext(gstdAmt);
				
				}
				
			}
			
			
			
			return 0;
		}
	
	
		//人工科目对应
		@Override
	public int manualMatch(Gaccount gaccount) {
			
		gaccountMapper.updateGaccount(gaccount);
		
		return 0;
	}
		
	
	//科目智能对应
	@Override
	public int intelligentMatch(Gaccount gaccount) {
		//传入账套id，批量级联修改 模糊匹配科目信息
		gaccountMapper.batchUpdate(gaccount);
		
		int i=0;
		
		while(gaccountMapper.getGaccountUnMatch(gaccount).getGaccountId()>0) {
			
			//如果企业科目未对应上，就对应其父及科目
			gaccountMapper.batchParentUpdate(gaccount);	
			
			i++;
			
			if(i==6) {
				//智能对应部分科目未能对应上
				return -1;
			}
			
		}
		
		
//		if(gaccountMapper.getGaccountUnMatch(gaccount).getGaccountId()==0) {
//			return 0;
//		}
//		
//		
//		if(gaccountMapper.getGaccountUnMatch(gaccount).getGaccountId()==0) {
//			return 0;
//		}
//		
//		//如果企业科目未对应上，就对应其父及的父及科目
//		gaccountMapper.batchParent2Update(gaccount);
		
		
//		if(gaccountMapper.getGaccountUnMatch(gaccount).getGaccountId()==0) {
//			return 0;
//		}else {
//			return -1;
//		}
		return 0;
	}
	
	
	
	
	
	
	
	// 企业科目智能对应前数据初始化
		@Override
		public int initAcct(List<Gaccount> gaccountInitList) {
			
			if(gaccountInitList==null || gaccountInitList.size()<=0) {
				return -1;
			}
			
			//企业科目数据初始化
			SdAccount sdAccountInit=new SdAccount();
			
			for(Gaccount gaccountParent:gaccountInitList) {
				
				
				
				sdAccountInit.setAcctLevel(gaccountParent.getFlevel()+1);
				sdAccountInit.setAcctId(gaccountParent.getFcode()+"%");
				sdAccountInit.setSdElectResAccId(gaccountParent.getSdElectResAccId());
				//遍历下一集科目
				List<SdAccount> sdAccountChildList= sdAccountMapper.getSdAccountChild(sdAccountInit);
				if(sdAccountChildList!=null&&sdAccountChildList.size()>0) {
					//是否有子集科目
					gaccountParent.setFisDetail(1);
				}else {
					gaccountParent.setFisDetail(0);
					continue;
				}
				
				
				//子集SdAccount转化为gAccount
				List<Gaccount> gAccountList =new ArrayList<Gaccount>();
				Gaccount gAccount=null;
				//SdAccount转化为gAccount
				for(SdAccount sdAccountChild:sdAccountChildList) {
					
					gAccount =new Gaccount(); 
					gAccount.setSdElectResAccId(sdAccountChild.getSdElectResAccId());
					gAccount.setFcode(sdAccountChild.getAcctId());
					gAccount.setFname(sdAccountChild.getAcctName());
					//设置父及科目
					gAccount.setFparent(gaccountParent.getFcode());
					gAccount.setFfullName(gaccountParent.getFfullName()+"-"+sdAccountChild.getAcctName());
					
					gAccount.setFlevel(sdAccountChild.getAcctLevel());
					
					gAccount.setFdc("借".equals(sdAccountChild.getBalDc())?1:-1);
					gAccount.setFcateName(sdAccountChild.getAcctType());
					gAccountList.add(gAccount);
					
				}
				
				
				//递归
				initAcct(gAccountList);
				
				
				
			}			
			
			//添加到全局变量
			gaccountAllList.addAll(gaccountInitList);
			
			return 0;
		}
		
	
	
	
	//企业账套还原
	@Override
	public int recovery(String fileSourcePath, String fileTargetPath, String fileName,int fRule) {

		if (!Common.unZip(fileSourcePath, fileTargetPath, fileName)) {

			//解压失败
			return -1;	
		}
		
		String ASSET = fileTargetPath+"Asset/";
		String BALANCE = fileTargetPath+"Balance/";
		String PUBLIC = fileTargetPath+"Public/";
		
		String SDASSETCARD=ASSET+"SDAssetCard.txt";
		
		String SDACCOUNT=BALANCE+"SDAccount.txt";
		String SDACCTAMOUNT=BALANCE+"SDAcctAmount.txt";
		String SDGLBASICINFO=BALANCE+"SDGLBasicInfo.txt";
		String SDVOUCHER=BALANCE+"SDVoucher.txt";
		
		String SDCUSTOMER=PUBLIC+"SDCustomer.txt";
		String SDDEPARTMENT=PUBLIC+"SDdepartment.txt";
		String SDELECTRESACC=PUBLIC+"SDElectResAcc.txt";
		String SDEMPLOYEE=PUBLIC+"SDEmployee.txt";
		String SDPERIOD=PUBLIC+"SDPeriod.txt";
		String SDSUPPLY=PUBLIC+"SDSupply.txt";
		String SDUSERITEM=PUBLIC+"SDUserItem.txt";
		
		//解析账套基础信息
		String jsonStr=null;
		try {
			jsonStr=Common.fileRead(SDELECTRESACC);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//读取账套失败
			return -1;
		}
		
		if(jsonStr==null||jsonStr.length()<=5) {
			return -1;
		}
		
		JSONObject jsObj = JSONObject.fromObject(jsonStr);
		jsObj=jsObj.getJSONObject("SDElectResAcc");
		
		SdElectResAcc sdElectResAcc =new SdElectResAcc();
		sdElectResAcc.setZtNumber(jsObj.getString("ZTNumber"));
		sdElectResAcc.setZtName(jsObj.getString("ZTName"));
		sdElectResAcc.setAcctUnit(jsObj.getString("AcctUnit"));
		sdElectResAcc.setOrgId(jsObj.getString("OrgID"));
		sdElectResAcc.setStdCurrency(jsObj.getString("StdCurrency"));
		sdElectResAcc.setFyear(jsObj.getString("FYear"));
		sdElectResAcc.setStdVerNumber(jsObj.getString("StdVerNumber"));
		sdElectResAcc.setfRule(fRule);
		
		if(StringUtil.isEmpty(sdElectResAcc.getZtNumber())) {
			return -1;
		}
		
		sdElectResAccMapper.insertSdElectResAcc(sdElectResAcc);
		//解析账套基础信息 end
		
		
		
		//解析总账基础信息
		
		jsonStr=null;
		try {
			jsonStr=Common.fileRead(SDGLBASICINFO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//读取账套失败
			return -1;
		}
		
		
		if(jsonStr==null||jsonStr.length()<=5) {
			return -1;
		}
		
		jsObj = JSONObject.fromObject(jsonStr);
		jsObj=jsObj.getJSONObject("SDGLBasicInfo");
		
		SdglBasicInfo sdglBasicInfo =new SdglBasicInfo();
		sdglBasicInfo.setAcctIdRule(jsObj.getString("AcctIDRule"));
		sdglBasicInfo.setCashFlowNoRule(jsObj.getString("CashFlowNORule"));
		sdglBasicInfo.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
		
		if(StringUtil.isEmpty(sdglBasicInfo.getAcctIdRule())) {
			return -1;
		}
		
		sdglBasicInfoMapper.insertSdglBasicInfo(sdglBasicInfo);
		
		
		
		//解析总账基础信息 end
		
		
		
		//解析会计期间信息
		
		jsonStr=null;
		try {
			jsonStr=Common.fileRead(SDPERIOD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//读取账套失败
			return -1;
		}
		
		
		if(jsonStr==null||jsonStr.length()<=5) {
			return -1;
		}
		
		jsObj = JSONObject.fromObject(jsonStr);
		JSONArray sdPeriodData=jsObj.getJSONArray("SDPeriod");
		List<SdPeriod> sdPeriodList =new ArrayList<SdPeriod>(12);
		JSONObject jsonObject =null;
		SdPeriod sdPeriod=null;
		
		for(int i=0;i<sdPeriodData.size();i++){
			
			jsonObject = sdPeriodData.getJSONObject(i);
			sdPeriod=new SdPeriod();
			sdPeriod.setFyear(jsonObject.getString("FYear"));
			sdPeriod.setPerdNumber(Integer.valueOf(jsonObject.getString("perdNumber")));
			sdPeriod.setPerdStartDateStr(jsonObject.getString("perdStartDate"));
			sdPeriod.setPerdEndDateStr(jsonObject.getString("perdEndDate"));
			sdPeriod.setPerdStatus("是".equals(jsonObject.getString("perdStatus")) ? "yes":"no" );
			sdPeriod.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
			
			sdPeriodList.add(sdPeriod);
			
		}
		
		if(sdPeriodList==null||sdPeriodList.size()==0) {
			return -1;
		}
		
		sdPeriodMapper.insertSdPeriodList(sdPeriodList);
		
		//解析会计期间信息 end
		
		
		
		//解析会计科目信息
		
				jsonStr=null;
				try {
					jsonStr=Common.fileRead(SDACCOUNT);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//读取账套失败
					return -1;
				}
				
				
				
				if(jsonStr==null||jsonStr.length()<=5) {
					return -1;
				}
				
				
				jsObj = JSONObject.fromObject(jsonStr);
				JSONArray sdAccountData=jsObj.getJSONArray("SDAccount");
				List<SdAccount> sdAccountList =new ArrayList<SdAccount>(500);
				jsonObject =null;
				SdAccount sdAccount=null;
				
				for(int i=0;i<sdAccountData.size();i++){
					
					jsonObject = sdAccountData.getJSONObject(i);
					sdAccount=new SdAccount();
					sdAccount.setAcctId(jsonObject.getString("AcctID"));
					sdAccount.setAcctName(jsonObject.getString("AcctName"));
					sdAccount.setAcctLevel(jsonObject.getInt("AcctLevel"));
					sdAccount.setAcctType(jsonObject.getString("AcctType"));
					sdAccount.setBalDc(jsonObject.getString("BalDC"));
					sdAccount.setIsQtyCal(jsonObject.getString("IsQtyCal"));
					sdAccount.setQtyCalUnit(jsonObject.getString("QtyCalUnit"));
					sdAccount.setIsAdjustRate(jsonObject.getString("IsAdjustRate"));
					sdAccount.setFcurUnit(jsonObject.getString("FCurUnit"));
					sdAccount.setMultiAcct(jsonObject.getString("MultiAcct"));
					sdAccount.setIsBankAcct(jsonObject.getString("IsBankAcct"));
					sdAccount.setFzhsType(jsonObject.getJSONArray("FZHS").toString());
					sdAccount.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
					
					
					
					sdAccountList.add(sdAccount);
					
				}
				
				if(sdAccountList==null||sdAccountList.size()==0) {
					return -1;
				}
				
				sdAccountMapper.insertSdAccountList(sdAccountList);
				
				//解析会计科目信息 end
				
				
				
				
				//企业科目数据初始化
				SdAccount sdAccountInit=new SdAccount();
				sdAccountInit.setAcctLevel(1);
				sdAccountInit.setAcctId(null);
				sdAccountInit.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
				//一级科目
				List<SdAccount> sdAccountInitList= sdAccountMapper.getSdAccountChild(sdAccountInit);
				List<Gaccount> gAccountParentList =new ArrayList<Gaccount>();
				Gaccount gAccountParent=null;
				
				for(SdAccount sdAccountParent:sdAccountInitList) {
					//一级科目 SdAccount转化为gAccount
					gAccountParent =new Gaccount(); 
					gAccountParent.setSdElectResAccId(sdAccountParent.getSdElectResAccId());
					gAccountParent.setFcode(sdAccountParent.getAcctId());
					gAccountParent.setFname(sdAccountParent.getAcctName());
					//设置父及科目
					gAccountParent.setFparent(null);
					gAccountParent.setFfullName(sdAccountParent.getAcctName());
					
					gAccountParent.setFlevel(sdAccountParent.getAcctLevel());
					
					gAccountParent.setFdc("借".equals(sdAccountParent.getBalDc())?1:-1);
					gAccountParent.setFcateName(sdAccountParent.getAcctType());
					gAccountParentList.add(gAccountParent);
					
				}
				
				//调用递归方法  初始化企业科目
				initAcct(gAccountParentList);
				
				//入库
				gaccountMapper.insertGaccountList(gaccountAllList);
				
				
				
				//企业科目数据初始化 end
				
				
				
				//解析会计科目余额发生额信息
				
				jsonStr=null;
				try {
					jsonStr=Common.fileRead(SDACCTAMOUNT);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//读取账套失败
					return -1;
				}
				
				
				if(jsonStr==null||jsonStr.length()<=5) {
					return -1;
				}
				
				jsObj = JSONObject.fromObject(jsonStr);
				JSONArray sdAcctAmountData=jsObj.getJSONArray("SDAcctAmount");
				List<SdAcctAmount> sdAcctAmountList =new ArrayList<SdAcctAmount>(500);
				jsonObject =null;
				SdAcctAmount sdAcctAmount=null;
				
				for(int i=0;i<sdAcctAmountData.size();i++){
					
					jsonObject = sdAcctAmountData.getJSONObject(i);
					sdAcctAmount=new SdAcctAmount();
					
					sdAcctAmount.setAcctId(jsonObject.getString("AcctID"));
					sdAcctAmount.setAcctName(jsonObject.getString("AcctName"));
					sdAcctAmount.setFzhsNum1(jsonObject.getString("FZHSNum1"));
					sdAcctAmount.setFzhsFinedName1(jsonObject.getString("FZHSFinedName1"));
					sdAcctAmount.setFzhsNo1(jsonObject.getString("FZHSNO1"));
					sdAcctAmount.setFzhsName1(jsonObject.getString("FZHSName1"));
					
					sdAcctAmount.setFzhsNum2(jsonObject.getString("FZHSNum2"));
					sdAcctAmount.setFzhsFinedName2(jsonObject.getString("FZHSFinedName2"));
					sdAcctAmount.setFzhsNo2(jsonObject.getString("FZHSNO2"));
					sdAcctAmount.setFzhsName2(jsonObject.getString("FZHSName2"));
					
					sdAcctAmount.setFzhsNum3(jsonObject.getString("FZHSNum3"));
					sdAcctAmount.setFzhsFinedName3(jsonObject.getString("FZHSFinedName3"));
					sdAcctAmount.setFzhsNo3(jsonObject.getString("FZHSNO3"));
					sdAcctAmount.setFzhsName3(jsonObject.getString("FZHSName3"));
					
					sdAcctAmount.setFzhsNum4(jsonObject.getString("FZHSNum4"));
					sdAcctAmount.setFzhsFinedName4(jsonObject.getString("FZHSFinedName4"));
					sdAcctAmount.setFzhsNo4(jsonObject.getString("FZHSNO4"));
					sdAcctAmount.setFzhsName4(jsonObject.getString("FZHSName4"));
					
					sdAcctAmount.setFzhsNum5(jsonObject.getString("FZHSNum5"));
					sdAcctAmount.setFzhsFinedName5(jsonObject.getString("FZHSFinedName5"));
					sdAcctAmount.setFzhsNo5(jsonObject.getString("FZHSNO5"));
					sdAcctAmount.setFzhsName5(jsonObject.getString("FZHSName5"));
					
					sdAcctAmount.setFzhsNum6(jsonObject.getString("FZHSNum6"));
					sdAcctAmount.setFzhsFinedName6(jsonObject.getString("FZHSFinedName6"));
					sdAcctAmount.setFzhsNo6(jsonObject.getString("FZHSNO6"));
					sdAcctAmount.setFzhsName6(jsonObject.getString("FZHSName6"));
					
					sdAcctAmount.setFyear(jsonObject.getString("FYear"));
					sdAcctAmount.setPerdNumber(Integer.valueOf(jsonObject.getString("perdNumber")));
					sdAcctAmount.setCurNo(jsonObject.getString("CurNO"));
					sdAcctAmount.setCurName(jsonObject.getString("CurName"));
					
					sdAcctAmount.setBamountS(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("BAmount_s"))?"0":jsonObject.getString("BAmount_s")));
					sdAcctAmount.setBamountN(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("BAmount_n"))?"0":jsonObject.getString("BAmount_n")));
					sdAcctAmount.setBamountDc(jsonObject.getString("BAmountDc"));
					
					sdAcctAmount.setDamountS(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("DAmount_s"))?"0":jsonObject.getString("DAmount_s")));
					sdAcctAmount.setDamountN(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("DAmount_n"))?"0":jsonObject.getString("DAmount_n")));
					sdAcctAmount.setCamountS(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("CAmount_s"))?"0":jsonObject.getString("CAmount_s")));
					sdAcctAmount.setCamountN(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("CAmount_n"))?"0":jsonObject.getString("CAmount_n")));
					
					sdAcctAmount.setEamountS(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("EAmount_s"))?"0":jsonObject.getString("EAmount_s")));
					sdAcctAmount.setEamountN(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("EAmount_n"))?"0":jsonObject.getString("EAmount_n")));
					sdAcctAmount.setEamountDc(jsonObject.getString("EAmountDc"));
					
					sdAcctAmount.setUnitId(jsonObject.getString("UnitID"));
					
					sdAcctAmount.setBqty(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("BQty"))?"0":jsonObject.getString("BQty")));
					sdAcctAmount.setDqty(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("DQty"))?"0":jsonObject.getString("DQty")));
					sdAcctAmount.setCqty(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("CQty"))?"0":jsonObject.getString("CQty")));
					
					sdAcctAmount.setEqty(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("EQty"))?"0":jsonObject.getString("EQty")));
					sdAcctAmount.setLjJf(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("LJ_JF"))?"0":jsonObject.getString("LJ_JF")));
					
					sdAcctAmount.setLjDf(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("LJ_DF"))?"0":jsonObject.getString("LJ_DF")));
					sdAcctAmount.setLjJfWb(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("LJ_JF_WB"))?"0":jsonObject.getString("LJ_JF_WB")));
					sdAcctAmount.setLjDfWb(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("LJ_DF_WB"))?"0":jsonObject.getString("LJ_DF_WB")));
					
					sdAcctAmount.setLjJfSl(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("LJ_JF_SL"))?"0":jsonObject.getString("LJ_JF_SL")));
					sdAcctAmount.setLjDfSl(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("LJ_DF_SL"))?"0":jsonObject.getString("LJ_DF_SL")));
					sdAcctAmount.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
					
					
					sdAcctAmountList.add(sdAcctAmount);
					
				}
				
				if(sdAcctAmountList==null||sdAcctAmountList.size()==0) {
					return -1;
				}
				
				sdAcctAmountMapper.insertSdAcctAmountList(sdAcctAmountList);
				
				
				//解析会计科目余额发生额信息 end
				
				
				
				
				//解析部门信息
				
				jsonStr=null;
				try {
					jsonStr=Common.fileRead(SDDEPARTMENT);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//读取账套失败
//					return -1;
				}
				
				
				
				if(jsonStr!=null && jsonStr.length()>5) {
					
					
				jsObj = JSONObject.fromObject(jsonStr);
				JSONArray sdDepartmentData=jsObj.getJSONArray("SDdepartment");
				List<SdDepartment> sdDepartmentList =new ArrayList<SdDepartment>(12);
				jsonObject =null;
				SdDepartment sdDepartment=null;
				
				for(int i=0;i<sdDepartmentData.size();i++){
					
					jsonObject = sdDepartmentData.getJSONObject(i);
					
					sdDepartment=new SdDepartment();
					
					sdDepartment.setDeptNo(jsonObject.getString("DeptNO"));
					sdDepartment.setDeptName(jsonObject.getString("DeptName"));
					sdDepartment.setParentDeptNo(jsonObject.getString("ParentDeptNO"));
					sdDepartment.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
					
					sdDepartmentList.add(sdDepartment);
					
				}
				
				if(sdDepartmentList==null||sdDepartmentList.size()==0) {
//					return -1;
				}
				
				sdDepartmentMapper.insertSdDepartmentList(sdDepartmentList);
				
				
				}
				//解析部门信息 end
				
				
				
				//解析职工信息
				
				jsonStr=null;
				try {
					jsonStr=Common.fileRead(SDEMPLOYEE);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//读取账套失败
//					return -1;
				}
				
				
				
				if(jsonStr!=null && jsonStr.length()>5) {
				
				
				jsObj = JSONObject.fromObject(jsonStr);
				JSONArray sdEmployeeData=jsObj.getJSONArray("SDEmployee");
				List<SdEmployee> sdEmployeeList =new ArrayList<SdEmployee>(50);
				jsonObject =null;
				SdEmployee sdEmployee=null;
				
				for(int i=0;i<sdEmployeeData.size();i++){
					
					jsonObject = sdEmployeeData.getJSONObject(i);
					
					sdEmployee=new SdEmployee();
					
					sdEmployee.setPersonNo(jsonObject.getString("PersonNO"));
					sdEmployee.setPersonName(jsonObject.getString("PersonName"));
					sdEmployee.setCardType(jsonObject.getString("CardType"));
					
					sdEmployee.setCardId(jsonObject.getString("CardID"));
					sdEmployee.setSex(jsonObject.getString("Sex"));
					sdEmployee.setBirthdayStr(StringUtil.isEmpty(jsonObject.getString("Birthday"))?null:jsonObject.getString("Birthday"));
					sdEmployee.setDeptNo(jsonObject.getString("DeptNO"));
					sdEmployee.setHiredateStr(StringUtil.isEmpty(jsonObject.getString("Birthday"))?null:jsonObject.getString("HireDate"));
					sdEmployee.setLeaveDateStr(StringUtil.isEmpty(jsonObject.getString("Birthday"))?null:jsonObject.getString("LeaveDate"));
					
					
					sdEmployee.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
					
					sdEmployeeList.add(sdEmployee);
					
				}
				
				if(sdEmployeeList==null||sdEmployeeList.size()==0) {
//					return -1;
				}
				
				sdEmployeeMapper.insertSdEmployeeList(sdEmployeeList);
				
				
				}
				//解析职工信息 end
				
				
				
				//解析客户信息
				
				jsonStr=null;
				try {
					jsonStr=Common.fileRead(SDCUSTOMER);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//读取账套失败
//					return -1;
				}
				
				
				if(jsonStr!=null && jsonStr.length()>5) {
				
				jsObj = JSONObject.fromObject(jsonStr);
				JSONArray sdCustomerData=jsObj.getJSONArray("SDCustomer");
				List<SdCustomer> sdCustomerList =new ArrayList<SdCustomer>(50);
				jsonObject =null;
				SdCustomer sdCustomer=null;
				
				for(int i=0;i<sdCustomerData.size();i++){
					
					jsonObject = sdCustomerData.getJSONObject(i);
					
					sdCustomer=new SdCustomer();
					
					sdCustomer.setCustNo(jsonObject.getString("CustNO"));
					sdCustomer.setCustName(jsonObject.getString("CustName"));
					sdCustomer.setCustShortName(jsonObject.getString("CustShortName"));
					
					
					sdCustomer.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
					
					sdCustomerList.add(sdCustomer);
					
				}
				
				if(sdCustomerList==null||sdCustomerList.size()==0) {
//					return -1;
				}
				
				sdCustomerMapper.insertSdCustomerList(sdCustomerList);
				
				
				}
				//解析客户信息 end
				
				
				
				
				//解析供应商信息
				
				jsonStr=null;
				try {
					jsonStr=Common.fileRead(SDSUPPLY);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//读取账套失败
//					return -1;
				}
				
				
				if(jsonStr!=null && jsonStr.length()>5) {
				
				
				
				jsObj = JSONObject.fromObject(jsonStr);
				JSONArray sdSupplyData=jsObj.getJSONArray("SDSupply");
				List<SdSupply> sdSupplyList =new ArrayList<SdSupply>(50);
				jsonObject =null;
				SdSupply sdSupply=null;
				
				for(int i=0;i<sdSupplyData.size();i++){
					
					jsonObject = sdSupplyData.getJSONObject(i);
					
					sdSupply=new SdSupply();
					
					sdSupply.setSupplyNo(jsonObject.getString("SupplyNO"));
					sdSupply.setSupplyName(jsonObject.getString("SupplyName"));
					sdSupply.setSupplyShortName(jsonObject.getString("SupplyShortName"));
					
					
					sdSupply.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
					
					sdSupplyList.add(sdSupply);
					
				}
				
				if(sdSupplyList==null||sdSupplyList.size()==0) {
//					return -1;
				}
				
				sdSupplyMapper.insertSdSupplyList(sdSupplyList);
				
				
				
				}
				//解析供应商信息 end
				
				
				
				//解析自定义核算项信息
				
				jsonStr=null;
				try {
					jsonStr=Common.fileRead(SDUSERITEM);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//读取账套失败
//					return -1;
				}
				
				
				if(jsonStr!=null && jsonStr.length()>5) {
				
				
				
				jsObj = JSONObject.fromObject(jsonStr);
				JSONArray sdUserItemData=jsObj.getJSONArray("SDUserItem");
				List<SdUserItem> sdUserItemList =new ArrayList<SdUserItem>(30);
				jsonObject =null;
				SdUserItem sdUserItem=null;
				
				for(int i=0;i<sdUserItemData.size();i++){
					
					jsonObject = sdUserItemData.getJSONObject(i);
					
					sdUserItem=new SdUserItem();
					
					sdUserItem.setHslbNo(jsonObject.getString("HSLBNO"));
					sdUserItem.setHslbNa(jsonObject.getString("HSLBNA"));
					sdUserItem.setHslbDesc(jsonObject.getString("HSLBDesc"));
					
					sdUserItem.setIsLevel(jsonObject.getString("ISLevel"));
					sdUserItem.setHslbNoRule(jsonObject.getString("HSLBNORule"));
					
					
					sdUserItem.setHspjt(jsonObject.getJSONArray("HSPJT").toString());
					sdUserItem.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
					
					sdUserItemList.add(sdUserItem);
					
				}
				
				if(sdUserItemList==null||sdUserItemList.size()==0) {
//					return -1;
				}
				
				sdUserItemMapper.insertSdUserItemList(sdUserItemList);
				
				
				
				}
				//解析自定义核算项信息 end
				
				
				
				//解析凭证信息
				
				jsonStr=null;
				try {
					jsonStr=Common.fileRead(SDVOUCHER);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//读取账套失败
					return -1;
				}
				
				jsObj = JSONObject.fromObject(jsonStr);
				JSONArray sdVoucherData=jsObj.getJSONArray("SDVoucher");
				List<SdVoucher> sdVoucherList =new ArrayList<SdVoucher>(400);
				jsonObject =null;
				SdVoucher sdVoucher=null;
				JSONArray vchRowData=null;
				
				JSONObject vchRowJsonObject =null;
				
				for(int i=0;i<sdVoucherData.size();i++){
					
					jsonObject = sdVoucherData.getJSONObject(i);
					
					sdVoucher=new SdVoucher();
					
					sdVoucher.setVchDateStr(jsonObject.getString("VchDate"));
					sdVoucher.setFyear(jsonObject.getString("FYear"));
					sdVoucher.setPerdNumber(Integer.valueOf(StringUtil.isEmpty(jsonObject.getString("perdNumber"))?"0":jsonObject.getString("perdNumber")));
					
					sdVoucher.setVchTypeNo(jsonObject.getString("VchTypeNO"));
					sdVoucher.setVchTypeName((jsonObject.getString("VchtypeName")));
					sdVoucher.setVchNo(jsonObject.getString("VchNO"));
					sdVoucher.setAttachMents(Integer.valueOf(StringUtil.isEmpty(jsonObject.getString("AttachMents"))?"0":jsonObject.getString("AttachMents")));
					
					sdVoucher.setBillerName(jsonObject.getString("BillerName"));
					sdVoucher.setBillerNo(jsonObject.getString("BillerNO"));
					sdVoucher.setCheckerName(jsonObject.getString("CheckerName"));
					sdVoucher.setCheckerNo(jsonObject.getString("CheckerNO"));
					
					sdVoucher.setPosterName(jsonObject.getString("PosterName"));
					sdVoucher.setFposterNo(jsonObject.getString("FPosterNO"));
					sdVoucher.setVchFlag(jsonObject.getString("VchFlag"));
					sdVoucher.setCancelFlag(jsonObject.getString("CancelFlag"));
					
					sdVoucher.setVchSource(jsonObject.getString("VchSource"));
					sdVoucher.setCtotalAmount(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("CTotalAmount"))?"0":jsonObject.getString("CTotalAmount")));
					sdVoucher.setDtotalAmount(Double.valueOf(StringUtil.isEmpty(jsonObject.getString("DTotalAmount"))?"0":jsonObject.getString("DTotalAmount")));
					
					//凭证行
					vchRowData=jsonObject.getJSONArray("VchRow");
					vchRowJsonObject = vchRowData.getJSONObject(0);
					
					sdVoucher.setVchRowId(Integer.valueOf(StringUtil.isEmpty(vchRowJsonObject.getString("VchRowId"))?"0":vchRowJsonObject.getString("VchRowId")));
					sdVoucher.setVchInfo(vchRowJsonObject.getString("VchInfo"));
					sdVoucher.setAcctId(StringUtil.isEmpty(vchRowJsonObject.getString("AcctID"))?null:vchRowJsonObject.getString("AcctID"));
					sdVoucher.setAcctName(vchRowJsonObject.getString("AcctName"));
					
					//辅助核算
					sdVoucher.setFzhsInfo(vchRowJsonObject.getJSONArray("FZHSInfo").toString());
					
					sdVoucher.setCurNo(vchRowJsonObject.getString("CurNO"));
					sdVoucher.setCurName(vchRowJsonObject.getString("CurName"));
					sdVoucher.setRateTypeNo(vchRowJsonObject.getString("RateTypeNO"));
					sdVoucher.setRateTypeName(vchRowJsonObject.getString("RateTypeName"));
					
					sdVoucher.setRate(Double.valueOf(vchRowJsonObject.getString("Rate")));
					sdVoucher.setUnitId(vchRowJsonObject.getString("UnitID"));
					sdVoucher.setPrice(Double.valueOf(StringUtil.isEmpty(vchRowJsonObject.getString("Price"))?"0":vchRowJsonObject.getString("Price")));
					sdVoucher.setDqty(Double.valueOf(StringUtil.isEmpty(vchRowJsonObject.getString("DQty"))?"0":vchRowJsonObject.getString("DQty")));
					
					sdVoucher.setDamountS(Double.valueOf(StringUtil.isEmpty(vchRowJsonObject.getString("DAmount_s"))?"0":vchRowJsonObject.getString("DAmount_s")));
					sdVoucher.setDamountN(Double.valueOf(StringUtil.isEmpty(vchRowJsonObject.getString("DAmount_n"))?"0":vchRowJsonObject.getString("DAmount_n")));
					sdVoucher.setCqty(Double.valueOf(StringUtil.isEmpty(vchRowJsonObject.getString("CQty"))?"0":vchRowJsonObject.getString("CQty")));
					sdVoucher.setCamountS(Double.valueOf(StringUtil.isEmpty(vchRowJsonObject.getString("CAmount_s"))?"0":vchRowJsonObject.getString("CAmount_s")));
					sdVoucher.setCamountN(Double.valueOf(StringUtil.isEmpty(vchRowJsonObject.getString("CAmount_n"))?"0":vchRowJsonObject.getString("CAmount_n")));
					
					sdVoucher.setSsCode(vchRowJsonObject.getString("SSCode"));
					sdVoucher.setSsName(vchRowJsonObject.getString("SSName"));
					sdVoucher.setBillType(vchRowJsonObject.getString("BillType"));
					sdVoucher.setBillNo(vchRowJsonObject.getString("BillNO"));
					sdVoucher.setBillDateStr(StringUtil.isEmpty(vchRowJsonObject.getString("BillDate"))?null:vchRowJsonObject.getString("BillDate"));
					
					//现金流
					sdVoucher.setCashFlowInfo(vchRowJsonObject.getJSONArray("CashFlowInfo").toString());
					
					
					sdVoucher.setSdElectResAccId(sdElectResAcc.getSdElectResAccId());
					
					sdVoucherList.add(sdVoucher);
					
					//300条插入一次
					if((sdVoucherList.size()/300)==1) {
						sdVoucherMapper.insertSdVoucherList(sdVoucherList);
						//清除数据
						sdVoucherList.clear();
					}
					
				}
				
				if(sdVoucherList==null||sdVoucherList.size()==0) {
					return -1;
				}
				
				sdVoucherMapper.insertSdVoucherList(sdVoucherList);
				
				//解析凭证信息 end
				
				

		return sdElectResAcc.getSdElectResAccId();

	}

}