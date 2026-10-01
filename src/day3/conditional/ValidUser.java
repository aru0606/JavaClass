package day3.conditional;

public class ValidUser {
	public static void main(String[] args) {
		String name = "arundhathi";
		int pass = 060306;
		if (name.equals("arundhathi") && pass == 060306) {
			System.out.println("Login Successfull");
		} else if (name.equals("arundhathi")) {
			System.out.println("Wrong Pass");
		} else {
			System.out.println("User not Found");
		}
	}
}
