
package com.hwl.service.model;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import java.io.Serializable;
import com.hwl.service.common.Page;

/**
 * @author lind
 *
 */
public class SdVoucher implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer sdVoucherId;
	/** 记账凭证日期 */
	private java.util.Date vchDate;
	
	private String vchDateStr;
	/** 会计年度 */
	private java.lang.String fyear;
	/** 会计期间号 */
	private java.lang.Integer perdNumber;
	/** 记账凭证类型编号 */
	private java.lang.String vchTypeNo;
	/** 记账凭证类型名称 */
	private java.lang.String vchTypeName;
	/** 记账凭证编号 */
	private java.lang.String vchNo;
	/** 附件数 */
	private java.lang.Integer attachMents;
	/** 制单人 */
	private java.lang.String billerName;
	/** 制单人用户编码 */
	private java.lang.String billerNo;
	/** 审核人 */
	private java.lang.String checkerName;
	/** 审核人用户编码 */
	private java.lang.String checkerNo;
	/** 记账人 */
	private java.lang.String posterName;
	/** 记账人用户编码 */
	private java.lang.String fposterNo;
	/** 记账标志 */
	private java.lang.String vchFlag;
	/** 作废标志 */
	private java.lang.String cancelFlag;
	/** 凭证来源 */
	private java.lang.String vchSource;
	/** 借方合计金额 */
	private Double ctotalAmount;
	/** 贷方合计金额 */
	private Double dtotalAmount;
	/** 记账凭证行号 */
	private java.lang.Integer vchRowId;
	/** 记账凭证摘要 */
	private java.lang.String vchInfo;
	/** 科目名称 */
	private java.lang.String acctName;
	/** 科目编码 */
	private java.lang.String acctId;
	/** 币种编码 */
	private java.lang.String curNo;
	/** 币种名称 */
	private java.lang.String curName;
	/** 汇率类型编号 */
	private java.lang.String rateTypeNo;
	/** 汇率类型名称 */
	private java.lang.String rateTypeName;
	/** 汇率 */
	private Double rate;
	/** 计量单位 */
	private java.lang.String unitId;
	/** 单价 */
	private Double price;
	/** 借方原币金额 */
	private Double damountS;
	/** 借方本币金额 */
	private Double damountN;
	/** 贷方原币金额 */
	private Double camountS;
	/** 贷方本币金额 */
	private Double camountN;
	/** 借方数量 */
	private Double dqty;
	/** 贷方数量 */
	private Double cqty;
	/** 结算方式编码 */
	private java.lang.String ssCode;
	/** 结算方式名称 */
	private java.lang.String ssName;
	/** 票据类型 */
	private java.lang.String billType;
	/** 票据号 */
	private java.lang.String billNo;
	/** 票据日期 */
	private java.util.Date billDate;
	private String billDateStr;
	/** 辅助核算项json */
	private java.lang.String fzhsInfo;
	/** 现金流量json */
	private java.lang.String cashFlowInfo;
	/** 是否关联现金流量 */
	private java.lang.Integer isRelateXjll;
	/** 是否关联核算项 */
	private java.lang.Integer isRelateFzhs;
	/** 账套外键 */
	private java.lang.Integer sdElectResAccId;
	/** 创建时间 */
	private java.util.Date createDate;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdVoucherId
	 */
	
	
	
	public void setSdVoucherId(java.lang.Integer sdVoucherId) {
		this.sdVoucherId = sdVoucherId;
	}
	
	public String getVchDateStr() {
		return vchDateStr;
	}

	public void setVchDateStr(String vchDateStr) {
		this.vchDateStr = vchDateStr;
	}

	public String getBillDateStr() {
		return billDateStr;
	}

	public void setBillDateStr(String billDateStr) {
		this.billDateStr = billDateStr;
	}

	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getSdVoucherId() {
		return this.sdVoucherId;
	}
	/**
	 * 设置 记账凭证日期
	 * @param vchDate
	 */
	public void setVchDate(java.util.Date vchDate) {
		this.vchDate = vchDate;
	}
	/**
	 * 记账凭证日期
	 * @return
	 */
	public java.util.Date getVchDate() {
		return this.vchDate;
	}
	/**
	 * 设置 会计年度
	 * @param fyear
	 */
	public void setFyear(java.lang.String fyear) {
		this.fyear = fyear;
	}
	/**
	 * 会计年度
	 * @return
	 */
	public java.lang.String getFyear() {
		return this.fyear;
	}
	/**
	 * 设置 会计期间号
	 * @param perdNumber
	 */
	public void setPerdNumber(java.lang.Integer perdNumber) {
		this.perdNumber = perdNumber;
	}
	/**
	 * 会计期间号
	 * @return
	 */
	public java.lang.Integer getPerdNumber() {
		return this.perdNumber;
	}
	/**
	 * 设置 记账凭证类型编号
	 * @param vchTypeNo
	 */
	public void setVchTypeNo(java.lang.String vchTypeNo) {
		this.vchTypeNo = vchTypeNo;
	}
	/**
	 * 记账凭证类型编号
	 * @return
	 */
	public java.lang.String getVchTypeNo() {
		return this.vchTypeNo;
	}
	/**
	 * 设置 记账凭证类型名称
	 * @param vchTypeName
	 */
	public void setVchTypeName(java.lang.String vchTypeName) {
		this.vchTypeName = vchTypeName;
	}
	/**
	 * 记账凭证类型名称
	 * @return
	 */
	public java.lang.String getVchTypeName() {
		return this.vchTypeName;
	}
	/**
	 * 设置 记账凭证编号
	 * @param vchNo
	 */
	public void setVchNo(java.lang.String vchNo) {
		this.vchNo = vchNo;
	}
	/**
	 * 记账凭证编号
	 * @return
	 */
	public java.lang.String getVchNo() {
		return this.vchNo;
	}
	/**
	 * 设置 附件数
	 * @param attachMents
	 */
	public void setAttachMents(java.lang.Integer attachMents) {
		this.attachMents = attachMents;
	}
	/**
	 * 附件数
	 * @return
	 */
	public java.lang.Integer getAttachMents() {
		return this.attachMents;
	}
	/**
	 * 设置 制单人
	 * @param billerName
	 */
	public void setBillerName(java.lang.String billerName) {
		this.billerName = billerName;
	}
	/**
	 * 制单人
	 * @return
	 */
	public java.lang.String getBillerName() {
		return this.billerName;
	}
	/**
	 * 设置 制单人用户编码
	 * @param billerNo
	 */
	public void setBillerNo(java.lang.String billerNo) {
		this.billerNo = billerNo;
	}
	/**
	 * 制单人用户编码
	 * @return
	 */
	public java.lang.String getBillerNo() {
		return this.billerNo;
	}
	/**
	 * 设置 审核人
	 * @param checkerName
	 */
	public void setCheckerName(java.lang.String checkerName) {
		this.checkerName = checkerName;
	}
	/**
	 * 审核人
	 * @return
	 */
	public java.lang.String getCheckerName() {
		return this.checkerName;
	}
	/**
	 * 设置 审核人用户编码
	 * @param checkerNo
	 */
	public void setCheckerNo(java.lang.String checkerNo) {
		this.checkerNo = checkerNo;
	}
	/**
	 * 审核人用户编码
	 * @return
	 */
	public java.lang.String getCheckerNo() {
		return this.checkerNo;
	}
	/**
	 * 设置 记账人
	 * @param posterName
	 */
	public void setPosterName(java.lang.String posterName) {
		this.posterName = posterName;
	}
	/**
	 * 记账人
	 * @return
	 */
	public java.lang.String getPosterName() {
		return this.posterName;
	}
	/**
	 * 设置 记账人用户编码
	 * @param fposterNo
	 */
	public void setFposterNo(java.lang.String fposterNo) {
		this.fposterNo = fposterNo;
	}
	/**
	 * 记账人用户编码
	 * @return
	 */
	public java.lang.String getFposterNo() {
		return this.fposterNo;
	}
	/**
	 * 设置 记账标志
	 * @param vchFlag
	 */

	
	
	/**
	 * 设置 凭证来源
	 * @param vchSource
	 */
	public void setVchSource(java.lang.String vchSource) {
		this.vchSource = vchSource;
	}
	public java.lang.String getVchFlag() {
		return vchFlag;
	}

	public void setVchFlag(java.lang.String vchFlag) {
		this.vchFlag = vchFlag;
	}

	public java.lang.String getCancelFlag() {
		return cancelFlag;
	}

	public void setCancelFlag(java.lang.String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}

	/**
	 * 凭证来源
	 * @return
	 */
	public java.lang.String getVchSource() {
		return this.vchSource;
	}
	/**
	 * 设置 借方合计金额
	 * @param ctotalAmount
	 */
	public void setCtotalAmount(Double ctotalAmount) {
		this.ctotalAmount = ctotalAmount;
	}
	/**
	 * 借方合计金额
	 * @return
	 */
	public Double getCtotalAmount() {
		return this.ctotalAmount;
	}
	/**
	 * 设置 贷方合计金额
	 * @param dtotalAmount
	 */
	public void setDtotalAmount(Double dtotalAmount) {
		this.dtotalAmount = dtotalAmount;
	}
	/**
	 * 贷方合计金额
	 * @return
	 */
	public Double getDtotalAmount() {
		return this.dtotalAmount;
	}
	/**
	 * 设置 记账凭证行号
	 * @param vchRowId
	 */
	public void setVchRowId(java.lang.Integer vchRowId) {
		this.vchRowId = vchRowId;
	}
	/**
	 * 记账凭证行号
	 * @return
	 */
	public java.lang.Integer getVchRowId() {
		return this.vchRowId;
	}
	/**
	 * 设置 记账凭证摘要
	 * @param vchInfo
	 */
	public void setVchInfo(java.lang.String vchInfo) {
		this.vchInfo = vchInfo;
	}
	/**
	 * 记账凭证摘要
	 * @return
	 */
	public java.lang.String getVchInfo() {
		return this.vchInfo;
	}
	/**
	 * 设置 科目名称
	 * @param acctName
	 */
	public void setAcctName(java.lang.String acctName) {
		this.acctName = acctName;
	}
	/**
	 * 科目名称
	 * @return
	 */
	public java.lang.String getAcctName() {
		return this.acctName;
	}
	/**
	 * 设置 科目编码
	 * @param acctId
	 */
	public void setAcctId(java.lang.String acctId) {
		this.acctId = acctId;
	}
	/**
	 * 科目编码
	 * @return
	 */
	public java.lang.String getAcctId() {
		return this.acctId;
	}
	/**
	 * 设置 币种编码
	 * @param curNo
	 */
	public void setCurNo(java.lang.String curNo) {
		this.curNo = curNo;
	}
	/**
	 * 币种编码
	 * @return
	 */
	public java.lang.String getCurNo() {
		return this.curNo;
	}
	/**
	 * 设置 币种名称
	 * @param curName
	 */
	public void setCurName(java.lang.String curName) {
		this.curName = curName;
	}
	/**
	 * 币种名称
	 * @return
	 */
	public java.lang.String getCurName() {
		return this.curName;
	}
	/**
	 * 设置 汇率类型编号
	 * @param rateTypeNo
	 */
	public void setRateTypeNo(java.lang.String rateTypeNo) {
		this.rateTypeNo = rateTypeNo;
	}
	/**
	 * 汇率类型编号
	 * @return
	 */
	public java.lang.String getRateTypeNo() {
		return this.rateTypeNo;
	}
	/**
	 * 设置 汇率类型名称
	 * @param rateTypeName
	 */
	public void setRateTypeName(java.lang.String rateTypeName) {
		this.rateTypeName = rateTypeName;
	}
	/**
	 * 汇率类型名称
	 * @return
	 */
	public java.lang.String getRateTypeName() {
		return this.rateTypeName;
	}
	/**
	 * 设置 汇率
	 * @param rate
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}
	/**
	 * 汇率
	 * @return
	 */
	public Double getRate() {
		return this.rate;
	}
	/**
	 * 设置 计量单位
	 * @param unitId
	 */
	public void setUnitId(java.lang.String unitId) {
		this.unitId = unitId;
	}
	/**
	 * 计量单位
	 * @return
	 */
	public java.lang.String getUnitId() {
		return this.unitId;
	}
	/**
	 * 设置 单价
	 * @param price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 单价
	 * @return
	 */
	public Double getPrice() {
		return this.price;
	}
	/**
	 * 设置 借方原币金额
	 * @param damountS
	 */
	public void setDamountS(Double damountS) {
		this.damountS = damountS;
	}
	/**
	 * 借方原币金额
	 * @return
	 */
	public Double getDamountS() {
		return this.damountS;
	}
	/**
	 * 设置 借方本币金额
	 * @param damountN
	 */
	public void setDamountN(Double damountN) {
		this.damountN = damountN;
	}
	/**
	 * 借方本币金额
	 * @return
	 */
	public Double getDamountN() {
		return this.damountN;
	}
	/**
	 * 设置 贷方原币金额
	 * @param camountS
	 */
	public void setCamountS(Double camountS) {
		this.camountS = camountS;
	}
	/**
	 * 贷方原币金额
	 * @return
	 */
	public Double getCamountS() {
		return this.camountS;
	}
	/**
	 * 设置 贷方本币金额
	 * @param camountN
	 */
	public void setCamountN(Double camountN) {
		this.camountN = camountN;
	}
	/**
	 * 贷方本币金额
	 * @return
	 */
	public Double getCamountN() {
		return this.camountN;
	}
	/**
	 * 设置 借方数量
	 * @param dqty
	 */
	public void setDqty(Double dqty) {
		this.dqty = dqty;
	}
	/**
	 * 借方数量
	 * @return
	 */
	public Double getDqty() {
		return this.dqty;
	}
	/**
	 * 设置 贷方数量
	 * @param cqty
	 */
	public void setCqty(Double cqty) {
		this.cqty = cqty;
	}
	/**
	 * 贷方数量
	 * @return
	 */
	public Double getCqty() {
		return this.cqty;
	}
	/**
	 * 设置 结算方式编码
	 * @param ssCode
	 */
	public void setSsCode(java.lang.String ssCode) {
		this.ssCode = ssCode;
	}
	/**
	 * 结算方式编码
	 * @return
	 */
	public java.lang.String getSsCode() {
		return this.ssCode;
	}
	/**
	 * 设置 结算方式名称
	 * @param ssName
	 */
	public void setSsName(java.lang.String ssName) {
		this.ssName = ssName;
	}
	/**
	 * 结算方式名称
	 * @return
	 */
	public java.lang.String getSsName() {
		return this.ssName;
	}
	/**
	 * 设置 票据类型
	 * @param billType
	 */
	public void setBillType(java.lang.String billType) {
		this.billType = billType;
	}
	/**
	 * 票据类型
	 * @return
	 */
	public java.lang.String getBillType() {
		return this.billType;
	}
	/**
	 * 设置 票据号
	 * @param billNo
	 */
	public void setBillNo(java.lang.String billNo) {
		this.billNo = billNo;
	}
	/**
	 * 票据号
	 * @return
	 */
	public java.lang.String getBillNo() {
		return this.billNo;
	}
	/**
	 * 设置 票据日期
	 * @param billDate
	 */
	public void setBillDate(java.util.Date billDate) {
		this.billDate = billDate;
	}
	/**
	 * 票据日期
	 * @return
	 */
	public java.util.Date getBillDate() {
		return this.billDate;
	}
	/**
	 * 设置 辅助核算项json
	 * @param fzhsInfo
	 */
	public void setFzhsInfo(java.lang.String fzhsInfo) {
		this.fzhsInfo = fzhsInfo;
	}
	/**
	 * 辅助核算项json
	 * @return
	 */
	public java.lang.String getFzhsInfo() {
		return this.fzhsInfo;
	}
	/**
	 * 设置 现金流量json
	 * @param cashFlowInfo
	 */
	public void setCashFlowInfo(java.lang.String cashFlowInfo) {
		this.cashFlowInfo = cashFlowInfo;
	}
	/**
	 * 现金流量json
	 * @return
	 */
	public java.lang.String getCashFlowInfo() {
		return this.cashFlowInfo;
	}
	/**
	 * 设置 是否关联现金流量
	 * @param isRelateXjll
	 */
	public void setIsRelateXjll(java.lang.Integer isRelateXjll) {
		this.isRelateXjll = isRelateXjll;
	}
	/**
	 * 是否关联现金流量
	 * @return
	 */
	public java.lang.Integer getIsRelateXjll() {
		return this.isRelateXjll;
	}
	/**
	 * 设置 是否关联核算项
	 * @param isRelateFzhs
	 */
	public void setIsRelateFzhs(java.lang.Integer isRelateFzhs) {
		this.isRelateFzhs = isRelateFzhs;
	}
	/**
	 * 是否关联核算项
	 * @return
	 */
	public java.lang.Integer getIsRelateFzhs() {
		return this.isRelateFzhs;
	}
	/**
	 * 设置 账套外键
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(java.lang.Integer sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * 账套外键
	 * @return
	 */
	public java.lang.Integer getSdElectResAccId() {
		return this.sdElectResAccId;
	}
	/**
	 * 设置 创建时间
	 * @param createDate
	 */
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 创建时间
	 * @return
	 */
	public java.util.Date getCreateDate() {
		return this.createDate;
	}

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
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

