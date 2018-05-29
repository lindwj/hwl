
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
public class Nation implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** id */
	private java.lang.Integer id;
	
	private java.lang.Integer shopId;
	/** code */
	private java.lang.String code;
	/** province */
	private java.lang.String province;
	/** city */
	private java.lang.String city;
	/** district */
	private java.lang.String district;
	/** parent */
	private java.lang.Integer parent;
	/** 街道 */
	private java.lang.String street;
	/** 是否为街道 */
	private java.lang.Integer isStreet;
	/** 创建人 */
	private java.lang.Integer createByAdm;
	/** createTime */
	private java.util.Date createTime;
	/** updateTime */
	private java.util.Date updateTime;
	/** 修改人 */
	private java.lang.Integer updateByAdm;
	
private java.lang.Integer menuId;
	
	public java.lang.Integer getMenuId() {
	return menuId;
}
public void setMenuId(java.lang.Integer menuId) {
	this.menuId = menuId;
}
	//columns END
	Page page;

	public java.lang.Integer getShopId() {
		return shopId;
	}
	public void setShopId(java.lang.Integer shopId) {
		this.shopId = shopId;
	}
	/**
	 * 设置 id
	 * @param id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	/**
	 * id
	 * @return
	 */
	public java.lang.Integer getId() {
		return this.id;
	}
	/**
	 * 设置 code
	 * @param code
	 */
	public void setCode(java.lang.String code) {
		this.code = code;
	}
	/**
	 * code
	 * @return
	 */
	public java.lang.String getCode() {
		return this.code;
	}
	/**
	 * 设置 province
	 * @param province
	 */
	public void setProvince(java.lang.String province) {
		this.province = province;
	}
	/**
	 * province
	 * @return
	 */
	public java.lang.String getProvince() {
		return this.province;
	}
	/**
	 * 设置 city
	 * @param city
	 */
	public void setCity(java.lang.String city) {
		this.city = city;
	}
	/**
	 * city
	 * @return
	 */
	public java.lang.String getCity() {
		return this.city;
	}
	/**
	 * 设置 district
	 * @param district
	 */
	public void setDistrict(java.lang.String district) {
		this.district = district;
	}
	/**
	 * district
	 * @return
	 */
	public java.lang.String getDistrict() {
		return this.district;
	}
	/**
	 * 设置 parent
	 * @param parent
	 */
	public void setParent(java.lang.Integer parent) {
		this.parent = parent;
	}
	/**
	 * parent
	 * @return
	 */
	public java.lang.Integer getParent() {
		return this.parent;
	}
	/**
	 * 设置 街道
	 * @param street
	 */
	public void setStreet(java.lang.String street) {
		this.street = street;
	}
	/**
	 * 街道
	 * @return
	 */
	public java.lang.String getStreet() {
		return this.street;
	}
	/**
	 * 设置 是否为街道
	 * @param isStreet
	 */
	public void setIsStreet(java.lang.Integer isStreet) {
		this.isStreet = isStreet;
	}
	/**
	 * 是否为街道
	 * @return
	 */
	public java.lang.Integer getIsStreet() {
		return this.isStreet;
	}
	/**
	 * 设置 创建人
	 * @param createByAdm
	 */
	public void setCreateByAdm(java.lang.Integer createByAdm) {
		this.createByAdm = createByAdm;
	}
	/**
	 * 创建人
	 * @return
	 */
	public java.lang.Integer getCreateByAdm() {
		return this.createByAdm;
	}
	/**
	 * 设置 createTime
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * createTime
	 * @return
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * 设置 updateTime
	 * @param updateTime
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * updateTime
	 * @return
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * 设置 修改人
	 * @param updateByAdm
	 */
	public void setUpdateByAdm(java.lang.Integer updateByAdm) {
		this.updateByAdm = updateByAdm;
	}
	/**
	 * 修改人
	 * @return
	 */
	public java.lang.Integer getUpdateByAdm() {
		return this.updateByAdm;
	}

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	
}

