package com.learnings.payments.gateway.model.java;

// Fields from parent request to be sent in follow up txn
public class ParentResponse {

	String responseCode;
	String authCode;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

}
