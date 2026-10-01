package inheritance;

public class Daughter extends Father {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println(d.money);
		
		d.property();
	}
}
