package com.example.api;

import com.example.exception.NoAccountException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalController {


    @ResponseStatus(HttpStatus.NOT_FOUND)// 404
    @ExceptionHandler(value = {NoAccountException.class})
    public TxrResponse noAccount(Throwable t){
        TxrResponse response=new TxrResponse();
        response.setMessage("account not found, number="+t.getMessage());
        return response;
    }

}
