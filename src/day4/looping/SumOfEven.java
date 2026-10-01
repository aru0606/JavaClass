package day4.looping;

import java.util.Scanner;

public class SumOfEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = s.nextInt();
		int even = 1*2;
		for (int i = 1; i <=n; i++) {
			
			
				even+=i;  // even = even+i
						//	 	  =    0+2
//				System.out.println(even);
			}
		
		
		System.out.println(even);
	
}
}
