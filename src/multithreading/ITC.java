package multithreading;

public class ITC implements Runnable{
	public void run() {
        synchronized (this) {

            System.out.println("Thread is waiting...");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread is running again...");
        }
    }

    public static void main(String[] args) {

        ITC obj = new ITC();

        Thread t1 = new Thread(obj);

        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (obj) {
            System.out.println("Sending notification...");
            obj.notify();
        }
    }
}