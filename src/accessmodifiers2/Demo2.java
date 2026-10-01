package accessmodifiers2;

import accessmodifiers1.AccessDemo1;

public class Demo2 {
	public static void main(String[] args) {
		AccessDemo1 a = new AccessDemo1();
		
//		a.one(); //default
//		a.two(); //private
//		a.three();//protected
		a.four(); //public
		
	}
}
