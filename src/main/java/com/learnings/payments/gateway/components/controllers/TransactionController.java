package com.learnings.payments.gateway.components.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learnings.payments.gateway.client.api.TransactionOperations;
import com.learnings.payments.gateway.components.services.TransactionService;
import com.learnings.payments.gateway.model.java.Authorization;
import com.learnings.payments.gateway.model.java.Transaction;
import com.learnings.payments.gateway.model.java.TransactionResponse;


@RestController
@RequestMapping("/transaction")
public class TransactionController implements  TransactionOperations {
	
	@Autowired
	TransactionService service;
	
	@Override
	public @ResponseBody TransactionResponse doAuthorize(Authorization transactionReq) {
		Transaction transaction = new Transaction();
		transaction.setTxnRequest(transactionReq);
		service.handleAuthorization(transaction);
		
		return transaction.getTxnResponse();
	}
	
	@Override
	public @ResponseBody TransactionResponse doReversal(String authId) {
		//service.handleReversal(transaction);	
		System.out.println("auth id is: " + authId);
		return null;
	}

}
