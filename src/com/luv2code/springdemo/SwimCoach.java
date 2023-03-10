package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
