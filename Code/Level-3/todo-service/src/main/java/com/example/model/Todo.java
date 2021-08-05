package com.example.model.model;

import com.example.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Todo {

    @Id
    private int id;
    private String title;
    private boolean completed;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
