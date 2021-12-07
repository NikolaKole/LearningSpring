package com.learningSpring.Annotations.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach{
    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    public PingPongCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your pingpong drop shot";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
