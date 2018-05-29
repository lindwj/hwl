
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
public class SdAcctAmount implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer sdAcctAmountId;
	/** 会计科目外键 */
	private java.lang.Integer sdAccountId;
	/** 科目名称 */
	private java.lang.String acctName;
	/** 科目编码 */
	private java.lang.String acctId;
	/** 会计年度 */
	private java.lang.String fyear;
	/** 会计期间号 */
	private java.lang.Integer perdNumber;
	/** 币种编码 */
	private java.lang.String curNo;
	/** 币种名称 */
	private java.lang.String curName;
	/** 月期初原币余额 */
	private double bamountS;
	/** 月期初本币余额 */
	private double bamountN;
	/** 月期初余额方向 */
	private java.lang.String bamountDc;
	/** 借方原币金额 */
	private double damountS;
	/** 借方本币金额 */
	private double damountN;
	/** 贷方原币金额 */
	private double camountS;
	/** 贷方本币金额 */
	private double camountN;
	/** 月期末原币余额 */
	private double eamountS;
	/** 月期末本币余额 */
	private double eamountN;
	/** 月期末余额方向 */
	private java.lang.String eamountDc;
	/** 计量单位 */
	private java.lang.String unitId;
	/** 期初数量 */
	private double bqty;
	/** 借方数量 */
	private double dqty;
	/** 贷方数量 */
	private double cqty;
	/** 期末数量 */
	private double eqty;
	/** 辅助核算编号 */
	private java.lang.String fzhsNum1;
	/** 辅助核算类别 */
	private java.lang.String fzhsFinedName1;
	/** 辅助核算编码 */
	private java.lang.String fzhsNo1;
	/** 辅助核算名称 */
	private java.lang.String fzhsName1;
	/** fzhsNum2 */
	private java.lang.String fzhsNum2;
	/** fzhsFinedName2 */
	private java.lang.String fzhsFinedName2;
	/** fzhsNo2 */
	private java.lang.String fzhsNo2;
	/** fzhsName2 */
	private java.lang.String fzhsName2;
	/** fzhsNum3 */
	private java.lang.String fzhsNum3;
	/** fzhsFinedName3 */
	private java.lang.String fzhsFinedName3;
	/** fzhsNo3 */
	private java.lang.String fzhsNo3;
	/** fzhsName3 */
	private java.lang.String fzhsName3;
	/** fzhsNum4 */
	private java.lang.String fzhsNum4;
	/** fzhsFinedName4 */
	private java.lang.String fzhsFinedName4;
	/** fzhsNo4 */
	private java.lang.String fzhsNo4;
	/** fzhsName4 */
	private java.lang.String fzhsName4;
	/** fzhsNum5 */
	private java.lang.String fzhsNum5;
	/** fzhsFinedName5 */
	private java.lang.String fzhsFinedName5;
	/** fzhsNo5 */
	private java.lang.String fzhsNo5;
	/** fzhsName5 */
	private java.lang.String fzhsName5;
	/** fzhsNum6 */
	private java.lang.String fzhsNum6;
	/** fzhsFinedName6 */
	private java.lang.String fzhsFinedName6;
	/** fzhsNo6 */
	private java.lang.String fzhsNo6;
	/** fzhsName6 */
	private java.lang.String fzhsName6;
	/** 累计借方 */
	private double ljJf;
	/** 累计贷方 */
	private double ljDf;
	/** 累计借方外币 */
	private double ljJfWb;
	/** 累计贷方外币 */
	private double ljDfWb;
	/** 累计借方数量 */
	private double ljJfSl;
	/** 累计贷方数量 */
	private double ljDfSl;
	/** isRelateFzhs */
	private java.lang.Integer isRelateFzhs;
	/** 账套外键 */
	private java.lang.Integer sdElectResAccId;
	/** 创建时间 */
	private java.util.Date createDate;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdAcctAmountId
	 */
	public void setSdAcctAmountId(java.lang.Integer sdAcctAmountId) {
		this.sdAcctAmountId = sdAcctAmountId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getSdAcctAmountId() {
		return this.sdAcctAmountId;
	}
	/**
	 * 设置 会计科目外键
	 * @param sdAccountId
	 */
	public void setSdAccountId(java.lang.Integer sdAccountId) {
		this.sdAccountId = sdAccountId;
	}
	/**
	 * 会计科目外键
	 * @return
	 */
	public java.lang.Integer getSdAccountId() {
		return this.sdAccountId;
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
	 * 设置 月期初原币余额
	 * @param bamountS
	 */
	public void setBamountS(double bamountS) {
		this.bamountS = bamountS;
	}
	/**
	 * 月期初原币余额
	 * @return
	 */
	public double getBamountS() {
		return this.bamountS;
	}
	/**
	 * 设置 月期初本币余额
	 * @param bamountN
	 */
	public void setBamountN(double bamountN) {
		this.bamountN = bamountN;
	}
	/**
	 * 月期初本币余额
	 * @return
	 */
	public double getBamountN() {
		return this.bamountN;
	}
	/**
	 * 设置 月期初余额方向
	 * @param bamountDc
	 */
	public void setBamountDc(java.lang.String bamountDc) {
		this.bamountDc = bamountDc;
	}
	/**
	 * 月期初余额方向
	 * @return
	 */
	public java.lang.String getBamountDc() {
		return this.bamountDc;
	}
	/**
	 * 设置 借方原币金额
	 * @param damountS
	 */
	public void setDamountS(double damountS) {
		this.damountS = damountS;
	}
	/**
	 * 借方原币金额
	 * @return
	 */
	public double getDamountS() {
		return this.damountS;
	}
	/**
	 * 设置 借方本币金额
	 * @param damountN
	 */
	public void setDamountN(double damountN) {
		this.damountN = damountN;
	}
	/**
	 * 借方本币金额
	 * @return
	 */
	public double getDamountN() {
		return this.damountN;
	}
	/**
	 * 设置 贷方原币金额
	 * @param camountS
	 */
	public void setCamountS(double camountS) {
		this.camountS = camountS;
	}
	/**
	 * 贷方原币金额
	 * @return
	 */
	public double getCamountS() {
		return this.camountS;
	}
	/**
	 * 设置 贷方本币金额
	 * @param camountN
	 */
	public void setCamountN(double camountN) {
		this.camountN = camountN;
	}
	/**
	 * 贷方本币金额
	 * @return
	 */
	public double getCamountN() {
		return this.camountN;
	}
	/**
	 * 设置 月期末原币余额
	 * @param eamountS
	 */
	public void setEamountS(double eamountS) {
		this.eamountS = eamountS;
	}
	/**
	 * 月期末原币余额
	 * @return
	 */
	public double getEamountS() {
		return this.eamountS;
	}
	/**
	 * 设置 月期末本币余额
	 * @param eamountN
	 */
	public void setEamountN(double eamountN) {
		this.eamountN = eamountN;
	}
	/**
	 * 月期末本币余额
	 * @return
	 */
	public double getEamountN() {
		return this.eamountN;
	}
	/**
	 * 设置 月期末余额方向
	 * @param eamountDc
	 */
	public void setEamountDc(java.lang.String eamountDc) {
		this.eamountDc = eamountDc;
	}
	/**
	 * 月期末余额方向
	 * @return
	 */
	public java.lang.String getEamountDc() {
		return this.eamountDc;
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
	 * 设置 期初数量
	 * @param bqty
	 */
	public void setBqty(double bqty) {
		this.bqty = bqty;
	}
	/**
	 * 期初数量
	 * @return
	 */
	public double getBqty() {
		return this.bqty;
	}
	/**
	 * 设置 借方数量
	 * @param dqty
	 */
	public void setDqty(double dqty) {
		this.dqty = dqty;
	}
	/**
	 * 借方数量
	 * @return
	 */
	public double getDqty() {
		return this.dqty;
	}
	/**
	 * 设置 贷方数量
	 * @param cqty
	 */
	public void setCqty(double cqty) {
		this.cqty = cqty;
	}
	/**
	 * 贷方数量
	 * @return
	 */
	public double getCqty() {
		return this.cqty;
	}
	/**
	 * 设置 期末数量
	 * @param eqty
	 */
	public void setEqty(double eqty) {
		this.eqty = eqty;
	}
	/**
	 * 期末数量
	 * @return
	 */
	public double getEqty() {
		return this.eqty;
	}
	/**
	 * 设置 辅助核算编号
	 * @param fzhsNum1
	 */
	public void setFzhsNum1(java.lang.String fzhsNum1) {
		this.fzhsNum1 = fzhsNum1;
	}
	/**
	 * 辅助核算编号
	 * @return
	 */
	public java.lang.String getFzhsNum1() {
		return this.fzhsNum1;
	}
	/**
	 * 设置 辅助核算类别
	 * @param fzhsFinedName1
	 */
	public void setFzhsFinedName1(java.lang.String fzhsFinedName1) {
		this.fzhsFinedName1 = fzhsFinedName1;
	}
	/**
	 * 辅助核算类别
	 * @return
	 */
	public java.lang.String getFzhsFinedName1() {
		return this.fzhsFinedName1;
	}
	/**
	 * 设置 辅助核算编码
	 * @param fzhsNo1
	 */
	public void setFzhsNo1(java.lang.String fzhsNo1) {
		this.fzhsNo1 = fzhsNo1;
	}
	/**
	 * 辅助核算编码
	 * @return
	 */
	public java.lang.String getFzhsNo1() {
		return this.fzhsNo1;
	}
	/**
	 * 设置 辅助核算名称
	 * @param fzhsName1
	 */
	public void setFzhsName1(java.lang.String fzhsName1) {
		this.fzhsName1 = fzhsName1;
	}
	/**
	 * 辅助核算名称
	 * @return
	 */
	public java.lang.String getFzhsName1() {
		return this.fzhsName1;
	}
	/**
	 * 设置 fzhsNum2
	 * @param fzhsNum2
	 */
	public void setFzhsNum2(java.lang.String fzhsNum2) {
		this.fzhsNum2 = fzhsNum2;
	}
	/**
	 * fzhsNum2
	 * @return
	 */
	public java.lang.String getFzhsNum2() {
		return this.fzhsNum2;
	}
	/**
	 * 设置 fzhsFinedName2
	 * @param fzhsFinedName2
	 */
	public void setFzhsFinedName2(java.lang.String fzhsFinedName2) {
		this.fzhsFinedName2 = fzhsFinedName2;
	}
	/**
	 * fzhsFinedName2
	 * @return
	 */
	public java.lang.String getFzhsFinedName2() {
		return this.fzhsFinedName2;
	}
	/**
	 * 设置 fzhsNo2
	 * @param fzhsNo2
	 */
	public void setFzhsNo2(java.lang.String fzhsNo2) {
		this.fzhsNo2 = fzhsNo2;
	}
	/**
	 * fzhsNo2
	 * @return
	 */
	public java.lang.String getFzhsNo2() {
		return this.fzhsNo2;
	}
	/**
	 * 设置 fzhsName2
	 * @param fzhsName2
	 */
	public void setFzhsName2(java.lang.String fzhsName2) {
		this.fzhsName2 = fzhsName2;
	}
	/**
	 * fzhsName2
	 * @return
	 */
	public java.lang.String getFzhsName2() {
		return this.fzhsName2;
	}
	/**
	 * 设置 fzhsNum3
	 * @param fzhsNum3
	 */
	public void setFzhsNum3(java.lang.String fzhsNum3) {
		this.fzhsNum3 = fzhsNum3;
	}
	/**
	 * fzhsNum3
	 * @return
	 */
	public java.lang.String getFzhsNum3() {
		return this.fzhsNum3;
	}
	/**
	 * 设置 fzhsFinedName3
	 * @param fzhsFinedName3
	 */
	public void setFzhsFinedName3(java.lang.String fzhsFinedName3) {
		this.fzhsFinedName3 = fzhsFinedName3;
	}
	/**
	 * fzhsFinedName3
	 * @return
	 */
	public java.lang.String getFzhsFinedName3() {
		return this.fzhsFinedName3;
	}
	/**
	 * 设置 fzhsNo3
	 * @param fzhsNo3
	 */
	public void setFzhsNo3(java.lang.String fzhsNo3) {
		this.fzhsNo3 = fzhsNo3;
	}
	/**
	 * fzhsNo3
	 * @return
	 */
	public java.lang.String getFzhsNo3() {
		return this.fzhsNo3;
	}
	/**
	 * 设置 fzhsName3
	 * @param fzhsName3
	 */
	public void setFzhsName3(java.lang.String fzhsName3) {
		this.fzhsName3 = fzhsName3;
	}
	/**
	 * fzhsName3
	 * @return
	 */
	public java.lang.String getFzhsName3() {
		return this.fzhsName3;
	}
	/**
	 * 设置 fzhsNum4
	 * @param fzhsNum4
	 */
	public void setFzhsNum4(java.lang.String fzhsNum4) {
		this.fzhsNum4 = fzhsNum4;
	}
	/**
	 * fzhsNum4
	 * @return
	 */
	public java.lang.String getFzhsNum4() {
		return this.fzhsNum4;
	}
	/**
	 * 设置 fzhsFinedName4
	 * @param fzhsFinedName4
	 */
	public void setFzhsFinedName4(java.lang.String fzhsFinedName4) {
		this.fzhsFinedName4 = fzhsFinedName4;
	}
	/**
	 * fzhsFinedName4
	 * @return
	 */
	public java.lang.String getFzhsFinedName4() {
		return this.fzhsFinedName4;
	}
	/**
	 * 设置 fzhsNo4
	 * @param fzhsNo4
	 */
	public void setFzhsNo4(java.lang.String fzhsNo4) {
		this.fzhsNo4 = fzhsNo4;
	}
	/**
	 * fzhsNo4
	 * @return
	 */
	public java.lang.String getFzhsNo4() {
		return this.fzhsNo4;
	}
	/**
	 * 设置 fzhsName4
	 * @param fzhsName4
	 */
	public void setFzhsName4(java.lang.String fzhsName4) {
		this.fzhsName4 = fzhsName4;
	}
	/**
	 * fzhsName4
	 * @return
	 */
	public java.lang.String getFzhsName4() {
		return this.fzhsName4;
	}
	/**
	 * 设置 fzhsNum5
	 * @param fzhsNum5
	 */
	public void setFzhsNum5(java.lang.String fzhsNum5) {
		this.fzhsNum5 = fzhsNum5;
	}
	/**
	 * fzhsNum5
	 * @return
	 */
	public java.lang.String getFzhsNum5() {
		return this.fzhsNum5;
	}
	/**
	 * 设置 fzhsFinedName5
	 * @param fzhsFinedName5
	 */
	public void setFzhsFinedName5(java.lang.String fzhsFinedName5) {
		this.fzhsFinedName5 = fzhsFinedName5;
	}
	/**
	 * fzhsFinedName5
	 * @return
	 */
	public java.lang.String getFzhsFinedName5() {
		return this.fzhsFinedName5;
	}
	/**
	 * 设置 fzhsNo5
	 * @param fzhsNo5
	 */
	public void setFzhsNo5(java.lang.String fzhsNo5) {
		this.fzhsNo5 = fzhsNo5;
	}
	/**
	 * fzhsNo5
	 * @return
	 */
	public java.lang.String getFzhsNo5() {
		return this.fzhsNo5;
	}
	/**
	 * 设置 fzhsName5
	 * @param fzhsName5
	 */
	public void setFzhsName5(java.lang.String fzhsName5) {
		this.fzhsName5 = fzhsName5;
	}
	/**
	 * fzhsName5
	 * @return
	 */
	public java.lang.String getFzhsName5() {
		return this.fzhsName5;
	}
	/**
	 * 设置 fzhsNum6
	 * @param fzhsNum6
	 */
	public void setFzhsNum6(java.lang.String fzhsNum6) {
		this.fzhsNum6 = fzhsNum6;
	}
	/**
	 * fzhsNum6
	 * @return
	 */
	public java.lang.String getFzhsNum6() {
		return this.fzhsNum6;
	}
	/**
	 * 设置 fzhsFinedName6
	 * @param fzhsFinedName6
	 */
	public void setFzhsFinedName6(java.lang.String fzhsFinedName6) {
		this.fzhsFinedName6 = fzhsFinedName6;
	}
	/**
	 * fzhsFinedName6
	 * @return
	 */
	public java.lang.String getFzhsFinedName6() {
		return this.fzhsFinedName6;
	}
	/**
	 * 设置 fzhsNo6
	 * @param fzhsNo6
	 */
	public void setFzhsNo6(java.lang.String fzhsNo6) {
		this.fzhsNo6 = fzhsNo6;
	}
	/**
	 * fzhsNo6
	 * @return
	 */
	public java.lang.String getFzhsNo6() {
		return this.fzhsNo6;
	}
	/**
	 * 设置 fzhsName6
	 * @param fzhsName6
	 */
	public void setFzhsName6(java.lang.String fzhsName6) {
		this.fzhsName6 = fzhsName6;
	}
	/**
	 * fzhsName6
	 * @return
	 */
	public java.lang.String getFzhsName6() {
		return this.fzhsName6;
	}
	/**
	 * 设置 累计借方
	 * @param ljJf
	 */
	public void setLjJf(double ljJf) {
		this.ljJf = ljJf;
	}
	/**
	 * 累计借方
	 * @return
	 */
	public double getLjJf() {
		return this.ljJf;
	}
	/**
	 * 设置 累计贷方
	 * @param ljDf
	 */
	public void setLjDf(double ljDf) {
		this.ljDf = ljDf;
	}
	/**
	 * 累计贷方
	 * @return
	 */
	public double getLjDf() {
		return this.ljDf;
	}
	/**
	 * 设置 累计借方外币
	 * @param ljJfWb
	 */
	public void setLjJfWb(double ljJfWb) {
		this.ljJfWb = ljJfWb;
	}
	/**
	 * 累计借方外币
	 * @return
	 */
	public double getLjJfWb() {
		return this.ljJfWb;
	}
	/**
	 * 设置 累计贷方外币
	 * @param ljDfWb
	 */
	public void setLjDfWb(double ljDfWb) {
		this.ljDfWb = ljDfWb;
	}
	/**
	 * 累计贷方外币
	 * @return
	 */
	public double getLjDfWb() {
		return this.ljDfWb;
	}
	/**
	 * 设置 累计借方数量
	 * @param ljJfSl
	 */
	public void setLjJfSl(double ljJfSl) {
		this.ljJfSl = ljJfSl;
	}
	/**
	 * 累计借方数量
	 * @return
	 */
	public double getLjJfSl() {
		return this.ljJfSl;
	}
	/**
	 * 设置 累计贷方数量
	 * @param ljDfSl
	 */
	public void setLjDfSl(double ljDfSl) {
		this.ljDfSl = ljDfSl;
	}
	/**
	 * 累计贷方数量
	 * @return
	 */
	public double getLjDfSl() {
		return this.ljDfSl;
	}
	/**
	 * 设置 isRelateFzhs
	 * @param isRelateFzhs
	 */
	public void setIsRelateFzhs(java.lang.Integer isRelateFzhs) {
		this.isRelateFzhs = isRelateFzhs;
	}
	/**
	 * isRelateFzhs
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
			.append("SdAcctAmountId",getSdAcctAmountId())
			.append("SdAccountId",getSdAccountId())
			.append("AcctName",getAcctName())
			.append("AcctId",getAcctId())
			.append("Fyear",getFyear())
			.append("PerdNumber",getPerdNumber())
			.append("CurNo",getCurNo())
			.append("CurName",getCurName())
			.append("BamountS",getBamountS())
			.append("BamountN",getBamountN())
			.append("BamountDc",getBamountDc())
			.append("DamountS",getDamountS())
			.append("DamountN",getDamountN())
			.append("CamountS",getCamountS())
			.append("CamountN",getCamountN())
			.append("EamountS",getEamountS())
			.append("EamountN",getEamountN())
			.append("EamountDc",getEamountDc())
			.append("UnitId",getUnitId())
			.append("Bqty",getBqty())
			.append("Dqty",getDqty())
			.append("Cqty",getCqty())
			.append("Eqty",getEqty())
			.append("FzhsNum1",getFzhsNum1())
			.append("FzhsFinedName1",getFzhsFinedName1())
			.append("FzhsNo1",getFzhsNo1())
			.append("FzhsName1",getFzhsName1())
			.append("FzhsNum2",getFzhsNum2())
			.append("FzhsFinedName2",getFzhsFinedName2())
			.append("FzhsNo2",getFzhsNo2())
			.append("FzhsName2",getFzhsName2())
			.append("FzhsNum3",getFzhsNum3())
			.append("FzhsFinedName3",getFzhsFinedName3())
			.append("FzhsNo3",getFzhsNo3())
			.append("FzhsName3",getFzhsName3())
			.append("FzhsNum4",getFzhsNum4())
			.append("FzhsFinedName4",getFzhsFinedName4())
			.append("FzhsNo4",getFzhsNo4())
			.append("FzhsName4",getFzhsName4())
			.append("FzhsNum5",getFzhsNum5())
			.append("FzhsFinedName5",getFzhsFinedName5())
			.append("FzhsNo5",getFzhsNo5())
			.append("FzhsName5",getFzhsName5())
			.append("FzhsNum6",getFzhsNum6())
			.append("FzhsFinedName6",getFzhsFinedName6())
			.append("FzhsNo6",getFzhsNo6())
			.append("FzhsName6",getFzhsName6())
			.append("LjJf",getLjJf())
			.append("LjDf",getLjDf())
			.append("LjJfWb",getLjJfWb())
			.append("LjDfWb",getLjDfWb())
			.append("LjJfSl",getLjJfSl())
			.append("LjDfSl",getLjDfSl())
			.append("IsRelateFzhs",getIsRelateFzhs())
			.append("SdElectResAccId",getSdElectResAccId())
			.append("CreateDate",getCreateDate())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdAcctAmountId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdAcctAmount == false) return false;
		if(this == obj) return true;
		SdAcctAmount other = (SdAcctAmount)obj;
		return new EqualsBuilder()
			.append(getSdAcctAmountId(),other.getSdAcctAmountId())
			.isEquals();
	}
}

