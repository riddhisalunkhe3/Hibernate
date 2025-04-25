package com.hibernate.task1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
@Entity
public class Customer {
	@Id
	@Column(name="cus_Id")
	private int cusId;
	private String cusName;
	private String address;

	@OneToOne
	private Laptop laptop;
	
	public Customer(int cusId, String cusName, String address, Laptop laptop) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.address = address;
		this.laptop = laptop;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", address=" + address + ", laptop=" + laptop + "]";
	}
	
	
}
