package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		
		//read the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		//get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//Coach theBasketBallCoach = context.getBean("basketballCoach", Coach.class);
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkOut());

		System.out.println(theCoach.getDailyFortune());
		
		//call our new swim coach methods
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
