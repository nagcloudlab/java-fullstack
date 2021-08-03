package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public String welcome(Model model){
        String message="welcome to spring-mvc";
        model.addAttribute("message",message);
        return "welcome-view";
    }

}
