/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Plate {
    private String food;
    private boolean availablity = false;

    public synchronized void serve(String food) {
        while (availablity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.food = food;
        this.availablity = true;
        notifyAll();
    }

    public synchronized String consumeFood() {
        while (!availablity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.availablity = false;
        notifyAll();
        return food;
    }

}
