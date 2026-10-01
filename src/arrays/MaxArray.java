package arrays;

public class MaxArray {
	public static void main(String[] args) {
		int a[] = { 30, 50, 10, 70, 20 };

		int max = a[0];
		// 5
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum value is: " + max);
	}
}
