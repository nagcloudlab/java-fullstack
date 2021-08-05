package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="todos")
public class Todo {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private boolean completed;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
