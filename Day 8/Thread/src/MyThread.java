/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class MyThread extends Thread {

    /* private String name;*/
    private final int[] arr;

    MyThread(String name, int[] arr) {
        super(name);
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i: arr){
            System.out.println("Thread Name: " + getName() + " Value: " + Math.pow(i, 2));
        }
    }
}
