package day3.conditional;

public class ScolarShip {
	public static void main(String[] args) {
		int annualIncome = 200000;
		int averageMark = 95; 
		int attendance = 70;
		
		if(annualIncome<=300000) {
			if(averageMark>=90) {
				if(attendance>=85) {
					System.out.println("Congradulations you won the scolarship");
				}else {
					System.out.println("Your attendance is low");
				}
			}else {
				System.out.println("Your average mark is low");
			}
		}else {
			System.out.println("Your annual income is higher");
		}
	}
}
