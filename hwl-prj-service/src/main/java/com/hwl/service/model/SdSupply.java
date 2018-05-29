
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
public class SdSupply implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer sdSupplyId;
	/** 辅助核算类别外键 */
	private java.lang.Integer sdUserItemId;
	/** 供应商编码 */
	private java.lang.String supplyNo;
	/** 供应商名称 */
	private java.lang.String supplyName;
	/** 供应商简称 */
	private java.lang.String supplyShortName;
	/** 创建时间 */
	private java.util.Date createDate;
	/** 账套外键关联 */
	private java.lang.Integer sdElectResAccId;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdSupplyId
	 */
	public void setSdSupplyId(java.lang.Integer sdSupplyId) {
		this.sdSupplyId = sdSupplyId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getSdSupplyId() {
		return this.sdSupplyId;
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
	 * 设置 供应商编码
	 * @param supplyNo
	 */
	public void setSupplyNo(java.lang.String supplyNo) {
		this.supplyNo = supplyNo;
	}
	/**
	 * 供应商编码
	 * @return
	 */
	public java.lang.String getSupplyNo() {
		return this.supplyNo;
	}
	/**
	 * 设置 供应商名称
	 * @param supplyName
	 */
	public void setSupplyName(java.lang.String supplyName) {
		this.supplyName = supplyName;
	}
	/**
	 * 供应商名称
	 * @return
	 */
	public java.lang.String getSupplyName() {
		return this.supplyName;
	}
	/**
	 * 设置 供应商简称
	 * @param supplyShortName
	 */
	public void setSupplyShortName(java.lang.String supplyShortName) {
		this.supplyShortName = supplyShortName;
	}
	/**
	 * 供应商简称
	 * @return
	 */
	public java.lang.String getSupplyShortName() {
		return this.supplyShortName;
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
			.append("SdSupplyId",getSdSupplyId())
			.append("SdUserItemId",getSdUserItemId())
			.append("SupplyNo",getSupplyNo())
			.append("SupplyName",getSupplyName())
			.append("SupplyShortName",getSupplyShortName())
			.append("CreateDate",getCreateDate())
			.append("SdElectResAccId",getSdElectResAccId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdSupplyId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdSupply == false) return false;
		if(this == obj) return true;
		SdSupply other = (SdSupply)obj;
		return new EqualsBuilder()
			.append(getSdSupplyId(),other.getSdSupplyId())
			.isEquals();
	}
}

