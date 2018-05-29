
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
public class ParameterForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String parameterId;
	/** 参数名称 */
	private String parameterName;
	/** 参数类型id */
	private String parameterTypeId;
	/** 状态 */
	private String state;
	/** pid */
	private String pid;
	/** 排序 */
	private String sort;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param parameterId
	 */
	public void setParameterId(String parameterId) {
		this.parameterId = parameterId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getParameterId() {
		return this.parameterId;
	}
	/**
	 * 设置 参数名称
	 * @param parameterName
	 */
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	/**
	 * 参数名称
	 * @return
	 */
	public String getParameterName() {
		return this.parameterName;
	}
	/**
	 * 设置 参数类型id
	 * @param parameterTypeId
	 */
	public void setParameterTypeId(String parameterTypeId) {
		this.parameterTypeId = parameterTypeId;
	}
	/**
	 * 参数类型id
	 * @return
	 */
	public String getParameterTypeId() {
		return this.parameterTypeId;
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
	/**
	 * 设置 pid
	 * @param pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * pid
	 * @return
	 */
	public String getPid() {
		return this.pid;
	}
	/**
	 * 设置 排序
	 * @param sort
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}
	/**
	 * 排序
	 * @return
	 */
	public String getSort() {
		return this.sort;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setParameter(Parameter parameter){
		if(parameter==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.parameterId=parameter.getParameterId()==null?"":String.valueOf(parameter.getParameterId());	
		this.parameterName=parameter.getParameterName()==null?"":parameter.getParameterName();	
		this.parameterTypeId=parameter.getParameterTypeId()==null?"":String.valueOf(parameter.getParameterTypeId());	
		this.state=parameter.getState()==null?"":String.valueOf(parameter.getState());	
		this.pid=parameter.getPid()==null?"":String.valueOf(parameter.getPid());	
		this.sort=parameter.getSort()==null?"":String.valueOf(parameter.getSort());	
		this.page=parameter.getPage();
	}
  
	public Parameter getParameter(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Parameter parameter=new Parameter();
		parameter.setParameterId(this.parameterId==null||this.parameterId.length()==0?0:Integer.parseInt(this.parameterId));  
		parameter.setParameterName(this.parameterName==null||this.parameterName.length()==0?"":this.parameterName);  
		parameter.setParameterTypeId(this.parameterTypeId==null||this.parameterTypeId.length()==0?0:Integer.parseInt(this.parameterTypeId));  
		parameter.setState(this.state==null||this.state.length()==0?0:Integer.parseInt(this.state));  
		parameter.setPid(this.pid==null||this.pid.length()==0?0:Integer.parseInt(this.pid));  
		parameter.setSort(this.sort==null||this.sort.length()==0?0:Integer.parseInt(this.sort));  
		parameter.setPage(this.page);	
		return parameter;
	}
  
	
}

