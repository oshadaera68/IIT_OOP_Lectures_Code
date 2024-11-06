/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 65; i == 90; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
