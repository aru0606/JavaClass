package exceptions;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b[] = { 1, 5, 7, 9 };
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println(a / 2);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			scan.close();
			System.out.println("This will always work!!");
		}
		

		System.out.println("Hello World!!");
	}
}