
package com.hwl.service.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.hwl.service.common.Page;

/**
 * @author lind
 *
 */
public class SdVoucherForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String sdVoucherId;
	/** 记账凭证日期 */
	private String vchDate;
	/** 会计年度 */
	private String fyear;
	/** 会计期间号 */
	private String perdNumber;
	/** 记账凭证类型编号 */
	private String vchTypeNo;
	/** 记账凭证类型名称 */
	private String vchTypeName;
	/** 记账凭证编号 */
	private String vchNo;
	/** 附件数 */
	private String attachMents;
	/** 制单人 */
	private String billerName;
	/** 制单人用户编码 */
	private String billerNo;
	/** 审核人 */
	private String checkerName;
	/** 审核人用户编码 */
	private String checkerNo;
	/** 记账人 */
	private String posterName;
	/** 记账人用户编码 */
	private String fposterNo;
	/** 记账标志 */
	private String vchFlag;
	/** 作废标志 */
	private String cancelFlag;
	/** 凭证来源 */
	private String vchSource;
	/** 借方合计金额 */
	private String ctotalAmount;
	/** 贷方合计金额 */
	private String dtotalAmount;
	/** 记账凭证行号 */
	private String vchRowId;
	/** 记账凭证摘要 */
	private String vchInfo;
	/** 科目名称 */
	private String acctName;
	/** 科目编码 */
	private String acctId;
	/** 币种编码 */
	private String curNo;
	/** 币种名称 */
	private String curName;
	/** 汇率类型编号 */
	private String rateTypeNo;
	/** 汇率类型名称 */
	private String rateTypeName;
	/** 汇率 */
	private String rate;
	/** 计量单位 */
	private String unitId;
	/** 单价 */
	private String price;
	/** 借方原币金额 */
	private String damountS;
	/** 借方本币金额 */
	private String damountN;
	/** 贷方原币金额 */
	private String camountS;
	/** 贷方本币金额 */
	private String camountN;
	/** 借方数量 */
	private String dqty;
	/** 贷方数量 */
	private String cqty;
	/** 结算方式编码 */
	private String ssCode;
	/** 结算方式名称 */
	private String ssName;
	/** 票据类型 */
	private String billType;
	/** 票据号 */
	private String billNo;
	/** 票据日期 */
	private String billDate;
	/** 辅助核算项json */
	private String fzhsInfo;
	/** 现金流量json */
	private String cashFlowInfo;
	/** 是否关联现金流量 */
	private String isRelateXjll;
	/** 是否关联核算项 */
	private String isRelateFzhs;
	/** 账套外键 */
	private String sdElectResAccId;
	/** 创建时间 */
	private String createDate;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdVoucherId
	 */
	public void setSdVoucherId(String sdVoucherId) {
		this.sdVoucherId = sdVoucherId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getSdVoucherId() {
		return this.sdVoucherId;
	}
	/**
	 * 设置 记账凭证日期
	 * @param vchDate
	 */
	public void setVchDate(String vchDate) {
		this.vchDate = vchDate;
	}
	/**
	 * 记账凭证日期
	 * @return
	 */
	public String getVchDate() {
		return this.vchDate;
	}
	/**
	 * 设置 会计年度
	 * @param fyear
	 */
	public void setFyear(String fyear) {
		this.fyear = fyear;
	}
	/**
	 * 会计年度
	 * @return
	 */
	public String getFyear() {
		return this.fyear;
	}
	/**
	 * 设置 会计期间号
	 * @param perdNumber
	 */
	public void setPerdNumber(String perdNumber) {
		this.perdNumber = perdNumber;
	}
	/**
	 * 会计期间号
	 * @return
	 */
	public String getPerdNumber() {
		return this.perdNumber;
	}
	/**
	 * 设置 记账凭证类型编号
	 * @param vchTypeNo
	 */
	public void setVchTypeNo(String vchTypeNo) {
		this.vchTypeNo = vchTypeNo;
	}
	/**
	 * 记账凭证类型编号
	 * @return
	 */
	public String getVchTypeNo() {
		return this.vchTypeNo;
	}
	/**
	 * 设置 记账凭证类型名称
	 * @param vchTypeName
	 */
	public void setVchTypeName(String vchTypeName) {
		this.vchTypeName = vchTypeName;
	}
	/**
	 * 记账凭证类型名称
	 * @return
	 */
	public String getVchTypeName() {
		return this.vchTypeName;
	}
	/**
	 * 设置 记账凭证编号
	 * @param vchNo
	 */
	public void setVchNo(String vchNo) {
		this.vchNo = vchNo;
	}
	/**
	 * 记账凭证编号
	 * @return
	 */
	public String getVchNo() {
		return this.vchNo;
	}
	/**
	 * 设置 附件数
	 * @param attachMents
	 */
	public void setAttachMents(String attachMents) {
		this.attachMents = attachMents;
	}
	/**
	 * 附件数
	 * @return
	 */
	public String getAttachMents() {
		return this.attachMents;
	}
	/**
	 * 设置 制单人
	 * @param billerName
	 */
	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}
	/**
	 * 制单人
	 * @return
	 */
	public String getBillerName() {
		return this.billerName;
	}
	/**
	 * 设置 制单人用户编码
	 * @param billerNo
	 */
	public void setBillerNo(String billerNo) {
		this.billerNo = billerNo;
	}
	/**
	 * 制单人用户编码
	 * @return
	 */
	public String getBillerNo() {
		return this.billerNo;
	}
	/**
	 * 设置 审核人
	 * @param checkerName
	 */
	public void setCheckerName(String checkerName) {
		this.checkerName = checkerName;
	}
	/**
	 * 审核人
	 * @return
	 */
	public String getCheckerName() {
		return this.checkerName;
	}
	/**
	 * 设置 审核人用户编码
	 * @param checkerNo
	 */
	public void setCheckerNo(String checkerNo) {
		this.checkerNo = checkerNo;
	}
	/**
	 * 审核人用户编码
	 * @return
	 */
	public String getCheckerNo() {
		return this.checkerNo;
	}
	/**
	 * 设置 记账人
	 * @param posterName
	 */
	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}
	/**
	 * 记账人
	 * @return
	 */
	public String getPosterName() {
		return this.posterName;
	}
	/**
	 * 设置 记账人用户编码
	 * @param fposterNo
	 */
	public void setFposterNo(String fposterNo) {
		this.fposterNo = fposterNo;
	}
	/**
	 * 记账人用户编码
	 * @return
	 */
	public String getFposterNo() {
		return this.fposterNo;
	}
	/**
	 * 设置 记账标志
	 * @param vchFlag
	 */
	public void setVchFlag(String vchFlag) {
		this.vchFlag = vchFlag;
	}
	/**
	 * 记账标志
	 * @return
	 */
	public String getVchFlag() {
		return this.vchFlag;
	}
	/**
	 * 设置 作废标志
	 * @param cancelFlag
	 */
	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}
	/**
	 * 作废标志
	 * @return
	 */
	public String getCancelFlag() {
		return this.cancelFlag;
	}
	/**
	 * 设置 凭证来源
	 * @param vchSource
	 */
	public void setVchSource(String vchSource) {
		this.vchSource = vchSource;
	}
	/**
	 * 凭证来源
	 * @return
	 */
	public String getVchSource() {
		return this.vchSource;
	}
	/**
	 * 设置 借方合计金额
	 * @param ctotalAmount
	 */
	public void setCtotalAmount(String ctotalAmount) {
		this.ctotalAmount = ctotalAmount;
	}
	/**
	 * 借方合计金额
	 * @return
	 */
	public String getCtotalAmount() {
		return this.ctotalAmount;
	}
	/**
	 * 设置 贷方合计金额
	 * @param dtotalAmount
	 */
	public void setDtotalAmount(String dtotalAmount) {
		this.dtotalAmount = dtotalAmount;
	}
	/**
	 * 贷方合计金额
	 * @return
	 */
	public String getDtotalAmount() {
		return this.dtotalAmount;
	}
	/**
	 * 设置 记账凭证行号
	 * @param vchRowId
	 */
	public void setVchRowId(String vchRowId) {
		this.vchRowId = vchRowId;
	}
	/**
	 * 记账凭证行号
	 * @return
	 */
	public String getVchRowId() {
		return this.vchRowId;
	}
	/**
	 * 设置 记账凭证摘要
	 * @param vchInfo
	 */
	public void setVchInfo(String vchInfo) {
		this.vchInfo = vchInfo;
	}
	/**
	 * 记账凭证摘要
	 * @return
	 */
	public String getVchInfo() {
		return this.vchInfo;
	}
	/**
	 * 设置 科目名称
	 * @param acctName
	 */
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	/**
	 * 科目名称
	 * @return
	 */
	public String getAcctName() {
		return this.acctName;
	}
	/**
	 * 设置 科目编码
	 * @param acctId
	 */
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	/**
	 * 科目编码
	 * @return
	 */
	public String getAcctId() {
		return this.acctId;
	}
	/**
	 * 设置 币种编码
	 * @param curNo
	 */
	public void setCurNo(String curNo) {
		this.curNo = curNo;
	}
	/**
	 * 币种编码
	 * @return
	 */
	public String getCurNo() {
		return this.curNo;
	}
	/**
	 * 设置 币种名称
	 * @param curName
	 */
	public void setCurName(String curName) {
		this.curName = curName;
	}
	/**
	 * 币种名称
	 * @return
	 */
	public String getCurName() {
		return this.curName;
	}
	/**
	 * 设置 汇率类型编号
	 * @param rateTypeNo
	 */
	public void setRateTypeNo(String rateTypeNo) {
		this.rateTypeNo = rateTypeNo;
	}
	/**
	 * 汇率类型编号
	 * @return
	 */
	public String getRateTypeNo() {
		return this.rateTypeNo;
	}
	/**
	 * 设置 汇率类型名称
	 * @param rateTypeName
	 */
	public void setRateTypeName(String rateTypeName) {
		this.rateTypeName = rateTypeName;
	}
	/**
	 * 汇率类型名称
	 * @return
	 */
	public String getRateTypeName() {
		return this.rateTypeName;
	}
	/**
	 * 设置 汇率
	 * @param rate
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}
	/**
	 * 汇率
	 * @return
	 */
	public String getRate() {
		return this.rate;
	}
	/**
	 * 设置 计量单位
	 * @param unitId
	 */
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	/**
	 * 计量单位
	 * @return
	 */
	public String getUnitId() {
		return this.unitId;
	}
	/**
	 * 设置 单价
	 * @param price
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * 单价
	 * @return
	 */
	public String getPrice() {
		return this.price;
	}
	/**
	 * 设置 借方原币金额
	 * @param damountS
	 */
	public void setDamountS(String damountS) {
		this.damountS = damountS;
	}
	/**
	 * 借方原币金额
	 * @return
	 */
	public String getDamountS() {
		return this.damountS;
	}
	/**
	 * 设置 借方本币金额
	 * @param damountN
	 */
	public void setDamountN(String damountN) {
		this.damountN = damountN;
	}
	/**
	 * 借方本币金额
	 * @return
	 */
	public String getDamountN() {
		return this.damountN;
	}
	/**
	 * 设置 贷方原币金额
	 * @param camountS
	 */
	public void setCamountS(String camountS) {
		this.camountS = camountS;
	}
	/**
	 * 贷方原币金额
	 * @return
	 */
	public String getCamountS() {
		return this.camountS;
	}
	/**
	 * 设置 贷方本币金额
	 * @param camountN
	 */
	public void setCamountN(String camountN) {
		this.camountN = camountN;
	}
	/**
	 * 贷方本币金额
	 * @return
	 */
	public String getCamountN() {
		return this.camountN;
	}
	/**
	 * 设置 借方数量
	 * @param dqty
	 */
	public void setDqty(String dqty) {
		this.dqty = dqty;
	}
	/**
	 * 借方数量
	 * @return
	 */
	public String getDqty() {
		return this.dqty;
	}
	/**
	 * 设置 贷方数量
	 * @param cqty
	 */
	public void setCqty(String cqty) {
		this.cqty = cqty;
	}
	/**
	 * 贷方数量
	 * @return
	 */
	public String getCqty() {
		return this.cqty;
	}
	/**
	 * 设置 结算方式编码
	 * @param ssCode
	 */
	public void setSsCode(String ssCode) {
		this.ssCode = ssCode;
	}
	/**
	 * 结算方式编码
	 * @return
	 */
	public String getSsCode() {
		return this.ssCode;
	}
	/**
	 * 设置 结算方式名称
	 * @param ssName
	 */
	public void setSsName(String ssName) {
		this.ssName = ssName;
	}
	/**
	 * 结算方式名称
	 * @return
	 */
	public String getSsName() {
		return this.ssName;
	}
	/**
	 * 设置 票据类型
	 * @param billType
	 */
	public void setBillType(String billType) {
		this.billType = billType;
	}
	/**
	 * 票据类型
	 * @return
	 */
	public String getBillType() {
		return this.billType;
	}
	/**
	 * 设置 票据号
	 * @param billNo
	 */
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	/**
	 * 票据号
	 * @return
	 */
	public String getBillNo() {
		return this.billNo;
	}
	/**
	 * 设置 票据日期
	 * @param billDate
	 */
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	/**
	 * 票据日期
	 * @return
	 */
	public String getBillDate() {
		return this.billDate;
	}
	/**
	 * 设置 辅助核算项json
	 * @param fzhsInfo
	 */
	public void setFzhsInfo(String fzhsInfo) {
		this.fzhsInfo = fzhsInfo;
	}
	/**
	 * 辅助核算项json
	 * @return
	 */
	public String getFzhsInfo() {
		return this.fzhsInfo;
	}
	/**
	 * 设置 现金流量json
	 * @param cashFlowInfo
	 */
	public void setCashFlowInfo(String cashFlowInfo) {
		this.cashFlowInfo = cashFlowInfo;
	}
	/**
	 * 现金流量json
	 * @return
	 */
	public String getCashFlowInfo() {
		return this.cashFlowInfo;
	}
	/**
	 * 设置 是否关联现金流量
	 * @param isRelateXjll
	 */
	public void setIsRelateXjll(String isRelateXjll) {
		this.isRelateXjll = isRelateXjll;
	}
	/**
	 * 是否关联现金流量
	 * @return
	 */
	public String getIsRelateXjll() {
		return this.isRelateXjll;
	}
	/**
	 * 设置 是否关联核算项
	 * @param isRelateFzhs
	 */
	public void setIsRelateFzhs(String isRelateFzhs) {
		this.isRelateFzhs = isRelateFzhs;
	}
	/**
	 * 是否关联核算项
	 * @return
	 */
	public String getIsRelateFzhs() {
		return this.isRelateFzhs;
	}
	/**
	 * 设置 账套外键
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(String sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * 账套外键
	 * @return
	 */
	public String getSdElectResAccId() {
		return this.sdElectResAccId;
	}
	/**
	 * 设置 创建时间
	 * @param createDate
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	/**
	 * 创建时间
	 * @return
	 */
	public String getCreateDate() {
		return this.createDate;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setSdVoucher(SdVoucher sdVoucher){
		if(sdVoucher==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdVoucherId=sdVoucher.getSdVoucherId()==null?"":String.valueOf(sdVoucher.getSdVoucherId());	
		this.vchDate=sdVoucher.getVchDate()==null?"":df.format(sdVoucher.getVchDate());	
		this.fyear=sdVoucher.getFyear()==null?"":sdVoucher.getFyear();	
		this.perdNumber=sdVoucher.getPerdNumber()==null?"":String.valueOf(sdVoucher.getPerdNumber());	
		this.vchTypeNo=sdVoucher.getVchTypeNo()==null?"":sdVoucher.getVchTypeNo();	
		this.vchTypeName=sdVoucher.getVchTypeName()==null?"":sdVoucher.getVchTypeName();	
		this.vchNo=sdVoucher.getVchNo()==null?"":sdVoucher.getVchNo();	
		this.attachMents=sdVoucher.getAttachMents()==null?"":String.valueOf(sdVoucher.getAttachMents());	
		this.billerName=sdVoucher.getBillerName()==null?"":sdVoucher.getBillerName();	
		this.billerNo=sdVoucher.getBillerNo()==null?"":sdVoucher.getBillerNo();	
		this.checkerName=sdVoucher.getCheckerName()==null?"":sdVoucher.getCheckerName();	
		this.checkerNo=sdVoucher.getCheckerNo()==null?"":sdVoucher.getCheckerNo();	
		this.posterName=sdVoucher.getPosterName()==null?"":sdVoucher.getPosterName();	
		this.fposterNo=sdVoucher.getFposterNo()==null?"":sdVoucher.getFposterNo();	
		this.vchFlag=sdVoucher.getVchFlag()==null?"":String.valueOf(sdVoucher.getVchFlag());	
		this.cancelFlag=sdVoucher.getCancelFlag()==null?"":String.valueOf(sdVoucher.getCancelFlag());	
		this.vchSource=sdVoucher.getVchSource()==null?"":sdVoucher.getVchSource();	
//		this.ctotalAmount=sdVoucher.getCtotalAmount()==null?"":sdVoucher.getCtotalAmount();	
//		this.dtotalAmount=sdVoucher.getDtotalAmount()==null?"":sdVoucher.getDtotalAmount();	
		this.vchRowId=sdVoucher.getVchRowId()==null?"":String.valueOf(sdVoucher.getVchRowId());	
		this.vchInfo=sdVoucher.getVchInfo()==null?"":sdVoucher.getVchInfo();	
		this.acctName=sdVoucher.getAcctName()==null?"":sdVoucher.getAcctName();	
		this.acctId=sdVoucher.getAcctId()==null?"":String.valueOf(sdVoucher.getAcctId());	
		this.curNo=sdVoucher.getCurNo()==null?"":sdVoucher.getCurNo();	
		this.curName=sdVoucher.getCurName()==null?"":sdVoucher.getCurName();	
		this.rateTypeNo=sdVoucher.getRateTypeNo()==null?"":sdVoucher.getRateTypeNo();	
		this.rateTypeName=sdVoucher.getRateTypeName()==null?"":sdVoucher.getRateTypeName();	
//		this.rate=sdVoucher.getRate()==null?"":sdVoucher.getRate();	
//		this.unitId=sdVoucher.getUnitId()==null?"":sdVoucher.getUnitId();	
//		this.price=sdVoucher.getPrice()==null?"":sdVoucher.getPrice();	
//		this.damountS=sdVoucher.getDamountS()==null?"":sdVoucher.getDamountS();	
//		this.damountN=sdVoucher.getDamountN()==null?"":sdVoucher.getDamountN();	
//		this.camountS=sdVoucher.getCamountS()==null?"":sdVoucher.getCamountS();	
//		this.camountN=sdVoucher.getCamountN()==null?"":sdVoucher.getCamountN();	
		this.dqty=sdVoucher.getDqty()==null?"":String.valueOf(sdVoucher.getDqty());	
		this.cqty=sdVoucher.getCqty()==null?"":String.valueOf(sdVoucher.getCqty());	
		this.ssCode=sdVoucher.getSsCode()==null?"":sdVoucher.getSsCode();	
		this.ssName=sdVoucher.getSsName()==null?"":sdVoucher.getSsName();	
		this.billType=sdVoucher.getBillType()==null?"":sdVoucher.getBillType();	
		this.billNo=sdVoucher.getBillNo()==null?"":sdVoucher.getBillNo();	
		this.billDate=sdVoucher.getBillDate()==null?"":df.format(sdVoucher.getBillDate());	
		this.fzhsInfo=sdVoucher.getFzhsInfo()==null?"":sdVoucher.getFzhsInfo();	
		this.cashFlowInfo=sdVoucher.getCashFlowInfo()==null?"":sdVoucher.getCashFlowInfo();	
		this.isRelateXjll=sdVoucher.getIsRelateXjll()==null?"":String.valueOf(sdVoucher.getIsRelateXjll());	
		this.isRelateFzhs=sdVoucher.getIsRelateFzhs()==null?"":String.valueOf(sdVoucher.getIsRelateFzhs());	
		this.sdElectResAccId=sdVoucher.getSdElectResAccId()==null?"":String.valueOf(sdVoucher.getSdElectResAccId());	
		this.createDate=sdVoucher.getCreateDate()==null?"":df.format(sdVoucher.getCreateDate());	
		this.page=sdVoucher.getPage();
	}
  
	public SdVoucher getSdVoucher(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdVoucher sdVoucher=new SdVoucher();
		sdVoucher.setSdVoucherId(this.sdVoucherId==null||this.sdVoucherId.length()==0?0:Integer.parseInt(this.sdVoucherId));  
		try {
			sdVoucher.setVchDate(this.vchDate==null||this.vchDate.length()==0?null:df.parse(this.vchDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdVoucher.setFyear(this.fyear==null||this.fyear.length()==0?"":this.fyear);  
		sdVoucher.setPerdNumber(this.perdNumber==null||this.perdNumber.length()==0?0:Integer.parseInt(this.perdNumber));  
		sdVoucher.setVchTypeNo(this.vchTypeNo==null||this.vchTypeNo.length()==0?"":this.vchTypeNo);  
		sdVoucher.setVchTypeName(this.vchTypeName==null||this.vchTypeName.length()==0?"":this.vchTypeName);  
		sdVoucher.setVchNo(this.vchNo==null||this.vchNo.length()==0?"":this.vchNo);  
		sdVoucher.setAttachMents(this.attachMents==null||this.attachMents.length()==0?0:Integer.parseInt(this.attachMents));  
		sdVoucher.setBillerName(this.billerName==null||this.billerName.length()==0?"":this.billerName);  
		sdVoucher.setBillerNo(this.billerNo==null||this.billerNo.length()==0?"":this.billerNo);  
		sdVoucher.setCheckerName(this.checkerName==null||this.checkerName.length()==0?"":this.checkerName);  
		sdVoucher.setCheckerNo(this.checkerNo==null||this.checkerNo.length()==0?"":this.checkerNo);  
		sdVoucher.setPosterName(this.posterName==null||this.posterName.length()==0?"":this.posterName);  
		sdVoucher.setFposterNo(this.fposterNo==null||this.fposterNo.length()==0?"":this.fposterNo);  
//		sdVoucher.setVchFlag(this.vchFlag==null||this.vchFlag.length()==0?0:Integer.parseInt(this.vchFlag));  
//		sdVoucher.setCancelFlag(this.cancelFlag==null||this.cancelFlag.length()==0?0:Integer.parseInt(this.cancelFlag));  
		sdVoucher.setVchSource(this.vchSource==null||this.vchSource.length()==0?"":this.vchSource);  
//		sdVoucher.setCtotalAmount(this.ctotalAmount==null||this.ctotalAmount.length()==0?"":this.ctotalAmount);  
//		sdVoucher.setDtotalAmount(this.dtotalAmount==null||this.dtotalAmount.length()==0?"":this.dtotalAmount);  
		sdVoucher.setVchRowId(this.vchRowId==null||this.vchRowId.length()==0?0:Integer.parseInt(this.vchRowId));  
		sdVoucher.setVchInfo(this.vchInfo==null||this.vchInfo.length()==0?"":this.vchInfo);  
		sdVoucher.setAcctName(this.acctName==null||this.acctName.length()==0?"":this.acctName);  
//		sdVoucher.setAcctId(this.acctId==null||this.acctId.length()==0?0:Integer.parseInt(this.acctId));  
		sdVoucher.setCurNo(this.curNo==null||this.curNo.length()==0?"":this.curNo);  
		sdVoucher.setCurName(this.curName==null||this.curName.length()==0?"":this.curName);  
		sdVoucher.setRateTypeNo(this.rateTypeNo==null||this.rateTypeNo.length()==0?"":this.rateTypeNo);  
		sdVoucher.setRateTypeName(this.rateTypeName==null||this.rateTypeName.length()==0?"":this.rateTypeName);  
//		sdVoucher.setRate(this.rate==null||this.rate.length()==0?"":this.rate);  
//		sdVoucher.setUnitId(this.unitId==null||this.unitId.length()==0?"":this.unitId);  
//		sdVoucher.setPrice(this.price==null||this.price.length()==0?"":this.price);  
//		sdVoucher.setDamountS(this.damountS==null||this.damountS.length()==0?"":this.damountS);  
//		sdVoucher.setDamountN(this.damountN==null||this.damountN.length()==0?"":this.damountN);  
//		sdVoucher.setCamountS(this.camountS==null||this.camountS.length()==0?"":this.camountS);  
//		sdVoucher.setCamountN(this.camountN==null||this.camountN.length()==0?"":this.camountN);  
//		sdVoucher.setDqty(this.dqty==null||this.dqty.length()==0?0:Integer.parseInt(this.dqty));  
//		sdVoucher.setCqty(this.cqty==null||this.cqty.length()==0?0:Integer.parseInt(this.cqty));  
		sdVoucher.setSsCode(this.ssCode==null||this.ssCode.length()==0?"":this.ssCode);  
		sdVoucher.setSsName(this.ssName==null||this.ssName.length()==0?"":this.ssName);  
		sdVoucher.setBillType(this.billType==null||this.billType.length()==0?"":this.billType);  
		sdVoucher.setBillNo(this.billNo==null||this.billNo.length()==0?"":this.billNo);  
		try {
			sdVoucher.setBillDate(this.billDate==null||this.billDate.length()==0?null:df.parse(this.billDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdVoucher.setFzhsInfo(this.fzhsInfo==null||this.fzhsInfo.length()==0?"":this.fzhsInfo);  
		sdVoucher.setCashFlowInfo(this.cashFlowInfo==null||this.cashFlowInfo.length()==0?"":this.cashFlowInfo);  
		sdVoucher.setIsRelateXjll(this.isRelateXjll==null||this.isRelateXjll.length()==0?0:Integer.parseInt(this.isRelateXjll));  
		sdVoucher.setIsRelateFzhs(this.isRelateFzhs==null||this.isRelateFzhs.length()==0?0:Integer.parseInt(this.isRelateFzhs));  
		sdVoucher.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		try {
			sdVoucher.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdVoucher.setPage(this.page);	
		return sdVoucher;
	}
  
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("SdVoucherId",getSdVoucherId())
		.append("VchDate",getVchDate())
		.append("Fyear",getFyear())
		.append("PerdNumber",getPerdNumber())
		.append("VchTypeNo",getVchTypeNo())
		.append("VchTypeName",getVchTypeName())
		.append("VchNo",getVchNo())
		.append("AttachMents",getAttachMents())
		.append("BillerName",getBillerName())
		.append("BillerNo",getBillerNo())
		.append("CheckerName",getCheckerName())
		.append("CheckerNo",getCheckerNo())
		.append("PosterName",getPosterName())
		.append("FposterNo",getFposterNo())
		.append("VchFlag",getVchFlag())
		.append("CancelFlag",getCancelFlag())
		.append("VchSource",getVchSource())
		.append("CtotalAmount",getCtotalAmount())
		.append("DtotalAmount",getDtotalAmount())
		.append("VchRowId",getVchRowId())
		.append("VchInfo",getVchInfo())
		.append("AcctName",getAcctName())
		.append("AcctId",getAcctId())
		.append("CurNo",getCurNo())
		.append("CurName",getCurName())
		.append("RateTypeNo",getRateTypeNo())
		.append("RateTypeName",getRateTypeName())
		.append("Rate",getRate())
		.append("UnitId",getUnitId())
		.append("Price",getPrice())
		.append("DamountS",getDamountS())
		.append("DamountN",getDamountN())
		.append("CamountS",getCamountS())
		.append("CamountN",getCamountN())
		.append("Dqty",getDqty())
		.append("Cqty",getCqty())
		.append("SsCode",getSsCode())
		.append("SsName",getSsName())
		.append("BillType",getBillType())
		.append("BillNo",getBillNo())
		.append("BillDate",getBillDate())
		.append("FzhsInfo",getFzhsInfo())
		.append("CashFlowInfo",getCashFlowInfo())
		.append("IsRelateXjll",getIsRelateXjll())
		.append("IsRelateFzhs",getIsRelateFzhs())
		.append("SdElectResAccId",getSdElectResAccId())
		.append("CreateDate",getCreateDate())
		.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdVoucherId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdVoucher == false) return false;
		if(this == obj) return true;
		SdVoucher other = (SdVoucher)obj;
		return new EqualsBuilder()
			.append(getSdVoucherId(),other.getSdVoucherId())
			.isEquals();
	}
}

