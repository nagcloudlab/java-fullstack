package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.gjt.mm.mysql.Driver;

import com.example.entity.Todo;

public class TodoApp {

	public static void main(String[] args) throws SQLException {

		Todo todo = new Todo("item-1", false);

		// step-1 : register 'jdbc-driver'
		DriverManager.registerDriver(new Driver());

		// step-2: create db-connection with URL,username and Password
		String url = "jdbc:mysql://localhost:3306/todos_db";
		String username = "root";
		String password = "root1234";

		Connection con = DriverManager.getConnection(url, username, password);

		System.out.println("connected..");

		// step-3 : create jdbc-statements with SQL
		String sql = "insert into todos (title,completed) values (?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, todo.getTitle());
		ps.setBoolean(2, todo.isCompleted());

		// step-4 : excute jdbc-statements & process result-set
		int rowCount = ps.executeUpdate();
		if (rowCount == 1) {
			System.out.println("Todo saved.");
		}

		//step-7 : close connection
		con.close();

	}

}
