package com.tiles.inventarymanagementsystem.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiles.inventarymanagementsystem.entities.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
