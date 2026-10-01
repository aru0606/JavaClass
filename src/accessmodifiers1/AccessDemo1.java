package accessmodifiers1;

public class AccessDemo1 {
	void one() { 	//Default
		
	}
	
	private void two() {
		
	}
	
	protected void three() {
		
	}
	
	public void four() {
		
	}
	
	public static void main(String[] args) {
		AccessDemo1 a = new AccessDemo1();
		
		a.one();  //default
		a.two();  //private
		a.three(); //protected
		a.four(); //public
	}
}
