package com.tiles.inventarymanagementsystem.services;

import java.util.List;

import com.tiles.inventarymanagementsystem.entities.Transaction;

public interface TransactionService {

	List<Transaction> getTransactions();

	Transaction updateTransaction(Integer id, Integer currentStock, Transaction transaction);

	void deleteTransaction(Integer productId, Integer currentStock, Transaction transaction);

//	Transaction addTransaction(Transaction transaction);

}
