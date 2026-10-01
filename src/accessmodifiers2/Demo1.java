package accessmodifiers2;

import accessmodifiers1.AccessDemo1;

public class Demo1 extends AccessDemo1{

	public static void main(String[] args) {
		Demo1 d = new Demo1();
//		d.one();//default
//		d.two();//private
		d.three();//protected
		d.four();//public
	}
	
}
