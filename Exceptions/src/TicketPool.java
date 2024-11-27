import java.util.LinkedList;
import java.util.Queue;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class TicketPool {
    private final int maximumTicketCapacity;
    private final Queue<Ticket> ticketQuene;

    public TicketPool(int maximumTicketCapacity) {
        this.maximumTicketCapacity = maximumTicketCapacity;
        this.ticketQuene = new LinkedList<>();
    }

    public synchronized void addTicket(Ticket ticket) {
        while (ticketQuene.size() >= maximumTicketCapacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
