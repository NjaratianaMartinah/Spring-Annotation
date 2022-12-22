package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(){
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("email : "+email);
        return null;
    }

    @Override
    public String getDailyFortune() {
        System.out.println("team : "+ team);
        return null;
    }
    
}
