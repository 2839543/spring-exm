package com.bus.spring.beans.spel;
 

import java.lang.Math;

public class Car {
	
	private String brand; 
	private double price; 
	private double tyrePerimeter;
	
	
	 
	
	public Car() { 
	System.out.println("Car's constructor....");
	}

 
	public double getTyrePerimeter() {
		return tyrePerimeter;
	}


	public void setTyrePerimeter(double tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	 
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrePerimeter=" + tyrePerimeter + "]";
	}

	 
	
}
