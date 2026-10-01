package encapsulation;

public class MyClass extends EncapsDemo {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		
		m.setValue(10000);
		System.out.println(m.getValue());
		
	}
}
