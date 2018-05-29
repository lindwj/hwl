
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
public class ManagerRole implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** managerRoleId */
	private java.lang.Integer managerRoleId;
	/** managerId */
	private java.lang.Integer managerId;
	/** roleId */
	private java.lang.Integer roleId;
	/** state */
	private java.lang.Integer state;
	//columns END
	Page page;

	/**
	 * 设置 managerRoleId
	 * @param managerRoleId
	 */
	public void setManagerRoleId(java.lang.Integer managerRoleId) {
		this.managerRoleId = managerRoleId;
	}
	/**
	 * managerRoleId
	 * @return
	 */
	public java.lang.Integer getManagerRoleId() {
		return this.managerRoleId;
	}
	/**
	 * 设置 managerId
	 * @param managerId
	 */
	public void setManagerId(java.lang.Integer managerId) {
		this.managerId = managerId;
	}
	/**
	 * managerId
	 * @return
	 */
	public java.lang.Integer getManagerId() {
		return this.managerId;
	}
	/**
	 * 设置 roleId
	 * @param roleId
	 */
	public void setRoleId(java.lang.Integer roleId) {
		this.roleId = roleId;
	}
	/**
	 * roleId
	 * @return
	 */
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}
	/**
	 * 设置 state
	 * @param state
	 */
	public void setState(java.lang.Integer state) {
		this.state = state;
	}
	/**
	 * state
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

