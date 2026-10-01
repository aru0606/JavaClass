package arrays;

import java.util.Scanner;

public class SumOfRows {
	public static void main(String[] args) {
		int b[][] = new int[3][3];
		Scanner scan  = new Scanner(System.in);
		int sum;
		System.out.println("Enter the values for array");
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				b[i][j] =  scan.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			sum = 0;
			for (int j = 0; j < 3; j++) {
				sum+=b[i][j]; //sum = sum + b[i][j]
			}
			System.out.println(sum);
		}
	}
}
