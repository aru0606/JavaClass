package pattern;

public class ReverseNumberTriangle {
	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {     //i = 3, j=1,2,3,4
//							//5 <= 2
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(" ");
//			}			    // <= 3
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++){
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
