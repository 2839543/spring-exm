package com.bus.spring.beans.autowire;
 

public class Car {
	
	private String brand;
	private String corp;
	private double price;
	private Integer maxSpeed;
	
	 
	
	public Car() { 
	System.out.println("Car's constructor....");
	}

	@Override
	public String toString() { 
		return "brand->"+brand + " corp->"+corp +" price->"+price + " maxSpeed->" +maxSpeed ;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}
	
	
}
