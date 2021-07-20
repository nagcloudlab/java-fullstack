package com.example.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.database.ConnectionFactory;
import com.example.entity.User;

public class JdbcUserRepository implements UserRepository {

	@Override
	public void save(User user) {

		try (Connection con = ConnectionFactory.getConnection()) {

			String sql = "insert into users(name,email,mobile) values(?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getMobile());

			int modifiedRowCount = preparedStatement.executeUpdate();
			if (modifiedRowCount == 1) {
				System.out.println("user saved..");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<User> findAll() {

		List<User> list = new ArrayList<>();

		try (Connection con = ConnectionFactory.getConnection()) {

			CallableStatement callableStatement = con.prepareCall("CALL SelectAllUsers");

			ResultSet rs = callableStatement.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setMobile(rs.getString("mobile"));
				list.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	@Override
	public List<User> findByMobile(String mobile) {
		List<User> list = new ArrayList<>();

		try (Connection con = ConnectionFactory.getConnection()) {
			String sql = "select * from users where mobile=" + mobile;
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setMobile(rs.getString("mobile"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

}
