package inheritance2;

public class ClassA {
	int a;
	
	public void methodA() {
		System.out.println("From ClassA");
	}
	
	public static void one() {
		
	}
	
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.methodA();
		ClassA.one();
	}
}
