package com.example.repository;

import java.sql.SQLException;
import java.util.List;

import com.example.entity.Product;
import com.example.entity.ProductType;

public interface ProductRepository {

	void save(Product product) throws SQLException ;

	List<Product> findAll() throws SQLException ;

	Product findById(int id) throws SQLException ;

	List<Product> findByType(ProductType productType) throws SQLException ;

	void update(Product product) throws SQLException ;

	void delete(int id) throws SQLException ;

}
