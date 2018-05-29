
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
public class SdElectResAcc implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** sdElectResAccId */
	private java.lang.Integer sdElectResAccId;
	/** 账套名称 */
	private java.lang.String ztName;
	/** 账套编号 */
	private java.lang.String ztNumber;
	/** 会计核算单位 */
	private java.lang.String acctUnit;
	/** 组织机构代码 */
	private java.lang.String orgId;
	/** 本位币 */
	private java.lang.String stdCurrency;
	/** 会计年度 */
	private java.lang.String fyear;
	/** 标准版本号 */
	private java.lang.String stdVerNumber;
	/** 状态：-1失效 1生效  */
	private java.lang.Integer status;
	private java.lang.Integer fRule;
	
	/** 创建时间 */
	private java.util.Date createDate;
	//columns END
	Page page;
	
	

	public java.lang.Integer getfRule() {
		return fRule;
	}
	public void setfRule(java.lang.Integer fRule) {
		this.fRule = fRule;
	}
	/**
	 * 设置 sdElectResAccId
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(java.lang.Integer sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * sdElectResAccId
	 * @return
	 */
	public java.lang.Integer getSdElectResAccId() {
		return this.sdElectResAccId;
	}
	/**
	 * 设置 账套名称
	 * @param ztName
	 */
	public void setZtName(java.lang.String ztName) {
		this.ztName = ztName;
	}
	/**
	 * 账套名称
	 * @return
	 */
	public java.lang.String getZtName() {
		return this.ztName;
	}
	/**
	 * 设置 账套编号
	 * @param ztNumber
	 */
	public void setZtNumber(java.lang.String ztNumber) {
		this.ztNumber = ztNumber;
	}
	/**
	 * 账套编号
	 * @return
	 */
	public java.lang.String getZtNumber() {
		return this.ztNumber;
	}
	/**
	 * 设置 会计核算单位
	 * @param acctUnit
	 */
	public void setAcctUnit(java.lang.String acctUnit) {
		this.acctUnit = acctUnit;
	}
	/**
	 * 会计核算单位
	 * @return
	 */
	public java.lang.String getAcctUnit() {
		return this.acctUnit;
	}
	/**
	 * 设置 组织机构代码
	 * @param orgId
	 */
	public void setOrgId(java.lang.String orgId) {
		this.orgId = orgId;
	}
	/**
	 * 组织机构代码
	 * @return
	 */
	public java.lang.String getOrgId() {
		return this.orgId;
	}
	/**
	 * 设置 本位币
	 * @param stdCurrency
	 */
	public void setStdCurrency(java.lang.String stdCurrency) {
		this.stdCurrency = stdCurrency;
	}
	/**
	 * 本位币
	 * @return
	 */
	public java.lang.String getStdCurrency() {
		return this.stdCurrency;
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
	 * 设置 标准版本号
	 * @param stdVerNumber
	 */
	public void setStdVerNumber(java.lang.String stdVerNumber) {
		this.stdVerNumber = stdVerNumber;
	}
	/**
	 * 标准版本号
	 * @return
	 */
	public java.lang.String getStdVerNumber() {
		return this.stdVerNumber;
	}
	/**
	 * 设置 状态：-1失效 1生效 
	 * @param status
	 */
	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}
	/**
	 * 状态：-1失效 1生效 
	 * @return
	 */
	public java.lang.Integer getStatus() {
		return this.status;
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
			.append("SdElectResAccId",getSdElectResAccId())
			.append("ZtName",getZtName())
			.append("ZtNumber",getZtNumber())
			.append("AcctUnit",getAcctUnit())
			.append("OrgId",getOrgId())
			.append("StdCurrency",getStdCurrency())
			.append("Fyear",getFyear())
			.append("StdVerNumber",getStdVerNumber())
			.append("Status",getStatus())
			.append("CreateDate",getCreateDate())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdElectResAccId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdElectResAcc == false) return false;
		if(this == obj) return true;
		SdElectResAcc other = (SdElectResAcc)obj;
		return new EqualsBuilder()
			.append(getSdElectResAccId(),other.getSdElectResAccId())
			.isEquals();
	}
}

