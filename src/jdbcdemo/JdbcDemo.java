package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/studentdbs";
		String username = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println("Database Connected Successfully!");

			Statement stmt = con.createStatement();

			String query = "SELECT * FROM student";

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println("Name: " + rs.getString("name"));
				System.out.println("age: " + rs.getInt("age"));
				System.out.println("Salary: " + rs.getInt("salary"));
				System.out.println("Department: " + rs.getString("dept"));
				System.out.println("Degree: " + rs.getString("degree"));
				System.out.println("----------------");
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
