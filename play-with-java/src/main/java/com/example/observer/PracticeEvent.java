package com.example.observer;

import org.springframework.context.ApplicationEvent;

public class PracticeEvent extends ApplicationEvent {
    public PracticeEvent(Object source) {
        super(source);
    }
}
