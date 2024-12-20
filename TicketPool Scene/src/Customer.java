/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Customer implements Runnable{
    private TicketPool ticketPool;

    public Customer(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ticketPool.buyTicket("ticket" + i);
        }

    }
}
