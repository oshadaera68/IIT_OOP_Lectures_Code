/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Customer implements Runnable {
    private final TicketPool ticketPool;
    private final int customerRetrieveRate;
    private final int quantity;

    public Customer(TicketPool ticketPool, int customerRetrieveRate, int quantity) {
        this.ticketPool = ticketPool;
        this.customerRetrieveRate = customerRetrieveRate;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        for (int i = 0; i < quantity; i++) {
            Ticket ticket = ticketPool.buyTicket(); // Call the method to buy tickets
            System.out.println("Ticket is: " + ticket + " - bought by: " + Thread.currentThread().getName());
            try {
                Thread.sleep(customerRetrieveRate * 1000L); // Retrieving delay
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
