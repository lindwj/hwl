
package com.hwl.service.model;


//import org.apache.commons.lang.builder.EqualsBuilder;
//import org.apache.commons.lang.builder.HashCodeBuilder;
//import org.apache.commons.lang.builder.ToStringBuilder;
//import org.apache.commons.lang.builder.ToStringStyle;
import java.io.Serializable;

import com.hwl.service.common.Page;

/**
 * @author lind
 *
 */
public class ParameterType implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer parameterTypeId;
	/** 参数类型名称 */
	private java.lang.String parameterTypeName;
	/** 状态 */
	private java.lang.Integer state;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param parameterTypeId
	 */
	public void setParameterTypeId(java.lang.Integer parameterTypeId) {
		this.parameterTypeId = parameterTypeId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getParameterTypeId() {
		return this.parameterTypeId;
	}
	/**
	 * 设置 参数类型名称
	 * @param parameterTypeName
	 */
	public void setParameterTypeName(java.lang.String parameterTypeName) {
		this.parameterTypeName = parameterTypeName;
	}
	/**
	 * 参数类型名称
	 * @return
	 */
	public java.lang.String getParameterTypeName() {
		return this.parameterTypeName;
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

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	
}

