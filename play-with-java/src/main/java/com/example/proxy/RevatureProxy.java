package com.example.proxy;

import java.util.ArrayList;
import java.util.List;

public class RevatureProxy implements Revature {

    Auth auth = new Auth();
    TimeLog timeLog = new TimeLog();
    FullstackTrainer fullstackTrainer = new FullstackTrainer();

    @Override
    public List<String> getTraining(String tngType) {

        auth.doAuth();
        timeLog.doTimeLog();

        List<String> javaTopics= fullstackTrainer.getJavaTopics();
        List<String> jsTopics=fullstackTrainer.getJavascriptTopics();

        // QC

        // Coding practice

        // Place

        List<String> topics=new ArrayList<>();
        topics.addAll(javaTopics);
        topics.addAll(jsTopics);
        return topics;
    }
}
