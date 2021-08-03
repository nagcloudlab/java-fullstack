package com.example.web;


import com.example.service.TxrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TxrController {

    @Autowired
    private TxrService txrService;

    @PostMapping(value="/txr")
    public @ResponseBody
    String doTxr(HttpServletRequest request){

        String fromAccNum=request.getParameter("fromAccNum");
        String toAccNum=request.getParameter("toAccNum");
        String amount=request.getParameter("amount");

        boolean b=txrService.txr(Double.parseDouble(amount),fromAccNum,toAccNum);

        String status="";
        if(b){
            status="Txr successfull";
        }else{
            status="Txr Failed";
        }
        return  status;

    }

}
