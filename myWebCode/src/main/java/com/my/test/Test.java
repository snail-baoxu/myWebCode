package com.my.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoxu.model.User;

public class Test {
	public static void main(String[] args) {
		BeanFactory applicationContext = new ClassPathXmlApplicationContext("/spring/root-context.xml");
		
		
		User user = (User) applicationContext.getBean("user");
		
		System.out.println(user.getUserName());
	}

}
