
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
public class SdglBasicInfoForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** sdglBasicInfoId */
	private String sdglBasicInfoId;
	/** 会计科目编号规则 */
	private String acctIdRule;
	/** 现金流量项目编码规则 */
	private String cashFlowNoRule;
	/** 账套外键 */
	private String sdElectResAccId;
	/** 创建时间 */
	private String createDate;
	//columns END
	Page page;

	/**
	 * 设置 sdglBasicInfoId
	 * @param sdglBasicInfoId
	 */
	public void setSdglBasicInfoId(String sdglBasicInfoId) {
		this.sdglBasicInfoId = sdglBasicInfoId;
	}
	/**
	 * sdglBasicInfoId
	 * @return
	 */
	public String getSdglBasicInfoId() {
		return this.sdglBasicInfoId;
	}
	/**
	 * 设置 会计科目编号规则
	 * @param acctIdRule
	 */
	public void setAcctIdRule(String acctIdRule) {
		this.acctIdRule = acctIdRule;
	}
	/**
	 * 会计科目编号规则
	 * @return
	 */
	public String getAcctIdRule() {
		return this.acctIdRule;
	}
	/**
	 * 设置 现金流量项目编码规则
	 * @param cashFlowNoRule
	 */
	public void setCashFlowNoRule(String cashFlowNoRule) {
		this.cashFlowNoRule = cashFlowNoRule;
	}
	/**
	 * 现金流量项目编码规则
	 * @return
	 */
	public String getCashFlowNoRule() {
		return this.cashFlowNoRule;
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
  
	public void setSdglBasicInfo(SdglBasicInfo sdglBasicInfo){
		if(sdglBasicInfo==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdglBasicInfoId=sdglBasicInfo.getSdglBasicInfoId()==null?"":String.valueOf(sdglBasicInfo.getSdglBasicInfoId());	
		this.acctIdRule=sdglBasicInfo.getAcctIdRule()==null?"":sdglBasicInfo.getAcctIdRule();	
		this.cashFlowNoRule=sdglBasicInfo.getCashFlowNoRule()==null?"":sdglBasicInfo.getCashFlowNoRule();	
		this.sdElectResAccId=sdglBasicInfo.getSdElectResAccId()==null?"":String.valueOf(sdglBasicInfo.getSdElectResAccId());	
		this.createDate=sdglBasicInfo.getCreateDate()==null?"":df.format(sdglBasicInfo.getCreateDate());	
		this.page=sdglBasicInfo.getPage();
	}
  
	public SdglBasicInfo getSdglBasicInfo(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdglBasicInfo sdglBasicInfo=new SdglBasicInfo();
		sdglBasicInfo.setSdglBasicInfoId(this.sdglBasicInfoId==null||this.sdglBasicInfoId.length()==0?0:Integer.parseInt(this.sdglBasicInfoId));  
		sdglBasicInfo.setAcctIdRule(this.acctIdRule==null||this.acctIdRule.length()==0?"":this.acctIdRule);  
		sdglBasicInfo.setCashFlowNoRule(this.cashFlowNoRule==null||this.cashFlowNoRule.length()==0?"":this.cashFlowNoRule);  
		sdglBasicInfo.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		try {
			sdglBasicInfo.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdglBasicInfo.setPage(this.page);	
		return sdglBasicInfo;
	}
  
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("SdglBasicInfoId",getSdglBasicInfoId())
		.append("AcctIdRule",getAcctIdRule())
		.append("CashFlowNoRule",getCashFlowNoRule())
		.append("SdElectResAccId",getSdElectResAccId())
		.append("CreateDate",getCreateDate())
		.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdglBasicInfoId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdglBasicInfo == false) return false;
		if(this == obj) return true;
		SdglBasicInfo other = (SdglBasicInfo)obj;
		return new EqualsBuilder()
			.append(getSdglBasicInfoId(),other.getSdglBasicInfoId())
			.isEquals();
	}
}

