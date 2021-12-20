package com.learnings.payments.gateway.client.api;


import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learnings.payments.gateway.model.java.Authorization;
import com.learnings.payments.gateway.model.java.TransactionResponse;

public interface TransactionOperations {
	
	@RequestMapping(path="/authorize", method = RequestMethod.POST)
	@Async
	public TransactionResponse doAuthorize(@RequestBody Authorization txnrequest);
	
	@RequestMapping(value="/reverse/{authId}", method = RequestMethod.POST)
	//@PostMapping("/reverse/{authId}") --> Shortcut to Request mapping
	public TransactionResponse doReversal(String authId);
	

}
