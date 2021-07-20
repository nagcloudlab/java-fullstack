package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class Ex4 {

	public static void main(String[] args) throws SQLException {

		Connection con = null;

		Date utilDate = new Date();
		LocalDate localDate = LocalDate.now();

		String sql = "insert into (name,dob) values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "Nag");
		ps.setDate(2, java.sql.Date.valueOf(localDate));
		ps.execute();

	}

}
