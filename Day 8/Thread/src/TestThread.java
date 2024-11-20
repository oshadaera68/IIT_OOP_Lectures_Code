public class TestThread {
    public static void main(String []args){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());

//        System.out.println(5/0);
        Thread thread = new Thread();
        thread.start();

        MyThread myThread = new MyThread("MyTHread", new int[]{1, 2, 3, 4, 5});
        myThread.start();

        int[] anotherArray = {9, 10, 11, 12};

//        for

        MyThread anotherThread = new MyThread("AnotherThread", anotherArray);
    }
}
