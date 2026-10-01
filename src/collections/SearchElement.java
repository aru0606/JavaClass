package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		ArrayList<Integer>num=new ArrayList<Integer>();
		num.add(10);
		num.add(12);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		num.add(70);
		num.add(80);
		num.add(90);
		num.add(100);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Search Number");
		int search=sc.nextInt();
		for (int i = 0; i <num.size(); i++) {
			if(num.get(i)==search) {
				System.out.println("Element is Found");
				
			}else {
				System.out.println("Element is Not Found");
			}
		}
		
		
		
	}

}
