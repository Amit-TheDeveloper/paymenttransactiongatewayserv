package com.learnings.payments.gateway.model.java;

// Fields from parent request to be sent in follow up txn
public class ParentRequest {

	String retrievalNo;

	public String getRetrievalNo() {
		return retrievalNo;
	}

	public void setRetrievalNo(String retrievalNo) {
		this.retrievalNo = retrievalNo;
	}
	
}
