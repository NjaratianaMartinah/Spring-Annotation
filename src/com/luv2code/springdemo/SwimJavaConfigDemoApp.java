package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SwimJavaConfigDemoApp {
    public static void main(String[] args) throws Exception {
    
        // read spring config file
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the ban from the spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);
        
        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        // call method too get the daily fortune
        System.out.println(theCoach.getDailyFortune());
        
        // close the context
        context.close();
    }
}
