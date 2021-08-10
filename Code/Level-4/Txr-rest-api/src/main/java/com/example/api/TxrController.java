package com.example.api;

import com.example.repository.AccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.repository.JpaTxnRepository;
import com.example.repository.TxnRepository;
import com.example.service.TxrService;
import com.example.service.TxrServiceImpl;

import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/txr")
public class TxrController { // ak.a Resource
	
	TxrService txrService;
	
	
	@PostConstruct
	public void init() {

		 AccountRepository accountRepository=new JpaAccountRepository();
	     TxnRepository txnRepository=new JpaTxnRepository();
	     txrService=new TxrServiceImpl(accountRepository,txnRepository);
		
	}
	
	@POST
	@Consumes(value = "application/json")
	@Produces(value = "application/json")
	public TxrResponse txr(TxrRequest request) {
		
		System.out.println(request);
		
		txrService.txr(request.getAmount(),request.getFromAccNum(),request.getToAccNum());
		TxrResponse response=new TxrResponse();
		response.setMessage("txr successfull");
		return response;
	}
	

}
