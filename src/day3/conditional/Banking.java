package day3.conditional;

public class Banking {
	public static void main(String[] args) {
		int experianceYear = 2;
		int salary = 5000;
		if (experianceYear >= 2) {
			if (salary >= 20000) {
				System.out.println("you got the bonus 10000");
			} else {
				System.out.println("sorry,you didn't got the bonus 10000");
			}
			if (salary <= 20000) {
				System.out.println("you got the bonus 5000");
			} else {
				System.out.println("sorry,you didn't got the bonus 5000");
			}

			if (experianceYear < 2 && salary >= 20000) {
				System.out.println("you got the bonus 2000");
			} else {
				System.out.println("sorry,you didn't got the bonus 2000");
			}}
		else {
			System.out.println("not eligible for bonus");
		}

	}
}
