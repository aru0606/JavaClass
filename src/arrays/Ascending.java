package arrays;

public class Ascending {
	public static void main(String[] args) {
		int array[] = { 50, 30, 20, 40, 10 };
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {   //i = 0  j =4
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Ascending order:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
