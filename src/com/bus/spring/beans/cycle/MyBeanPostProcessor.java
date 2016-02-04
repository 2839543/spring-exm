package com.bus.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization:" + bean +  ", " + beanName);
		
		if("car".equals(beanName)){
			System.out.println("[success ] postProcessAfterInitialization "+beanName);
		}
		return bean ;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization:"+bean+ ","+ beanName);
		
		if("car".equals(beanName)){
			System.out.println("[success ] postProcessBeforeInitialization "+beanName);
			
		}
		
		return bean;
	}
	
}
