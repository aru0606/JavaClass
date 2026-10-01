package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mark1 = 99;
		int mark2 = 100;
		int mark3 = 98;
		int mark4 = 35;
		int mark5 = 60;

		int mark[] = { 99, 100, 98, 35, 60 };

		System.out.println(mark[3]);
		System.out.println("Enter size of the Array");
		int size = scan.nextInt();
		int a[] = new int[size];
//		a[0] = 10;
//		a[1] = 50;

//		for (int i = 0; i < a.length; i++) {
//			a[i] = i+1;
//		}

//		for (int i = 0; i < mark.length; i++) {
//			System.out.println(mark[i]);
//		}

		System.out.println("Enter the values for array: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("Even numbers: ");
	}
}
