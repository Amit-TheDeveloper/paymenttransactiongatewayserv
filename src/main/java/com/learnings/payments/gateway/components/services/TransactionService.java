package com.learnings.payments.gateway.components.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnings.payments.gateway.components.repositories.TransactionRepository;
import com.learnings.payments.gateway.exception.GatewayException;
import com.learnings.payments.gateway.model.java.Authorization;
import com.learnings.payments.gateway.model.java.Transaction;
import com.learnings.payments.gateway.model.java.TransactionRequest;
import com.learnings.payments.gateway.model.java.TransactionResponse;

/**
 * 
 * @author amchandra
 * A servicing class to serve incoming requests.
 *
 */
@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository<TransactionRequest> txnRepository;
	
	public Transaction handleAuthorization(Transaction transaction) throws GatewayException {
			// TODO add logging
			Set<ConstraintViolation<Authorization>> voilations = validateInput(transaction);
			if(voilations.size() > 0) {
				throw new GatewayException("Please fix validation erros.");
			} else {
				try {
					ISOMsg isoMsg = getAuthorizationIso((Authorization)transaction.getTxnRequest());
					isoMsg.dump(System.out, " ");
					byte[] isoBytes = isoMsg.pack();
					//process bytes
					getResponse(transaction);
					txnRepository.save(null);
					return transaction;
				} catch (ISOException e) {
					throw new GatewayException("Message parsing failed.");
				}
			}
	}

	private void getResponse(Transaction transaction) {
		TransactionResponse response = new TransactionResponse();
		response.setAuthcode("Auth000");
		response.setResponseCode("000");
		response.setResponseMessage("Approved");
		transaction.setTxnResponse(response);
	}

	private Set<ConstraintViolation<Authorization>> validateInput(Transaction transaction) {
		ValidatorFactory validatorFactory =  Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<Authorization>> voilations = validatorFactory.getValidator().validate((Authorization)transaction.getTxnRequest());
		return voilations;
	}
	
	private ISOMsg getAuthorizationIso(Authorization authRequest) throws ISOException {
		
		ISOMsg msg = new ISOMsg();
		
		msg.setPackager(new GenericPackager(getClass().getResourceAsStream("/packager.xml")));
		msg.set(0, "0100");
		msg.set(2, authRequest.getCardInstrument().getCardNo());
		msg.set(3, "000000");
		msg.set(4, ""+authRequest.getAmount().getTxnAmount());
		
		return msg;
		
	}

}
