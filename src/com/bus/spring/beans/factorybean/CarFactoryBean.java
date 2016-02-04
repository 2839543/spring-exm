package com.bus.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car>{

	private String brand ;
	
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public Car getObject() throws Exception { 
		return new Car("BMW",500000);
	}

	@Override
	public Class<?> getObjectType() { 
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return  true;
	}
	
}
