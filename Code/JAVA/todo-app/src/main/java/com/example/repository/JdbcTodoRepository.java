package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.db.ConnectionFactory;
import com.example.entity.Todo;

public class JdbcTodoRepository implements TodoRepository {

	@Override
	public void save(Todo todo) {
		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
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

	@Override
	public void update(int id, String newTitle) {

		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
			// step-3 : create jdbc-statements with SQL
			String sql = "update todos set title=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newTitle);
			ps.setInt(2, id);
			// step-4 : excute jdbc-statements & process result-set
			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println("Todo updated.");
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

	@Override
	public void update(int id, boolean completed) {

		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
			// step-3 : create jdbc-statements with SQL
			String sql = "update todos set completed=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setBoolean(1, completed);
			ps.setInt(2, id);
			// step-4 : excute jdbc-statements & process result-set
			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println("Todo updated.");
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

	@Override
	public void delete(int id) {

		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
			// step-3 : create jdbc-statements with SQL
			String sql = "delete from todos where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			// step-4 : excute jdbc-statements & process result-set
			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println("Todo deleted.");
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

	@Override
	public void clearCompleted() {

		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
			// step-3 : create jdbc-statements with SQL
			String sql = "delete from todos where completed=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setBoolean(1, true);
			// step-4 : excute jdbc-statements & process result-set
			int rowCount = ps.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Todo(s) deleted.");
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

	@Override
	public List<Todo> getTodos(TodoFilter filter) {

		Connection con = null;

		List<Todo> todos = new ArrayList<Todo>();

		try {
			con = ConnectionFactory.getConnection();
			// step-3 : create jdbc-statements with SQL

			StringBuilder query = new StringBuilder("select * from todos");
			if (filter.equals(TodoFilter.ACTIVE)) {
				query.append(" where completed=false");
			}
			if (filter.equals(TodoFilter.COMPLETED)) {
				query.append(" where completed=true");
			}

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query.toString());

			while (rs.next()) {
				Todo todo = new Todo();
				todo.setId(rs.getInt(1));
				todo.setTitle(rs.getString(2));
				todo.setCompleted(rs.getBoolean(3));
				todos.add(todo);
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

		return todos;

	}

	@Override
	public int count() {

		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
			// step-3 : create jdbc-statements with SQL
			String sql = "select count(*) from todos";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			int c = rs.getInt(1);
			return c;
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
		return 0;
	}

}
