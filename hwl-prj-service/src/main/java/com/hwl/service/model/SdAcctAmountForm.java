
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
public class SdAcctAmountForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String sdAcctAmountId;
	/** 会计科目外键 */
	private String sdAccountId;
	/** 科目名称 */
	private String acctName;
	/** 科目编码 */
	private String acctId;
	/** 会计年度 */
	private String fyear;
	/** 会计期间号 */
	private String perdNumber;
	/** 币种编码 */
	private String curNo;
	/** 币种名称 */
	private String curName;
	/** 月期初原币余额 */
	private String bamountS;
	/** 月期初本币余额 */
	private String bamountN;
	/** 月期初余额方向 */
	private String bamountDc;
	/** 借方原币金额 */
	private String damountS;
	/** 借方本币金额 */
	private String damountN;
	/** 贷方原币金额 */
	private String camountS;
	/** 贷方本币金额 */
	private String camountN;
	/** 月期末原币余额 */
	private String eamountS;
	/** 月期末本币余额 */
	private String eamountN;
	/** 月期末余额方向 */
	private String eamountDc;
	/** 计量单位 */
	private String unitId;
	/** 期初数量 */
	private String bqty;
	/** 借方数量 */
	private String dqty;
	/** 贷方数量 */
	private String cqty;
	/** 期末数量 */
	private String eqty;
	/** 辅助核算编号 */
	private String fzhsNum1;
	/** 辅助核算类别 */
	private String fzhsFinedName1;
	/** 辅助核算编码 */
	private String fzhsNo1;
	/** 辅助核算名称 */
	private String fzhsName1;
	/** fzhsNum2 */
	private String fzhsNum2;
	/** fzhsFinedName2 */
	private String fzhsFinedName2;
	/** fzhsNo2 */
	private String fzhsNo2;
	/** fzhsName2 */
	private String fzhsName2;
	/** fzhsNum3 */
	private String fzhsNum3;
	/** fzhsFinedName3 */
	private String fzhsFinedName3;
	/** fzhsNo3 */
	private String fzhsNo3;
	/** fzhsName3 */
	private String fzhsName3;
	/** fzhsNum4 */
	private String fzhsNum4;
	/** fzhsFinedName4 */
	private String fzhsFinedName4;
	/** fzhsNo4 */
	private String fzhsNo4;
	/** fzhsName4 */
	private String fzhsName4;
	/** fzhsNum5 */
	private String fzhsNum5;
	/** fzhsFinedName5 */
	private String fzhsFinedName5;
	/** fzhsNo5 */
	private String fzhsNo5;
	/** fzhsName5 */
	private String fzhsName5;
	/** fzhsNum6 */
	private String fzhsNum6;
	/** fzhsFinedName6 */
	private String fzhsFinedName6;
	/** fzhsNo6 */
	private String fzhsNo6;
	/** fzhsName6 */
	private String fzhsName6;
	/** 累计借方 */
	private String ljJf;
	/** 累计贷方 */
	private String ljDf;
	/** 累计借方外币 */
	private String ljJfWb;
	/** 累计贷方外币 */
	private String ljDfWb;
	/** 累计借方数量 */
	private String ljJfSl;
	/** 累计贷方数量 */
	private String ljDfSl;
	/** isRelateFzhs */
	private String isRelateFzhs;
	/** 账套外键 */
	private String sdElectResAccId;
	/** 创建时间 */
	private String createDate;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdAcctAmountId
	 */
	public void setSdAcctAmountId(String sdAcctAmountId) {
		this.sdAcctAmountId = sdAcctAmountId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getSdAcctAmountId() {
		return this.sdAcctAmountId;
	}
	/**
	 * 设置 会计科目外键
	 * @param sdAccountId
	 */
	public void setSdAccountId(String sdAccountId) {
		this.sdAccountId = sdAccountId;
	}
	/**
	 * 会计科目外键
	 * @return
	 */
	public String getSdAccountId() {
		return this.sdAccountId;
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
	 * 设置 月期初原币余额
	 * @param bamountS
	 */
	public void setBamountS(String bamountS) {
		this.bamountS = bamountS;
	}
	/**
	 * 月期初原币余额
	 * @return
	 */
	public String getBamountS() {
		return this.bamountS;
	}
	/**
	 * 设置 月期初本币余额
	 * @param bamountN
	 */
	public void setBamountN(String bamountN) {
		this.bamountN = bamountN;
	}
	/**
	 * 月期初本币余额
	 * @return
	 */
	public String getBamountN() {
		return this.bamountN;
	}
	/**
	 * 设置 月期初余额方向
	 * @param bamountDc
	 */
	public void setBamountDc(String bamountDc) {
		this.bamountDc = bamountDc;
	}
	/**
	 * 月期初余额方向
	 * @return
	 */
	public String getBamountDc() {
		return this.bamountDc;
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
	 * 设置 月期末原币余额
	 * @param eamountS
	 */
	public void setEamountS(String eamountS) {
		this.eamountS = eamountS;
	}
	/**
	 * 月期末原币余额
	 * @return
	 */
	public String getEamountS() {
		return this.eamountS;
	}
	/**
	 * 设置 月期末本币余额
	 * @param eamountN
	 */
	public void setEamountN(String eamountN) {
		this.eamountN = eamountN;
	}
	/**
	 * 月期末本币余额
	 * @return
	 */
	public String getEamountN() {
		return this.eamountN;
	}
	/**
	 * 设置 月期末余额方向
	 * @param eamountDc
	 */
	public void setEamountDc(String eamountDc) {
		this.eamountDc = eamountDc;
	}
	/**
	 * 月期末余额方向
	 * @return
	 */
	public String getEamountDc() {
		return this.eamountDc;
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
	 * 设置 期初数量
	 * @param bqty
	 */
	public void setBqty(String bqty) {
		this.bqty = bqty;
	}
	/**
	 * 期初数量
	 * @return
	 */
	public String getBqty() {
		return this.bqty;
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
	 * 设置 期末数量
	 * @param eqty
	 */
	public void setEqty(String eqty) {
		this.eqty = eqty;
	}
	/**
	 * 期末数量
	 * @return
	 */
	public String getEqty() {
		return this.eqty;
	}
	/**
	 * 设置 辅助核算编号
	 * @param fzhsNum1
	 */
	public void setFzhsNum1(String fzhsNum1) {
		this.fzhsNum1 = fzhsNum1;
	}
	/**
	 * 辅助核算编号
	 * @return
	 */
	public String getFzhsNum1() {
		return this.fzhsNum1;
	}
	/**
	 * 设置 辅助核算类别
	 * @param fzhsFinedName1
	 */
	public void setFzhsFinedName1(String fzhsFinedName1) {
		this.fzhsFinedName1 = fzhsFinedName1;
	}
	/**
	 * 辅助核算类别
	 * @return
	 */
	public String getFzhsFinedName1() {
		return this.fzhsFinedName1;
	}
	/**
	 * 设置 辅助核算编码
	 * @param fzhsNo1
	 */
	public void setFzhsNo1(String fzhsNo1) {
		this.fzhsNo1 = fzhsNo1;
	}
	/**
	 * 辅助核算编码
	 * @return
	 */
	public String getFzhsNo1() {
		return this.fzhsNo1;
	}
	/**
	 * 设置 辅助核算名称
	 * @param fzhsName1
	 */
	public void setFzhsName1(String fzhsName1) {
		this.fzhsName1 = fzhsName1;
	}
	/**
	 * 辅助核算名称
	 * @return
	 */
	public String getFzhsName1() {
		return this.fzhsName1;
	}
	/**
	 * 设置 fzhsNum2
	 * @param fzhsNum2
	 */
	public void setFzhsNum2(String fzhsNum2) {
		this.fzhsNum2 = fzhsNum2;
	}
	/**
	 * fzhsNum2
	 * @return
	 */
	public String getFzhsNum2() {
		return this.fzhsNum2;
	}
	/**
	 * 设置 fzhsFinedName2
	 * @param fzhsFinedName2
	 */
	public void setFzhsFinedName2(String fzhsFinedName2) {
		this.fzhsFinedName2 = fzhsFinedName2;
	}
	/**
	 * fzhsFinedName2
	 * @return
	 */
	public String getFzhsFinedName2() {
		return this.fzhsFinedName2;
	}
	/**
	 * 设置 fzhsNo2
	 * @param fzhsNo2
	 */
	public void setFzhsNo2(String fzhsNo2) {
		this.fzhsNo2 = fzhsNo2;
	}
	/**
	 * fzhsNo2
	 * @return
	 */
	public String getFzhsNo2() {
		return this.fzhsNo2;
	}
	/**
	 * 设置 fzhsName2
	 * @param fzhsName2
	 */
	public void setFzhsName2(String fzhsName2) {
		this.fzhsName2 = fzhsName2;
	}
	/**
	 * fzhsName2
	 * @return
	 */
	public String getFzhsName2() {
		return this.fzhsName2;
	}
	/**
	 * 设置 fzhsNum3
	 * @param fzhsNum3
	 */
	public void setFzhsNum3(String fzhsNum3) {
		this.fzhsNum3 = fzhsNum3;
	}
	/**
	 * fzhsNum3
	 * @return
	 */
	public String getFzhsNum3() {
		return this.fzhsNum3;
	}
	/**
	 * 设置 fzhsFinedName3
	 * @param fzhsFinedName3
	 */
	public void setFzhsFinedName3(String fzhsFinedName3) {
		this.fzhsFinedName3 = fzhsFinedName3;
	}
	/**
	 * fzhsFinedName3
	 * @return
	 */
	public String getFzhsFinedName3() {
		return this.fzhsFinedName3;
	}
	/**
	 * 设置 fzhsNo3
	 * @param fzhsNo3
	 */
	public void setFzhsNo3(String fzhsNo3) {
		this.fzhsNo3 = fzhsNo3;
	}
	/**
	 * fzhsNo3
	 * @return
	 */
	public String getFzhsNo3() {
		return this.fzhsNo3;
	}
	/**
	 * 设置 fzhsName3
	 * @param fzhsName3
	 */
	public void setFzhsName3(String fzhsName3) {
		this.fzhsName3 = fzhsName3;
	}
	/**
	 * fzhsName3
	 * @return
	 */
	public String getFzhsName3() {
		return this.fzhsName3;
	}
	/**
	 * 设置 fzhsNum4
	 * @param fzhsNum4
	 */
	public void setFzhsNum4(String fzhsNum4) {
		this.fzhsNum4 = fzhsNum4;
	}
	/**
	 * fzhsNum4
	 * @return
	 */
	public String getFzhsNum4() {
		return this.fzhsNum4;
	}
	/**
	 * 设置 fzhsFinedName4
	 * @param fzhsFinedName4
	 */
	public void setFzhsFinedName4(String fzhsFinedName4) {
		this.fzhsFinedName4 = fzhsFinedName4;
	}
	/**
	 * fzhsFinedName4
	 * @return
	 */
	public String getFzhsFinedName4() {
		return this.fzhsFinedName4;
	}
	/**
	 * 设置 fzhsNo4
	 * @param fzhsNo4
	 */
	public void setFzhsNo4(String fzhsNo4) {
		this.fzhsNo4 = fzhsNo4;
	}
	/**
	 * fzhsNo4
	 * @return
	 */
	public String getFzhsNo4() {
		return this.fzhsNo4;
	}
	/**
	 * 设置 fzhsName4
	 * @param fzhsName4
	 */
	public void setFzhsName4(String fzhsName4) {
		this.fzhsName4 = fzhsName4;
	}
	/**
	 * fzhsName4
	 * @return
	 */
	public String getFzhsName4() {
		return this.fzhsName4;
	}
	/**
	 * 设置 fzhsNum5
	 * @param fzhsNum5
	 */
	public void setFzhsNum5(String fzhsNum5) {
		this.fzhsNum5 = fzhsNum5;
	}
	/**
	 * fzhsNum5
	 * @return
	 */
	public String getFzhsNum5() {
		return this.fzhsNum5;
	}
	/**
	 * 设置 fzhsFinedName5
	 * @param fzhsFinedName5
	 */
	public void setFzhsFinedName5(String fzhsFinedName5) {
		this.fzhsFinedName5 = fzhsFinedName5;
	}
	/**
	 * fzhsFinedName5
	 * @return
	 */
	public String getFzhsFinedName5() {
		return this.fzhsFinedName5;
	}
	/**
	 * 设置 fzhsNo5
	 * @param fzhsNo5
	 */
	public void setFzhsNo5(String fzhsNo5) {
		this.fzhsNo5 = fzhsNo5;
	}
	/**
	 * fzhsNo5
	 * @return
	 */
	public String getFzhsNo5() {
		return this.fzhsNo5;
	}
	/**
	 * 设置 fzhsName5
	 * @param fzhsName5
	 */
	public void setFzhsName5(String fzhsName5) {
		this.fzhsName5 = fzhsName5;
	}
	/**
	 * fzhsName5
	 * @return
	 */
	public String getFzhsName5() {
		return this.fzhsName5;
	}
	/**
	 * 设置 fzhsNum6
	 * @param fzhsNum6
	 */
	public void setFzhsNum6(String fzhsNum6) {
		this.fzhsNum6 = fzhsNum6;
	}
	/**
	 * fzhsNum6
	 * @return
	 */
	public String getFzhsNum6() {
		return this.fzhsNum6;
	}
	/**
	 * 设置 fzhsFinedName6
	 * @param fzhsFinedName6
	 */
	public void setFzhsFinedName6(String fzhsFinedName6) {
		this.fzhsFinedName6 = fzhsFinedName6;
	}
	/**
	 * fzhsFinedName6
	 * @return
	 */
	public String getFzhsFinedName6() {
		return this.fzhsFinedName6;
	}
	/**
	 * 设置 fzhsNo6
	 * @param fzhsNo6
	 */
	public void setFzhsNo6(String fzhsNo6) {
		this.fzhsNo6 = fzhsNo6;
	}
	/**
	 * fzhsNo6
	 * @return
	 */
	public String getFzhsNo6() {
		return this.fzhsNo6;
	}
	/**
	 * 设置 fzhsName6
	 * @param fzhsName6
	 */
	public void setFzhsName6(String fzhsName6) {
		this.fzhsName6 = fzhsName6;
	}
	/**
	 * fzhsName6
	 * @return
	 */
	public String getFzhsName6() {
		return this.fzhsName6;
	}
	/**
	 * 设置 累计借方
	 * @param ljJf
	 */
	public void setLjJf(String ljJf) {
		this.ljJf = ljJf;
	}
	/**
	 * 累计借方
	 * @return
	 */
	public String getLjJf() {
		return this.ljJf;
	}
	/**
	 * 设置 累计贷方
	 * @param ljDf
	 */
	public void setLjDf(String ljDf) {
		this.ljDf = ljDf;
	}
	/**
	 * 累计贷方
	 * @return
	 */
	public String getLjDf() {
		return this.ljDf;
	}
	/**
	 * 设置 累计借方外币
	 * @param ljJfWb
	 */
	public void setLjJfWb(String ljJfWb) {
		this.ljJfWb = ljJfWb;
	}
	/**
	 * 累计借方外币
	 * @return
	 */
	public String getLjJfWb() {
		return this.ljJfWb;
	}
	/**
	 * 设置 累计贷方外币
	 * @param ljDfWb
	 */
	public void setLjDfWb(String ljDfWb) {
		this.ljDfWb = ljDfWb;
	}
	/**
	 * 累计贷方外币
	 * @return
	 */
	public String getLjDfWb() {
		return this.ljDfWb;
	}
	/**
	 * 设置 累计借方数量
	 * @param ljJfSl
	 */
	public void setLjJfSl(String ljJfSl) {
		this.ljJfSl = ljJfSl;
	}
	/**
	 * 累计借方数量
	 * @return
	 */
	public String getLjJfSl() {
		return this.ljJfSl;
	}
	/**
	 * 设置 累计贷方数量
	 * @param ljDfSl
	 */
	public void setLjDfSl(String ljDfSl) {
		this.ljDfSl = ljDfSl;
	}
	/**
	 * 累计贷方数量
	 * @return
	 */
	public String getLjDfSl() {
		return this.ljDfSl;
	}
	/**
	 * 设置 isRelateFzhs
	 * @param isRelateFzhs
	 */
	public void setIsRelateFzhs(String isRelateFzhs) {
		this.isRelateFzhs = isRelateFzhs;
	}
	/**
	 * isRelateFzhs
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
  
	public void setSdAcctAmount(SdAcctAmount sdAcctAmount){
		if(sdAcctAmount==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdAcctAmountId=sdAcctAmount.getSdAcctAmountId()==null?"":String.valueOf(sdAcctAmount.getSdAcctAmountId());	
		this.sdAccountId=sdAcctAmount.getSdAccountId()==null?"":String.valueOf(sdAcctAmount.getSdAccountId());	
		this.acctName=sdAcctAmount.getAcctName()==null?"":sdAcctAmount.getAcctName();	
		this.acctId=sdAcctAmount.getAcctId()==null?"":String.valueOf(sdAcctAmount.getAcctId());	
		this.fyear=sdAcctAmount.getFyear()==null?"":sdAcctAmount.getFyear();	
		this.perdNumber=sdAcctAmount.getPerdNumber()==null?"":String.valueOf(sdAcctAmount.getPerdNumber());	
		this.curNo=sdAcctAmount.getCurNo()==null?"":sdAcctAmount.getCurNo();	
		this.curName=sdAcctAmount.getCurName()==null?"":sdAcctAmount.getCurName();	
//		this.bamountS=sdAcctAmount.getBamountS()==null?"":sdAcctAmount.getBamountS();	
//		this.bamountN=sdAcctAmount.getBamountN()==null?"":sdAcctAmount.getBamountN();	
//		this.bamountDc=sdAcctAmount.getBamountDc()==null?"":sdAcctAmount.getBamountDc();	
//		this.damountS=sdAcctAmount.getDamountS()==null?"":sdAcctAmount.getDamountS();	
//		this.damountN=sdAcctAmount.getDamountN()==null?"":sdAcctAmount.getDamountN();	
//		this.camountS=sdAcctAmount.getCamountS()==null?"":sdAcctAmount.getCamountS();	
//		this.camountN=sdAcctAmount.getCamountN()==null?"":sdAcctAmount.getCamountN();	
//		this.eamountS=sdAcctAmount.getEamountS()==null?"":sdAcctAmount.getEamountS();	
//		this.eamountN=sdAcctAmount.getEamountN()==null?"":sdAcctAmount.getEamountN();	
		this.eamountDc=sdAcctAmount.getEamountDc()==null?"":sdAcctAmount.getEamountDc();	
		this.unitId=sdAcctAmount.getUnitId()==null?"":sdAcctAmount.getUnitId();	
//		this.bqty=sdAcctAmount.getBqty()==null?"":sdAcctAmount.getBqty();	
//		this.dqty=sdAcctAmount.getDqty()==null?"":sdAcctAmount.getDqty();	
//		this.cqty=sdAcctAmount.getCqty()==null?"":sdAcctAmount.getCqty();	
//		this.eqty=sdAcctAmount.getEqty()==null?"":sdAcctAmount.getEqty();	
		this.fzhsNum1=sdAcctAmount.getFzhsNum1()==null?"":sdAcctAmount.getFzhsNum1();	
		this.fzhsFinedName1=sdAcctAmount.getFzhsFinedName1()==null?"":sdAcctAmount.getFzhsFinedName1();	
		this.fzhsNo1=sdAcctAmount.getFzhsNo1()==null?"":sdAcctAmount.getFzhsNo1();	
		this.fzhsName1=sdAcctAmount.getFzhsName1()==null?"":sdAcctAmount.getFzhsName1();	
		this.fzhsNum2=sdAcctAmount.getFzhsNum2()==null?"":sdAcctAmount.getFzhsNum2();	
		this.fzhsFinedName2=sdAcctAmount.getFzhsFinedName2()==null?"":sdAcctAmount.getFzhsFinedName2();	
		this.fzhsNo2=sdAcctAmount.getFzhsNo2()==null?"":sdAcctAmount.getFzhsNo2();	
		this.fzhsName2=sdAcctAmount.getFzhsName2()==null?"":sdAcctAmount.getFzhsName2();	
		this.fzhsNum3=sdAcctAmount.getFzhsNum3()==null?"":sdAcctAmount.getFzhsNum3();	
		this.fzhsFinedName3=sdAcctAmount.getFzhsFinedName3()==null?"":sdAcctAmount.getFzhsFinedName3();	
		this.fzhsNo3=sdAcctAmount.getFzhsNo3()==null?"":sdAcctAmount.getFzhsNo3();	
		this.fzhsName3=sdAcctAmount.getFzhsName3()==null?"":sdAcctAmount.getFzhsName3();	
		this.fzhsNum4=sdAcctAmount.getFzhsNum4()==null?"":sdAcctAmount.getFzhsNum4();	
		this.fzhsFinedName4=sdAcctAmount.getFzhsFinedName4()==null?"":sdAcctAmount.getFzhsFinedName4();	
		this.fzhsNo4=sdAcctAmount.getFzhsNo4()==null?"":sdAcctAmount.getFzhsNo4();	
		this.fzhsName4=sdAcctAmount.getFzhsName4()==null?"":sdAcctAmount.getFzhsName4();	
		this.fzhsNum5=sdAcctAmount.getFzhsNum5()==null?"":sdAcctAmount.getFzhsNum5();	
		this.fzhsFinedName5=sdAcctAmount.getFzhsFinedName5()==null?"":sdAcctAmount.getFzhsFinedName5();	
		this.fzhsNo5=sdAcctAmount.getFzhsNo5()==null?"":sdAcctAmount.getFzhsNo5();	
		this.fzhsName5=sdAcctAmount.getFzhsName5()==null?"":sdAcctAmount.getFzhsName5();	
		this.fzhsNum6=sdAcctAmount.getFzhsNum6()==null?"":sdAcctAmount.getFzhsNum6();	
		this.fzhsFinedName6=sdAcctAmount.getFzhsFinedName6()==null?"":sdAcctAmount.getFzhsFinedName6();	
		this.fzhsNo6=sdAcctAmount.getFzhsNo6()==null?"":sdAcctAmount.getFzhsNo6();	
		this.fzhsName6=sdAcctAmount.getFzhsName6()==null?"":sdAcctAmount.getFzhsName6();	
//		this.ljJf=sdAcctAmount.getLjJf()==null?"":sdAcctAmount.getLjJf();	
//		this.ljDf=sdAcctAmount.getLjDf()==null?"":sdAcctAmount.getLjDf();	
//		this.ljJfWb=sdAcctAmount.getLjJfWb()==null?"":sdAcctAmount.getLjJfWb();	
//		this.ljDfWb=sdAcctAmount.getLjDfWb()==null?"":sdAcctAmount.getLjDfWb();	
//		this.ljJfSl=sdAcctAmount.getLjJfSl()==null?"":sdAcctAmount.getLjJfSl();	
//		this.ljDfSl=sdAcctAmount.getLjDfSl()==null?"":sdAcctAmount.getLjDfSl();	
		this.isRelateFzhs=sdAcctAmount.getIsRelateFzhs()==null?"":String.valueOf(sdAcctAmount.getIsRelateFzhs());	
		this.sdElectResAccId=sdAcctAmount.getSdElectResAccId()==null?"":String.valueOf(sdAcctAmount.getSdElectResAccId());	
		this.createDate=sdAcctAmount.getCreateDate()==null?"":df.format(sdAcctAmount.getCreateDate());	
		this.page=sdAcctAmount.getPage();
	}
  
	public SdAcctAmount getSdAcctAmount(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdAcctAmount sdAcctAmount=new SdAcctAmount();
		sdAcctAmount.setSdAcctAmountId(this.sdAcctAmountId==null||this.sdAcctAmountId.length()==0?0:Integer.parseInt(this.sdAcctAmountId));  
		sdAcctAmount.setSdAccountId(this.sdAccountId==null||this.sdAccountId.length()==0?0:Integer.parseInt(this.sdAccountId));  
		sdAcctAmount.setAcctName(this.acctName==null||this.acctName.length()==0?"":this.acctName);  
//		sdAcctAmount.setAcctId(this.acctId==null||this.acctId.length()==0?0:Integer.parseInt(this.acctId));  
		sdAcctAmount.setFyear(this.fyear==null||this.fyear.length()==0?"":this.fyear);  
		sdAcctAmount.setPerdNumber(this.perdNumber==null||this.perdNumber.length()==0?0:Integer.parseInt(this.perdNumber));  
		sdAcctAmount.setCurNo(this.curNo==null||this.curNo.length()==0?"":this.curNo);  
		sdAcctAmount.setCurName(this.curName==null||this.curName.length()==0?"":this.curName);  
//		sdAcctAmount.setBamountS(this.bamountS==null||this.bamountS.length()==0?"":this.bamountS);  
//		sdAcctAmount.setBamountN(this.bamountN==null||this.bamountN.length()==0?"":this.bamountN);  
//		sdAcctAmount.setBamountDc(this.bamountDc==null||this.bamountDc.length()==0?"":this.bamountDc);  
//		sdAcctAmount.setDamountS(this.damountS==null||this.damountS.length()==0?"":this.damountS);  
//		sdAcctAmount.setDamountN(this.damountN==null||this.damountN.length()==0?"":this.damountN);  
//		sdAcctAmount.setCamountS(this.camountS==null||this.camountS.length()==0?"":this.camountS);  
//		sdAcctAmount.setCamountN(this.camountN==null||this.camountN.length()==0?"":this.camountN);  
//		sdAcctAmount.setEamountS(this.eamountS==null||this.eamountS.length()==0?"":this.eamountS);  
//		sdAcctAmount.setEamountN(this.eamountN==null||this.eamountN.length()==0?"":this.eamountN);  
		sdAcctAmount.setEamountDc(this.eamountDc==null||this.eamountDc.length()==0?"":this.eamountDc);  
		sdAcctAmount.setUnitId(this.unitId==null||this.unitId.length()==0?"":this.unitId);  
//		sdAcctAmount.setBqty(this.bqty==null||this.bqty.length()==0?"":this.bqty);  
//		sdAcctAmount.setDqty(this.dqty==null||this.dqty.length()==0?"":this.dqty);  
//		sdAcctAmount.setCqty(this.cqty==null||this.cqty.length()==0?"":this.cqty);  
//		sdAcctAmount.setEqty(this.eqty==null||this.eqty.length()==0?"":this.eqty);  
		sdAcctAmount.setFzhsNum1(this.fzhsNum1==null||this.fzhsNum1.length()==0?"":this.fzhsNum1);  
		sdAcctAmount.setFzhsFinedName1(this.fzhsFinedName1==null||this.fzhsFinedName1.length()==0?"":this.fzhsFinedName1);  
		sdAcctAmount.setFzhsNo1(this.fzhsNo1==null||this.fzhsNo1.length()==0?"":this.fzhsNo1);  
		sdAcctAmount.setFzhsName1(this.fzhsName1==null||this.fzhsName1.length()==0?"":this.fzhsName1);  
		sdAcctAmount.setFzhsNum2(this.fzhsNum2==null||this.fzhsNum2.length()==0?"":this.fzhsNum2);  
		sdAcctAmount.setFzhsFinedName2(this.fzhsFinedName2==null||this.fzhsFinedName2.length()==0?"":this.fzhsFinedName2);  
		sdAcctAmount.setFzhsNo2(this.fzhsNo2==null||this.fzhsNo2.length()==0?"":this.fzhsNo2);  
		sdAcctAmount.setFzhsName2(this.fzhsName2==null||this.fzhsName2.length()==0?"":this.fzhsName2);  
		sdAcctAmount.setFzhsNum3(this.fzhsNum3==null||this.fzhsNum3.length()==0?"":this.fzhsNum3);  
		sdAcctAmount.setFzhsFinedName3(this.fzhsFinedName3==null||this.fzhsFinedName3.length()==0?"":this.fzhsFinedName3);  
		sdAcctAmount.setFzhsNo3(this.fzhsNo3==null||this.fzhsNo3.length()==0?"":this.fzhsNo3);  
		sdAcctAmount.setFzhsName3(this.fzhsName3==null||this.fzhsName3.length()==0?"":this.fzhsName3);  
		sdAcctAmount.setFzhsNum4(this.fzhsNum4==null||this.fzhsNum4.length()==0?"":this.fzhsNum4);  
		sdAcctAmount.setFzhsFinedName4(this.fzhsFinedName4==null||this.fzhsFinedName4.length()==0?"":this.fzhsFinedName4);  
		sdAcctAmount.setFzhsNo4(this.fzhsNo4==null||this.fzhsNo4.length()==0?"":this.fzhsNo4);  
		sdAcctAmount.setFzhsName4(this.fzhsName4==null||this.fzhsName4.length()==0?"":this.fzhsName4);  
		sdAcctAmount.setFzhsNum5(this.fzhsNum5==null||this.fzhsNum5.length()==0?"":this.fzhsNum5);  
		sdAcctAmount.setFzhsFinedName5(this.fzhsFinedName5==null||this.fzhsFinedName5.length()==0?"":this.fzhsFinedName5);  
		sdAcctAmount.setFzhsNo5(this.fzhsNo5==null||this.fzhsNo5.length()==0?"":this.fzhsNo5);  
		sdAcctAmount.setFzhsName5(this.fzhsName5==null||this.fzhsName5.length()==0?"":this.fzhsName5);  
		sdAcctAmount.setFzhsNum6(this.fzhsNum6==null||this.fzhsNum6.length()==0?"":this.fzhsNum6);  
		sdAcctAmount.setFzhsFinedName6(this.fzhsFinedName6==null||this.fzhsFinedName6.length()==0?"":this.fzhsFinedName6);  
		sdAcctAmount.setFzhsNo6(this.fzhsNo6==null||this.fzhsNo6.length()==0?"":this.fzhsNo6);  
		sdAcctAmount.setFzhsName6(this.fzhsName6==null||this.fzhsName6.length()==0?"":this.fzhsName6);  
//		sdAcctAmount.setLjJf(this.ljJf==null||this.ljJf.length()==0?"":this.ljJf);  
//		sdAcctAmount.setLjDf(this.ljDf==null||this.ljDf.length()==0?"":this.ljDf);  
//		sdAcctAmount.setLjJfWb(this.ljJfWb==null||this.ljJfWb.length()==0?"":this.ljJfWb);  
//		sdAcctAmount.setLjDfWb(this.ljDfWb==null||this.ljDfWb.length()==0?"":this.ljDfWb);  
//		sdAcctAmount.setLjJfSl(this.ljJfSl==null||this.ljJfSl.length()==0?"":this.ljJfSl);  
//		sdAcctAmount.setLjDfSl(this.ljDfSl==null||this.ljDfSl.length()==0?"":this.ljDfSl);  
		sdAcctAmount.setIsRelateFzhs(this.isRelateFzhs==null||this.isRelateFzhs.length()==0?0:Integer.parseInt(this.isRelateFzhs));  
		sdAcctAmount.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		try {
			sdAcctAmount.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdAcctAmount.setPage(this.page);	
		return sdAcctAmount;
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

