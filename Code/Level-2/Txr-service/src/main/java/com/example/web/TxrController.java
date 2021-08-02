package com.example.web;

import com.example.service.TxrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TxrController {

    @Autowired
    TxrService txrService;

    @PostMapping("/txr")
    public void doTxr(HttpServletRequest request){
        //
//        txrService.txr(amount,fromAccNum,toAccNum);
    }

}
