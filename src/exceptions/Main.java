package exceptions;

public class Main {
	public static void main(String[] args) {
		try {
			ValidationClass.ageValidator(20);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}
}
