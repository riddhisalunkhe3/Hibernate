package com.perfectChildWear;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int cusId;
	private String cusName;
	private String CusMoNo;
	private String cusAddr;
	@OneToMany(mappedBy="customer")
	private List<Cloth> cloths;
	
	public List<Cloth> getCloths() {
		return cloths;
	}
	public void setCloths(List<Cloth> cloths) {
		this.cloths = cloths;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusMoNo() {
		return CusMoNo;
	}
	public void setCusMoNo(String cusMoNo) {
		CusMoNo = cusMoNo;
	}
	public String getCusAddr() {
		return cusAddr;
	}
	public void setCusAddr(String cusAddr) {
		this.cusAddr = cusAddr;
	}
	public Customer(int cusId, String cusName, String cusMoNo, String cusAddr) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		CusMoNo = cusMoNo;
		this.cusAddr = cusAddr;
	}
	
	
	public Customer(int cusId, String cusName, String cusMoNo, String cusAddr, List<Cloth> cloths) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		CusMoNo = cusMoNo;
		this.cusAddr = cusAddr;
		this.cloths = cloths;
	}
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", CusMoNo=" + CusMoNo + ", cusAddr=" + cusAddr
				+ ", cloths=" + cloths + "]";
	}
	
	
}
