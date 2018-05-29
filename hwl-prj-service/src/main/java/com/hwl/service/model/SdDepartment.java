
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
public class SdDepartment implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer sdDepartmentId;
	/** 辅助核算类别外键 */
	private java.lang.Integer sdUserItemId;
	/** 部门编码 */
	private java.lang.String deptNo;
	/** 部门名称 */
	private java.lang.String deptName;
	/** 上级部门编码 */
	private java.lang.String parentDeptNo;
	/** 父级主键 */
	private java.lang.Integer psdDepartmentId;
	/** 创建时间 */
	private java.util.Date createDate;
	/** 账套外键关联 */
	private java.lang.Integer sdElectResAccId;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdDepartmentId
	 */
	public void setSdDepartmentId(java.lang.Integer sdDepartmentId) {
		this.sdDepartmentId = sdDepartmentId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getSdDepartmentId() {
		return this.sdDepartmentId;
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
	 * 设置 部门编码
	 * @param deptNo
	 */
	public void setDeptNo(java.lang.String deptNo) {
		this.deptNo = deptNo;
	}
	/**
	 * 部门编码
	 * @return
	 */
	public java.lang.String getDeptNo() {
		return this.deptNo;
	}
	/**
	 * 设置 部门名称
	 * @param deptName
	 */
	public void setDeptName(java.lang.String deptName) {
		this.deptName = deptName;
	}
	/**
	 * 部门名称
	 * @return
	 */
	public java.lang.String getDeptName() {
		return this.deptName;
	}
	/**
	 * 设置 上级部门编码
	 * @param parentDeptNo
	 */
	public void setParentDeptNo(java.lang.String parentDeptNo) {
		this.parentDeptNo = parentDeptNo;
	}
	/**
	 * 上级部门编码
	 * @return
	 */
	public java.lang.String getParentDeptNo() {
		return this.parentDeptNo;
	}
	/**
	 * 设置 父级主键
	 * @param psdDepartmentId
	 */
	public void setPsdDepartmentId(java.lang.Integer psdDepartmentId) {
		this.psdDepartmentId = psdDepartmentId;
	}
	/**
	 * 父级主键
	 * @return
	 */
	public java.lang.Integer getPsdDepartmentId() {
		return this.psdDepartmentId;
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
			.append("SdDepartmentId",getSdDepartmentId())
			.append("SdUserItemId",getSdUserItemId())
			.append("DeptNo",getDeptNo())
			.append("DeptName",getDeptName())
			.append("ParentDeptNo",getParentDeptNo())
			.append("PsdDepartmentId",getPsdDepartmentId())
			.append("CreateDate",getCreateDate())
			.append("SdElectResAccId",getSdElectResAccId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdDepartmentId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdDepartment == false) return false;
		if(this == obj) return true;
		SdDepartment other = (SdDepartment)obj;
		return new EqualsBuilder()
			.append(getSdDepartmentId(),other.getSdDepartmentId())
			.isEquals();
	}
}

