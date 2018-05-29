
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
public class SdCustomer implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer sdCustomerId;
	/** 辅助核算类别外键 */
	private java.lang.Integer sdUserItemId;
	/** 客户名称 */
	private java.lang.String custName;
	/** 客户编码 */
	private java.lang.String custNo;
	/** 客户简称 */
	private java.lang.String custShortName;
	/** 创建时间 */
	private java.util.Date createDate;
	/** 账套外键关联 */
	private java.lang.Integer sdElectResAccId;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdCustomerId
	 */
	public void setSdCustomerId(java.lang.Integer sdCustomerId) {
		this.sdCustomerId = sdCustomerId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getSdCustomerId() {
		return this.sdCustomerId;
	}
	/**
	 * 设置 辅助核算类别外键
	 * @param sdUserItemId
	 */
	public void setSdUserItemId(java.lang.Integer sdUserItemId) {
		this.sdUserItemId = sdUserItemId;
	}
	/**
	 * 辅助核算类别外键
	 * @return
	 */
	public java.lang.Integer getSdUserItemId() {
		return this.sdUserItemId;
	}
	/**
	 * 设置 客户名称
	 * @param custName
	 */
	public void setCustName(java.lang.String custName) {
		this.custName = custName;
	}
	/**
	 * 客户名称
	 * @return
	 */
	public java.lang.String getCustName() {
		return this.custName;
	}
	/**
	 * 设置 客户编码
	 * @param custNo
	 */
	public void setCustNo(java.lang.String custNo) {
		this.custNo = custNo;
	}
	/**
	 * 客户编码
	 * @return
	 */
	public java.lang.String getCustNo() {
		return this.custNo;
	}
	/**
	 * 设置 客户简称
	 * @param custShortName
	 */
	public void setCustShortName(java.lang.String custShortName) {
		this.custShortName = custShortName;
	}
	/**
	 * 客户简称
	 * @return
	 */
	public java.lang.String getCustShortName() {
		return this.custShortName;
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
	/**
	 * 设置 账套外键关联
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(java.lang.Integer sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * 账套外键关联
	 * @return
	 */
	public java.lang.Integer getSdElectResAccId() {
		return this.sdElectResAccId;
	}

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("SdCustomerId",getSdCustomerId())
			.append("SdUserItemId",getSdUserItemId())
			.append("CustName",getCustName())
			.append("CustNo",getCustNo())
			.append("CustShortName",getCustShortName())
			.append("CreateDate",getCreateDate())
			.append("SdElectResAccId",getSdElectResAccId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdCustomerId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdCustomer == false) return false;
		if(this == obj) return true;
		SdCustomer other = (SdCustomer)obj;
		return new EqualsBuilder()
			.append(getSdCustomerId(),other.getSdCustomerId())
			.isEquals();
	}
}

