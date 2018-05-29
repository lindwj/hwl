
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
public class Gaccount implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private java.lang.Integer gaccountId;
	/** 账套 */
	private java.lang.Integer sdElectResAccId;
	/** 保留字段 */
	private java.lang.String fcaseNum;
	/** 年 */
	private java.util.Date fcaseYear;
	
	private int fRule;
	/** 企业科目编码 */
	private java.lang.String fcode;
	/** 企业科目编码全称 */
	private java.lang.String ffullCode;
	/** 企业科目名称 */
	private java.lang.String fname;
	/** 企业科目父级编码 */
	private java.lang.String fparent;
	/** 企业科目名称全称 */
	private java.lang.String ffullName;
	/** 企业科目层级 */
	private java.lang.Integer flevel;
	/** 是否有明细科目 */
	private java.lang.Integer fisDetail;
	/** 企业科目方向 1 借 -1 贷 */
	private java.lang.Integer fdc;
	/** 企业科目类别名称 */
	private java.lang.String fcateName;
	/** fprojCount */
	private java.lang.Integer fprojCount;
	/** fprojType1 */
	private java.lang.String fprojType1;
	/** fprojType2 */
	private java.lang.String fprojType2;
	/** fprojType3 */
	private java.lang.String fprojType3;
	/** fprojType4 */
	private java.lang.String fprojType4;
	/** fprojType5 */
	private java.lang.String fprojType5;
	/** fprojType6 */
	private java.lang.String fprojType6;
	/** fisUsed */
	private java.lang.Integer fisUsed;
	/** 标准科目 */
	private java.lang.String fstdCode;
	/** fisTran */
	private java.lang.Integer fisTran;
	/** 标准科目-顶级科目 */
	private java.lang.String froot;
	//columns END
	Page page;

	
	
	public int getfRule() {
		return fRule;
	}
	public void setfRule(int fRule) {
		this.fRule = fRule;
	}
	/**
	 * 设置 主键
	 * @param gaccountId
	 */
	public void setGaccountId(java.lang.Integer gaccountId) {
		this.gaccountId = gaccountId;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.lang.Integer getGaccountId() {
		return this.gaccountId;
	}
	/**
	 * 设置 账套
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(java.lang.Integer sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * 账套
	 * @return
	 */
	public java.lang.Integer getSdElectResAccId() {
		return this.sdElectResAccId;
	}
	/**
	 * 设置 保留字段
	 * @param fcaseNum
	 */
	public void setFcaseNum(java.lang.String fcaseNum) {
		this.fcaseNum = fcaseNum;
	}
	/**
	 * 保留字段
	 * @return
	 */
	public java.lang.String getFcaseNum() {
		return this.fcaseNum;
	}
	/**
	 * 设置 年
	 * @param fcaseYear
	 */
	public void setFcaseYear(java.util.Date fcaseYear) {
		this.fcaseYear = fcaseYear;
	}
	/**
	 * 年
	 * @return
	 */
	public java.util.Date getFcaseYear() {
		return this.fcaseYear;
	}
	/**
	 * 设置 企业科目编码
	 * @param fcode
	 */
	public void setFcode(java.lang.String fcode) {
		this.fcode = fcode;
	}
	/**
	 * 企业科目编码
	 * @return
	 */
	public java.lang.String getFcode() {
		return this.fcode;
	}
	/**
	 * 设置 企业科目编码全称
	 * @param ffullCode
	 */
	public void setFfullCode(java.lang.String ffullCode) {
		this.ffullCode = ffullCode;
	}
	/**
	 * 企业科目编码全称
	 * @return
	 */
	public java.lang.String getFfullCode() {
		return this.ffullCode;
	}
	/**
	 * 设置 企业科目名称
	 * @param fname
	 */
	public void setFname(java.lang.String fname) {
		this.fname = fname;
	}
	/**
	 * 企业科目名称
	 * @return
	 */
	public java.lang.String getFname() {
		return this.fname;
	}
	/**
	 * 设置 企业科目父级编码
	 * @param fparent
	 */
	public void setFparent(java.lang.String fparent) {
		this.fparent = fparent;
	}
	/**
	 * 企业科目父级编码
	 * @return
	 */
	public java.lang.String getFparent() {
		return this.fparent;
	}
	/**
	 * 设置 企业科目名称全称
	 * @param ffullName
	 */
	public void setFfullName(java.lang.String ffullName) {
		this.ffullName = ffullName;
	}
	/**
	 * 企业科目名称全称
	 * @return
	 */
	public java.lang.String getFfullName() {
		return this.ffullName;
	}
	/**
	 * 设置 企业科目层级
	 * @param flevel
	 */
	public void setFlevel(java.lang.Integer flevel) {
		this.flevel = flevel;
	}
	/**
	 * 企业科目层级
	 * @return
	 */
	public java.lang.Integer getFlevel() {
		return this.flevel;
	}
	/**
	 * 设置 是否有明细科目
	 * @param fisDetail
	 */
	public void setFisDetail(java.lang.Integer fisDetail) {
		this.fisDetail = fisDetail;
	}
	/**
	 * 是否有明细科目
	 * @return
	 */
	public java.lang.Integer getFisDetail() {
		return this.fisDetail;
	}
	/**
	 * 设置 企业科目方向 1 借 -1 贷
	 * @param fdc
	 */
	public void setFdc(java.lang.Integer fdc) {
		this.fdc = fdc;
	}
	/**
	 * 企业科目方向 1 借 -1 贷
	 * @return
	 */
	public java.lang.Integer getFdc() {
		return this.fdc;
	}
	/**
	 * 设置 企业科目类别名称
	 * @param fcateName
	 */
	public void setFcateName(java.lang.String fcateName) {
		this.fcateName = fcateName;
	}
	/**
	 * 企业科目类别名称
	 * @return
	 */
	public java.lang.String getFcateName() {
		return this.fcateName;
	}
	/**
	 * 设置 fprojCount
	 * @param fprojCount
	 */
	public void setFprojCount(java.lang.Integer fprojCount) {
		this.fprojCount = fprojCount;
	}
	/**
	 * fprojCount
	 * @return
	 */
	public java.lang.Integer getFprojCount() {
		return this.fprojCount;
	}
	/**
	 * 设置 fprojType1
	 * @param fprojType1
	 */
	public void setFprojType1(java.lang.String fprojType1) {
		this.fprojType1 = fprojType1;
	}
	/**
	 * fprojType1
	 * @return
	 */
	public java.lang.String getFprojType1() {
		return this.fprojType1;
	}
	/**
	 * 设置 fprojType2
	 * @param fprojType2
	 */
	public void setFprojType2(java.lang.String fprojType2) {
		this.fprojType2 = fprojType2;
	}
	/**
	 * fprojType2
	 * @return
	 */
	public java.lang.String getFprojType2() {
		return this.fprojType2;
	}
	/**
	 * 设置 fprojType3
	 * @param fprojType3
	 */
	public void setFprojType3(java.lang.String fprojType3) {
		this.fprojType3 = fprojType3;
	}
	/**
	 * fprojType3
	 * @return
	 */
	public java.lang.String getFprojType3() {
		return this.fprojType3;
	}
	/**
	 * 设置 fprojType4
	 * @param fprojType4
	 */
	public void setFprojType4(java.lang.String fprojType4) {
		this.fprojType4 = fprojType4;
	}
	/**
	 * fprojType4
	 * @return
	 */
	public java.lang.String getFprojType4() {
		return this.fprojType4;
	}
	/**
	 * 设置 fprojType5
	 * @param fprojType5
	 */
	public void setFprojType5(java.lang.String fprojType5) {
		this.fprojType5 = fprojType5;
	}
	/**
	 * fprojType5
	 * @return
	 */
	public java.lang.String getFprojType5() {
		return this.fprojType5;
	}
	/**
	 * 设置 fprojType6
	 * @param fprojType6
	 */
	public void setFprojType6(java.lang.String fprojType6) {
		this.fprojType6 = fprojType6;
	}
	/**
	 * fprojType6
	 * @return
	 */
	public java.lang.String getFprojType6() {
		return this.fprojType6;
	}
	/**
	 * 设置 fisUsed
	 * @param fisUsed
	 */
	public void setFisUsed(java.lang.Integer fisUsed) {
		this.fisUsed = fisUsed;
	}
	/**
	 * fisUsed
	 * @return
	 */
	public java.lang.Integer getFisUsed() {
		return this.fisUsed;
	}
	/**
	 * 设置 标准科目
	 * @param fstdCode
	 */
	public void setFstdCode(java.lang.String fstdCode) {
		this.fstdCode = fstdCode;
	}
	/**
	 * 标准科目
	 * @return
	 */
	public java.lang.String getFstdCode() {
		return this.fstdCode;
	}
	/**
	 * 设置 fisTran
	 * @param fisTran
	 */
	public void setFisTran(java.lang.Integer fisTran) {
		this.fisTran = fisTran;
	}
	/**
	 * fisTran
	 * @return
	 */
	public java.lang.Integer getFisTran() {
		return this.fisTran;
	}
	/**
	 * 设置 标准科目-顶级科目
	 * @param froot
	 */
	public void setFroot(java.lang.String froot) {
		this.froot = froot;
	}
	/**
	 * 标准科目-顶级科目
	 * @return
	 */
	public java.lang.String getFroot() {
		return this.froot;
	}

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("GaccountId",getGaccountId())
			.append("SdElectResAccId",getSdElectResAccId())
			.append("FcaseNum",getFcaseNum())
			.append("FcaseYear",getFcaseYear())
			.append("Fcode",getFcode())
			.append("FfullCode",getFfullCode())
			.append("Fname",getFname())
			.append("Fparent",getFparent())
			.append("FfullName",getFfullName())
			.append("Flevel",getFlevel())
			.append("FisDetail",getFisDetail())
			.append("Fdc",getFdc())
			.append("FcateName",getFcateName())
			.append("FprojCount",getFprojCount())
			.append("FprojType1",getFprojType1())
			.append("FprojType2",getFprojType2())
			.append("FprojType3",getFprojType3())
			.append("FprojType4",getFprojType4())
			.append("FprojType5",getFprojType5())
			.append("FprojType6",getFprojType6())
			.append("FisUsed",getFisUsed())
			.append("FstdCode",getFstdCode())
			.append("FisTran",getFisTran())
			.append("Froot",getFroot())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getGaccountId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Gaccount == false) return false;
		if(this == obj) return true;
		Gaccount other = (Gaccount)obj;
		return new EqualsBuilder()
			.append(getGaccountId(),other.getGaccountId())
			.isEquals();
	}
}

