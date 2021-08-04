package com.example.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TxrRequest")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TxrRequest {

    private String fromAccNum;
    private String toAccNum;
    private double amount;

}
