package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Autowired
    @Qualifier("practiceFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
