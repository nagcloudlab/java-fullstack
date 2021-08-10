package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TxrService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/txr")
public class TxrController { // ak.a Resource
	
	
	@Autowired
	TxrService txrService;
	
	@PostMapping
	public TxrResponse txr(@RequestBody TxrRequest request) {
		txrService.txr(request.getAmount(),request.getFromAccNum(),request.getToAccNum());
		TxrResponse response=new TxrResponse();
		response.setMessage("txr successfull");
		return response;
	}
	

}
