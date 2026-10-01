package arrays;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		int a[] = {1,5,9,8,7,12};
		int b[][] = new int[3][3];
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
//		for (int i : a) {
//			System.out.println(i);
//		}
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the values for array");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] =  scan.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
	}
}
