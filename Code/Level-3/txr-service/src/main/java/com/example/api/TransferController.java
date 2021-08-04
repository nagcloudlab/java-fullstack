package com.example.api;

import com.example.exception.BalanceException;
import com.example.exception.NoAccountException;
import com.example.service.TransferService;
import com.example.service.TxrStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransferController {

    private TransferService transferService;

    @Autowired
    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping(
            value = "/api/txr",
            consumes = {"application/json","application/xml"},
            produces = {"application/json","application/xml"}
    )
    public ResponseEntity<?> doTxr(@RequestBody TxrRequest request){
       TxrStatus txrStatus= transferService.txr(request.getAmount(),request.getFromAccNum(), request.getToAccNum());
       TxrResponse response=new TxrResponse();
       response.setMessage(txrStatus.getStatus().name());
       return ResponseEntity.ok().body(response); // 200
    }
//
//    @ResponseStatus(HttpStatus.NOT_FOUND)// 404
//    @ExceptionHandler(value = {NoAccountException.class})
//    public TxrResponse noAccount(Throwable t){
//        TxrResponse response=new TxrResponse();
//        response.setMessage("account not found, number="+t.getMessage());
//        return response;
//    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)// 400
    @ExceptionHandler(value = {BalanceException.class})
    public TxrResponse noEnoughBalance(Throwable t){
        TxrResponse response=new TxrResponse();
        response.setMessage("no enough balance, balance="+t.getMessage());
        return response;
    }

}
