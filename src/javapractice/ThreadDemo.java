package javapractice;

import java.util.Iterator;

public class ThreadDemo extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 200; i++) {
			System.out.println("T1 thread");
			
		}
		}
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		t1.setName("T1");
		System.out.println(Thread.currentThread().getName());
		t1.start();
		for (int i = 0; i < 200; i++) {
			System.out.println("Main Thread");
			
		}
	}
	}
	


