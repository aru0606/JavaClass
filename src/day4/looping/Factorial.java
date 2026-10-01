package day4.looping;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for n: ");
		int n = scan.nextInt();
		
		int fact = 1;
		
		for (int i = 1; i < n; i++) {
			fact*=i;
		}
		
		System.out.println(fact);
	}
}
