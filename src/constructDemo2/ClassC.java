package constructDemo2;

public class ClassC extends ClassB {
	int a, b, c, d;

	public ClassC(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}

	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		ClassC c = new ClassC(10, 20, 30, 40);
//		classC c1 = new ClassC();
		System.out.println();
	}

}
