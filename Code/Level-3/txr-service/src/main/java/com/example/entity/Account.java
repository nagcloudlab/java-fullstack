package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="ACCOUNTS",schema = "accounts_db")
public class Account {
    @Id
    @Column(name="NUMBER")
    private String number;
    @Column(name="BALANCE")
    private double balance;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    private List<Txn> txns;

}
