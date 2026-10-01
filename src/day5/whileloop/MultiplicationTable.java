package day5.whileloop;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
	   //Print multiplication table of a number
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Which table you want?");
	 int table = scan.nextInt(); //5
	 
	 for(int i = 1;i<=10;i++) {
		 System.out.println(i+" * "+table+" = "+(i*table));
	 }
	}
}
