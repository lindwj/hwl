
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
public class GstdAmt implements Serializable{	

	//private static final double serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** gstdAmtId */
	private java.lang.Integer gstdAmtId;
	/** fcaseNum */
	private java.lang.String fcaseNum;
	/** 账套外键 */
	private java.lang.Integer sdElectResAccId;
	/** 会计年度 */
	private java.lang.String fcaseYear;
	
	private java.lang.String fcasePreYear;
	/** 科目代码 */
	private java.lang.String fcode;
	private int fRule;
	/** 会计期间号 */
	private java.lang.Integer fperiod;
	private java.lang.Integer fprePeriod;
	/** 年初余额 */
	private double fyearBeg;
	/** 年初借方余额 */
	private double fyearBegDebitBal;
	/** 年初贷方余额 */
	private double fyearBegCreditBal;
	/** 累计发生额 */
	private double fyearBal;
	/** 期末借方余额 */
	private double fendDebitBal;
	/** 期末贷方余额 */
	private double fendCreditBal;
	/** 本期发生额 */
	private double fbal;
	/** 期初余额 */
	private double fbegBal;
	/** 本期借方发生额 */
	private double fdebitBal;
	/** 本期贷方发生额 */
	private double fcreditBal;
	/** 累计借方发生额 */
	private double fyearDebitBal;
	/** 累计贷方发生额 */
	private double fyearCreditBal;
	/** 期末余额 */
	private double fendBal;
	//columns END
	Page page;
	
	
	

