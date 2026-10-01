package arrays;

import java.util.Iterator;

public class SeperateEvenOdd {
	public static void main(String[] args) {
		int num[] = { 1, 2, 4, 9, 6, 5, 7, 8, 16, 19 };
		int evenSize = 0;
		int oddSize = 0;
		int evenIndex = 0;
		int oddIndex = 0;
		// 10
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				evenSize++;
			} else {
				oddSize++;
			}
		}
		int odd[] = new int[oddSize];
		int even[] = new int[evenSize];

		for (int i = 0; i < num.length; i++) {
				 //2 inx 1
			if (num[i] % 2 == 0) {
				
				even[evenIndex] = num[i];
				evenIndex++;
			}else {
				odd[oddIndex] = num[i];
				oddIndex++;
			}
		}
		System.out.println("Even Array");
		for (int i = 0; i < even.length; i++) {
			System.out.println(even[i]);
		}
		System.out.println("Odd Array");
		for (int i = 0; i < odd.length; i++) {
			System.out.println(odd[i]);
		}
	}
}
