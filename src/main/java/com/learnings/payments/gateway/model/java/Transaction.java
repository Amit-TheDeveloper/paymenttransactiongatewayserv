package com.learnings.payments.gateway.model.java;

public class Transaction {

	Integer txnID;
	TransactionRequest txnRequest;
	TransactionResponse txnResponse;

	public TransactionRequest getTxnRequest() {
		return txnRequest;
	}

	public void setTxnRequest(TransactionRequest txnRequest) {
		this.txnRequest = txnRequest;
	}

	public TransactionResponse getTxnResponse() {
		return txnResponse;
	}

	public void setTxnResponse(TransactionResponse txnResponse) {
		this.txnResponse = txnResponse;
	}

	public Integer getTxnID() {
		return txnID;
	}

	public void setTxnID(Integer txnID) {
		this.txnID = txnID;
	}
	

}
