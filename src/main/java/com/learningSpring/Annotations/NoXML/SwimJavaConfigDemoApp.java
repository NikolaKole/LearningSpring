package com.learningSpring.Annotations.NoXML;

import com.learningSpring.Annotations.Exercise.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);//

        // get the bean from spring cont

        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call our new swim coah methods... has the props values injected
        System.out.println("email: "  +theCoach.getEmail());
        System.out.println("team: "  +theCoach.getTeam());

        //close the context
        context.close();

    }
}
