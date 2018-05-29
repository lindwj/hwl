
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
public class SdSupplyForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String sdSupplyId;
	/** 辅助核算类别外键 */
	private String sdUserItemId;
	/** 供应商编码 */
	private String supplyNo;
	/** 供应商名称 */
	private String supplyName;
	/** 供应商简称 */
	private String supplyShortName;
	/** 创建时间 */
	private String createDate;
	/** 账套外键关联 */
	private String sdElectResAccId;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdSupplyId
	 */
	public void setSdSupplyId(String sdSupplyId) {
		this.sdSupplyId = sdSupplyId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getSdSupplyId() {
		return this.sdSupplyId;
	}
	/**
	 * 设置 辅助核算类别外键
	 * @param sdUserItemId
	 */
	public void setSdUserItemId(String sdUserItemId) {
		this.sdUserItemId = sdUserItemId;
	}
	/**
	 * 辅助核算类别外键
	 * @return
	 */
	public String getSdUserItemId() {
		return this.sdUserItemId;
	}
	/**
	 * 设置 供应商编码
	 * @param supplyNo
	 */
	public void setSupplyNo(String supplyNo) {
		this.supplyNo = supplyNo;
	}
	/**
	 * 供应商编码
	 * @return
	 */
	public String getSupplyNo() {
		return this.supplyNo;
	}
	/**
	 * 设置 供应商名称
	 * @param supplyName
	 */
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}
	/**
	 * 供应商名称
	 * @return
	 */
	public String getSupplyName() {
		return this.supplyName;
	}
	/**
	 * 设置 供应商简称
	 * @param supplyShortName
	 */
	public void setSupplyShortName(String supplyShortName) {
		this.supplyShortName = supplyShortName;
	}
	/**
	 * 供应商简称
	 * @return
	 */
	public String getSupplyShortName() {
		return this.supplyShortName;
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

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setSdSupply(SdSupply sdSupply){
		if(sdSupply==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdSupplyId=sdSupply.getSdSupplyId()==null?"":String.valueOf(sdSupply.getSdSupplyId());	
		this.sdUserItemId=sdSupply.getSdUserItemId()==null?"":String.valueOf(sdSupply.getSdUserItemId());	
		this.supplyNo=sdSupply.getSupplyNo()==null?"":sdSupply.getSupplyNo();	
		this.supplyName=sdSupply.getSupplyName()==null?"":sdSupply.getSupplyName();	
		this.supplyShortName=sdSupply.getSupplyShortName()==null?"":sdSupply.getSupplyShortName();	
		this.createDate=sdSupply.getCreateDate()==null?"":df.format(sdSupply.getCreateDate());	
		this.sdElectResAccId=sdSupply.getSdElectResAccId()==null?"":String.valueOf(sdSupply.getSdElectResAccId());	
		this.page=sdSupply.getPage();
	}
  
	public SdSupply getSdSupply(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdSupply sdSupply=new SdSupply();
		sdSupply.setSdSupplyId(this.sdSupplyId==null||this.sdSupplyId.length()==0?0:Integer.parseInt(this.sdSupplyId));  
		sdSupply.setSdUserItemId(this.sdUserItemId==null||this.sdUserItemId.length()==0?0:Integer.parseInt(this.sdUserItemId));  
		sdSupply.setSupplyNo(this.supplyNo==null||this.supplyNo.length()==0?"":this.supplyNo);  
		sdSupply.setSupplyName(this.supplyName==null||this.supplyName.length()==0?"":this.supplyName);  
		sdSupply.setSupplyShortName(this.supplyShortName==null||this.supplyShortName.length()==0?"":this.supplyShortName);  
		try {
			sdSupply.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdSupply.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		sdSupply.setPage(this.page);	
		return sdSupply;
	}
  
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("SdSupplyId",getSdSupplyId())
		.append("SdUserItemId",getSdUserItemId())
		.append("SupplyNo",getSupplyNo())
		.append("SupplyName",getSupplyName())
		.append("SupplyShortName",getSupplyShortName())
		.append("CreateDate",getCreateDate())
		.append("SdElectResAccId",getSdElectResAccId())
		.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdSupplyId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdSupply == false) return false;
		if(this == obj) return true;
		SdSupply other = (SdSupply)obj;
		return new EqualsBuilder()
			.append(getSdSupplyId(),other.getSdSupplyId())
			.isEquals();
	}
}

