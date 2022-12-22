package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) throws Exception {
    
        // read spring config file
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the ban from the spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alfaCoach = context.getBean("tennisCoach", Coach.class);
       
        // check if they are the same
        boolean result = (theCoach == alfaCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alfaCoach: " + alfaCoach);
        // close the context
        context.close();
    }
}