	public int getfRule() {
		return fRule;
	}
	public void setfRule(int fRule) {
		this.fRule = fRule;
	}
	public java.lang.String getFcasePreYear() {
		return fcasePreYear;
	}
	public void setFcasePreYear(java.lang.String fcasePreYear) {
		this.fcasePreYear = fcasePreYear;
	}
	public java.lang.Integer getFprePeriod() {
		return fprePeriod;
	}
	public void setFprePeriod(java.lang.Integer fprePeriod) {
		this.fprePeriod = fprePeriod;
	}
	/**
	 * 设置 gstdAmtId
	 * @param gstdAmtId
	 */
	public void setGstdAmtId(java.lang.Integer gstdAmtId) {
		this.gstdAmtId = gstdAmtId;
	}
	/**
	 * gstdAmtId
	 * @return
	 */
	public java.lang.Integer getGstdAmtId() {
		return this.gstdAmtId;
	}
	/**
	 * 设置 fcaseNum
	 * @param fcaseNum
	 */
	public void setFcaseNum(java.lang.String fcaseNum) {
		this.fcaseNum = fcaseNum;
	}
	/**
	 * fcaseNum
	 * @return
	 */
	public java.lang.String getFcaseNum() {
		return this.fcaseNum;
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
	 * 设置 会计年度
	 * @param fcaseYear
	 */
	public void setFcaseYear(java.lang.String fcaseYear) {
		this.fcaseYear = fcaseYear;
	}
	/**
	 * 会计年度
	 * @return
	 */
	public java.lang.String getFcaseYear() {
		return this.fcaseYear;
	}
	/**
	 * 设置 科目代码
	 * @param fcode
	 */
	public void setFcode(java.lang.String fcode) {
		this.fcode = fcode;
	}
	/**
	 * 科目代码
	 * @return
	 */
	public java.lang.String getFcode() {
		return this.fcode;
	}
	/**
	 * 设置 会计期间号
	 * @param fperiod
	 */
	public void setFperiod(java.lang.Integer fperiod) {
		this.fperiod = fperiod;
	}
	/**
	 * 会计期间号
	 * @return
	 */
	public java.lang.Integer getFperiod() {
		return this.fperiod;
	}
	/**
	 * 设置 年初余额
	 * @param fyearBeg
	 */
	public void setFyearBeg(double fyearBeg) {
		this.fyearBeg = fyearBeg;
	}
	/**
	 * 年初余额
	 * @return
	 */
	public double getFyearBeg() {
		return this.fyearBeg;
	}
	/**
	 * 设置 年初借方余额
	 * @param fyearBegDebitBal
	 */
	public void setFyearBegDebitBal(double fyearBegDebitBal) {
		this.fyearBegDebitBal = fyearBegDebitBal;
	}
	/**
	 * 年初借方余额
	 * @return
	 */
	public double getFyearBegDebitBal() {
		return this.fyearBegDebitBal;
	}
	/**
	 * 设置 年初贷方余额
	 * @param fyearBegCreditBal
	 */
	public void setFyearBegCreditBal(double fyearBegCreditBal) {
		this.fyearBegCreditBal = fyearBegCreditBal;
	}
	/**
	 * 年初贷方余额
	 * @return
	 */
	public double getFyearBegCreditBal() {
		return this.fyearBegCreditBal;
	}
	/**
	 * 设置 累计发生额
	 * @param fyearBal
	 */
	public void setFyearBal(double fyearBal) {
		this.fyearBal = fyearBal;
	}
	/**
	 * 累计发生额
	 * @return
	 */
	public double getFyearBal() {
		return this.fyearBal;
	}
	/**
	 * 设置 期末借方余额
	 * @param fendDebitBal
	 */
	public void setFendDebitBal(double fendDebitBal) {
		this.fendDebitBal = fendDebitBal;
	}
	/**
	 * 期末借方余额
	 * @return
	 */
	public double getFendDebitBal() {
		return this.fendDebitBal;
	}
	/**
	 * 设置 期末贷方余额
	 * @param fendCreditBal
	 */
	public void setFendCreditBal(double fendCreditBal) {
		this.fendCreditBal = fendCreditBal;
	}
	/**
	 * 期末贷方余额
	 * @return
	 */
	public double getFendCreditBal() {
		return this.fendCreditBal;
	}
	/**
	 * 设置 本期发生额
	 * @param fbal
	 */
	public void setFbal(double fbal) {
		this.fbal = fbal;
	}
	/**
	 * 本期发生额
	 * @return
	 */
	public double getFbal() {
		return this.fbal;
	}
	/**
	 * 设置 期初余额
	 * @param fbegBal
	 */
	public void setFbegBal(double fbegBal) {
		this.fbegBal = fbegBal;
	}
	/**
	 * 期初余额
	 * @return
	 */
	public double getFbegBal() {
		return this.fbegBal;
	}
	/**
	 * 设置 本期借方发生额
	 * @param fdebitBal
	 */
	public void setFdebitBal(double fdebitBal) {
		this.fdebitBal = fdebitBal;
	}
	/**
	 * 本期借方发生额
	 * @return
	 */
	public double getFdebitBal() {
		return this.fdebitBal;
	}
	/**
	 * 设置 本期贷方发生额
	 * @param fcreditBal
	 */
	public void setFcreditBal(double fcreditBal) {
		this.fcreditBal = fcreditBal;
	}
	/**
	 * 本期贷方发生额
	 * @return
	 */
	public double getFcreditBal() {
		return this.fcreditBal;
	}
	/**
	 * 设置 累计借方发生额
	 * @param fyearDebitBal
	 */
	public void setFyearDebitBal(double fyearDebitBal) {
		this.fyearDebitBal = fyearDebitBal;
	}
	/**
	 * 累计借方发生额
	 * @return
	 */
	public double getFyearDebitBal() {
		return this.fyearDebitBal;
	}
	/**
	 * 设置 累计贷方发生额
	 * @param fyearCreditBal
	 */
	public void setFyearCreditBal(double fyearCreditBal) {
		this.fyearCreditBal = fyearCreditBal;
	}
	/**
	 * 累计贷方发生额
	 * @return
	 */
	public double getFyearCreditBal() {
		return this.fyearCreditBal;
	}
	/**
	 * 设置 期末余额
	 * @param fendBal
	 */
	public void setFendBal(double fendBal) {
		this.fendBal = fendBal;
	}
	/**
	 * 期末余额
	 * @return
	 */
	public double getFendBal() {
		return this.fendBal;
	}

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("GstdAmtId",getGstdAmtId())
			.append("FcaseNum",getFcaseNum())
			.append("SdElectResAccId",getSdElectResAccId())
			.append("FcaseYear",getFcaseYear())
			.append("Fcode",getFcode())
			.append("Fperiod",getFperiod())
			.append("FyearBeg",getFyearBeg())
			.append("FyearBegDebitBal",getFyearBegDebitBal())
			.append("FyearBegCreditBal",getFyearBegCreditBal())
			.append("FyearBal",getFyearBal())
			.append("FendDebitBal",getFendDebitBal())
			.append("FendCreditBal",getFendCreditBal())
			.append("Fbal",getFbal())
			.append("FbegBal",getFbegBal())
			.append("FdebitBal",getFdebitBal())
			.append("FcreditBal",getFcreditBal())
			.append("FyearDebitBal",getFyearDebitBal())
			.append("FyearCreditBal",getFyearCreditBal())
			.append("FendBal",getFendBal())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getGstdAmtId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GstdAmt == false) return false;
		if(this == obj) return true;
		GstdAmt other = (GstdAmt)obj;
		return new EqualsBuilder()
			.append(getGstdAmtId(),other.getGstdAmtId())
			.isEquals();
	}
}

