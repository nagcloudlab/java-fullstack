package com.example.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Factory class
public class ConnectionFactory {

//	private static Properties properties = new Properties();
//
//	static {
//		try {
//			FileInputStream fis = new FileInputStream("src/main/resources/db.properties");
//			properties.load(fis);
//			fis.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	static {
		// step-1 : register 'jdbc-driver'
		try {
//			DriverManager.registerDriver(new Driver());
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Factory method
	public static Connection getConnection() throws SQLException {
		// step-2: create db-connection with URL,username and Password
		String url = "jdbc:mysql://localhost:3306/pm_db";
		String username = "root";
		String password = "root1234";
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}

}
