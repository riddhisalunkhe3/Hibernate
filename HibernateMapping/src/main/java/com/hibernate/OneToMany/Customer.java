package com.hibernate.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Customer {
	@Id
	private int cusId;
	private String cus_name;
	private String address;
	@OneToMany
	private List<Laptop> laptopList;
	
	public Customer(int cusId, String cus_name, String address, List<Laptop> laptopList) {
		super();
		this.cusId = cusId;
		this.cus_name = cus_name;
		this.address = address;
		this.laptopList = laptopList;
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

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Laptop> getLaptopList() {
		return laptopList;
	}

	public void setLaptopList(List<Laptop> laptopList) {
		this.laptopList = laptopList;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cus_name=" + cus_name + ", address=" + address + ", laptopList="
				+ laptopList + "]";
	}
	
	
	
}
