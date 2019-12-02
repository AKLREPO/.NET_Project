package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

	
	@Autowired
	@Qualifier("userFortuneService")
	private FortuneService fortuneService;
	
	/*//@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> Inside the default constructor");
	}
	
	/*
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}
	*/
	/*
	//define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println(">> TennisCoach: inside the setFortuneService() method");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService)
	{
		System.out.println(">> TennisCoach: inside the setFortuneService() method");
		fortuneService = theFortuneService;
	}
	*/
	
	
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
