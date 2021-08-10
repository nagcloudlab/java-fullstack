package com.example.configuration;

import javax.persistence.*;

public class JpaConfiguration {

    private static EntityManagerFactory emf;

    static {
        emf= Persistence.createEntityManagerFactory("my-pu");
    }

    public static EntityManager em(){
        return  emf.createEntityManager();
    }

}
