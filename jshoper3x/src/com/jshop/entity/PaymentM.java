package com.jshop.entity;

// Generated 2014-5-27 21:22:57 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PaymentM generated by hbm2java
 */
@Entity
@Table(name = "payment_m", catalog = "jshoper3")
public class PaymentM implements java.io.Serializable {

	private String paymentid;
	private String paymentname;
	private String paymentCode;
	private String paymentFree;
	private String paymentInterface;
	private String account;
	private String safecode;
	private String partnerid;
	private String des;
	private String isFast;
	private String state;

	public PaymentM() {
	}

	public PaymentM(String paymentid, String state) {
		this.paymentid = paymentid;
		this.state = state;
	}

	public PaymentM(String paymentid, String paymentname, String paymentCode,
			String paymentFree, String paymentInterface, String account,
			String safecode, String partnerid, String des, String isFast,
			String state) {
		this.paymentid = paymentid;
		this.paymentname = paymentname;
		this.paymentCode = paymentCode;
		this.paymentFree = paymentFree;
		this.paymentInterface = paymentInterface;
		this.account = account;
		this.safecode = safecode;
		this.partnerid = partnerid;
		this.des = des;
		this.isFast = isFast;
		this.state = state;
	}

	@Id
	@Column(name = "PAYMENTID", unique = true, nullable = false, length = 20)
	public String getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	@Column(name = "PAYMENTNAME", length = 45)
	public String getPaymentname() {
		return this.paymentname;
	}

	public void setPaymentname(String paymentname) {
		this.paymentname = paymentname;
	}

	@Column(name = "PAYMENT_CODE", length = 20)
	public String getPaymentCode() {
		return this.paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	@Column(name = "PAYMENT_FREE", length = 20)
	public String getPaymentFree() {
		return this.paymentFree;
	}

	public void setPaymentFree(String paymentFree) {
		this.paymentFree = paymentFree;
	}

	@Column(name = "PAYMENT_INTERFACE", length = 1)
	public String getPaymentInterface() {
		return this.paymentInterface;
	}

	public void setPaymentInterface(String paymentInterface) {
		this.paymentInterface = paymentInterface;
	}

	@Column(name = "ACCOUNT", length = 100)
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "SAFECODE", length = 128)
	public String getSafecode() {
		return this.safecode;
	}

	public void setSafecode(String safecode) {
		this.safecode = safecode;
	}

	@Column(name = "PARTNERID", length = 128)
	public String getPartnerid() {
		return this.partnerid;
	}

	public void setPartnerid(String partnerid) {
		this.partnerid = partnerid;
	}

	@Column(name = "DES", length = 200)
	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Column(name = "IS_FAST", length = 1)
	public String getIsFast() {
		return this.isFast;
	}

	public void setIsFast(String isFast) {
		this.isFast = isFast;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
