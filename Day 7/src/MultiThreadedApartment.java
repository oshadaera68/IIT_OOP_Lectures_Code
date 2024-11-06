/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class MultiThreadedApartment {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        Thread t1 = new MyThread("Thread01");
        t1.start();

        Runnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();

    }


}
