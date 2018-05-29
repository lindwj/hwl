
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
public class ManagerForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** managerId */
	private String managerId;
	/** name */
	private String name;
	/** idNo */
	private String idNo;
	/** province */
	private String province;
	/** city */
	private String city;
	/** district */
	private String district;
	/** street */
	private String street;
	/** shopId */
	private String shopId;
	/** mobile */
	private String mobile;
	/** telephone */
	private String telephone;
	/** 状态             -1 删除             0 默认 草稿             1 上架             2 下架 */
	private String status;
	/** 编码 */
	private String code;
	/** createByAdm */
	private String createByAdm;
	/** createDate */
	private String createDate;
	/** updateByAdm */
	private String updateByAdm;
	/** updateDate */
	private String updateDate;
	/** roleId */
	private String roleId;
	/** password */
	private String password;
	
	private String account;
	//columns END
	Page page;

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
	 * 设置 name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * name
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 设置 idNo
	 * @param idNo
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	/**
	 * idNo
	 * @return
	 */
	public String getIdNo() {
		return this.idNo;
	}
	/**
	 * 设置 province
	 * @param province
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * province
	 * @return
	 */
	public String getProvince() {
		return this.province;
	}
	/**
	 * 设置 city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * city
	 * @return
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * 设置 district
	 * @param district
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * district
	 * @return
	 */
	public String getDistrict() {
		return this.district;
	}
	/**
	 * 设置 street
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * street
	 * @return
	 */
	public String getStreet() {
		return this.street;
	}
	/**
	 * 设置 shopId
	 * @param shopId
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	/**
	 * shopId
	 * @return
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * 设置 mobile
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * mobile
	 * @return
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * 设置 telephone
	 * @param telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * telephone
	 * @return
	 */
	public String getTelephone() {
		return this.telephone;
	}
	/**
	 * 设置 状态             -1 删除             0 默认 草稿             1 上架             2 下架
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 状态             -1 删除             0 默认 草稿             1 上架             2 下架
	 * @return
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * 设置 编码
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 编码
	 * @return
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * 设置 createByAdm
	 * @param createByAdm
	 */
	public void setCreateByAdm(String createByAdm) {
		this.createByAdm = createByAdm;
	}
	/**
	 * createByAdm
	 * @return
	 */
	public String getCreateByAdm() {
		return this.createByAdm;
	}
	/**
	 * 设置 createDate
	 * @param createDate
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	/**
	 * createDate
	 * @return
	 */
	public String getCreateDate() {
		return this.createDate;
	}
	/**
	 * 设置 updateByAdm
	 * @param updateByAdm
	 */
	public void setUpdateByAdm(String updateByAdm) {
		this.updateByAdm = updateByAdm;
	}
	/**
	 * updateByAdm
	 * @return
	 */
	public String getUpdateByAdm() {
		return this.updateByAdm;
	}
	/**
	 * 设置 updateDate
	 * @param updateDate
	 */
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * updateDate
	 * @return
	 */
	public String getUpdateDate() {
		return this.updateDate;
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
	 * 设置 password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * password
	 * @return
	 */
	public String getPassword() {
		return this.password;
	}
	
	

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setManager(Manager manager){
		if(manager==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.managerId=manager.getManagerId()==null?"":String.valueOf(manager.getManagerId());	
		this.name=manager.getName()==null?"":manager.getName();	
		this.idNo=manager.getIdNo()==null?"":manager.getIdNo();	
		this.province=manager.getProvince()==null?"":String.valueOf(manager.getProvince());	
		this.city=manager.getCity()==null?"":String.valueOf(manager.getCity());	
		this.district=manager.getDistrict()==null?"":String.valueOf(manager.getDistrict());	
		this.street=manager.getStreet()==null?"":String.valueOf(manager.getStreet());	
		this.shopId=manager.getShopId()==null?"":String.valueOf(manager.getShopId());	
		this.mobile=manager.getMobile()==null?"":manager.getMobile();	
		this.telephone=manager.getTelephone()==null?"":manager.getTelephone();	
		this.status=manager.getStatus()==null?"":String.valueOf(manager.getStatus());	
		this.code=manager.getCode()==null?"":manager.getCode();	
		this.createByAdm=manager.getCreateByAdm()==null?"":String.valueOf(manager.getCreateByAdm());	
		this.createDate=manager.getCreateDate()==null?"":df.format(manager.getCreateDate());	
		this.updateByAdm=manager.getUpdateByAdm()==null?"":String.valueOf(manager.getUpdateByAdm());	
		this.updateDate=manager.getUpdateDate()==null?"":df.format(manager.getUpdateDate());	
		this.roleId=manager.getRoleId()==null?"":String.valueOf(manager.getRoleId());	
		this.password=manager.getPassword()==null?"":manager.getPassword();	
		this.account=manager.getAccount()==null?"":manager.getAccount();	
		this.page=manager.getPage();
	}
  
	public Manager getManager(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Manager manager=new Manager();
		manager.setManagerId(this.managerId==null||this.managerId.length()==0?0:Integer.parseInt(this.managerId));  
		manager.setName(this.name==null||this.name.length()==0?"":this.name);  
		manager.setIdNo(this.idNo==null||this.idNo.length()==0?"":this.idNo);  
		manager.setProvince(this.province==null||this.province.length()==0?0:Integer.parseInt(this.province));  
		manager.setCity(this.city==null||this.city.length()==0?0:Integer.parseInt(this.city));  
		manager.setDistrict(this.district==null||this.district.length()==0?0:Integer.parseInt(this.district));  
		manager.setStreet(this.street==null||this.street.length()==0?0:Integer.parseInt(this.street));  
		manager.setShopId(this.shopId==null||this.shopId.length()==0?0:Integer.parseInt(this.shopId));  
		manager.setMobile(this.mobile==null||this.mobile.length()==0?"":this.mobile);  
		manager.setTelephone(this.telephone==null||this.telephone.length()==0?"":this.telephone);  
		manager.setStatus(this.status==null||this.status.length()==0?0:Integer.parseInt(this.status));  
		manager.setCode(this.code==null||this.code.length()==0?"":this.code);  
		manager.setCreateByAdm(this.createByAdm==null||this.createByAdm.length()==0?0:Integer.parseInt(this.createByAdm));  
		try {
			manager.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		manager.setUpdateByAdm(this.updateByAdm==null||this.updateByAdm.length()==0?0:Integer.parseInt(this.updateByAdm));  
		try {
			manager.setUpdateDate(this.updateDate==null||this.updateDate.length()==0?null:df.parse(this.updateDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		manager.setRoleId(this.roleId==null||this.roleId.length()==0?0:Integer.parseInt(this.roleId));  
		manager.setPassword(this.password==null||this.password.length()==0?"":this.password);  
		manager.setAccount(this.account==null||this.account.length()==0?"":this.account);  
		
		manager.setPage(this.page);	
		return manager;
	}
  
	
}

