package arrays;

public class MergeArray {
	public static void main(String[] args) {
		int firstArray[] = { 50, 70, 60, 90, 20 };  //5
		int secondArray[] = { 40, 30, 10, 80, 45 };
		int mergeArray[] = new int[firstArray.length + secondArray.length];
		int secondIndex = 0;
		for (int i = 0; i < mergeArray.length; i++) {
				//  <5
			if (i < firstArray.length) {
				mergeArray[i] = firstArray[i];
			} else {
				mergeArray[i] = secondArray[secondIndex];
				secondIndex++;
			}

		}
		
		for (int i = 0; i < mergeArray.length; i++) {
			System.out.println(mergeArray[i]);
		}
	}
}
