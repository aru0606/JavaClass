package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedDemo {
	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdbs", "root", "root");

			String query = "SELECT * FROM student WHERE age = ?";

			PreparedStatement pstmt = con.prepareStatement(query);
			
			int age = 21;

			pstmt.setInt(1, age);

			ResultSet rs = pstmt.executeQuery();

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
