package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
	
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/studentdbs";
		String username = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println("Database Connected Successfully!");

			Statement stmt = con.createStatement();

			String query = "INSERT INTO student VALUES('Reen',21,50000,'EEE','BE')";

			 int value = stmt.executeUpdate(query);

			if(value >= 1) {
				System.out.println("Data Inserted");
			}else {
				System.out.println("Error!!!!");
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
