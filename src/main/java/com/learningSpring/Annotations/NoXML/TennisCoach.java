package com.learningSpring.Annotations.NoXML;

import com.learningSpring.Annotations.Exercise.Coach;
import com.learningSpring.Annotations.Exercise.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;
// define default const
    public TennisCoach() {
        System.out.println(">> inside default constructor ");
    }
// define a setter method
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {

        System.out.println(">> inside default constructor... method");
        this.fortuneService = fortuneService;
    }

    /*
        @Autowired
        public TennisCoach(FortuneService fortuneService) {
            this.fortuneService = fortuneService;
        }
    */
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
