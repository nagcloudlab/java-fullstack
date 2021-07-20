package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.example.database.ConnectionFactory;
import com.example.entity.Account;

public class App {

	public static void main(String[] args) {

		// Transaction
		Connection connection = null;
		Savepoint sp1 = null;
		Savepoint sp2 = null;
		try {

			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			sp1 = connection.setSavepoint("sp1");

			// step-1 : Load account 'from' account

			String sql1 = "select * from Account where number = '2' ";
			Statement stm1 = connection.createStatement();
			ResultSet rs1 = stm1.executeQuery(sql1);
			rs1.next();
			Account fromAccount = new Account(rs1.getString(1), rs1.getDouble(2));

			// step-2 : Load account 'to' account

			String sql2 = "select * from Account where number = '1' ";
			Statement stm2 = connection.createStatement();
			ResultSet rs2 = stm2.executeQuery(sql2);
			rs2.next();
			Account toAccount = new Account(rs2.getString(1), rs2.getDouble(2));

			sp2 = connection.setSavepoint("sp2");

			// step-4 : credit & debit

			if (fromAccount.getBalance() < 500) {

				fromAccount.setBalance(fromAccount.getBalance() - 500);
				toAccount.setBalance(toAccount.getBalance() + 500);

				// step-5 : update 'from' account

				String sql3 = "update Account set balance=? where number = ?";
				PreparedStatement ps = connection.prepareStatement(sql3);
				ps.setDouble(1, fromAccount.getBalance());
				ps.setString(2, fromAccount.getNumber());
				ps.executeUpdate();

				boolean b = true;
				if (b) {
					throw new IllegalStateException("boo00000om");
				}

				// step-6 : update 'to' account
				String sql4 = "update Account set balance=? where number = ? ";
				PreparedStatement ps2 = connection.prepareStatement(sql4);
				ps2.setDouble(1, toAccount.getBalance());
				ps2.setString(2, toAccount.getNumber());
				ps2.executeUpdate();

				connection.commit();

				System.out.println("success");
			} else {
				System.out.println("No Balance");
			}

		} catch (Exception e) {
			try {
				connection.rollback(sp2);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
