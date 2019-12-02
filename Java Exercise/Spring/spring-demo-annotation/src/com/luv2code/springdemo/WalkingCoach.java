package com.luv2code.springdemo;

public class WalkingCoach implements Coach {

	private FortuneService fortuneService;
	
	public WalkingCoach(FortuneService theFortuneService)
	{	
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Walk 1000 miles everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
