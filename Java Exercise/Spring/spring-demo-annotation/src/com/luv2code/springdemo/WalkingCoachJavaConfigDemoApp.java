package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WalkingCoachJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
		
		WalkingCoach theCoach = context.getBean("walkingCoach", WalkingCoach.class);
		
		
		System.out.println(theCoach.getDailyWorkOut());

		System.out.println(theCoach.getDailyFortune());
		
		context.close();
		
	}

}
