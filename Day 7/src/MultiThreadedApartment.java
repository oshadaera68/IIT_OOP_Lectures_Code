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
        Thread t2 = new Thread(r1, "Thread02");
        t2.start();

        Thread t3 = new Thread(() -> {
            /*
             * Implementation of runnable interface
             *`override the run method
             *
             */
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "Hello world");
            }

        }, "Thread03");
        t3.start();
    }
}