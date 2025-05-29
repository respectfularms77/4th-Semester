package com.ex.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mobile {
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration is loaded successfully");
		Sim sim=(Sim)context.getBean("sim");
		sim.calling();
		sim.data();
	}
}