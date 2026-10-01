package day3.conditional;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		boolean extraCur = true;
		Scanner scan = new Scanner(System.in);
		int totalUnits = scan.nextInt(); //250
		int bill;
		if(totalUnits<=100) {
			bill = totalUnits*5;
		}else if(totalUnits<=200) {
			bill = (100*5)+((totalUnits-100)*7);
		}else {
			bill = (100*5)+(100*7)+((totalUnits-200)*10);
		}
		System.out.println("The total bill before tax is: "+bill);
	}
}
