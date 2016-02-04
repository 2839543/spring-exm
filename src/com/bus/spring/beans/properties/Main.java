package com.bus.spring.beans.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bus.spring.beans.collections.DataSource; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		 DataSource ds  = (DataSource)ctx.getBean("dataSource");
		 System.out.println(ds);
	}

}
