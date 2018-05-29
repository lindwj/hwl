
package com.hwl.service.model;


//import org.apache.commons.lang.builder.EqualsBuilder;
//import org.apache.commons.lang.builder.HashCodeBuilder;
//import org.apache.commons.lang.builder.ToStringBuilder;
//import org.apache.commons.lang.builder.ToStringStyle;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.hwl.service.common.Page;


/**
 * @author lind
 *
 */
public class User implements Serializable{	

	//private static final long serialVersionUID = -3885313706621697914L;//TODO 删掉重新生成一个 
	//columns START
	/** userId */
	private java.lang.Integer userId;
	/** mobile */
	private java.lang.String mobile;
	/** 状态             -1 删除             0 默认 草稿             1 上架             2 下架 */
	private java.lang.Integer status;
	/** createDate */
	private java.util.Date createDate;
	/** updateByAdm */
	private java.lang.Integer updateByAdm;
	/** updateDate */
	private java.util.Date updateDate;
	/** password */
	private java.lang.String password;
	
	private java.lang.String captcha;
	
	private java.lang.String dowhat;
	
	private java.lang.String errcode;
	
	private java.lang.String nickname;
	/** registType */
	private java.lang.Integer registType;
	
	private String openId;
	
	private Integer agentId;
	
	private Date bindDate;
	
	private Integer bindState;
	
	private java.lang.Integer menuId;
	
	private List<User> users;
	
	private String createDateStr;
	
	private String picWx;
	
	private String nicknameWd;
	
	private double price;
	
	private String beginTime;
	private String endTime;
	
	private Date successDate;
	//columns END
	Page page;

	
	public java.lang.String getNickname() {
		return nickname;
	}
	public void setNickname(java.lang.String nickname) {
		this.nickname = nickname;
	}
	public java.lang.String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(java.lang.String captcha) {
		this.captcha = captcha;
	}
	public java.lang.String getDowhat() {
		return dowhat;
	}
	public void setDowhat(java.lang.String dowhat) {
		this.dowhat = dowhat;
	}
	public java.lang.String getErrcode() {
		return errcode;
	}
	public void setErrcode(java.lang.String errcode) {
		this.errcode = errcode;
	}
	/**
	 * 设置 userId
	 * @param userId
	 */
	public void setUserId(java.lang.Integer userId) {
		this.userId = userId;
	}
	/**
	 * userId
	 * @return
	 */
	public java.lang.Integer getUserId() {
		return this.userId;
	}
	/**
	 * 设置 mobile
	 * @param mobile
	 */
	public void setMobile(java.lang.String mobile) {
		this.mobile = mobile;
	}
	/**
	 * mobile
	 * @return
	 */
	public java.lang.String getMobile() {
		return this.mobile;
	}
	/**
	 * 设置 状态             -1 删除             0 默认 草稿             1 上架             2 下架
	 * @param status
	 */
	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}
	/**
	 * 状态             -1 删除             0 默认 草稿             1 上架             2 下架
	 * @return
	 */
	public java.lang.Integer getStatus() {
		return this.status;
	}
	/**
	 * 设置 createDate
	 * @param createDate
	 */
	public void setCreateDate(java.util.Date createDate) {
		if(createDate!=null){
			SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			this.setCreateDateStr(time.format(createDate));
		}
		this.createDate = createDate;
	}
	/**
	 * createDate
	 * @return
	 */
	public java.util.Date getCreateDate() {
		return this.createDate;
	}
	/**
	 * 设置 updateByAdm
	 * @param updateByAdm
	 */
	public void setUpdateByAdm(java.lang.Integer updateByAdm) {
		this.updateByAdm = updateByAdm;
	}
	/**
	 * updateByAdm
	 * @return
	 */
	public java.lang.Integer getUpdateByAdm() {
		return this.updateByAdm;
	}
	/**
	 * 设置 updateDate
	 * @param updateDate
	 */
	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * updateDate
	 * @return
	 */
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}
	/**
	 * 设置 password
	 * @param password
	 */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}
	/**
	 * password
	 * @return
	 */
	public java.lang.String getPassword() {
		return this.password;
	}
	/**
	 * 设置 registType
	 * @param registType
	 */
	public void setRegistType(java.lang.Integer registType) {
		this.registType = registType;
	}
	/**
	 * registType
	 * @return
	 */
	public java.lang.Integer getRegistType() {
		return this.registType;
	}

  public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public java.lang.Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(java.lang.Integer menuId) {
		this.menuId = menuId;
	}
	public String getCreateDateStr() {
		return createDateStr;
	}
	public void setCreateDateStr(String createDateStr) {
		this.createDateStr = createDateStr;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	public Date getBindDate() {
		return bindDate;
	}
	public void setBindDate(Date bindDate) {
		this.bindDate = bindDate;
	}
	public Integer getBindState() {
		return bindState;
	}
	public void setBindState(Integer bindState) {
		this.bindState = bindState;
	}
	public String getPicWx() {
		return picWx;
	}
	public void setPicWx(String picWx) {
		this.picWx = picWx;
	}
	public String getNicknameWd() {
		return nicknameWd;
	}
	public void setNicknameWd(String nicknameWd) {
		this.nicknameWd = nicknameWd;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getSuccessDate() {
		return successDate;
	}
	public void setSuccessDate(Date successDate) {
		this.successDate = successDate;
	}
}

