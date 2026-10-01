package arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 10, 50, 80, 50, 30 };
		int[] b = new int[a.length];
		int index = 0;

		for (int i = 0; i < a.length; i++) {   //i = 4
			boolean found = false;
								//2
			for (int j = 0; j < index; j++) {  // index 3
				if (a[i] == b[j]) {
					found = true;
					break; // Stop searching once found
				}
			}

			if (!found) {
				// 2
				b[index++] = a[i];
			}
		}

		System.out.println("Array after removing duplicates:");
		for (int i = 0; i < index; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
