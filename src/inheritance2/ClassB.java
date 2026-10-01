package inheritance2;

public class ClassB extends ClassA{
	int b;
	public void methodB() {
		System.out.println("From ClassB");
	}
	
	public static void main(String[] args) {
		ClassB cb = new ClassB();
		
		cb.methodA();
	}
}
