
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
public class SdglBasicInfo implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** sdglBasicInfoId */
	private java.lang.Integer sdglBasicInfoId;
	/** 会计科目编号规则 */
	private java.lang.String acctIdRule;
	/** 现金流量项目编码规则 */
	private java.lang.String cashFlowNoRule;
	/** 账套外键 */
	private java.lang.Integer sdElectResAccId;
	/** 创建时间 */
	private java.util.Date createDate;
	//columns END
	Page page;

	/**
	 * 设置 sdglBasicInfoId
	 * @param sdglBasicInfoId
	 */
	public void setSdglBasicInfoId(java.lang.Integer sdglBasicInfoId) {
		this.sdglBasicInfoId = sdglBasicInfoId;
	}
	/**
	 * sdglBasicInfoId
	 * @return
	 */
	public java.lang.Integer getSdglBasicInfoId() {
		return this.sdglBasicInfoId;
	}
	/**
	 * 设置 会计科目编号规则
	 * @param acctIdRule
	 */
	public void setAcctIdRule(java.lang.String acctIdRule) {
		this.acctIdRule = acctIdRule;
	}
	/**
	 * 会计科目编号规则
	 * @return
	 */
	public java.lang.String getAcctIdRule() {
		return this.acctIdRule;
	}
	/**
	 * 设置 现金流量项目编码规则
	 * @param cashFlowNoRule
	 */
	public void setCashFlowNoRule(java.lang.String cashFlowNoRule) {
		this.cashFlowNoRule = cashFlowNoRule;
	}
	/**
	 * 现金流量项目编码规则
	 * @return
	 */
	public java.lang.String getCashFlowNoRule() {
		return this.cashFlowNoRule;
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
			.append("SdglBasicInfoId",getSdglBasicInfoId())
			.append("AcctIdRule",getAcctIdRule())
			.append("CashFlowNoRule",getCashFlowNoRule())
			.append("SdElectResAccId",getSdElectResAccId())
			.append("CreateDate",getCreateDate())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdglBasicInfoId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdglBasicInfo == false) return false;
		if(this == obj) return true;
		SdglBasicInfo other = (SdglBasicInfo)obj;
		return new EqualsBuilder()
			.append(getSdglBasicInfoId(),other.getSdglBasicInfoId())
			.isEquals();
	}
}

