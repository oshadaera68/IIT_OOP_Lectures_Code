/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class TicketPool {
    private String ticket;
    private boolean availability = false;

    public synchronized void addTicket(String ticket) {
        while (availability) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.ticket = ticket;
        this.availability = true;
        notifyAll();
        System.out.println("Ticket added: " + ticket);
    }

    public synchronized String buyTicket(String ticket) {
        while (availability) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.availability = false;
        notifyAll();
        System.out.println("Ticket added: " + ticket);
        return ticket;
    }
}
