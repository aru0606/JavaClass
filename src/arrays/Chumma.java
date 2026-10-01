package arrays;

import java.util.Scanner;

public class Chumma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt(); // 20
		int a[] = new int[size];
//		a[1] = 20;
//		a[6] = 15;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Value for index "+i);
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
