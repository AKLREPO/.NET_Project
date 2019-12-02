package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sport.properties")
public class UserFortuneService implements FortuneService {

	@Value("${fortune}")
	private String data;
	private String[] fortune;
	
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Loading data from sports.properties");
		fortune = data.split(",");
	}
	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		Random randomObject = new Random();
		int randomNumber = randomObject.nextInt(fortune.length);
		
		return fortune[randomNumber];
	}

}
