package com.learnings.payments.gateway.components.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository<Transaction> extends CrudRepository<Transaction, Integer> {
	
	
}
