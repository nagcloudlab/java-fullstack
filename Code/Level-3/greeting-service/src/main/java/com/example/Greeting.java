package com.example;

public enum Greeting {

    ENGLISH("welcome"),
    TAMIL("வரவேற்பு"),
    ARABIC("أهلا بك"),;

    String message;

    Greeting(String message) {
        this.message=message;
    }

}
