package generics;

public class GenericClassMain {
	public static void main(String[] args) {
		GenericClass<Integer> gc =new GenericClass<Integer>();
		
		gc.setValue(100);
		
		System.out.println(gc.getValue());
	}
}
