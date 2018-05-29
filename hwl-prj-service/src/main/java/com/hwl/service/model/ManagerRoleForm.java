
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
public class ManagerRoleForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** managerRoleId */
	private String managerRoleId;
	/** managerId */
	private String managerId;
	/** roleId */
	private String roleId;
	/** state */
	private String state;
	//columns END
	Page page;

	/**
	 * 设置 managerRoleId
	 * @param managerRoleId
	 */
	public void setManagerRoleId(String managerRoleId) {
		this.managerRoleId = managerRoleId;
	}
	/**
	 * managerRoleId
	 * @return
	 */
	public String getManagerRoleId() {
		return this.managerRoleId;
	}
	/**
	 * 设置 managerId
	 * @param managerId
	 */
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	/**
	 * managerId
	 * @return
	 */
	public String getManagerId() {
		return this.managerId;
	}
	/**
	 * 设置 roleId
	 * @param roleId
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * roleId
	 * @return
	 */
	public String getRoleId() {
		return this.roleId;
	}
	/**
	 * 设置 state
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * state
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
  
	public void setManagerRole(ManagerRole managerRole){
		if(managerRole==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.managerRoleId=managerRole.getManagerRoleId()==null?"":String.valueOf(managerRole.getManagerRoleId());	
		this.managerId=managerRole.getManagerId()==null?"":String.valueOf(managerRole.getManagerId());	
		this.roleId=managerRole.getRoleId()==null?"":String.valueOf(managerRole.getRoleId());	
		this.state=managerRole.getState()==null?"":String.valueOf(managerRole.getState());	
		this.page=managerRole.getPage();
	}
  
	public ManagerRole getManagerRole(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ManagerRole managerRole=new ManagerRole();
		managerRole.setManagerRoleId(this.managerRoleId==null||this.managerRoleId.length()==0?0:Integer.parseInt(this.managerRoleId));  
		managerRole.setManagerId(this.managerId==null||this.managerId.length()==0?0:Integer.parseInt(this.managerId));  
		managerRole.setRoleId(this.roleId==null||this.roleId.length()==0?0:Integer.parseInt(this.roleId));  
		managerRole.setState(this.state==null||this.state.length()==0?0:Integer.parseInt(this.state));  
		managerRole.setPage(this.page);	
		return managerRole;
	}
  
	
}

