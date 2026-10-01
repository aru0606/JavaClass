package polymorphism;

public class MethodOverriding1 {
	
	public void one() {
		System.out.println("This is from 1");
	}
	
	public static void main(String[] args) {
		MethodOverriding2.two();
	}
}
