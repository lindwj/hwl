
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
public class SdPeriod implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** sdPeriodId */
	private java.lang.Integer sdPeriodId;
	/** 会计年度 */
	private java.lang.String fyear;
	/** 会计期间号 */
	private java.lang.Integer perdNumber;
	/** 会计期间起始日期 */
	private java.util.Date perdStartDate;
	/** 会计期间结束日期 */
	private java.util.Date perdEndDate;
	
	/** 会计期间起始日期 */
	private String perdStartDateStr;
	/** 会计期间结束日期 */
	private String perdEndDateStr;
	
	
	/** 会计期间状态 */
	private java.lang.String perdStatus;
	/** 账套外键 */
	private java.lang.Integer sdElectResAccId;
	/** 创建时间 */
	private java.util.Date createDate;
	//columns END
	Page page;

	public String getPerdStartDateStr() {
		return perdStartDateStr;
	}
	public void setPerdStartDateStr(String perdStartDateStr) {
		this.perdStartDateStr = perdStartDateStr;
	}
	public String getPerdEndDateStr() {
		return perdEndDateStr;
	}
	public void setPerdEndDateStr(String perdEndDateStr) {
		this.perdEndDateStr = perdEndDateStr;
	}
	/**
	 * 设置 sdPeriodId
	 * @param sdPeriodId
	 */
	public void setSdPeriodId(java.lang.Integer sdPeriodId) {
		this.sdPeriodId = sdPeriodId;
	}
	/**
	 * sdPeriodId
	 * @return
	 */
	public java.lang.Integer getSdPeriodId() {
		return this.sdPeriodId;
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
	 * 设置 会计期间起始日期
	 * @param perdStartDate
	 */
	public void setPerdStartDate(java.util.Date perdStartDate) {
		this.perdStartDate = perdStartDate;
	}
	/**
	 * 会计期间起始日期
	 * @return
	 */
	public java.util.Date getPerdStartDate() {
		return this.perdStartDate;
	}
	/**
	 * 设置 会计期间结束日期
	 * @param perdEndDate
	 */
	public void setPerdEndDate(java.util.Date perdEndDate) {
		this.perdEndDate = perdEndDate;
	}
	/**
	 * 会计期间结束日期
	 * @return
	 */
	public java.util.Date getPerdEndDate() {
		return this.perdEndDate;
	}
	/**
	 * 设置 会计期间状态
	 * @param perdStatus
	 */
	public void setPerdStatus(java.lang.String perdStatus) {
		this.perdStatus = perdStatus;
	}
	/**
	 * 会计期间状态
	 * @return
	 */
	public java.lang.String getPerdStatus() {
		return this.perdStatus;
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
			.append("SdPeriodId",getSdPeriodId())
			.append("Fyear",getFyear())
			.append("PerdNumber",getPerdNumber())
			.append("PerdStartDate",getPerdStartDate())
			.append("PerdEndDate",getPerdEndDate())
			.append("PerdStatus",getPerdStatus())
			.append("SdElectResAccId",getSdElectResAccId())
			.append("CreateDate",getCreateDate())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdPeriodId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdPeriod == false) return false;
		if(this == obj) return true;
		SdPeriod other = (SdPeriod)obj;
		return new EqualsBuilder()
			.append(getSdPeriodId(),other.getSdPeriodId())
			.isEquals();
	}
}

