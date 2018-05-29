
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
public class SdDepartmentForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String sdDepartmentId;
	/** 辅助核算类别外键 */
	private String sdUserItemId;
	/** 部门编码 */
	private String deptNo;
	/** 部门名称 */
	private String deptName;
	/** 上级部门编码 */
	private String parentDeptNo;
	/** 父级主键 */
	private String psdDepartmentId;
	/** 创建时间 */
	private String createDate;
	/** 账套外键关联 */
	private String sdElectResAccId;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdDepartmentId
	 */
	public void setSdDepartmentId(String sdDepartmentId) {
		this.sdDepartmentId = sdDepartmentId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getSdDepartmentId() {
		return this.sdDepartmentId;
	}
	/**
	 * 设置 辅助核算类别外键
	 * @param sdUserItemId
	 */
	public void setSdUserItemId(String sdUserItemId) {
		this.sdUserItemId = sdUserItemId;
	}
	/**
	 * 辅助核算类别外键
	 * @return
	 */
	public String getSdUserItemId() {
		return this.sdUserItemId;
	}
	/**
	 * 设置 部门编码
	 * @param deptNo
	 */
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	/**
	 * 部门编码
	 * @return
	 */
	public String getDeptNo() {
		return this.deptNo;
	}
	/**
	 * 设置 部门名称
	 * @param deptName
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * 部门名称
	 * @return
	 */
	public String getDeptName() {
		return this.deptName;
	}
	/**
	 * 设置 上级部门编码
	 * @param parentDeptNo
	 */
	public void setParentDeptNo(String parentDeptNo) {
		this.parentDeptNo = parentDeptNo;
	}
	/**
	 * 上级部门编码
	 * @return
	 */
	public String getParentDeptNo() {
		return this.parentDeptNo;
	}
	/**
	 * 设置 父级主键
	 * @param psdDepartmentId
	 */
	public void setPsdDepartmentId(String psdDepartmentId) {
		this.psdDepartmentId = psdDepartmentId;
	}
	/**
	 * 父级主键
	 * @return
	 */
	public String getPsdDepartmentId() {
		return this.psdDepartmentId;
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
	/**
	 * 设置 账套外键关联
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(String sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * 账套外键关联
	 * @return
	 */
	public String getSdElectResAccId() {
		return this.sdElectResAccId;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setSdDepartment(SdDepartment sdDepartment){
		if(sdDepartment==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdDepartmentId=sdDepartment.getSdDepartmentId()==null?"":String.valueOf(sdDepartment.getSdDepartmentId());	
		this.sdUserItemId=sdDepartment.getSdUserItemId()==null?"":String.valueOf(sdDepartment.getSdUserItemId());	
		this.deptNo=sdDepartment.getDeptNo()==null?"":sdDepartment.getDeptNo();	
		this.deptName=sdDepartment.getDeptName()==null?"":sdDepartment.getDeptName();	
		this.parentDeptNo=sdDepartment.getParentDeptNo()==null?"":sdDepartment.getParentDeptNo();	
		this.psdDepartmentId=sdDepartment.getPsdDepartmentId()==null?"":String.valueOf(sdDepartment.getPsdDepartmentId());	
		this.createDate=sdDepartment.getCreateDate()==null?"":df.format(sdDepartment.getCreateDate());	
		this.sdElectResAccId=sdDepartment.getSdElectResAccId()==null?"":String.valueOf(sdDepartment.getSdElectResAccId());	
		this.page=sdDepartment.getPage();
	}
  
	public SdDepartment getSdDepartment(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdDepartment sdDepartment=new SdDepartment();
		sdDepartment.setSdDepartmentId(this.sdDepartmentId==null||this.sdDepartmentId.length()==0?0:Integer.parseInt(this.sdDepartmentId));  
		sdDepartment.setSdUserItemId(this.sdUserItemId==null||this.sdUserItemId.length()==0?0:Integer.parseInt(this.sdUserItemId));  
		sdDepartment.setDeptNo(this.deptNo==null||this.deptNo.length()==0?"":this.deptNo);  
		sdDepartment.setDeptName(this.deptName==null||this.deptName.length()==0?"":this.deptName);  
		sdDepartment.setParentDeptNo(this.parentDeptNo==null||this.parentDeptNo.length()==0?"":this.parentDeptNo);  
		sdDepartment.setPsdDepartmentId(this.psdDepartmentId==null||this.psdDepartmentId.length()==0?0:Integer.parseInt(this.psdDepartmentId));  
		try {
			sdDepartment.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdDepartment.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		sdDepartment.setPage(this.page);	
		return sdDepartment;
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

