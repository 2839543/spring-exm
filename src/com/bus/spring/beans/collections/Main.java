package com.bus.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) ctx.getBean("person5");
		System.out.println(person);
		
		NewPerson newp = (NewPerson) ctx.getBean("newPerson");
		System.out.println(newp);
		
		
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		System.out.println(ds);
	}

}
