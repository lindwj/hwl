
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
public class SdUserItemForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String sdUserItemId;
	/** 辅助核算类编码 */
	private String hslbNo;
	/** 辅助核算类名称 */
	private String hslbNa;
	/** 辅助核算类描述 */
	private String hslbDesc;
	/** 是否有层级特性 */
	private String isLevel;
	/** 自定义核算项json */
	private String hspjt;
	/** 核算类编码规则 */
	private String hslbNoRule;
	/** 账套外键关联 */
	private String sdElectResAccId;
	/** 创建时间 */
	private String createDate;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdUserItemId
	 */
	public void setSdUserItemId(String sdUserItemId) {
		this.sdUserItemId = sdUserItemId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getSdUserItemId() {
		return this.sdUserItemId;
	}
	/**
	 * 设置 辅助核算类编码
	 * @param hslbNo
	 */
	public void setHslbNo(String hslbNo) {
		this.hslbNo = hslbNo;
	}
	/**
	 * 辅助核算类编码
	 * @return
	 */
	public String getHslbNo() {
		return this.hslbNo;
	}
	/**
	 * 设置 辅助核算类名称
	 * @param hslbNa
	 */
	public void setHslbNa(String hslbNa) {
		this.hslbNa = hslbNa;
	}
	/**
	 * 辅助核算类名称
	 * @return
	 */
	public String getHslbNa() {
		return this.hslbNa;
	}
	/**
	 * 设置 辅助核算类描述
	 * @param hslbDesc
	 */
	public void setHslbDesc(String hslbDesc) {
		this.hslbDesc = hslbDesc;
	}
	/**
	 * 辅助核算类描述
	 * @return
	 */
	public String getHslbDesc() {
		return this.hslbDesc;
	}
	/**
	 * 设置 是否有层级特性
	 * @param isLevel
	 */
	public void setIsLevel(String isLevel) {
		this.isLevel = isLevel;
	}
	/**
	 * 是否有层级特性
	 * @return
	 */
	public String getIsLevel() {
		return this.isLevel;
	}
	/**
	 * 设置 自定义核算项json
	 * @param hspjt
	 */
	public void setHspjt(String hspjt) {
		this.hspjt = hspjt;
	}
	/**
	 * 自定义核算项json
	 * @return
	 */
	public String getHspjt() {
		return this.hspjt;
	}
	/**
	 * 设置 核算类编码规则
	 * @param hslbNoRule
	 */
	public void setHslbNoRule(String hslbNoRule) {
		this.hslbNoRule = hslbNoRule;
	}
	/**
	 * 核算类编码规则
	 * @return
	 */
	public String getHslbNoRule() {
		return this.hslbNoRule;
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

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setSdUserItem(SdUserItem sdUserItem){
		if(sdUserItem==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdUserItemId=sdUserItem.getSdUserItemId()==null?"":String.valueOf(sdUserItem.getSdUserItemId());	
		this.hslbNo=sdUserItem.getHslbNo()==null?"":sdUserItem.getHslbNo();	
		this.hslbNa=sdUserItem.getHslbNa()==null?"":sdUserItem.getHslbNa();	
		this.hslbDesc=sdUserItem.getHslbDesc()==null?"":sdUserItem.getHslbDesc();	
		this.isLevel=sdUserItem.getIsLevel()==null?"":sdUserItem.getIsLevel();	
		this.hspjt=sdUserItem.getHspjt()==null?"":sdUserItem.getHspjt();	
		this.hslbNoRule=sdUserItem.getHslbNoRule()==null?"":sdUserItem.getHslbNoRule();	
		this.sdElectResAccId=sdUserItem.getSdElectResAccId()==null?"":String.valueOf(sdUserItem.getSdElectResAccId());	
		this.createDate=sdUserItem.getCreateDate()==null?"":df.format(sdUserItem.getCreateDate());	
		this.page=sdUserItem.getPage();
	}
  
	public SdUserItem getSdUserItem(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdUserItem sdUserItem=new SdUserItem();
		sdUserItem.setSdUserItemId(this.sdUserItemId==null||this.sdUserItemId.length()==0?0:Integer.parseInt(this.sdUserItemId));  
		sdUserItem.setHslbNo(this.hslbNo==null||this.hslbNo.length()==0?"":this.hslbNo);  
		sdUserItem.setHslbNa(this.hslbNa==null||this.hslbNa.length()==0?"":this.hslbNa);  
		sdUserItem.setHslbDesc(this.hslbDesc==null||this.hslbDesc.length()==0?"":this.hslbDesc);  
		sdUserItem.setIsLevel(this.isLevel==null||this.isLevel.length()==0?"":this.isLevel);  
		sdUserItem.setHspjt(this.hspjt==null||this.hspjt.length()==0?"":this.hspjt);  
		sdUserItem.setHslbNoRule(this.hslbNoRule==null||this.hslbNoRule.length()==0?"":this.hslbNoRule);  
		sdUserItem.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		try {
			sdUserItem.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdUserItem.setPage(this.page);	
		return sdUserItem;
	}
  
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("SdUserItemId",getSdUserItemId())
		.append("HslbNo",getHslbNo())
		.append("HslbNa",getHslbNa())
		.append("HslbDesc",getHslbDesc())
		.append("IsLevel",getIsLevel())
		.append("Hspjt",getHspjt())
		.append("HslbNoRule",getHslbNoRule())
		.append("SdElectResAccId",getSdElectResAccId())
		.append("CreateDate",getCreateDate())
		.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdUserItemId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdUserItem == false) return false;
		if(this == obj) return true;
		SdUserItem other = (SdUserItem)obj;
		return new EqualsBuilder()
			.append(getSdUserItemId(),other.getSdUserItemId())
			.isEquals();
	}
}

