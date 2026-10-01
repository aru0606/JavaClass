package oops;

public class Students {
	String name;  //instance variable
	int age;

	public Students() {
		this.name = "Reen";
		this.age = 25;
	}

	public void one() { //instance method
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		Students raja = new Students();
		Students arun = new Students();

//		raja.name = "Raja";
//		raja.age = 20;

//		arun.name = "Arundhathi";
//		arun.age = 20;

		raja.name = "Raja";

//		System.out.println(raja.name);
//		System.out.println(raja.age);
//
//		System.out.println(arun.name);
//		System.out.println(arun.age);
//		
		raja.one();
	}
}
