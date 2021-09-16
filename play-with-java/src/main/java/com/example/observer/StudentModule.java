package com.example.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StudentModule implements ApplicationListener<PracticeEvent> {

    @Override
    public void onApplicationEvent(PracticeEvent practiceEvent) {
        System.out.println("student practicing : "+practiceEvent);
    }
}
