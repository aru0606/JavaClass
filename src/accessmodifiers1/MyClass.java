package accessmodifiers1;

public class MyClass {
	public static void main(String[] args) {
		AccessDemo1 a = new AccessDemo1();
		
		a.one(); //default
		a.two(); //private
		a.three(); //protected
		a.four(); //public
	}
}
