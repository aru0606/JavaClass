package inheritance2;

public class ClassC extends ClassB{
	int c;
	public void methodC() {
		System.out.println("From ClassC");
	}
	
	public static void main(String[] args) {
		ClassC cl = new ClassC();
		
		System.out.println(cl.a);
		
		cl.methodB();
		cl.methodA();
		cl.methodC();
	}
}
