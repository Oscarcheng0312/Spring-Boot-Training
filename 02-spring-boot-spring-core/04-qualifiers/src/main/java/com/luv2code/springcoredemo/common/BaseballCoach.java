package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Throw the ball for 100 times";
    }
}
