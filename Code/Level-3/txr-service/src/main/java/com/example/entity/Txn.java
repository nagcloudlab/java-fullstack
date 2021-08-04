package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="TXN_HISTORY",schema = "accounts_db")
public class Txn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private TxnType type;
    private double amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
//    @ManyToOne
//    @JoinColumn(name="acc_number")
//    private Account account;


}
