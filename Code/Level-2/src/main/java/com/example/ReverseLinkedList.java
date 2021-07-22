package com.example;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {


        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");

       /*

        Algorithms / steps / imperative style
            step-1 :  swap edge element(s)
        */

//        Collections.reverse(linkedList); // built-in api

        // custom
        for(int i=0;i<linkedList.size()/2;i++){
            String edge1=linkedList.get(i);
            String edge2=linkedList.get(linkedList.size()-i-1);
            linkedList.set(i,edge2);
            linkedList.set(linkedList.size()-i-1,edge1);
        }

        System.out.println(linkedList);


    }
}
