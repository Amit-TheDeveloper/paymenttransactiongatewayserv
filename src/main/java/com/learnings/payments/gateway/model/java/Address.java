package com.learnings.payments.gateway.model.java;

import javax.validation.constraints.NotNull;

public class Address {

	String city;
	String state;
	@NotNull(message = "cntry cannot be null")
	String country;
	@NotNull(message = "zip cannot be null")
	String zipCode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
