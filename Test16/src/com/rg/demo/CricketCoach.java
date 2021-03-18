package com.rg.demo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new field for email and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("cricket coach: inside our setter method-setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("cricket coach: inside our setter method-setTeam");
		this.team = team;
	}
	//create no-arg constructor
	 public CricketCoach() {
		 System.out.println("cricket coach: no arg constructor");
	}
	 //our setter method
	 public void setFortuneService(FortuneService fortuneService) {
		 	System.out.println("cricket coach: inside our setter method-fortune service");
			this.fortuneService = fortuneService;
		}
	 
	 
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 10 min";
	}

	@Override
	public String getDailyFortune() {
		return "have a good day";
	}

}
