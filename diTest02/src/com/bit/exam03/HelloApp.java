package com.bit.exam03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloApp {
	public static void main(String[] args) {
//		MessageBean ms = new MessageBeanEn();
		MessageBean ms = null;
		
//		String configLocation = "beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam03/beans.xml");
		MessageBean bean = (MessageBean)context.getBean("mb");
		
	
		
		ms.sayHello("¿Ã∏ß");
	}
}
