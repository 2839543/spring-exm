package com.bus.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		HelloWorld helloworld = new HelloWorld();
//		helloworld.setName("at bus");
//		helloworld.hello();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		HelloWorld hello =		(HelloWorld) ctx.getBean("helloWorld");
//        hello.hello();
		//Car car = 	(Car) ctx.getBean("car");
		// car = 	(Car) ctx.getBean("car2");
		 
		Person per = (Person) ctx.getBean("person");
		System.out.println(per);
	}

}
