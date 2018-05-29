
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
public class SdAccountForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String sdAccountId;
	/** 科目名称 */
	private String acctName;
	/** 科目类型 */
	private String acctType;
	/** 科目编码 */
	private String acctId;
	/** 科目级次 */
	private String acctLevel;
	/** 余额方向 */
	private String balDc;
	/** 是否数量核算 */
	private String isQtyCal;
	/** 数量核算单位 */
	private String qtyCalUnit;
	/** 外币币种单位 */
	private String fcurUnit;
	/** 是否期末调汇 */
	private String isAdjustRate;
	/** 是否现金类科目 */
	private String multiAcct;
	/** 是否银行类科目 */
	private String isBankAcct;
	/** 是否关联核算类 */
	private String isRelateFzhs;
	/** 父级科目主键 */
	private String psdAccountId;
	/** 关联的辅助核算类别json数据 */
	private String fzhsType;
	/** 账套外键 */
	private String sdElectResAccId;
	/** 创建时间 */
	private String createDate;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdAccountId
	 */
	public void setSdAccountId(String sdAccountId) {
		this.sdAccountId = sdAccountId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getSdAccountId() {
		return this.sdAccountId;
	}
	/**
	 * 设置 科目名称
	 * @param acctName
	 */
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	/**
	 * 科目名称
	 * @return
	 */
	public String getAcctName() {
		return this.acctName;
	}
	/**
	 * 设置 科目类型
	 * @param acctType
	 */
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	/**
	 * 科目类型
	 * @return
	 */
	public String getAcctType() {
		return this.acctType;
	}
	/**
	 * 设置 科目编码
	 * @param acctId
	 */
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	/**
	 * 科目编码
	 * @return
	 */
	public String getAcctId() {
		return this.acctId;
	}
	/**
	 * 设置 科目级次
	 * @param acctLevel
	 */
	public void setAcctLevel(String acctLevel) {
		this.acctLevel = acctLevel;
	}
	/**
	 * 科目级次
	 * @return
	 */
	public String getAcctLevel() {
		return this.acctLevel;
	}
	/**
	 * 设置 余额方向
	 * @param balDc
	 */
	public void setBalDc(String balDc) {
		this.balDc = balDc;
	}
	/**
	 * 余额方向
	 * @return
	 */
	public String getBalDc() {
		return this.balDc;
	}
	/**
	 * 设置 是否数量核算
	 * @param isQtyCal
	 */
	public void setIsQtyCal(String isQtyCal) {
		this.isQtyCal = isQtyCal;
	}
	/**
	 * 是否数量核算
	 * @return
	 */
	public String getIsQtyCal() {
		return this.isQtyCal;
	}
	/**
	 * 设置 数量核算单位
	 * @param qtyCalUnit
	 */
	public void setQtyCalUnit(String qtyCalUnit) {
		this.qtyCalUnit = qtyCalUnit;
	}
	/**
	 * 数量核算单位
	 * @return
	 */
	public String getQtyCalUnit() {
		return this.qtyCalUnit;
	}
	/**
	 * 设置 外币币种单位
	 * @param fcurUnit
	 */
	public void setFcurUnit(String fcurUnit) {
		this.fcurUnit = fcurUnit;
	}
	/**
	 * 外币币种单位
	 * @return
	 */
	public String getFcurUnit() {
		return this.fcurUnit;
	}
	/**
	 * 设置 是否期末调汇
	 * @param isAdjustRate
	 */
	public void setIsAdjustRate(String isAdjustRate) {
		this.isAdjustRate = isAdjustRate;
	}
	/**
	 * 是否期末调汇
	 * @return
	 */
	public String getIsAdjustRate() {
		return this.isAdjustRate;
	}
	/**
	 * 设置 是否现金类科目
	 * @param multiAcct
	 */
	public void setMultiAcct(String multiAcct) {
		this.multiAcct = multiAcct;
	}
	/**
	 * 是否现金类科目
	 * @return
	 */
	public String getMultiAcct() {
		return this.multiAcct;
	}
	/**
	 * 设置 是否银行类科目
	 * @param isBankAcct
	 */
	public void setIsBankAcct(String isBankAcct) {
		this.isBankAcct = isBankAcct;
	}
	/**
	 * 是否银行类科目
	 * @return
	 */
	public String getIsBankAcct() {
		return this.isBankAcct;
	}
	/**
	 * 设置 是否关联核算类
	 * @param isRelateFzhs
	 */
	public void setIsRelateFzhs(String isRelateFzhs) {
		this.isRelateFzhs = isRelateFzhs;
	}
	/**
	 * 是否关联核算类
	 * @return
	 */
	public String getIsRelateFzhs() {
		return this.isRelateFzhs;
	}
	/**
	 * 设置 父级科目主键
	 * @param psdAccountId
	 */
	public void setPsdAccountId(String psdAccountId) {
		this.psdAccountId = psdAccountId;
	}
	/**
	 * 父级科目主键
	 * @return
	 */
	public String getPsdAccountId() {
		return this.psdAccountId;
	}
	/**
	 * 设置 关联的辅助核算类别json数据
	 * @param fzhsType
	 */
	public void setFzhsType(String fzhsType) {
		this.fzhsType = fzhsType;
	}
	/**
	 * 关联的辅助核算类别json数据
	 * @return
	 */
	public String getFzhsType() {
		return this.fzhsType;
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
  
	public void setSdAccount(SdAccount sdAccount){
		if(sdAccount==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdAccountId=sdAccount.getSdAccountId()==null?"":String.valueOf(sdAccount.getSdAccountId());	
		this.acctName=sdAccount.getAcctName()==null?"":sdAccount.getAcctName();	
		this.acctType=sdAccount.getAcctType()==null?"":sdAccount.getAcctType();	
		this.acctId=sdAccount.getAcctId()==null?"":String.valueOf(sdAccount.getAcctId());	
		this.acctLevel=sdAccount.getAcctLevel()==null?"":String.valueOf(sdAccount.getAcctLevel());	
		this.balDc=sdAccount.getBalDc()==null?"":sdAccount.getBalDc();	
		this.isQtyCal=sdAccount.getIsQtyCal()==null?"":sdAccount.getIsQtyCal();	
		this.qtyCalUnit=sdAccount.getQtyCalUnit()==null?"":sdAccount.getQtyCalUnit();	
		this.fcurUnit=sdAccount.getFcurUnit()==null?"":sdAccount.getFcurUnit();	
		this.isAdjustRate=sdAccount.getIsAdjustRate()==null?"":sdAccount.getIsAdjustRate();	
		this.multiAcct=sdAccount.getMultiAcct()==null?"":sdAccount.getMultiAcct();	
		this.isBankAcct=sdAccount.getIsBankAcct()==null?"":sdAccount.getIsBankAcct();	
		this.isRelateFzhs=sdAccount.getIsRelateFzhs()==null?"":sdAccount.getIsRelateFzhs();	
		this.psdAccountId=sdAccount.getPsdAccountId()==null?"":String.valueOf(sdAccount.getPsdAccountId());	
		this.fzhsType=sdAccount.getFzhsType()==null?"":sdAccount.getFzhsType();	
		this.sdElectResAccId=sdAccount.getSdElectResAccId()==null?"":String.valueOf(sdAccount.getSdElectResAccId());	
		this.createDate=sdAccount.getCreateDate()==null?"":df.format(sdAccount.getCreateDate());	
		this.page=sdAccount.getPage();
	}
  
	public SdAccount getSdAccount(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdAccount sdAccount=new SdAccount();
		sdAccount.setSdAccountId(this.sdAccountId==null||this.sdAccountId.length()==0?0:Integer.parseInt(this.sdAccountId));  
		sdAccount.setAcctName(this.acctName==null||this.acctName.length()==0?"":this.acctName);  
		sdAccount.setAcctType(this.acctType==null||this.acctType.length()==0?"":this.acctType);  
//		sdAccount.setAcctId(this.acctId==null||this.acctId.length()==0?0:Integer.parseInt(this.acctId));  
		sdAccount.setAcctLevel(this.acctLevel==null||this.acctLevel.length()==0?0:Integer.parseInt(this.acctLevel));  
		sdAccount.setBalDc(this.balDc==null||this.balDc.length()==0?"":this.balDc);  
		sdAccount.setIsQtyCal(this.isQtyCal==null||this.isQtyCal.length()==0?"":this.isQtyCal);  
		sdAccount.setQtyCalUnit(this.qtyCalUnit==null||this.qtyCalUnit.length()==0?"":this.qtyCalUnit);  
		sdAccount.setFcurUnit(this.fcurUnit==null||this.fcurUnit.length()==0?"":this.fcurUnit);  
		sdAccount.setIsAdjustRate(this.isAdjustRate==null||this.isAdjustRate.length()==0?"":this.isAdjustRate);  
		sdAccount.setMultiAcct(this.multiAcct==null||this.multiAcct.length()==0?"":this.multiAcct);  
		sdAccount.setIsBankAcct(this.isBankAcct==null||this.isBankAcct.length()==0?"":this.isBankAcct);  
		sdAccount.setIsRelateFzhs(this.isRelateFzhs==null||this.isRelateFzhs.length()==0?"":this.isRelateFzhs);  
		sdAccount.setPsdAccountId(this.psdAccountId==null||this.psdAccountId.length()==0?0:Integer.parseInt(this.psdAccountId));  
		sdAccount.setFzhsType(this.fzhsType==null||this.fzhsType.length()==0?"":this.fzhsType);  
		sdAccount.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		try {
			sdAccount.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdAccount.setPage(this.page);	
		return sdAccount;
	}
  
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("SdAccountId",getSdAccountId())
		.append("AcctName",getAcctName())
		.append("AcctType",getAcctType())
		.append("AcctId",getAcctId())
		.append("AcctLevel",getAcctLevel())
		.append("BalDc",getBalDc())
		.append("IsQtyCal",getIsQtyCal())
		.append("QtyCalUnit",getQtyCalUnit())
		.append("FcurUnit",getFcurUnit())
		.append("IsAdjustRate",getIsAdjustRate())
		.append("MultiAcct",getMultiAcct())
		.append("IsBankAcct",getIsBankAcct())
		.append("IsRelateFzhs",getIsRelateFzhs())
		.append("PsdAccountId",getPsdAccountId())
		.append("FzhsType",getFzhsType())
		.append("SdElectResAccId",getSdElectResAccId())
		.append("CreateDate",getCreateDate())
		.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdAccountId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdAccount == false) return false;
		if(this == obj) return true;
		SdAccount other = (SdAccount)obj;
		return new EqualsBuilder()
			.append(getSdAccountId(),other.getSdAccountId())
			.isEquals();
	}
}

