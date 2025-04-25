package com.perfect.pojo;

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
	private String moNo;
	private String cusAddr;

	private List<Cloth> cloth;
	
	public Customer(int cusId, String cusName, String moNo, String cusAddr, List<Cloth> cloth) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.moNo = moNo;
		this.cusAddr = cusAddr;
		this.cloth = cloth;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getMoNo() {
		return moNo;
	}

	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}

	public String getCusAddr() {
		return cusAddr;
	}

	public void setCusAddr(String cusAddr) {
		this.cusAddr = cusAddr;
	}

	public List<Cloth> getCloth() {
		return cloth;
	}

	public void setCloth(List<Cloth> cloth) {
		this.cloth = cloth;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", moNo=" + moNo + ", cusAddr=" + cusAddr
				+ ", cloth=" + cloth + "]";
	}
	
	
}
