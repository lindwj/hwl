
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
public class SdElectResAccForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** sdElectResAccId */
	private String sdElectResAccId;
	/** 账套名称 */
	private String ztName;
	/** 账套编号 */
	private String ztNumber;
	/** 会计核算单位 */
	private String acctUnit;
	/** 组织机构代码 */
	private String orgId;
	/** 本位币 */
	private String stdCurrency;
	/** 会计年度 */
	private String fyear;
	/** 标准版本号 */
	private String stdVerNumber;
	/** 状态：-1失效 1生效  */
	private String status;
	/** 创建时间 */
	private String createDate;
	//columns END
	Page page;

	/**
	 * 设置 sdElectResAccId
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(String sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * sdElectResAccId
	 * @return
	 */
	public String getSdElectResAccId() {
		return this.sdElectResAccId;
	}
	/**
	 * 设置 账套名称
	 * @param ztName
	 */
	public void setZtName(String ztName) {
		this.ztName = ztName;
	}
	/**
	 * 账套名称
	 * @return
	 */
	public String getZtName() {
		return this.ztName;
	}
	/**
	 * 设置 账套编号
	 * @param ztNumber
	 */
	public void setZtNumber(String ztNumber) {
		this.ztNumber = ztNumber;
	}
	/**
	 * 账套编号
	 * @return
	 */
	public String getZtNumber() {
		return this.ztNumber;
	}
	/**
	 * 设置 会计核算单位
	 * @param acctUnit
	 */
	public void setAcctUnit(String acctUnit) {
		this.acctUnit = acctUnit;
	}
	/**
	 * 会计核算单位
	 * @return
	 */
	public String getAcctUnit() {
		return this.acctUnit;
	}
	/**
	 * 设置 组织机构代码
	 * @param orgId
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	/**
	 * 组织机构代码
	 * @return
	 */
	public String getOrgId() {
		return this.orgId;
	}
	/**
	 * 设置 本位币
	 * @param stdCurrency
	 */
	public void setStdCurrency(String stdCurrency) {
		this.stdCurrency = stdCurrency;
	}
	/**
	 * 本位币
	 * @return
	 */
	public String getStdCurrency() {
		return this.stdCurrency;
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
	 * 设置 标准版本号
	 * @param stdVerNumber
	 */
	public void setStdVerNumber(String stdVerNumber) {
		this.stdVerNumber = stdVerNumber;
	}
	/**
	 * 标准版本号
	 * @return
	 */
	public String getStdVerNumber() {
		return this.stdVerNumber;
	}
	/**
	 * 设置 状态：-1失效 1生效 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 状态：-1失效 1生效 
	 * @return
	 */
	public String getStatus() {
		return this.status;
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
  
	public void setSdElectResAcc(SdElectResAcc sdElectResAcc){
		if(sdElectResAcc==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdElectResAccId=sdElectResAcc.getSdElectResAccId()==null?"":String.valueOf(sdElectResAcc.getSdElectResAccId());	
		this.ztName=sdElectResAcc.getZtName()==null?"":sdElectResAcc.getZtName();	
		this.ztNumber=sdElectResAcc.getZtNumber()==null?"":sdElectResAcc.getZtNumber();	
		this.acctUnit=sdElectResAcc.getAcctUnit()==null?"":sdElectResAcc.getAcctUnit();	
		this.orgId=sdElectResAcc.getOrgId()==null?"":sdElectResAcc.getOrgId();	
		this.stdCurrency=sdElectResAcc.getStdCurrency()==null?"":sdElectResAcc.getStdCurrency();	
		this.fyear=sdElectResAcc.getFyear()==null?"":sdElectResAcc.getFyear();	
		this.stdVerNumber=sdElectResAcc.getStdVerNumber()==null?"":sdElectResAcc.getStdVerNumber();	
		this.status=sdElectResAcc.getStatus()==null?"":String.valueOf(sdElectResAcc.getStatus());	
		this.createDate=sdElectResAcc.getCreateDate()==null?"":df.format(sdElectResAcc.getCreateDate());	
		this.page=sdElectResAcc.getPage();
	}
  
	public SdElectResAcc getSdElectResAcc(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdElectResAcc sdElectResAcc=new SdElectResAcc();
		sdElectResAcc.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		sdElectResAcc.setZtName(this.ztName==null||this.ztName.length()==0?"":this.ztName);  
		sdElectResAcc.setZtNumber(this.ztNumber==null||this.ztNumber.length()==0?"":this.ztNumber);  
		sdElectResAcc.setAcctUnit(this.acctUnit==null||this.acctUnit.length()==0?"":this.acctUnit);  
		sdElectResAcc.setOrgId(this.orgId==null||this.orgId.length()==0?"":this.orgId);  
		sdElectResAcc.setStdCurrency(this.stdCurrency==null||this.stdCurrency.length()==0?"":this.stdCurrency);  
		sdElectResAcc.setFyear(this.fyear==null||this.fyear.length()==0?"":this.fyear);  
		sdElectResAcc.setStdVerNumber(this.stdVerNumber==null||this.stdVerNumber.length()==0?"":this.stdVerNumber);  
		sdElectResAcc.setStatus(this.status==null||this.status.length()==0?0:Integer.parseInt(this.status));  
		try {
			sdElectResAcc.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdElectResAcc.setPage(this.page);	
		return sdElectResAcc;
	}
  
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("SdElectResAccId",getSdElectResAccId())
		.append("ZtName",getZtName())
		.append("ZtNumber",getZtNumber())
		.append("AcctUnit",getAcctUnit())
		.append("OrgId",getOrgId())
		.append("StdCurrency",getStdCurrency())
		.append("Fyear",getFyear())
		.append("StdVerNumber",getStdVerNumber())
		.append("Status",getStatus())
		.append("CreateDate",getCreateDate())
		.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdElectResAccId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdElectResAcc == false) return false;
		if(this == obj) return true;
		SdElectResAcc other = (SdElectResAcc)obj;
		return new EqualsBuilder()
			.append(getSdElectResAccId(),other.getSdElectResAccId())
			.isEquals();
	}
}

