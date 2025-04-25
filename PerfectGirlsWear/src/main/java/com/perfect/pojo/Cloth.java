package com.perfect.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cloth {
	@Id
	private int clothId;
	private String clothCompany;
	private String clothSize;
	private int clothPrice;
	
	public Cloth(int clothId, String clothCompany, String clothSize, int clothPrice) {
		super();
		this.clothId = clothId;
		this.clothCompany = clothCompany;
		this.clothSize = clothSize;
		this.clothPrice = clothPrice;
	}

	public Cloth() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getClothId() {
		return clothId;
	}

	public void setClothId(int clothId) {
		this.clothId = clothId;
	}

	public String getClothCompany() {
		return clothCompany;
	}

	public void setClothCompany(String clothCompany) {
		this.clothCompany = clothCompany;
	}

	public String getClothSize() {
		return clothSize;
	}

	public void setClothSize(String clothSize) {
		this.clothSize = clothSize;
	}

	public int getClothPrice() {
		return clothPrice;
	}

	public void setClothPrice(int clothPrice) {
		this.clothPrice = clothPrice;
	}

	@Override
	public String toString() {
		return "Cloth [clothId=" + clothId + ", clothCompany=" + clothCompany + ", clothSize=" + clothSize
				+ ", clothPrice=" + clothPrice + "]";
	}
	
	
}
