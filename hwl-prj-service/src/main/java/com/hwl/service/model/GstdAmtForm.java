
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
public class GstdAmtForm implements Serializable{	
	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** gstdAmtId */
	private String gstdAmtId;
	/** fcaseNum */
	private String fcaseNum;
	/** 账套外键 */
	private String sdElectResAccId;
	/** 会计年度 */
	private String fcaseYear;
	/** 科目代码 */
	private String fcode;
	/** 会计期间号 */
	private String fperiod;
	/** 年初余额 */
	private String fyearBeg;
	/** 年初借方余额 */
	private String fyearBegDebitBal;
	/** 年初贷方余额 */
	private String fyearBegCreditBal;
	/** 累计发生额 */
	private String fyearBal;
	/** 期末借方余额 */
	private String fendDebitBal;
	/** 期末贷方余额 */
	private String fendCreditBal;
	/** 本期发生额 */
	private String fbal;
	/** 期初余额 */
	private String fbegBal;
	/** 本期借方发生额 */
	private String fdebitBal;
	/** 本期贷方发生额 */
	private String fcreditBal;
	/** 累计借方发生额 */
	private String fyearDebitBal;
	/** 累计贷方发生额 */
	private String fyearCreditBal;
	/** 期末余额 */
	private String fendBal;
	//columns END
	Page page;

