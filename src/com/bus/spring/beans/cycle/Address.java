package com.bus.spring.beans.cycle;

public class Address {
	
	private String city ;
	
	private String strest;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getStrest() {
		return strest;
	}
	public void setStrest(String strest) {
		this.strest = strest;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", strest=" + strest + "]";
	}
	 
	
	
	
}
