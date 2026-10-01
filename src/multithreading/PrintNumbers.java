package multithreading;

public class PrintNumbers extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (Thread.currentThread().getName().equals("T1") && i <= 10) {
				System.out.println(i);
				System.out.println(Thread.currentThread().getName());
			} else if (i > 10) {
				System.out.println(i);
				System.out.println(Thread.currentThread().getName());
			}
		}
	}

	public static void main(String[] args) {
		PrintNumbers t1 = new PrintNumbers();
		t1.setName("T1");
		PrintNumbers t2 = new PrintNumbers();
		t2.setName("T2");

		t1.start();
		t2.start();
	}
}
