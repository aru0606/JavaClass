package oops;

public class MyClass {

	int x; // Instance variable
	boolean value;
	int y;

	public MyClass() { // Constructor
		this.x = 0;
		this.value = false;
		this.y = 0;
	}

	public static void main(String[] args) {
		// Classname ref = new Classname();
		int a = 10;
		MyClass mc1 = new MyClass(); // Instance
		// Constructor call
		MyClass mc2 = new MyClass();
		mc1.x = 20;
		mc1.value = true;
		System.out.println(mc1.x);
		System.out.println(mc1.value);
		
		mc2.x = 50;
		
		System.out.println(mc2.x);
		System.out.println(mc2.value);

	}

}
