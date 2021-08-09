package com.example;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/greeting/")
public class GreetingController {

    @GetMapping("/{lang}")
    public String getGreetingMessage(@PathVariable String lang){
        String greetingMessage="";
                switch (lang){
                    case "en":
                        greetingMessage=Greeting.ENGLISH.message;
                        break;
                    case "ar":
                        greetingMessage=Greeting.ARABIC.message;
                        break;
                    case "tn":
                        greetingMessage=Greeting.TAMIL.message;
                        break;
                    default:
                        greetingMessage="greetings";
                }
                return greetingMessage;
    }

}
