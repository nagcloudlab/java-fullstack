package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.database.ConnectionFactory;
import com.example.entity.Account;

public class JdbcAccountRepository implements AccountRepository {

	public Account load(String accNumber) {

		Account account = null;

		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();

			String sql = "select * from Account where number=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, accNumber);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				account = new Account();
				account.setNum(rs.getString(1));
				account.setBalance(rs.getDouble(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return account;
	}

	public void update(Account account) {

		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();

			String sql = "update Account set balance=? where number=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setDouble(1, account.getBalance());
			ps.setString(2, account.getNum());
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
