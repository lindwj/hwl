
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
public class SdEmployeeForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String sdEmployeeId;
	/** 辅助核算类别外键 */
	private String sdUserItemId;
	/** 职工编码 */
	private String personNo;
	/** 职工姓名 */
	private String personName;
	/** 证件类别 */
	private String cardType;
	/** 证件号码 */
	private String cardId;
	/** 性别 */
	private String sex;
	/** 出生日期 */
	private String birthday;
	/** 部门编码 */
	private String deptNo;
	/** 入职日期 */
	private String hiredate;
	/** 离职日期 */
	private String leaveDate;
	/** 创建时间 */
	private String createDate;
	/** 账套外键关联 */
	private String sdElectResAccId;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param sdEmployeeId
	 */
	public void setSdEmployeeId(String sdEmployeeId) {
		this.sdEmployeeId = sdEmployeeId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getSdEmployeeId() {
		return this.sdEmployeeId;
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
	 * 设置 职工编码
	 * @param personNo
	 */
	public void setPersonNo(String personNo) {
		this.personNo = personNo;
	}
	/**
	 * 职工编码
	 * @return
	 */
	public String getPersonNo() {
		return this.personNo;
	}
	/**
	 * 设置 职工姓名
	 * @param personName
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	/**
	 * 职工姓名
	 * @return
	 */
	public String getPersonName() {
		return this.personName;
	}
	/**
	 * 设置 证件类别
	 * @param cardType
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	/**
	 * 证件类别
	 * @return
	 */
	public String getCardType() {
		return this.cardType;
	}
	/**
	 * 设置 证件号码
	 * @param cardId
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	/**
	 * 证件号码
	 * @return
	 */
	public String getCardId() {
		return this.cardId;
	}
	/**
	 * 设置 性别
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 性别
	 * @return
	 */
	public String getSex() {
		return this.sex;
	}
	/**
	 * 设置 出生日期
	 * @param birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * 出生日期
	 * @return
	 */
	public String getBirthday() {
		return this.birthday;
	}
	/**
	 * 设置 部门编码
	 * @param deptNo
	 */
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	/**
	 * 部门编码
	 * @return
	 */
	public String getDeptNo() {
		return this.deptNo;
	}
	/**
	 * 设置 入职日期
	 * @param hiredate
	 */
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	/**
	 * 入职日期
	 * @return
	 */
	public String getHiredate() {
		return this.hiredate;
	}
	/**
	 * 设置 离职日期
	 * @param leaveDate
	 */
	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}
	/**
	 * 离职日期
	 * @return
	 */
	public String getLeaveDate() {
		return this.leaveDate;
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
  
	public void setSdEmployee(SdEmployee sdEmployee){
		if(sdEmployee==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.sdEmployeeId=sdEmployee.getSdEmployeeId()==null?"":String.valueOf(sdEmployee.getSdEmployeeId());	
		this.sdUserItemId=sdEmployee.getSdUserItemId()==null?"":String.valueOf(sdEmployee.getSdUserItemId());	
		this.personNo=sdEmployee.getPersonNo()==null?"":sdEmployee.getPersonNo();	
		this.personName=sdEmployee.getPersonName()==null?"":sdEmployee.getPersonName();	
		this.cardType=sdEmployee.getCardType()==null?"":sdEmployee.getCardType();	
		this.cardId=sdEmployee.getCardId()==null?"":sdEmployee.getCardId();	
		this.sex=sdEmployee.getSex()==null?"":sdEmployee.getSex();	
		this.birthday=sdEmployee.getBirthday()==null?"":df.format(sdEmployee.getBirthday());	
		this.deptNo=sdEmployee.getDeptNo()==null?"":sdEmployee.getDeptNo();	
		this.hiredate=sdEmployee.getHiredate()==null?"":df.format(sdEmployee.getHiredate());	
		this.leaveDate=sdEmployee.getLeaveDate()==null?"":df.format(sdEmployee.getLeaveDate());	
		this.createDate=sdEmployee.getCreateDate()==null?"":df.format(sdEmployee.getCreateDate());	
		this.sdElectResAccId=sdEmployee.getSdElectResAccId()==null?"":String.valueOf(sdEmployee.getSdElectResAccId());	
		this.page=sdEmployee.getPage();
	}
  
	public SdEmployee getSdEmployee(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SdEmployee sdEmployee=new SdEmployee();
		sdEmployee.setSdEmployeeId(this.sdEmployeeId==null||this.sdEmployeeId.length()==0?0:Integer.parseInt(this.sdEmployeeId));  
		sdEmployee.setSdUserItemId(this.sdUserItemId==null||this.sdUserItemId.length()==0?0:Integer.parseInt(this.sdUserItemId));  
		sdEmployee.setPersonNo(this.personNo==null||this.personNo.length()==0?"":this.personNo);  
		sdEmployee.setPersonName(this.personName==null||this.personName.length()==0?"":this.personName);  
		sdEmployee.setCardType(this.cardType==null||this.cardType.length()==0?"":this.cardType);  
		sdEmployee.setCardId(this.cardId==null||this.cardId.length()==0?"":this.cardId);  
		sdEmployee.setSex(this.sex==null||this.sex.length()==0?"":this.sex);  
		try {
			sdEmployee.setBirthday(this.birthday==null||this.birthday.length()==0?null:df.parse(this.birthday));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdEmployee.setDeptNo(this.deptNo==null||this.deptNo.length()==0?"":this.deptNo);  
		try {
			sdEmployee.setHiredate(this.hiredate==null||this.hiredate.length()==0?null:df.parse(this.hiredate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			sdEmployee.setLeaveDate(this.leaveDate==null||this.leaveDate.length()==0?null:df.parse(this.leaveDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			sdEmployee.setCreateDate(this.createDate==null||this.createDate.length()==0?null:df.parse(this.createDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdEmployee.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		sdEmployee.setPage(this.page);	
		return sdEmployee;
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

