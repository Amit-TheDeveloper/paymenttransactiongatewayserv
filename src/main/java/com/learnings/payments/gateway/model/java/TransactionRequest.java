package com.learnings.payments.gateway.model.java;

public class TransactionRequest {

	private int transactionID;
	private Amount amount;
	private CardHolder cardHolder;
	private Instrument cardInstrument;
	private Merchant merchant;

	
	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public CardHolder getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(CardHolder cardHolder) {
		this.cardHolder = cardHolder;
	}

	public Instrument getCardInstrument() {
		return cardInstrument;
	}

	public void setCardInstrument(Instrument cardInstrument) {
		this.cardInstrument = cardInstrument;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

}
