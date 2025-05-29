package com.ex.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("DI Configuration loaded successfully");
		Student student=context.getBean("stu",Student.class);
		student.read();
	}
}