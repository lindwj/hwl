
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
public class NationForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** id */
	private String id;
	/** code */
	private String code;
	/** province */
	private String province;
	/** city */
	private String city;
	/** district */
	private String district;
	/** parent */
	private String parent;
	/** 街道 */
	private String street;
	/** 是否为街道 */
	private String isStreet;
	/** 创建人 */
	private String createByAdm;
	/** createTime */
	private String createTime;
	/** updateTime */
	private String updateTime;
	/** 修改人 */
	private String updateByAdm;
	//columns END
	Page page;

	/**
	 * 设置 id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * id
	 * @return
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * 设置 code
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * code
	 * @return
	 */
	public String getCode() {
		return this.code;
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
	 * 设置 parent
	 * @param parent
	 */
	public void setParent(String parent) {
		this.parent = parent;
	}
	/**
	 * parent
	 * @return
	 */
	public String getParent() {
		return this.parent;
	}
	/**
	 * 设置 街道
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * 街道
	 * @return
	 */
	public String getStreet() {
		return this.street;
	}
	/**
	 * 设置 是否为街道
	 * @param isStreet
	 */
	public void setIsStreet(String isStreet) {
		this.isStreet = isStreet;
	}
	/**
	 * 是否为街道
	 * @return
	 */
	public String getIsStreet() {
		return this.isStreet;
	}
	/**
	 * 设置 创建人
	 * @param createByAdm
	 */
	public void setCreateByAdm(String createByAdm) {
		this.createByAdm = createByAdm;
	}
	/**
	 * 创建人
	 * @return
	 */
	public String getCreateByAdm() {
		return this.createByAdm;
	}
	/**
	 * 设置 createTime
	 * @param createTime
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * createTime
	 * @return
	 */
	public String getCreateTime() {
		return this.createTime;
	}
	/**
	 * 设置 updateTime
	 * @param updateTime
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * updateTime
	 * @return
	 */
	public String getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * 设置 修改人
	 * @param updateByAdm
	 */
	public void setUpdateByAdm(String updateByAdm) {
		this.updateByAdm = updateByAdm;
	}
	/**
	 * 修改人
	 * @return
	 */
	public String getUpdateByAdm() {
		return this.updateByAdm;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setNation(Nation nation){
		if(nation==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.id=nation.getId()==null?"":String.valueOf(nation.getId());	
		this.code=nation.getCode()==null?"":nation.getCode();	
		this.province=nation.getProvince()==null?"":nation.getProvince();	
		this.city=nation.getCity()==null?"":nation.getCity();	
		this.district=nation.getDistrict()==null?"":nation.getDistrict();	
		this.parent=nation.getParent()==null?"":String.valueOf(nation.getParent());	
		this.street=nation.getStreet()==null?"":nation.getStreet();	
		this.isStreet=nation.getIsStreet()==null?"":String.valueOf(nation.getIsStreet());	
		this.createByAdm=nation.getCreateByAdm()==null?"":String.valueOf(nation.getCreateByAdm());	
		this.createTime=nation.getCreateTime()==null?"":df.format(nation.getCreateTime());	
		this.updateTime=nation.getUpdateTime()==null?"":df.format(nation.getUpdateTime());	
		this.updateByAdm=nation.getUpdateByAdm()==null?"":String.valueOf(nation.getUpdateByAdm());	
		this.page=nation.getPage();
	}
  
	public Nation getNation(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Nation nation=new Nation();
		nation.setId(this.id==null||this.id.length()==0?0:Integer.parseInt(this.id));  
		nation.setCode(this.code==null||this.code.length()==0?"":this.code);  
		nation.setProvince(this.province==null||this.province.length()==0?"":this.province);  
		nation.setCity(this.city==null||this.city.length()==0?"":this.city);  
		nation.setDistrict(this.district==null||this.district.length()==0?"":this.district);  
		nation.setParent(this.parent==null||this.parent.length()==0?0:Integer.parseInt(this.parent));  
		nation.setStreet(this.street==null||this.street.length()==0?"":this.street);  
		nation.setIsStreet(this.isStreet==null||this.isStreet.length()==0?0:Integer.parseInt(this.isStreet));  
		nation.setCreateByAdm(this.createByAdm==null||this.createByAdm.length()==0?0:Integer.parseInt(this.createByAdm));  
		try {
			nation.setCreateTime(this.createTime==null||this.createTime.length()==0?null:df.parse(this.createTime));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			nation.setUpdateTime(this.updateTime==null||this.updateTime.length()==0?null:df.parse(this.updateTime));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nation.setUpdateByAdm(this.updateByAdm==null||this.updateByAdm.length()==0?0:Integer.parseInt(this.updateByAdm));  
		nation.setPage(this.page);	
		return nation;
	}
  
	
}

