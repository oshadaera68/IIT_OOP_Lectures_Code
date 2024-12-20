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

    // vendor who is the producer will call the add ticket() method
    public synchronized void addTicket(Ticket ticket) {
        while (ticketQuene.size() >= maximumTicketCapacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace(); // For CLI (command line interface)
                throw new RuntimeException(e); // For Client-Server Application
            }
        }

        this.ticketQuene.add(ticket);
        notifyAll(); //Notify all the waiting threads
        System.out.println("Ticket added by:" + Thread.currentThread().getName() + " - current size: " + ticketQuene.size());
    }

    // Customer who is the Consumer will call the buyTicket() method
    public synchronized Ticket buyTicket() {
        while (ticketQuene.isEmpty()) {
            try {
                wait(); // If queue is empty add customer to waiting status
            } catch (InterruptedException e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        Ticket ticket = ticketQuene.poll();
        notifyAll(); //Notify all the waiting threads
        System.out.println("Ticket bought by:" + Thread.currentThread().getName() + " - current size: " + ticketQuene.size() + "- Ticket is: " + ticket);
        return ticket;

    }
}
