package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class WelcomeController {

    @GetMapping("/")
    public ModelAndView welcome(){
        System.out.println("welcome()");
        ModelAndView mav=new ModelAndView();
        mav.addObject("message","Welcome to Revature");
        mav.setViewName("index");
        return  mav;
    }

}
