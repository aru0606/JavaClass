package regex;

public class RegexDemo {
	public static void main(String[] args) {

		String number = "12345";

		boolean result = number.matches("\\d+");

		System.out.println(result);
		
	}
}
