
package com.hwl.service.model;


//import org.apache.commons.lang.builder.EqualsBuilder;
//import org.apache.commons.lang.builder.HashCodeBuilder;
//import org.apache.commons.lang.builder.ToStringBuilder;
//import org.apache.commons.lang.builder.ToStringStyle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hwl.service.common.Page;

/**
 * @author lind
 *
 */
public class Parameter implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer parameterId;
	/** 参数名称 */
	private java.lang.String parameterName;
	/** 参数类型id */
	private java.lang.Integer parameterTypeId;
	/** 状态 */
	private java.lang.Integer state;
	/** pid */
	private java.lang.Integer pid;
	/** 排序 */
	private java.lang.Integer sort;
	/** 描述	*/
	private String description;
	/** 小图标*/
	private String icon;
	/** 图片*/
	private String picture;
	/** 分类类型名称*/
	private String parameterTypeName;
	/**	创建时间*/
	private Date createTime;
	/** 修改时间*/
	private Date updateTime;
	/** 创建人*/
	private Integer createMan;
	/**	修改人*/
	private Integer updateMan;
	
	List<ParameterType> parameterTypeList=new ArrayList<ParameterType>();
	
	private java.lang.Integer menuId;
	
	//columns END
	Page page;

	
	
	/**
	 * 设置 主键
	 * @param parameterId
	 */
	public void setParameterId(java.lang.Integer parameterId) {
		this.parameterId = parameterId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getParameterId() {
		return this.parameterId;
	}
	/**
	 * 设置 参数名称
	 * @param parameterName
	 */
	public void setParameterName(java.lang.String parameterName) {
		this.parameterName = parameterName;
	}
	/**
	 * 参数名称
	 * @return
	 */
	public java.lang.String getParameterName() {
		return this.parameterName;
	}
	/**
	 * 设置 参数类型id
	 * @param parameterTypeId
	 */
	public void setParameterTypeId(java.lang.Integer parameterTypeId) {
		this.parameterTypeId = parameterTypeId;
	}
	/**
	 * 参数类型id
	 * @return
	 */
	public java.lang.Integer getParameterTypeId() {
		return this.parameterTypeId;
	}
	/**
	 * 设置 状态
	 * @param state
	 */
	public void setState(java.lang.Integer state) {
		this.state = state;
	}
	/**
	 * 状态
	 * @return
	 */
	public java.lang.Integer getState() {
		return this.state;
	}
	/**
	 * 设置 pid
	 * @param pid
	 */
	public void setPid(java.lang.Integer pid) {
		this.pid = pid;
	}
	/**
	 * pid
	 * @return
	 */
	public java.lang.Integer getPid() {
		return this.pid;
	}
	/**
	 * 设置 排序
	 * @param sort
	 */
	public void setSort(java.lang.Integer sort) {
		this.sort = sort;
	}
	/**
	 * 排序
	 * @return
	 */
	public java.lang.Integer getSort() {
		return this.sort;
	}

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getParameterTypeName() {
		return parameterTypeName;
	}
	public void setParameterTypeName(String parameterTypeName) {
		this.parameterTypeName = parameterTypeName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getCreateMan() {
		return createMan;
	}
	public void setCreateMan(Integer createMan) {
		this.createMan = createMan;
	}
	public Integer getUpdateMan() {
		return updateMan;
	}
	public void setUpdateMan(Integer updateMan) {
		this.updateMan = updateMan;
	}
	public List<ParameterType> getParameterTypeList() {
		return parameterTypeList;
	}
	public void setParameterTypeList(List<ParameterType> parameterTypeList) {
		this.parameterTypeList = parameterTypeList;
	}
	public java.lang.Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(java.lang.Integer menuId) {
		this.menuId = menuId;
	}
}

