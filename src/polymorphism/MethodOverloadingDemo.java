package polymorphism;

public class MethodOverloadingDemo {
		
	public void one() {
		System.out.println("From one method");
	}

	public void one(int a) {
		System.out.println("Value of A is :" + a);
	}
	
	public void one(int a, int b) {
		System.out.println("Value of A is :" + a);
		System.out.println("Value of B is :" + b);
	}
	
	
	public void one(double a, int b) {
		System.out.println("Value of A is :" + a);
		System.out.println("Value of B is :" + b);
	}
	
	
	public void one(double a, double b) {
		System.out.println("Value of A is :" + a);
		System.out.println("Value of B is :" + b);
	}

	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();	
		m.one();
		m.one(50);
		m.one(10,20);
		m.one(5.27, 19);
		m.one(12, 19.7);
	}
}