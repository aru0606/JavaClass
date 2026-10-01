package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		
		long alStart = System.currentTimeMillis();
		for (int i = 0; i < 99999; i++) {
			alist.add(1,999);
		}
		long alEnd = System.currentTimeMillis();
		
		long alDuration = alEnd - alStart;
		
		
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(1);
		llist.add(2);
		llist.add(3);
		
		long llStart = System.currentTimeMillis();
		for (int i = 0; i < 99999; i++) {
			llist.add(1,999);
		}
		long llEnd = System.currentTimeMillis();
		
		long llDuration = llEnd - llStart;
		
		System.out.println("Duration of Arraylist: "+alDuration);
		System.out.println("Duration of Linkedlist: "+llDuration);
		
	}
}
