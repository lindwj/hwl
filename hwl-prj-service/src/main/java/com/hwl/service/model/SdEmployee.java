
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
public class SdEmployee implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer sdEmployeeId;
	/** 辅助核算类别外键 */
	private java.lang.Integer sdUserItemId;
	/** 职工编码 */
	private java.lang.String personNo;
	/** 职工姓名 */
	private java.lang.String personName;
	/** 证件类别 */
	private java.lang.String cardType;
	/** 证件号码 */
	private java.lang.String cardId;
	/** 性别 */
	private java.lang.String sex;
	/** 出生日期 */
	private java.util.Date birthday;
	private String birthdayStr;
	/** 部门编码 */
	private java.lang.String deptNo;
	/** 入职日期 */
	private java.util.Date hiredate;
	/** 离职日期 */
	private java.util.Date leaveDate;
	/** 创建时间 */
	private java.util.Date createDate;
	
	private String leaveDateStr;
	/** 创建时间 */
	private String hiredateStr;
	/** 账套外键关联 */
	private java.lang.Integer sdElectResAccId;
	//columns END
	Page page;

	
	
	public String getBirthdayStr() {
		return birthdayStr;
	}
	public void setBirthdayStr(String birthdayStr) {
		this.birthdayStr = birthdayStr;
	}
	public String getLeaveDateStr() {
		return leaveDateStr;
	}
	public void setLeaveDateStr(String leaveDateStr) {
		this.leaveDateStr = leaveDateStr;
	}
	
	public String getHiredateStr() {
		return hiredateStr;
	}
	public void setHiredateStr(String hiredateStr) {
		this.hiredateStr = hiredateStr;
	}
	/**
	 * 设置 主键
	 * @param sdEmployeeId
	 */
	public void setSdEmployeeId(java.lang.Integer sdEmployeeId) {
		this.sdEmployeeId = sdEmployeeId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getSdEmployeeId() {
		return this.sdEmployeeId;
	}
	/**
	 * 设置 辅助核算类别外键
	 * @param sdUserItemId
	 */
	public void setSdUserItemId(java.lang.Integer sdUserItemId) {
		this.sdUserItemId = sdUserItemId;
	}
	/**
	 * 辅助核算类别外键
	 * @return
	 */
	public java.lang.Integer getSdUserItemId() {
		return this.sdUserItemId;
	}
	/**
	 * 设置 职工编码
	 * @param personNo
	 */
	public void setPersonNo(java.lang.String personNo) {
		this.personNo = personNo;
	}
	/**
	 * 职工编码
	 * @return
	 */
	public java.lang.String getPersonNo() {
		return this.personNo;
	}
	/**
	 * 设置 职工姓名
	 * @param personName
	 */
	public void setPersonName(java.lang.String personName) {
		this.personName = personName;
	}
	/**
	 * 职工姓名
	 * @return
	 */
	public java.lang.String getPersonName() {
		return this.personName;
	}
	/**
	 * 设置 证件类别
	 * @param cardType
	 */
	public void setCardType(java.lang.String cardType) {
		this.cardType = cardType;
	}
	/**
	 * 证件类别
	 * @return
	 */
	public java.lang.String getCardType() {
		return this.cardType;
	}
	/**
	 * 设置 证件号码
	 * @param cardId
	 */
	public void setCardId(java.lang.String cardId) {
		this.cardId = cardId;
	}
	/**
	 * 证件号码
	 * @return
	 */
	public java.lang.String getCardId() {
		return this.cardId;
	}
	/**
	 * 设置 性别
	 * @param sex
	 */
	public void setSex(java.lang.String sex) {
		this.sex = sex;
	}
	/**
	 * 性别
	 * @return
	 */
	public java.lang.String getSex() {
		return this.sex;
	}
	/**
	 * 设置 出生日期
	 * @param birthday
	 */
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * 出生日期
	 * @return
	 */
	public java.util.Date getBirthday() {
		return this.birthday;
	}
	/**
	 * 设置 部门编码
	 * @param deptNo
	 */
	public void setDeptNo(java.lang.String deptNo) {
		this.deptNo = deptNo;
	}
	/**
	 * 部门编码
	 * @return
	 */
	public java.lang.String getDeptNo() {
		return this.deptNo;
	}
	/**
	 * 设置 入职日期
	 * @param hiredate
	 */
	public void setHiredate(java.util.Date hiredate) {
		this.hiredate = hiredate;
	}
	/**
	 * 入职日期
	 * @return
	 */
	public java.util.Date getHiredate() {
		return this.hiredate;
	}
	/**
	 * 设置 离职日期
	 * @param leaveDate
	 */
	public void setLeaveDate(java.util.Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	/**
	 * 离职日期
	 * @return
	 */
	public java.util.Date getLeaveDate() {
		return this.leaveDate;
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
	/**
	 * 设置 账套外键关联
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(java.lang.Integer sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * 账套外键关联
	 * @return
	 */
	public java.lang.Integer getSdElectResAccId() {
		return this.sdElectResAccId;
	}

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("SdEmployeeId",getSdEmployeeId())
			.append("SdUserItemId",getSdUserItemId())
			.append("PersonNo",getPersonNo())
			.append("PersonName",getPersonName())
			.append("CardType",getCardType())
			.append("CardId",getCardId())
			.append("Sex",getSex())
			.append("Birthday",getBirthday())
			.append("DeptNo",getDeptNo())
			.append("Hiredate",getHiredate())
			.append("LeaveDate",getLeaveDate())
			.append("CreateDate",getCreateDate())
			.append("SdElectResAccId",getSdElectResAccId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSdEmployeeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SdEmployee == false) return false;
		if(this == obj) return true;
		SdEmployee other = (SdEmployee)obj;
		return new EqualsBuilder()
			.append(getSdEmployeeId(),other.getSdEmployeeId())
			.isEquals();
	}
}

