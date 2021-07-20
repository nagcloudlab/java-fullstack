package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.database.ConnectionFactory;
import com.example.entity.Product;
import com.example.entity.ProductType;

public class JdbcProductRepository implements ProductRepository {

	@Override
	public void save(Product product) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();
		String sql = "insert into PRODUCTS(name,price,type) values (?,?,?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, product.getName());
		ps.setDouble(2, product.getPrice());
		ps.setString(3, product.getType().name());

		ps.executeUpdate();

		connection.close();

	}

	@Override
	public List<Product> findAll() throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		String sql = "select * from PRODUCTS";
		PreparedStatement ps = connection.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Product> products = new ArrayList<>();
		while (rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setPrice(rs.getDouble(3));
			product.setType(ProductType.valueOf(rs.getString(4)));
			products.add(product);
		}

		connection.close();
		
		return products;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByType(ProductType productType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
