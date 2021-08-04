package com.example.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TxrResponse")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TxrResponse {
    private int id;
    private String message;
}
