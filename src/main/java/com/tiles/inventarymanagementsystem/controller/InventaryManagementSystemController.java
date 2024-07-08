package com.tiles.inventarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tiles.inventarymanagementsystem.entities.Product;
import com.tiles.inventarymanagementsystem.entities.Transaction;
import com.tiles.inventarymanagementsystem.services.ProductService;
import com.tiles.inventarymanagementsystem.services.TransactionService;

@CrossOrigin
@RestController
@RequestMapping("/inventarymanagement")
public class InventaryManagementSystemController{
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/testServer")
	public String testingServer(){
		return "Hi I am up.. You can use me..";
	}
	
	@GetMapping("/getProducts")
	public List<Product> allProducts(){
		return productService.getAllProducts();
	}
	
	@PutMapping("/updateProducts")
	public Product updateProduct(@RequestParam(name = "id")Integer id,@RequestBody Transaction transaction){
		return productService.updateProduct(id,transaction);
	}
	
	@PostMapping("/addNewProducts")
	public Product addNewProducts(@RequestBody Product product) {
		return productService.addNewProducts(product);
	}
	
	@RequestMapping("/getTransactions")
	public List<Transaction> allTransactions(){
		return transactionService.getTransactions();
	}
	
	@PutMapping("/updateTransaction")
	public Transaction updateTransaction(@RequestParam(name = "product_id")Integer productId,@RequestParam(name="current_stock")Integer currentStock,@RequestBody Transaction transaction){
		return transactionService.updateTransaction(productId,currentStock,transaction);
	}
	
	@DeleteMapping("/deleteTransaction")
	public void deleteTransaction(@RequestParam(name = "product_id")Integer productId,@RequestParam(name="current_stock")Integer currentStock,@RequestBody Transaction transaction){
		transactionService.deleteTransaction(productId,currentStock,transaction);
	}
	
}
