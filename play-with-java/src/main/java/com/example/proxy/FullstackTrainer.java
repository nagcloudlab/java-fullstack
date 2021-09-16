package com.example.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class FullstackTrainer {

    public List<String> getJavaTopics(){
        return List.of("java","spring");
    }
    public List<String> getJavascriptTopics(){
        return List.of("javascript","NG");
    }

}

/*

 design issues

    => code tangling / tight-coupling
    => code scattering / duplication

 */