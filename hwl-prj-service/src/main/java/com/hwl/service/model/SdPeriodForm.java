
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
public class SdPeriodForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** sdPeriodId */
	private String sdPeriodId;
	/** 会计年度 */
	private String fyear;
	/** 会计期间号 */
	private String perdNumber;
	/** 会计期间起始日期 */
	private String perdStartDate;
	/** 会计期间结束日期 */
	private String perdEndDate;
	/** 会计期间状态 */
	private String perdStatus;
	/** 账套外键 */
	private String sdElectResAccId;
	/** 创建时间 */
	private String createDate;
	//columns END
	Page page;

	/**
	 * 设置 sdPeriodId
	 * @param sdPeriodId
	 */
	public void setSdPeriodId(String sdPeriodId) {
		this.sdPeriodId = sdPeriodId;
	}
	/**
	 * sdPeriodId
	 * @return
	 */
	public String getSdPeriodId() {
		return this.sdPeriodId;
	}
	/**
	 * 设置 会计年度
	 * @param fyear
	 */
	public void setFyear(String fyear) {
		this.fyear = fyear;
	}
	/**
	 * 会计年度
	 * @return
	 */
	public String getFyear() {
		return this.fyear;
	}
	/**
	 * 设置 会计期间号
	 * @param perdNumber
	 */
	public void setPerdNumber(String perdNumber) {
		this.perdNumber = perdNumber;
	}
	/**
	 * 会计期间号
	 * @return
	 */
	public String getPerdNumber() {
		return this.perdNumber;
	}
	/**
	 * 设置 会计期间起始日期
	 * @param perdStartDate
	 */
	public void setPerdStartDate(String perdStartDate) {
		this.perdStartDate = perdStartDate;
	}
	/**
	 * 会计期间起始日期
	 * @return
	 */
	public String getPerdStartDate() {
		return this.perdStartDate;
	}
	/**
	 * 设置 会计期间结束日期
	 * @param perdEndDate
	 */
	public void setPerdEndDate(String perdEndDate) {
		this.perdEndDate = perdEndDate;
	}
	/**
	 * 会计期间结束日期
	 * @return
	 */
	public String getPerdEndDate() {
		return this.perdEndDate;
	}
	/**
	 * 设置 会计期间状态
	 * @param perdStatus
	 */
	public void setPerdStatus(String perdStatus) {
		this.perdStatus = perdStatus;
	}
	/**
	 * 会计期间状态
	 * @return
	 */
	public String getPerdStatus() {
		return this.perdStatus;
	}
	/**
	 * 设置 账套外键
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(String sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * 账套外键
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
  
	public void setSdPeriod(SdPeriod sdPeriod){
		if(sdPeriod==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdPeriodId=sdPeriod.getSdPeriodId()==null?"":String.valueOf(sdPeriod.getSdPeriodId());	
		this.fyear=sdPeriod.getFyear()==null?"":sdPeriod.getFyear();	
		this.perdNumber=sdPeriod.getPerdNumber()==null?"":String.valueOf(sdPeriod.getPerdNumber());	
		this.perdStartDate=sdPeriod.getPerdStartDate()==null?"":df.format(sdPeriod.getPerdStartDate());	
		this.perdEndDate=sdPeriod.getPerdEndDate()==null?"":df.format(sdPeriod.getPerdEndDate());	
		this.perdStatus=sdPeriod.getPerdStatus()==null?"":sdPeriod.getPerdStatus();	
		this.sdElectResAccId=sdPeriod.getSdElectResAccId()==null?"":String.valueOf(sdPeriod.getSdElectResAccId());	
		this.createDate=sdPeriod.getCreateDate()==null?"":df.format(sdPeriod.getCreateDate());	
		this.page=sdPeriod.getPage();
	}
  
	public SdPeriod getSdPeriod(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdPeriod sdPeriod=new SdPeriod();
		sdPeriod.setSdPeriodId(this.sdPeriodId==null||this.sdPeriodId.length()==0?0:Integer.parseInt(this.sdPeriodId));  
		sdPeriod.setFyear(this.fyear==null||this.fyear.length()==0?"":this.fyear);  
		sdPeriod.setPerdNumber(this.perdNumber==null||this.perdNumber.length()==0?0:Integer.parseInt(this.perdNumber));  
		try {
			sdPeriod.setPerdStartDate(this.perdStartDate==null||this.perdStartDate.length()==0?null:df.parse(this.perdStartDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			sdPeriod.setPerdEndDate(this.perdEndDate==null||this.perdEndDate.length()==0?null:df.parse(this.perdEndDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdPeriod.setPerdStatus(this.perdStatus==null||this.perdStatus.length()==0?"":this.perdStatus);  
		sdPeriod.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		try {
			sdPeriod.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdPeriod.setPage(this.page);	
		return sdPeriod;
	}
  
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("SdPeriodId",getSdPeriodId())
		.append("Fyear",getFyear())
		.append("PerdNumber",getPerdNumber())
		.append("PerdStartDate",getPerdStartDate())
		.append("PerdEndDate",getPerdEndDate())
		.append("PerdStatus",getPerdStatus())
		.append("SdElectResAccId",getSdElectResAccId())
		.append("CreateDate",getCreateDate())
		.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdPeriodId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdPeriod == false) return false;
		if(this == obj) return true;
		SdPeriod other = (SdPeriod)obj;
		return new EqualsBuilder()
			.append(getSdPeriodId(),other.getSdPeriodId())
			.isEquals();
	}
}

