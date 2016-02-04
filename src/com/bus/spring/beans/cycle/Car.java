package com.bus.spring.beans.cycle;

 
public class Car {
	
	private String brand; 
	
	 public void setBrand(String brand) {
		 System.out.println("setBrand ....");
		this.brand = brand;
	}
	
	public Car() { 
	System.out.println("Car's constructor....");
	}
 
	public void init() {
		System.out.println("init...");
	}
	
 	public void destroy(){
 		System.out.println("destroy...");
 	}
}
