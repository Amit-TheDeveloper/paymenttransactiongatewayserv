package com.learnings.payments.gateway.model.java;

import javax.validation.constraints.NotNull;

public class Amount {

	@NotNull(message = "cannot be null")
	private double txnAmount;
	private int currencyCode;
	private String isoCurrencyCode;

	public double getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(double txnAmount) {
		this.txnAmount = txnAmount;
	}

	public int getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(int currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}

	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}

}
