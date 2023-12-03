package com.navneet.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // injecting properties for coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //exposing a new endpoint for team info
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
     return "Coach :" + coachName + ", Team Name: " + teamName;
    }

    // Expose the endpoint "/"
    @GetMapping("/")
    public String sayHello() {
        return "Hello world!";
    }

    // expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endopoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
