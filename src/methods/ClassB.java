package methods;

public class ClassB {

	public static void one() { // Without parameter without return type
		System.out.println("This is from method One");
	}

	public static int add() { // Without parameter with return type
		int a = 10;
		int b = 20;

		return a + b;
	}

	public static void square(int a) { // With parameter without return type
		System.out.println("Squear of a: " + (a * a));
	}

	public static int areaOfRectangle(int l, int b) { // with parameter with return type
		return l * b;
	}

	public static void main(String[] args) {
		one();
		System.out.println("Hi everyone!!!");
		one();

		int result = add();

		System.out.println(result);
//		System.out.println(add());

		square(25);

		int result2 = areaOfRectangle(10, 5);
		System.out.println("Area of Rectangle: " + result2);
	}

}