
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
public class GaccountForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** 主键 */
	private String gaccountId;
	/** 账套 */
	private String sdElectResAccId;
	/** 保留字段 */
	private String fcaseNum;
	/** 年 */
	private String fcaseYear;
	/** 企业科目编码 */
	private String fcode;
	/** 企业科目编码全称 */
	private String ffullCode;
	/** 企业科目名称 */
	private String fname;
	/** 企业科目父级编码 */
	private String fparent;
	/** 企业科目名称全称 */
	private String ffullName;
	/** 企业科目层级 */
	private String flevel;
	/** 是否有明细科目 */
	private String fisDetail;
	/** 企业科目方向 1 借 -1 贷 */
	private String fdc;
	/** 企业科目类别名称 */
	private String fcateName;
	/** fprojCount */
	private String fprojCount;
	/** fprojType1 */
	private String fprojType1;
	/** fprojType2 */
	private String fprojType2;
	/** fprojType3 */
	private String fprojType3;
	/** fprojType4 */
	private String fprojType4;
	/** fprojType5 */
	private String fprojType5;
	/** fprojType6 */
	private String fprojType6;
	/** fisUsed */
	private String fisUsed;
	/** 标准科目 */
	private String fstdCode;
	/** fisTran */
	private String fisTran;
	/** 标准科目-顶级科目 */
	private String froot;
	//columns END
	Page page;

	/**
	 * 设置 主键
	 * @param gaccountId
	 */
	public void setGaccountId(String gaccountId) {
		this.gaccountId = gaccountId;
	}
	/**
	 * 主键
	 * @return
	 */
	public String getGaccountId() {
		return this.gaccountId;
	}
	/**
	 * 设置 账套
	 * @param sdElectResAccId
	 */
	public void setSdElectResAccId(String sdElectResAccId) {
		this.sdElectResAccId = sdElectResAccId;
	}
	/**
	 * 账套
	 * @return
	 */
	public String getSdElectResAccId() {
		return this.sdElectResAccId;
	}
	/**
	 * 设置 保留字段
	 * @param fcaseNum
	 */
	public void setFcaseNum(String fcaseNum) {
		this.fcaseNum = fcaseNum;
	}
	/**
	 * 保留字段
	 * @return
	 */
	public String getFcaseNum() {
		return this.fcaseNum;
	}
	/**
	 * 设置 年
	 * @param fcaseYear
	 */
	public void setFcaseYear(String fcaseYear) {
		this.fcaseYear = fcaseYear;
	}
	/**
	 * 年
	 * @return
	 */
	public String getFcaseYear() {
		return this.fcaseYear;
	}
	/**
	 * 设置 企业科目编码
	 * @param fcode
	 */
	public void setFcode(String fcode) {
		this.fcode = fcode;
	}
	/**
	 * 企业科目编码
	 * @return
	 */
	public String getFcode() {
		return this.fcode;
	}
	/**
	 * 设置 企业科目编码全称
	 * @param ffullCode
	 */
	public void setFfullCode(String ffullCode) {
		this.ffullCode = ffullCode;
	}
	/**
	 * 企业科目编码全称
	 * @return
	 */
	public String getFfullCode() {
		return this.ffullCode;
	}
	/**
	 * 设置 企业科目名称
	 * @param fname
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * 企业科目名称
	 * @return
	 */
	public String getFname() {
		return this.fname;
	}
	/**
	 * 设置 企业科目父级编码
	 * @param fparent
	 */
	public void setFparent(String fparent) {
		this.fparent = fparent;
	}
	/**
	 * 企业科目父级编码
	 * @return
	 */
	public String getFparent() {
		return this.fparent;
	}
	/**
	 * 设置 企业科目名称全称
	 * @param ffullName
	 */
	public void setFfullName(String ffullName) {
		this.ffullName = ffullName;
	}
	/**
	 * 企业科目名称全称
	 * @return
	 */
	public String getFfullName() {
		return this.ffullName;
	}
	/**
	 * 设置 企业科目层级
	 * @param flevel
	 */
	public void setFlevel(String flevel) {
		this.flevel = flevel;
	}
	/**
	 * 企业科目层级
	 * @return
	 */
	public String getFlevel() {
		return this.flevel;
	}
	/**
	 * 设置 是否有明细科目
	 * @param fisDetail
	 */
	public void setFisDetail(String fisDetail) {
		this.fisDetail = fisDetail;
	}
	/**
	 * 是否有明细科目
	 * @return
	 */
	public String getFisDetail() {
		return this.fisDetail;
	}
	/**
	 * 设置 企业科目方向 1 借 -1 贷
	 * @param fdc
	 */
	public void setFdc(String fdc) {
		this.fdc = fdc;
	}
	/**
	 * 企业科目方向 1 借 -1 贷
	 * @return
	 */
	public String getFdc() {
		return this.fdc;
	}
	/**
	 * 设置 企业科目类别名称
	 * @param fcateName
	 */
	public void setFcateName(String fcateName) {
		this.fcateName = fcateName;
	}
	/**
	 * 企业科目类别名称
	 * @return
	 */
	public String getFcateName() {
		return this.fcateName;
	}
	/**
	 * 设置 fprojCount
	 * @param fprojCount
	 */
	public void setFprojCount(String fprojCount) {
		this.fprojCount = fprojCount;
	}
	/**
	 * fprojCount
	 * @return
	 */
	public String getFprojCount() {
		return this.fprojCount;
	}
	/**
	 * 设置 fprojType1
	 * @param fprojType1
	 */
	public void setFprojType1(String fprojType1) {
		this.fprojType1 = fprojType1;
	}
	/**
	 * fprojType1
	 * @return
	 */
	public String getFprojType1() {
		return this.fprojType1;
	}
	/**
	 * 设置 fprojType2
	 * @param fprojType2
	 */
	public void setFprojType2(String fprojType2) {
		this.fprojType2 = fprojType2;
	}
	/**
	 * fprojType2
	 * @return
	 */
	public String getFprojType2() {
		return this.fprojType2;
	}
	/**
	 * 设置 fprojType3
	 * @param fprojType3
	 */
	public void setFprojType3(String fprojType3) {
		this.fprojType3 = fprojType3;
	}
	/**
	 * fprojType3
	 * @return
	 */
	public String getFprojType3() {
		return this.fprojType3;
	}
	/**
	 * 设置 fprojType4
	 * @param fprojType4
	 */
	public void setFprojType4(String fprojType4) {
		this.fprojType4 = fprojType4;
	}
	/**
	 * fprojType4
	 * @return
	 */
	public String getFprojType4() {
		return this.fprojType4;
	}
	/**
	 * 设置 fprojType5
	 * @param fprojType5
	 */
	public void setFprojType5(String fprojType5) {
		this.fprojType5 = fprojType5;
	}
	/**
	 * fprojType5
	 * @return
	 */
	public String getFprojType5() {
		return this.fprojType5;
	}
	/**
	 * 设置 fprojType6
	 * @param fprojType6
	 */
	public void setFprojType6(String fprojType6) {
		this.fprojType6 = fprojType6;
	}
	/**
	 * fprojType6
	 * @return
	 */
	public String getFprojType6() {
		return this.fprojType6;
	}
	/**
	 * 设置 fisUsed
	 * @param fisUsed
	 */
	public void setFisUsed(String fisUsed) {
		this.fisUsed = fisUsed;
	}
	/**
	 * fisUsed
	 * @return
	 */
	public String getFisUsed() {
		return this.fisUsed;
	}
	/**
	 * 设置 标准科目
	 * @param fstdCode
	 */
	public void setFstdCode(String fstdCode) {
		this.fstdCode = fstdCode;
	}
	/**
	 * 标准科目
	 * @return
	 */
	public String getFstdCode() {
		return this.fstdCode;
	}
	/**
	 * 设置 fisTran
	 * @param fisTran
	 */
	public void setFisTran(String fisTran) {
		this.fisTran = fisTran;
	}
	/**
	 * fisTran
	 * @return
	 */
	public String getFisTran() {
		return this.fisTran;
	}
	/**
	 * 设置 标准科目-顶级科目
	 * @param froot
	 */
	public void setFroot(String froot) {
		this.froot = froot;
	}
	/**
	 * 标准科目-顶级科目
	 * @return
	 */
	public String getFroot() {
		return this.froot;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setGaccount(Gaccount gaccount){
		if(gaccount==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.gaccountId=gaccount.getGaccountId()==null?"":String.valueOf(gaccount.getGaccountId());	
		this.sdElectResAccId=gaccount.getSdElectResAccId()==null?"":String.valueOf(gaccount.getSdElectResAccId());	
		this.fcaseNum=gaccount.getFcaseNum()==null?"":gaccount.getFcaseNum();	
		this.fcaseYear=gaccount.getFcaseYear()==null?"":df.format(gaccount.getFcaseYear());	
		this.fcode=gaccount.getFcode()==null?"":gaccount.getFcode();	
		this.ffullCode=gaccount.getFfullCode()==null?"":gaccount.getFfullCode();	
		this.fname=gaccount.getFname()==null?"":gaccount.getFname();	
		this.fparent=gaccount.getFparent()==null?"":gaccount.getFparent();	
		this.ffullName=gaccount.getFfullName()==null?"":gaccount.getFfullName();	
		this.flevel=gaccount.getFlevel()==null?"":String.valueOf(gaccount.getFlevel());	
		this.fisDetail=gaccount.getFisDetail()==null?"":String.valueOf(gaccount.getFisDetail());	
		this.fdc=gaccount.getFdc()==null?"":String.valueOf(gaccount.getFdc());	
		this.fcateName=gaccount.getFcateName()==null?"":gaccount.getFcateName();	
		this.fprojCount=gaccount.getFprojCount()==null?"":String.valueOf(gaccount.getFprojCount());	
		this.fprojType1=gaccount.getFprojType1()==null?"":gaccount.getFprojType1();	
		this.fprojType2=gaccount.getFprojType2()==null?"":gaccount.getFprojType2();	
		this.fprojType3=gaccount.getFprojType3()==null?"":gaccount.getFprojType3();	
		this.fprojType4=gaccount.getFprojType4()==null?"":gaccount.getFprojType4();	
		this.fprojType5=gaccount.getFprojType5()==null?"":gaccount.getFprojType5();	
		this.fprojType6=gaccount.getFprojType6()==null?"":gaccount.getFprojType6();	
		this.fisUsed=gaccount.getFisUsed()==null?"":String.valueOf(gaccount.getFisUsed());	
		this.fstdCode=gaccount.getFstdCode()==null?"":gaccount.getFstdCode();	
		this.fisTran=gaccount.getFisTran()==null?"":String.valueOf(gaccount.getFisTran());	
		this.froot=gaccount.getFroot()==null?"":gaccount.getFroot();	
		this.page=gaccount.getPage();
	}
  
	public Gaccount getGaccount(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Gaccount gaccount=new Gaccount();
		gaccount.setGaccountId(this.gaccountId==null||this.gaccountId.length()==0?0:Integer.parseInt(this.gaccountId));  
		gaccount.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		gaccount.setFcaseNum(this.fcaseNum==null||this.fcaseNum.length()==0?"":this.fcaseNum);  
		try {
			gaccount.setFcaseYear(this.fcaseYear==null||this.fcaseYear.length()==0?null:df.parse(this.fcaseYear));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		gaccount.setFcode(this.fcode==null||this.fcode.length()==0?"":this.fcode);  
		gaccount.setFfullCode(this.ffullCode==null||this.ffullCode.length()==0?"":this.ffullCode);  
		gaccount.setFname(this.fname==null||this.fname.length()==0?"":this.fname);  
		gaccount.setFparent(this.fparent==null||this.fparent.length()==0?"":this.fparent);  
		gaccount.setFfullName(this.ffullName==null||this.ffullName.length()==0?"":this.ffullName);  
		gaccount.setFlevel(this.flevel==null||this.flevel.length()==0?0:Integer.parseInt(this.flevel));  
		gaccount.setFisDetail(this.fisDetail==null||this.fisDetail.length()==0?0:Integer.parseInt(this.fisDetail));  
		gaccount.setFdc(this.fdc==null||this.fdc.length()==0?0:Integer.parseInt(this.fdc));  
		gaccount.setFcateName(this.fcateName==null||this.fcateName.length()==0?"":this.fcateName);  
		gaccount.setFprojCount(this.fprojCount==null||this.fprojCount.length()==0?0:Integer.parseInt(this.fprojCount));  
		gaccount.setFprojType1(this.fprojType1==null||this.fprojType1.length()==0?"":this.fprojType1);  
		gaccount.setFprojType2(this.fprojType2==null||this.fprojType2.length()==0?"":this.fprojType2);  
		gaccount.setFprojType3(this.fprojType3==null||this.fprojType3.length()==0?"":this.fprojType3);  
		gaccount.setFprojType4(this.fprojType4==null||this.fprojType4.length()==0?"":this.fprojType4);  
		gaccount.setFprojType5(this.fprojType5==null||this.fprojType5.length()==0?"":this.fprojType5);  
		gaccount.setFprojType6(this.fprojType6==null||this.fprojType6.length()==0?"":this.fprojType6);  
		gaccount.setFisUsed(this.fisUsed==null||this.fisUsed.length()==0?0:Integer.parseInt(this.fisUsed));  
		gaccount.setFstdCode(this.fstdCode==null||this.fstdCode.length()==0?"":this.fstdCode);  
		gaccount.setFisTran(this.fisTran==null||this.fisTran.length()==0?0:Integer.parseInt(this.fisTran));  
		gaccount.setFroot(this.froot==null||this.froot.length()==0?"":this.froot);  
		gaccount.setPage(this.page);	
		return gaccount;
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

