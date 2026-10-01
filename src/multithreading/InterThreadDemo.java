package multithreading;

public class InterThreadDemo implements Runnable{
	public void run() {

        synchronized (this) {

            if (Thread.currentThread().getName().equals("Thread 1")) {

                try {
                    System.out.println("Thread 1 is waiting...");
                    wait();
                    System.out.println("Thread 1 resumed...");
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

            } else {

                System.out.println("Thread 2 is notifying...");
                notify();
            }
        }
    }

    public static void main(String[] args) {

    	InterThreadDemo obj = new InterThreadDemo();

        Thread t1 = new Thread(obj, "Thread 1");
        Thread t2 = new Thread(obj, "Thread 2");

        t1.start();       

        try {
            Thread.sleep(1000);           //main thread to sleep
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        
    }
}
