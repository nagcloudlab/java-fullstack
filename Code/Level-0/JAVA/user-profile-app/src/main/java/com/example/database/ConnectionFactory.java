package com.example.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	static Properties properties = new Properties();

	static {
		try {
			FileInputStream fis = new FileInputStream("src/main/resources/db.properties");
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static {
		try {
			Class.forName(properties.getProperty("db.driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {

		String url = properties.getProperty("db.url");
		String user = properties.getProperty("db.user");
		String password = properties.getProperty("db.password");
		return DriverManager.getConnection(url, user, password);

	}

}
