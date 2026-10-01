package exceptions;

public class ValidationClass {
	public static void ageValidator(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age is under 18");
		}else {
			System.out.println("You are Eligible!!!");
		}
	}
}
