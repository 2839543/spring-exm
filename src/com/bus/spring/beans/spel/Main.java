package com.bus.spring.beans.spel;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-spel.xml");
 
//	
	Address addr = (Address)ctx.getBean("address");
	System.out.println(addr);
	
//	Car car = (Car) ctx.getBean("car");
//	System.out.println(car);

	Person person = (Person) ctx.getBean("person");
	
	System.out.println(person);
}
}
