package day3.conditional;

public class NestedIf {
	public static void main(String[] args) {
		//variable = (condition) ? value_if_true : value_if_false;
		
		int a = 15;
		
		String result = (a % 2 == 0) ? "Even" : "Odd"; //ternary operator
		
		System.out.println(result);
		
		//nested if
		//Salary Bonus
		int experiance = 3;
		int leavePerMonth = 0;
		
		if(experiance>=2) {
			if(leavePerMonth<=1) {
				System.out.println("Congradulations you got the bonus!!!");
			}else {
				System.out.println("Sorry you took more than 1 leave per month");
			}
		}else {
			System.out.println("Sorry you dont have enough experiance!!");
		}
		
//		if((experiance>=2)&&(leavePerMonth<=1)) {
//			System.out.println("Congradulations you got the bonus!!!");
//		}else {
//			System.out.println("Sorry better luck next time :(");
//		}
		
		
	}
}
