package arrays;

import java.util.Scanner;

public class TwoDimArray {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of array: ");

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		int min = a[0][0];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				if (min > a[i][j]) {
					min = a[i][j];
				}
			}
		}
		
		System.out.println("The minimum number is: "+min);
	}
}
