package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedInsert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/studentdbs";
		String username = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println("Database Connected Successfully!");

			

			String query = "INSERT INTO student VALUES(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			
			
			String name="naveen";
			pstmt.setString(1, name);
			pstmt.setInt(2, 23);
			pstmt.setInt(3, 50000);
			pstmt.setString(4, "EEE");
			pstmt.setString(5, "B.Tech");
			int value = pstmt.executeUpdate(query);
			if (value >= 1) {
				System.out.println("Data Inserted");
			} else {
				System.out.println("Error!!!!");
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
