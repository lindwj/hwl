
package com.hwl.service.model;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import java.io.Serializable;
import com.hwl.service.common.Page;

/**
 * @author lind
 *
 */
public class SdAccount implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer sdAccountId;
	/** 科目名称 */
	private java.lang.String acctName;
	/** 科目类型 */
	private java.lang.String acctType;
	/** 科目编码 */
	private java.lang.String acctId;
	/** 科目级次 */
	private java.lang.Integer acctLevel;
	/** 余额方向 */
	private java.lang.String balDc;
	/** 是否数量核算 */
	private java.lang.String isQtyCal;
	/** 数量核算单位 */
	private java.lang.String qtyCalUnit;
	/** 外币币种单位 */
	private java.lang.String fcurUnit;
	/** 是否期末调汇 */
	private java.lang.String isAdjustRate;
	/** 是否现金类科目 */
	private java.lang.String multiAcct;
	/** 是否银行类科目 */
	private java.lang.String isBankAcct;
	/** 是否关联核算类 */
	private java.lang.String isRelateFzhs;
	/** 父级科目主键 */
	private java.lang.Integer psdAccountId;
	/** 关联的辅助核算类别json数据 */
	private java.lang.String fzhsType;
	/** 账套外键 */
	private java.lang.Integer sdElectResAccId;
	/** 创建时间 */
	private java.util.Date createDate;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdAccountId
	 */
	public void setSdAccountId(java.lang.Integer sdAccountId) {
		this.sdAccountId = sdAccountId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getSdAccountId() {
		return this.sdAccountId;
	}
	/**
	 * 设置 科目名称
	 * @param acctName
	 */
	public void setAcctName(java.lang.String acctName) {
		this.acctName = acctName;
	}
	/**
	 * 科目名称
	 * @return
	 */
	public java.lang.String getAcctName() {
		return this.acctName;
	}
	/**
	 * 设置 科目类型
	 * @param acctType
	 */
	public void setAcctType(java.lang.String acctType) {
		this.acctType = acctType;
	}
	/**
	 * 科目类型
	 * @return
	 */
	public java.lang.String getAcctType() {
		return this.acctType;
	}
	/**
	 * 设置 科目编码
	 * @param acctId
	 */
	public void setAcctId(java.lang.String acctId) {
		this.acctId = acctId;
	}
	/**
	 * 科目编码
	 * @return
	 */
	public java.lang.String getAcctId() {
		return this.acctId;
	}
	/**
	 * 设置 科目级次
	 * @param acctLevel
	 */
	public void setAcctLevel(java.lang.Integer acctLevel) {
		this.acctLevel = acctLevel;
	}
	/**
	 * 科目级次
	 * @return
	 */
	public java.lang.Integer getAcctLevel() {
		return this.acctLevel;
	}
	/**
	 * 设置 余额方向
	 * @param balDc
	 */
	public void setBalDc(java.lang.String balDc) {
		this.balDc = balDc;
	}
	/**
	 * 余额方向
	 * @return
	 */
	public java.lang.String getBalDc() {
		return this.balDc;
	}
	/**
	 * 设置 是否数量核算
	 * @param isQtyCal
	 */
	public void setIsQtyCal(java.lang.String isQtyCal) {
		this.isQtyCal = isQtyCal;
	}
	/**
	 * 是否数量核算
	 * @return
	 */
	public java.lang.String getIsQtyCal() {
		return this.isQtyCal;
	}
	/**
	 * 设置 数量核算单位
	 * @param qtyCalUnit
	 */
	public void setQtyCalUnit(java.lang.String qtyCalUnit) {
		this.qtyCalUnit = qtyCalUnit;
	}
	/**
	 * 数量核算单位
	 * @return
	 */
	public java.lang.String getQtyCalUnit() {
		return this.qtyCalUnit;
	}
	/**
	 * 设置 外币币种单位
	 * @param fcurUnit
	 */
	public void setFcurUnit(java.lang.String fcurUnit) {
		this.fcurUnit = fcurUnit;
	}
	/**
	 * 外币币种单位
	 * @return
	 */
	public java.lang.String getFcurUnit() {
		return this.fcurUnit;
	}
	/**
	 * 设置 是否期末调汇
	 * @param isAdjustRate
	 */
	public void setIsAdjustRate(java.lang.String isAdjustRate) {
		this.isAdjustRate = isAdjustRate;
	}
	/**
	 * 是否期末调汇
	 * @return
	 */
	public java.lang.String getIsAdjustRate() {
		return this.isAdjustRate;
	}
	/**
	 * 设置 是否现金类科目
	 * @param multiAcct
	 */
	public void setMultiAcct(java.lang.String multiAcct) {
		this.multiAcct = multiAcct;
	}
	/**
	 * 是否现金类科目
	 * @return
	 */
	public java.lang.String getMultiAcct() {
		return this.multiAcct;
	}
	/**
	 * 设置 是否银行类科目
	 * @param isBankAcct
	 */
	public void setIsBankAcct(java.lang.String isBankAcct) {
		this.isBankAcct = isBankAcct;
	}
	/**
	 * 是否银行类科目
	 * @return
	 */
	public java.lang.String getIsBankAcct() {
		return this.isBankAcct;
	}
	/**
	 * 设置 是否关联核算类
	 * @param isRelateFzhs
	 */
	public void setIsRelateFzhs(java.lang.String isRelateFzhs) {
		this.isRelateFzhs = isRelateFzhs;
	}
	/**
	 * 是否关联核算类
	 * @return
	 */
	public java.lang.String getIsRelateFzhs() {
		return this.isRelateFzhs;
	}
	/**
	 * 设置 父级科目主键
	 * @param psdAccountId
	 */
	public void setPsdAccountId(java.lang.Integer psdAccountId) {
		this.psdAccountId = psdAccountId;
	}
	/**
	 * 父级科目主键
	 * @return
	 */
	public java.lang.Integer getPsdAccountId() {
		return this.psdAccountId;
	}
	/**
	 * 设置 关联的辅助核算类别json数据
	 * @param fzhsType
	 */
	public void setFzhsType(java.lang.String fzhsType) {
		this.fzhsType = fzhsType;
	}
	/**
	 * 关联的辅助核算类别json数据
	 * @return
	 */
	public java.lang.String getFzhsType() {
		return this.fzhsType;
	}
	/**
	 * 设置 账套外键
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(java.lang.Integer sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * 账套外键
	 * @return
	 */
	public java.lang.Integer getSdElectResAccId() {
		return this.sdElectResAccId;
	}
	/**
	 * 设置 创建时间
	 * @param createDate
	 */
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 创建时间
	 * @return
	 */
	public java.util.Date getCreateDate() {
		return this.createDate;
	}

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
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

