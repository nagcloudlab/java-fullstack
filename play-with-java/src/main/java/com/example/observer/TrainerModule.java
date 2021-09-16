package com.example.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class TrainerModule {

    final
    ApplicationEventPublisher eventPublisher;

    public TrainerModule(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void doTraining(){

        // notify , as do practice
        eventPublisher.publishEvent(new PracticeEvent("Ex1"));

    }

}
