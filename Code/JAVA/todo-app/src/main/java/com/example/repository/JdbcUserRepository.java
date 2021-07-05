package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.db.ConnectionFactory;
import com.example.entity.User;

public class JdbcUserRepository implements UserRepository {

	@Override
	public void save(User user) {

		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
			// step-3 : create jdbc-statements with SQL
			String sql = "insert into users (name) values (?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getName());
			// step-4 : excute jdbc-statements & process result-set
			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println("User saved.");
			}
			// step-7 : close connection
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
