package com.bus.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
	//Person person	 = (Person)	ctx.getBean("person");
	//System.out.println(person);
	
//	Address addr = (Address)ctx.getBean("address");
//	System.out.println(addr);
//	
	Address addr = (Address)ctx.getBean("address2");
	System.out.println(addr);
	
}
}
