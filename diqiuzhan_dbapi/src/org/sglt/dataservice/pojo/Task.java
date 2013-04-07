package org.sglt.dataservice.pojo;

import java.util.Date;

public class Task {
	
	private String _id;
	// 电话接听人员.
	private String phoneAnswer;
	// 接听电话号码.
	private String phoneNumer;
	// 电话接听时间.
	private Date phoneTime;
	// 上门收取捐赠物人员.
	private String collector;
	// 入库时间.
	private Date storageTime;
	
	// 所属分区.
	private String area;
	// 任务处理状态.
	private String status;
	// 捐赠人证件号码.
	private String owerId;
	// 捐赠人姓名
	private String name;
	// 备注
	private String remark;
	
	// 保留字段
	private String res1;
	private String res2;
	
	public String getPhoneAnswer() {
		return phoneAnswer;
	}
	public void setPhoneAnswer(String phoneAnswer) {
		this.phoneAnswer = phoneAnswer;
	}
	public String getPhoneNumer() {
		return phoneNumer;
	}
	public void setPhoneNumer(String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}
	public Date getPhoneTime() {
		return phoneTime;
	}
	public void setPhoneTime(Date phoneTime) {
		this.phoneTime = phoneTime;
	}
	public String getCollector() {
		return collector;
	}
	public void setCollector(String collector) {
		this.collector = collector;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwerId() {
		return owerId;
	}
	public void setOwerId(String owerId) {
		this.owerId = owerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRes1() {
		return res1;
	}
	public void setRes1(String res1) {
		this.res1 = res1;
	}
	public String getRes2() {
		return res2;
	}
	public void setRes2(String res2) {
		this.res2 = res2;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Date getStorageTime() {
		return storageTime;
	}
	public void setStorageTime(Date storageTime) {
		this.storageTime = storageTime;
	}
}
