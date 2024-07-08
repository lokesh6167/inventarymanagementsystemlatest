package com.tiles.inventarymanagementsystem.services;

import java.util.List;

import com.tiles.inventarymanagementsystem.entities.Product;
import com.tiles.inventarymanagementsystem.entities.Transaction;

public interface ProductService {

	List<Product> getAllProducts();

	Product updateProduct(Integer id, Transaction transaction);

	Product addNewProducts(Product product);


}
