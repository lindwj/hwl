
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
public class SdUserItem implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer sdUserItemId;
	/** 辅助核算类编码 */
	private java.lang.String hslbNo;
	/** 辅助核算类名称 */
	private java.lang.String hslbNa;
	/** 辅助核算类描述 */
	private java.lang.String hslbDesc;
	/** 是否有层级特性 */
	private java.lang.String isLevel;
	/** 自定义核算项json */
	private java.lang.String hspjt;
	/** 核算类编码规则 */
	private java.lang.String hslbNoRule;
	/** 账套外键关联 */
	private java.lang.Integer sdElectResAccId;
	/** 创建时间 */
	private java.util.Date createDate;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdUserItemId
	 */
	public void setSdUserItemId(java.lang.Integer sdUserItemId) {
		this.sdUserItemId = sdUserItemId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getSdUserItemId() {
		return this.sdUserItemId;
	}
	/**
	 * 设置 辅助核算类编码
	 * @param hslbNo
	 */
	public void setHslbNo(java.lang.String hslbNo) {
		this.hslbNo = hslbNo;
	}
	/**
	 * 辅助核算类编码
	 * @return
	 */
	public java.lang.String getHslbNo() {
		return this.hslbNo;
	}
	/**
	 * 设置 辅助核算类名称
	 * @param hslbNa
	 */
	public void setHslbNa(java.lang.String hslbNa) {
		this.hslbNa = hslbNa;
	}
	/**
	 * 辅助核算类名称
	 * @return
	 */
	public java.lang.String getHslbNa() {
		return this.hslbNa;
	}
	/**
	 * 设置 辅助核算类描述
	 * @param hslbDesc
	 */
	public void setHslbDesc(java.lang.String hslbDesc) {
		this.hslbDesc = hslbDesc;
	}
	/**
	 * 辅助核算类描述
	 * @return
	 */
	public java.lang.String getHslbDesc() {
		return this.hslbDesc;
	}
	/**
	 * 设置 是否有层级特性
	 * @param isLevel
	 */
	public void setIsLevel(java.lang.String isLevel) {
		this.isLevel = isLevel;
	}
	/**
	 * 是否有层级特性
	 * @return
	 */
	public java.lang.String getIsLevel() {
		return this.isLevel;
	}
	/**
	 * 设置 自定义核算项json
	 * @param hspjt
	 */
	public void setHspjt(java.lang.String hspjt) {
		this.hspjt = hspjt;
	}
	/**
	 * 自定义核算项json
	 * @return
	 */
	public java.lang.String getHspjt() {
		return this.hspjt;
	}
	/**
	 * 设置 核算类编码规则
	 * @param hslbNoRule
	 */
	public void setHslbNoRule(java.lang.String hslbNoRule) {
		this.hslbNoRule = hslbNoRule;
	}
	/**
	 * 核算类编码规则
	 * @return
	 */
	public java.lang.String getHslbNoRule() {
		return this.hslbNoRule;
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
			.append("SdUserItemId",getSdUserItemId())
			.append("HslbNo",getHslbNo())
			.append("HslbNa",getHslbNa())
			.append("HslbDesc",getHslbDesc())
			.append("IsLevel",getIsLevel())
			.append("Hspjt",getHspjt())
			.append("HslbNoRule",getHslbNoRule())
			.append("SdElectResAccId",getSdElectResAccId())
			.append("CreateDate",getCreateDate())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdUserItemId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdUserItem == false) return false;
		if(this == obj) return true;
		SdUserItem other = (SdUserItem)obj;
		return new EqualsBuilder()
			.append(getSdUserItemId(),other.getSdUserItemId())
			.isEquals();
	}
}

