package arrays;

import java.util.Scanner;

public class SumOfDiagonals {
	public static void main(String args[]) {
		int b[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the value of array");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) { // i = 0
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					sum += b[i][j];
				}
			}

		}
		System.out.println("sum of diagonal:" + sum);
	}
}
