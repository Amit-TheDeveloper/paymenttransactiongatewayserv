package com.learnings.payments.gateway.model.java;

public class Authorization extends TransactionRequest {
	
	String retrievalNo;

	public String getRetrievalNo() {
		return retrievalNo;
	}

	public void setRetrievalNo(String retrievalNo) {
		this.retrievalNo = retrievalNo;
	}
	
	

}
