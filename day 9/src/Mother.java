/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Mother implements Runnable{
    private Plate plate;

    public Mother(Plate plate) {
        this.plate = plate;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            plate.serve("Food added: "+i);
            System.out.println(Thread.currentThread().getName() + ": Served food: "+i);
        }
    }
}
