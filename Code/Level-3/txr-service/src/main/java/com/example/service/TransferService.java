package com.example.service;

public interface TransferService {

   TxrStatus txr(double amount,String fromAccNum,String toAccNum);

}
