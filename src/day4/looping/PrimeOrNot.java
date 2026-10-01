package day4.looping;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a value: ");
		int n = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {//i = i+1
			//11%1==0
			if(n%i==0) {
				count++; //count = count+1
			}
		}
		
		if(count==2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Primenumber");
		}

	}
}
