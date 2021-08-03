package com.example.web;

import com.example.service.TxrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TxrController {

    @Autowired
    private TxrService txrService;

    @GetMapping("/txr-form")
    public String getTxrForm(){
        return "transfer-form";
    }

    @PostMapping(value="/txr")
    public String doTxr(HttpServletRequest request, Model model){

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

        model.addAttribute("status",status);

        return "transfer-status";

    }
    
}
