package lesson9.problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    Queue<Ticket> queue;
    int nextId;

    public TicketingSystem() {
        queue = new LinkedList<>();
        nextId = 1;
    }

    public void addTicket(String description) {
        if (description == null || description.isEmpty()) return;
        Ticket ticket = new Ticket(nextId++, description);
        queue.add(ticket);
    }

    public Ticket processTicket() {
        if (queue.isEmpty()) return null;
        return queue.remove();
    }

    public Ticket viewNextTicket() {
        if (queue.isEmpty()) return null;
        return queue.peek();
    }
}
