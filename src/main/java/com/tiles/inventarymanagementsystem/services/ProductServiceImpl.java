package com.tiles.inventarymanagementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiles.inventarymanagementsystem.entities.Product;
import com.tiles.inventarymanagementsystem.entities.Transaction;
import com.tiles.inventarymanagementsystem.repos.ProductRepository;
import com.tiles.inventarymanagementsystem.repos.TransactionsRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository product_repo;
	@Autowired
	private TransactionsRepository transaction_repo;
	
	@Override
	public List<Product> getAllProducts(){
		return (List<Product>) product_repo.findAll();
	}
	
	@Override
	public Product updateProduct(Integer id, Transaction transaction) {
		Product product=product_repo.findById(id).get();
		String transactionType=transaction.getTransactionType();
		if(transactionType.equals("Inflow")) {
			product.setStockQuantity(product.getStockQuantity()+transaction.getTransactionQuantity());
		}else if(transactionType.equals("Outflow")) {
			product.setStockQuantity(product.getStockQuantity()-transaction.getTransactionQuantity());
		}
		transaction_repo.save(transaction);
		return product_repo.save(product);
	}
	
	@Override
	public Product addNewProducts(Product product) {
		return product_repo.save(product);
	}

}
