package com.jshop.entity;

// Generated 2014-5-27 21:22:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TemplatesetT generated by hbm2java
 */
@Entity
@Table(name = "templateset_t", catalog = "jshoper3")
public class TemplatesetT implements java.io.Serializable {

	private String tsid;
	private String templateurl;
	private String systemcontent;
	private Date createtime;
	private String creatorid;
	private String buildhtmlpath;
	private String sign;
	private String status;
	private String themeid;
	private String themename;

	public TemplatesetT() {
	}

	public TemplatesetT(String tsid, String templateurl, String systemcontent,
			Date createtime, String creatorid, String buildhtmlpath, String sign) {
		this.tsid = tsid;
		this.templateurl = templateurl;
		this.systemcontent = systemcontent;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.buildhtmlpath = buildhtmlpath;
		this.sign = sign;
	}

	public TemplatesetT(String tsid, String templateurl, String systemcontent,
			Date createtime, String creatorid, String buildhtmlpath,
			String sign, String status, String themeid, String themename) {
		this.tsid = tsid;
		this.templateurl = templateurl;
		this.systemcontent = systemcontent;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.buildhtmlpath = buildhtmlpath;
		this.sign = sign;
		this.status = status;
		this.themeid = themeid;
		this.themename = themename;
	}

	@Id
	@Column(name = "TSID", unique = true, nullable = false, length = 20)
	public String getTsid() {
		return this.tsid;
	}

	public void setTsid(String tsid) {
		this.tsid = tsid;
	}

	@Column(name = "TEMPLATEURL", nullable = false)
	public String getTemplateurl() {
		return this.templateurl;
	}

	public void setTemplateurl(String templateurl) {
		this.templateurl = templateurl;
	}

	@Column(name = "SYSTEMCONTENT", nullable = false, length = 45)
	public String getSystemcontent() {
		return this.systemcontent;
	}

	public void setSystemcontent(String systemcontent) {
		this.systemcontent = systemcontent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "BUILDHTMLPATH", nullable = false)
	public String getBuildhtmlpath() {
		return this.buildhtmlpath;
	}

	public void setBuildhtmlpath(String buildhtmlpath) {
		this.buildhtmlpath = buildhtmlpath;
	}

	@Column(name = "SIGN", nullable = false, length = 45)
	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Column(name = "STATUS", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "THEMEID", length = 20)
	public String getThemeid() {
		return this.themeid;
	}

	public void setThemeid(String themeid) {
		this.themeid = themeid;
	}

	@Column(name = "THEMENAME", length = 45)
	public String getThemename() {
		return this.themename;
	}

	public void setThemename(String themename) {
		this.themename = themename;
	}

}
