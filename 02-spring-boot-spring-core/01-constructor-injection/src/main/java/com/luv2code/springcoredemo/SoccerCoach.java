package com.luv2code.springcoredemo;


import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice shooting for 100 times";
    }
}
