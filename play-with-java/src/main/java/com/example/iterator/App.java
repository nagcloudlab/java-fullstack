package com.example.iterator;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        NagLinkedList<String> nagFamily=new NagLinkedList<>();
        nagFamily.add("Nag");
        nagFamily.add("Indu");
        nagFamily.add("Riya");
        nagFamily.add("Diya");
        nagFamily.add("Renuka");
        nagFamily.add("Rangaya");

        for(String member:nagFamily){
            System.out.println(member);
        }

        //--------------------------------------------------

//        LinkedList<String> linkedList=new LinkedList<>();
//        linkedList.add("Nag");
//        linkedList.add("Indu");
//        linkedList.add("Riya");
//        linkedList.add("Diya");
//        for(String item:linkedList){
//            System.out.println(item);
//        }



    }
}
