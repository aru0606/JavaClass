package javatutorial;

enum Shapes {
	CIRCLE, SQUARE, TRIANGLE;
}

public class EnumDemo {
	public static void main(String[] args) {
		Shapes s = Shapes.SQUARE;
		if (s == Shapes.CIRCLE) {
			System.out.println("no sides");
		}
		if (s == Shapes.SQUARE) {
			System.out.println("foursides");
		}
		if (s == Shapes.TRIANGLE) {
			System.out.println("three sides");
		}
		if(s==Shapes.SQUARE) {
			System.out.println("Fivesides");
		}
		System.out.println(s.ordinal());
		
	}
}
