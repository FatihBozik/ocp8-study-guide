package io.github.fatihbozik.ch7.questions;

class TicketManager {
    private TicketManager() {
        super();
    }

    private static TicketManager instance;

    public static synchronized TicketManager getInstance() {
        if (instance == null) {
            instance = new TicketManager();
        }
        return instance;
    }

    private int tickets;

    public int getTicketCount() {
        return tickets;
    }

    public void makeTicketsAvailable(int value) {
        tickets += value;
    }

    public void sellTickets(int value) {
        synchronized (this) {
            tickets -= value;
        }
    }
}

public class Q14 {
    public static void main(String[] args) {

    }
}
