/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Child implements Runnable{
    private Plate plate;

    public Child(Plate plate) {
        this.plate = plate;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String food = plate.consumeFood();
            System.out.println(Thread.currentThread().getName() + ": Consumed food: " +food);
        }
    }
}
