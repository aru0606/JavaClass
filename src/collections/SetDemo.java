package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();

		set.add(30);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
	System.out.println(set);
	}

}
