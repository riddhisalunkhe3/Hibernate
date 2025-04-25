package com.restaurant;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="restaurant_table")
public class Restaurant {
	@Id
	private int restaurantId;
	private String restaurantName;
	@ManyToMany
	@JoinTable
	private List<Dish> dishes;
	
	
	public Restaurant(int restaurantId, String restaurantName) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
	}
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(int restaurantId, String restaurantName, List<Dish> dishes) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.dishes = dishes;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", dishes=" + dishes
				+ "]";
	}
	
	
}
