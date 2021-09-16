package com.example.proxy;

import org.springframework.stereotype.Service;

@Service
public class SomeService {



    public void useCase1(){
        // tm.begin()
        System.out.println("use-case-1");
        // if all good : tm.commit()
        // if anything bad: tm.rollback()
        // close()
    }

    public void useCase2(){
        // tm.begin()
        System.out.println("use-case-2");
        // if all good : tm.commit()
        // if anything bad: tm.rollback()
        // close()
    }

}
