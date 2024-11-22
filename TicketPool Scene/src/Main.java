/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Main {
    public static void main(String[] args) {
        TicketPool ticketPool = new TicketPool();

        Vendor vendor = new Vendor(ticketPool);
        Thread vendorThread = new Thread(vendor);

        Customer customer = new Customer(ticketPool);
        Thread customerThread = new Thread(customer);

        vendorThread.start();
        customerThread.start();
    }
}
