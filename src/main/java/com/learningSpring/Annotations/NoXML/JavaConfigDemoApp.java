package com.learningSpring.Annotations.NoXML;

import com.learningSpring.Annotations.Exercise.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyLoggerConfig.class,SportConfig.class);//

        // get the bean from spring cont

        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        // call method to get the daily fortune

        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
