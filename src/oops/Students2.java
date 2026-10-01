package oops;

public class Students2 {
	String name;
	int id, age;
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("id:"+id);
		System.out.println("Age:"+age);
	}
	
	// User defined constructor or Parameterized constructor
	public Students2(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public Students2() {
		this.name = null;
		this.id = 0;
		this.age = 0;
	}

	public Students2(String name, int id) {
		this.name = name;
		this.id = id;
		this.age = 20;
	}

	public static void main(String[] args) {
		Students2 raja = new Students2("Raja", 1, 20);
		Students2 arun = new Students2("Arundathi", 2);
		
		raja.display();
		arun.display();

	}
}
