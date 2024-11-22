/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Vendor implements Runnable{
    private TicketPool ticketPool;

    public Vendor(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ticketPool.addTicket("ticket" + i);
        }
    }
}
