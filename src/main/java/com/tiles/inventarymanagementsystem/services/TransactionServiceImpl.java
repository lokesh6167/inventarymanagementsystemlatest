package com.tiles.inventarymanagementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiles.inventarymanagementsystem.entities.Product;
import com.tiles.inventarymanagementsystem.entities.Transaction;
import com.tiles.inventarymanagementsystem.repos.ProductRepository;
import com.tiles.inventarymanagementsystem.repos.TransactionsRepository;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private ProductRepository product_repo;
	@Autowired
	private TransactionsRepository trans_repo;
	
	@Override
	public List<Transaction> getTransactions(){
		return (List<Transaction>) trans_repo.findAll();
	}
//	@Override
//	public Transaction addTransaction(Transaction transaction) {
//		return repo.save(transaction);
//	}

	@Override
	public Transaction updateTransaction(Integer productId, Integer currentStock, Transaction transaction) {
		Product updatingProduct = product_repo.findById(productId).get();
        updatingProduct.setStockQuantity(currentStock);
        product_repo.save(updatingProduct);
        return trans_repo.save(transaction);
	}

	@Override
	public void deleteTransaction(Integer productId, Integer currentStock, Transaction transaction) {
		Product updatingProduct = product_repo.findById(productId).get();
        updatingProduct.setStockQuantity(currentStock);
        product_repo.save(updatingProduct);
        trans_repo.delete(transaction);
	}
}
