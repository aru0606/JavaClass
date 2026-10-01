package multithreading;

public class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 200; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		t1.setName("T1");
		ThreadDemo t2 = new ThreadDemo();
		t2.setName("T2");
//		System.out.println(Thread.currentThread().getName());
		t1.start();
		t2.start();
		for (int i = 0; i < 200; i++) {
			System.out.println("Main Thread");
		}
		
		
	}
}
