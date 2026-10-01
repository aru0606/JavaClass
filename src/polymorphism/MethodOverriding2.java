package polymorphism;

public class MethodOverriding2 extends MethodOverriding1{
	
	public void one() {
		System.out.println("This is from 2");
	}
	
	public static void two() {
		System.out.println("This is from two method");
	}
	
	public static void main(String[] args) {
		MethodOverriding2 m =  new MethodOverriding2();
		Math.max(0, 0);
		m.one();
		MethodOverriding2.two();
	}
}