	/**
	 * 设置 gstdAmtId
	 * @param gstdAmtId
	 */
	public void setGstdAmtId(String gstdAmtId) {
		this.gstdAmtId = gstdAmtId;
	}
	/**
	 * gstdAmtId
	 * @return
	 */
	public String getGstdAmtId() {
		return this.gstdAmtId;
	}
	/**
	 * 设置 fcaseNum
	 * @param fcaseNum
	 */
	public void setFcaseNum(String fcaseNum) {
		this.fcaseNum = fcaseNum;
	}
	/**
	 * fcaseNum
	 * @return
	 */
	public String getFcaseNum() {
		return this.fcaseNum;
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
	 * 设置 会计年度
	 * @param fcaseYear
	 */
	public void setFcaseYear(String fcaseYear) {
		this.fcaseYear = fcaseYear;
	}
	/**
	 * 会计年度
	 * @return
	 */
	public String getFcaseYear() {
		return this.fcaseYear;
	}
	/**
	 * 设置 科目代码
	 * @param fcode
	 */
	public void setFcode(String fcode) {
		this.fcode = fcode;
	}
	/**
	 * 科目代码
	 * @return
	 */
	public String getFcode() {
		return this.fcode;
	}
	/**
	 * 设置 会计期间号
	 * @param fperiod
	 */
	public void setFperiod(String fperiod) {
		this.fperiod = fperiod;
	}
	/**
	 * 会计期间号
	 * @return
	 */
	public String getFperiod() {
		return this.fperiod;
	}
	/**
	 * 设置 年初余额
	 * @param fyearBeg
	 */
	public void setFyearBeg(String fyearBeg) {
		this.fyearBeg = fyearBeg;
	}
	/**
	 * 年初余额
	 * @return
	 */
	public String getFyearBeg() {
		return this.fyearBeg;
	}
	/**
	 * 设置 年初借方余额
	 * @param fyearBegDebitBal
	 */
	public void setFyearBegDebitBal(String fyearBegDebitBal) {
		this.fyearBegDebitBal = fyearBegDebitBal;
	}
	/**
	 * 年初借方余额
	 * @return
	 */
	public String getFyearBegDebitBal() {
		return this.fyearBegDebitBal;
	}
	/**
	 * 设置 年初贷方余额
	 * @param fyearBegCreditBal
	 */
	public void setFyearBegCreditBal(String fyearBegCreditBal) {
		this.fyearBegCreditBal = fyearBegCreditBal;
	}
	/**
	 * 年初贷方余额
	 * @return
	 */
	public String getFyearBegCreditBal() {
		return this.fyearBegCreditBal;
	}
	/**
	 * 设置 累计发生额
	 * @param fyearBal
	 */
	public void setFyearBal(String fyearBal) {
		this.fyearBal = fyearBal;
	}
	/**
	 * 累计发生额
	 * @return
	 */
	public String getFyearBal() {
		return this.fyearBal;
	}
	/**
	 * 设置 期末借方余额
	 * @param fendDebitBal
	 */
	public void setFendDebitBal(String fendDebitBal) {
		this.fendDebitBal = fendDebitBal;
	}
	/**
	 * 期末借方余额
	 * @return
	 */
	public String getFendDebitBal() {
		return this.fendDebitBal;
	}
	/**
	 * 设置 期末贷方余额
	 * @param fendCreditBal
	 */
	public void setFendCreditBal(String fendCreditBal) {
		this.fendCreditBal = fendCreditBal;
	}
	/**
	 * 期末贷方余额
	 * @return
	 */
	public String getFendCreditBal() {
		return this.fendCreditBal;
	}
	/**
	 * 设置 本期发生额
	 * @param fbal
	 */
	public void setFbal(String fbal) {
		this.fbal = fbal;
	}
	/**
	 * 本期发生额
	 * @return
	 */
	public String getFbal() {
		return this.fbal;
	}
	/**
	 * 设置 期初余额
	 * @param fbegBal
	 */
	public void setFbegBal(String fbegBal) {
		this.fbegBal = fbegBal;
	}
	/**
	 * 期初余额
	 * @return
	 */
	public String getFbegBal() {
		return this.fbegBal;
	}
	/**
	 * 设置 本期借方发生额
	 * @param fdebitBal
	 */
	public void setFdebitBal(String fdebitBal) {
		this.fdebitBal = fdebitBal;
	}
	/**
	 * 本期借方发生额
	 * @return
	 */
	public String getFdebitBal() {
		return this.fdebitBal;
	}
	/**
	 * 设置 本期贷方发生额
	 * @param fcreditBal
	 */
	public void setFcreditBal(String fcreditBal) {
		this.fcreditBal = fcreditBal;
	}
	/**
	 * 本期贷方发生额
	 * @return
	 */
	public String getFcreditBal() {
		return this.fcreditBal;
	}
	/**
	 * 设置 累计借方发生额
	 * @param fyearDebitBal
	 */
	public void setFyearDebitBal(String fyearDebitBal) {
		this.fyearDebitBal = fyearDebitBal;
	}
	/**
	 * 累计借方发生额
	 * @return
	 */
	public String getFyearDebitBal() {
		return this.fyearDebitBal;
	}
	/**
	 * 设置 累计贷方发生额
	 * @param fyearCreditBal
	 */
	public void setFyearCreditBal(String fyearCreditBal) {
		this.fyearCreditBal = fyearCreditBal;
	}
	/**
	 * 累计贷方发生额
	 * @return
	 */
	public String getFyearCreditBal() {
		return this.fyearCreditBal;
	}
	/**
	 * 设置 期末余额
	 * @param fendBal
	 */
	public void setFendBal(String fendBal) {
		this.fendBal = fendBal;
	}
	/**
	 * 期末余额
	 * @return
	 */
	public String getFendBal() {
		return this.fendBal;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
  
	public void setGstdAmt(GstdAmt gstdAmt){
		if(gstdAmt==null)return;
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.gstdAmtId=gstdAmt.getGstdAmtId()==null?"":String.valueOf(gstdAmt.getGstdAmtId());	
		this.fcaseNum=gstdAmt.getFcaseNum()==null?"":gstdAmt.getFcaseNum();	
		this.sdElectResAccId=gstdAmt.getSdElectResAccId()==null?"":String.valueOf(gstdAmt.getSdElectResAccId());	
		this.fcaseYear=gstdAmt.getFcaseYear()==null?"":gstdAmt.getFcaseYear();	
		this.fcode=gstdAmt.getFcode()==null?"":gstdAmt.getFcode();	
		this.fperiod=gstdAmt.getFperiod()==null?"":String.valueOf(gstdAmt.getFperiod());	
//		this.fyearBeg=gstdAmt.getFyearBeg()==null?"":gstdAmt.getFyearBeg();	
//		this.fyearBegDebitBal=gstdAmt.getFyearBegDebitBal()==null?"":gstdAmt.getFyearBegDebitBal();	
//		this.fyearBegCreditBal=gstdAmt.getFyearBegCreditBal()==null?"":gstdAmt.getFyearBegCreditBal();	
//		this.fyearBal=gstdAmt.getFyearBal()==null?"":gstdAmt.getFyearBal();	
//		this.fendDebitBal=gstdAmt.getFendDebitBal()==null?"":gstdAmt.getFendDebitBal();	
//		this.fendCreditBal=gstdAmt.getFendCreditBal()==null?"":gstdAmt.getFendCreditBal();	
//		this.fbal=gstdAmt.getFbal()==null?"":gstdAmt.getFbal();	
//		this.fbegBal=gstdAmt.getFbegBal()==null?"":gstdAmt.getFbegBal();	
//		this.fdebitBal=gstdAmt.getFdebitBal()==null?"":gstdAmt.getFdebitBal();	
//		this.fcreditBal=gstdAmt.getFcreditBal()==null?"":gstdAmt.getFcreditBal();	
//		this.fyearDebitBal=gstdAmt.getFyearDebitBal()==null?"":gstdAmt.getFyearDebitBal();	
//		this.fyearCreditBal=gstdAmt.getFyearCreditBal()==null?"":gstdAmt.getFyearCreditBal();	
//		this.fendBal=gstdAmt.getFendBal()==null?"":gstdAmt.getFendBal();	
		this.page=gstdAmt.getPage();
	}
  
	public GstdAmt getGstdAmt(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		GstdAmt gstdAmt=new GstdAmt();
		gstdAmt.setGstdAmtId(this.gstdAmtId==null||this.gstdAmtId.length()==0?0:Integer.parseInt(this.gstdAmtId));  
		gstdAmt.setFcaseNum(this.fcaseNum==null||this.fcaseNum.length()==0?"":this.fcaseNum);  
		gstdAmt.setSdElectResAccId(this.sdElectResAccId==null||this.sdElectResAccId.length()==0?0:Integer.parseInt(this.sdElectResAccId));  
		gstdAmt.setFcaseYear(this.fcaseYear==null||this.fcaseYear.length()==0?"":this.fcaseYear);  
		gstdAmt.setFcode(this.fcode==null||this.fcode.length()==0?"":this.fcode);  
		gstdAmt.setFperiod(this.fperiod==null||this.fperiod.length()==0?0:Integer.parseInt(this.fperiod));  
//		gstdAmt.setFyearBeg(this.fyearBeg==null||this.fyearBeg.length()==0?"":this.fyearBeg);  
//		gstdAmt.setFyearBegDebitBal(this.fyearBegDebitBal==null||this.fyearBegDebitBal.length()==0?"":this.fyearBegDebitBal);  
//		gstdAmt.setFyearBegCreditBal(this.fyearBegCreditBal==null||this.fyearBegCreditBal.length()==0?"":this.fyearBegCreditBal);  
//		gstdAmt.setFyearBal(this.fyearBal==null||this.fyearBal.length()==0?"":this.fyearBal);  
//		gstdAmt.setFendDebitBal(this.fendDebitBal==null||this.fendDebitBal.length()==0?"":this.fendDebitBal);  
//		gstdAmt.setFendCreditBal(this.fendCreditBal==null||this.fendCreditBal.length()==0?"":this.fendCreditBal);  
//		gstdAmt.setFbal(this.fbal==null||this.fbal.length()==0?"":this.fbal);  
//		gstdAmt.setFbegBal(this.fbegBal==null||this.fbegBal.length()==0?"":this.fbegBal);  
//		gstdAmt.setFdebitBal(this.fdebitBal==null||this.fdebitBal.length()==0?"":this.fdebitBal);  
//		gstdAmt.setFcreditBal(this.fcreditBal==null||this.fcreditBal.length()==0?"":this.fcreditBal);  
//		gstdAmt.setFyearDebitBal(this.fyearDebitBal==null||this.fyearDebitBal.length()==0?"":this.fyearDebitBal);  
//		gstdAmt.setFyearCreditBal(this.fyearCreditBal==null||this.fyearCreditBal.length()==0?"":this.fyearCreditBal);  
//		gstdAmt.setFendBal(this.fendBal==null||this.fendBal.length()==0?"":this.fendBal);  
		gstdAmt.setPage(this.page);	
		return gstdAmt;
	}
  
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("GstdAmtId",getGstdAmtId())
		.append("FcaseNum",getFcaseNum())
		.append("SdElectResAccId",getSdElectResAccId())
		.append("FcaseYear",getFcaseYear())
		.append("Fcode",getFcode())
		.append("Fperiod",getFperiod())
		.append("FyearBeg",getFyearBeg())
		.append("FyearBegDebitBal",getFyearBegDebitBal())
		.append("FyearBegCreditBal",getFyearBegCreditBal())
		.append("FyearBal",getFyearBal())
		.append("FendDebitBal",getFendDebitBal())
		.append("FendCreditBal",getFendCreditBal())
		.append("Fbal",getFbal())
		.append("FbegBal",getFbegBal())
		.append("FdebitBal",getFdebitBal())
		.append("FcreditBal",getFcreditBal())
		.append("FyearDebitBal",getFyearDebitBal())
		.append("FyearCreditBal",getFyearCreditBal())
		.append("FendBal",getFendBal())
		.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getGstdAmtId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GstdAmt == false) return false;
		if(this == obj) return true;
		GstdAmt other = (GstdAmt)obj;
		return new EqualsBuilder()
			.append(getGstdAmtId(),other.getGstdAmtId())
			.isEquals();
	}
}

