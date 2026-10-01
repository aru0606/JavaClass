package arrays;

import java.util.Scanner;

public class SingleDArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = scan.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
