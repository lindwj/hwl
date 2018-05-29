
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
public class SdCustomerForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String sdCustomerId;
	/** 辅助核算类别外键 */
	private String sdUserItemId;
	/** 客户名称 */
	private String custName;
	/** 客户编码 */
	private String custNo;
	/** 客户简称 */
	private String custShortName;
	/** 创建时间 */
	private String createDate;
	/** 账套外键关联 */
	private String sdElectResAccId;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdCustomerId
	 */
	public void setSdCustomerId(String sdCustomerId) {
		this.sdCustomerId = sdCustomerId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getSdCustomerId() {
		return this.sdCustomerId;
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
	 * 设置 客户名称
	 * @param custName
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * 客户名称
	 * @return
	 */
	public String getCustName() {
		return this.custName;
	}
	/**
	 * 设置 客户编码
	 * @param custNo
	 */
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	/**
	 * 客户编码
	 * @return
	 */
	public String getCustNo() {
		return this.custNo;
	}
	/**
	 * 设置 客户简称
	 * @param custShortName
	 */
	public void setCustShortName(String custShortName) {
		this.custShortName = custShortName;
	}
	/**
	 * 客户简称
	 * @return
	 */
	public String getCustShortName() {
		return this.custShortName;
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
  
	public void setSdCustomer(SdCustomer sdCustomer){
		if(sdCustomer==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdCustomerId=sdCustomer.getSdCustomerId()==null?"":String.valueOf(sdCustomer.getSdCustomerId());	
		this.sdUserItemId=sdCustomer.getSdUserItemId()==null?"":String.valueOf(sdCustomer.getSdUserItemId());	
		this.custName=sdCustomer.getCustName()==null?"":sdCustomer.getCustName();	
		this.custNo=sdCustomer.getCustNo()==null?"":sdCustomer.getCustNo();	
		this.custShortName=sdCustomer.getCustShortName()==null?"":sdCustomer.getCustShortName();	
		this.createDate=sdCustomer.getCreateDate()==null?"":df.format(sdCustomer.getCreateDate());	
		this.sdElectResAccId=sdCustomer.getSdElectResAccId()==null?"":String.valueOf(sdCustomer.getSdElectResAccId());	
		this.page=sdCustomer.getPage();
	}
  
	public SdCustomer getSdCustomer(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdCustomer sdCustomer=new SdCustomer();
		sdCustomer.setSdCustomerId(this.sdCustomerId==null||this.sdCustomerId.length()==0?0:Integer.parseInt(this.sdCustomerId));  
		sdCustomer.setSdUserItemId(this.sdUserItemId==null||this.sdUserItemId.length()==0?0:Integer.parseInt(this.sdUserItemId));  
		sdCustomer.setCustName(this.custName==null||this.custName.length()==0?"":this.custName);  
		sdCustomer.setCustNo(this.custNo==null||this.custNo.length()==0?"":this.custNo);  
		sdCustomer.setCustShortName(this.custShortName==null||this.custShortName.length()==0?"":this.custShortName);  
		try {
			sdCustomer.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdCustomer.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		sdCustomer.setPage(this.page);	
		return sdCustomer;
	}
  
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("SdCustomerId",getSdCustomerId())
		.append("SdUserItemId",getSdUserItemId())
		.append("CustName",getCustName())
		.append("CustNo",getCustNo())
		.append("CustShortName",getCustShortName())
		.append("CreateDate",getCreateDate())
		.append("SdElectResAccId",getSdElectResAccId())
		.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdCustomerId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdCustomer == false) return false;
		if(this == obj) return true;
		SdCustomer other = (SdCustomer)obj;
		return new EqualsBuilder()
			.append(getSdCustomerId(),other.getSdCustomerId())
			.isEquals();
	}
}

