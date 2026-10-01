package day3.conditional;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String[] args) {
		// int a
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value for a: ");

		int a = s.nextInt();

		System.out.println("Enter the value for b: ");

		int b = s.nextInt();

		System.out.println("Enter the value for c: ");

		int c = s.nextInt();

		// System.out.println("The entered value is: "+a);
	//a = 6, b = 7, c = 13
		if(a>b) {
			if(a>c) {
				System.out.println("A is greater");
			}else {
				System.out.println("C is greater");
			}
		}else if(b>c) {
				System.out.println("B is greater");
			
		}else {
			System.out.println("C is greater");
		}
			
	}
}
