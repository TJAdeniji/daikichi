package com.daikichi.daikichi.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
    
    @RequestMapping("")
    public String welcome(){
        return "Welcome!";
    }

    @RequestMapping("/today")
    public String today(){
        return "Today you will find luck in all your endeavours!";
    }

    @RequestMapping(value="/tomorrow", method=RequestMethod.GET)
    public String tomorrow() {
        return "Tomorrow, and opportunity will arise, so be sure to be open to new ideas!";
    }

    @RequestMapping(value="/travel/{city}", method=RequestMethod.GET)
    public String travel(@PathVariable("city") String city) {
        return "Congratulations! You will soon travel to " + city;
    }

    @RequestMapping(value = "/lotto/{num}", method = RequestMethod.GET)
    public String lotto(@PathVariable("num") int num){
        if(num % 2 == 0){
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        }
        else
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    }
    
    

}
