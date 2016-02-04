package com.bus.spring.beans.spel;
 

public class Person {
	private String name;
	private Car car; 
	// 引用address bean的city 属性
	private String city ;
	
	//根据Car的price 确定info  car 的price 》=30000 为金领 否则为白领
	private String info;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
	} 
	
}
