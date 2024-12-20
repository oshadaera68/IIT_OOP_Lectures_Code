/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Main {
    public static void main(String[] args) {
        TicketPool ticketPool = new TicketPool(10);

        Vendor[] vendors = new Vendor[10];
        for (int i = 0; i < vendors.length; i++) {
            vendors[i] = new Vendor(20, 5, ticketPool);
            Thread vendorThread = new Thread(vendors[i], "Vendor ID-" + i);
            vendorThread.start();
        }

        Customer[] customers = new Customer[10]; // Creating array of customers
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(ticketPool, 6, 5); // Retrieve tickets
            Thread customerThread = new Thread(customers[i], "Customer ID-" + i);
            customerThread.start();
        }

    }
}
