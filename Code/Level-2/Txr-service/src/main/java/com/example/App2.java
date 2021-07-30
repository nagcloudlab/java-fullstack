package com.example;

public class App2 {
    public static void main(String[] args) {
        System.out.println(System.getProperties().get("key1"));
        System.getenv().forEach((key,value)->{
            System.out.println(key+" "+value);
        });
    }
}
