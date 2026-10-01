package collections;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
//		int a[] = new int[5];
//		
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.remove(1);
		
		list.add(40);
		list.add(50);
		list.add(40);
		
		list.set(1, 20);
		list.add(2, 30);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		System.out.println(list);
		
		
		
		
	}
}
