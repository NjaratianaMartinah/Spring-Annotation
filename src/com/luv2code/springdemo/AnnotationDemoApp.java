package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) throws Exception {
    
        // read spring config file
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the ban from the spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        // close the context
        context.close();
    }
}