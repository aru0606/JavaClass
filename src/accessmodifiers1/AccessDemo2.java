package accessmodifiers1;

public class AccessDemo2 extends AccessDemo1{
	public static void main(String[] args) {
		AccessDemo2 a = new AccessDemo2();
		
		a.one(); //default
		a.two(); //private
		a.three(); //protected
		a.four(); //public
	}
}
