
package com.hwl.service.model;

import java.io.Serializable;
//import org.apache.commons.lang.builder.EqualsBuilder;
//import org.apache.commons.lang.builder.HashCodeBuilder;
//import org.apache.commons.lang.builder.ToStringBuilder;
//import org.apache.commons.lang.builder.ToStringStyle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.hwl.service.common.Page;

/**
 * @author lind
 *
 */
public class ParameterTypeForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String parameterTypeId;
	/** 参数类型名称 */
	private String parameterTypeName;
	/** 状态 */
	private String state;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param parameterTypeId
	 */
	public void setParameterTypeId(String parameterTypeId) {
		this.parameterTypeId = parameterTypeId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getParameterTypeId() {
		return this.parameterTypeId;
	}
	/**
	 * 设置 参数类型名称
	 * @param parameterTypeName
	 */
	public void setParameterTypeName(String parameterTypeName) {
		this.parameterTypeName = parameterTypeName;
	}
	/**
	 * 参数类型名称
	 * @return
	 */
	public String getParameterTypeName() {
		return this.parameterTypeName;
	}
	/**
	 * 设置 状态
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 状态
	 * @return
	 */
	public String getState() {
		return this.state;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setParameterType(ParameterType parameterType){
		if(parameterType==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.parameterTypeId=parameterType.getParameterTypeId()==null?"":String.valueOf(parameterType.getParameterTypeId());	
		this.parameterTypeName=parameterType.getParameterTypeName()==null?"":parameterType.getParameterTypeName();	
		this.state=parameterType.getState()==null?"":String.valueOf(parameterType.getState());	
		this.page=parameterType.getPage();
	}
  
	public ParameterType getParameterType(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ParameterType parameterType=new ParameterType();
		parameterType.setParameterTypeId(this.parameterTypeId==null||this.parameterTypeId.length()==0?0:Integer.parseInt(this.parameterTypeId));  
		parameterType.setParameterTypeName(this.parameterTypeName==null||this.parameterTypeName.length()==0?"":this.parameterTypeName);  
		parameterType.setState(this.state==null||this.state.length()==0?0:Integer.parseInt(this.state));  
		parameterType.setPage(this.page);	
		return parameterType;
	}
  
	
}

