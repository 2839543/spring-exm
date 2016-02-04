package com.bus.spring.beans;

public class HelloWorld {
	
	private String name ;
	
	private String name2 ;
	
	public void setName(String name) {
		System.out.println("do name ....");
		this.name = name;
	}
	
	public void setName2(String name2) {
		System.out.println("do name2 ....");
		this.name2 = name2;
	} 
	
	public void hello(){
		System.out.println("hello:"+name);
	}  
	public HelloWorld() {
		System.out.println("current doing constructor....");
	}
	
}
