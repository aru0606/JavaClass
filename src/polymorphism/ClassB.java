package polymorphism;

public class ClassB {
	public void start() {
		System.out.println("From ClassB");
	}
	
	public static void main(String[] args) {
		ClassA a = new ClassA(); //Targetted Object Creation
		
		a.start();
		
	}
}
