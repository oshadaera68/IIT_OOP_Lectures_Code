/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate();

        Mother mother = new Mother(plate);
        Thread motherThread = new Thread(mother, "Mother thread");

        Child child = new Child(plate);
        Thread childThread = new Thread(child, "Child thread");

        motherThread.start();
        childThread.start();
    }
}
