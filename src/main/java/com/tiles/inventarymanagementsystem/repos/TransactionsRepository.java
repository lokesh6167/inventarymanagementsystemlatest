package com.tiles.inventarymanagementsystem.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiles.inventarymanagementsystem.entities.Transaction;

@Repository
public interface TransactionsRepository extends CrudRepository<Transaction, Integer> {

}
