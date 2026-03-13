package lesson9.problem4;

public class Test {
    static void main() {
        TicketingSystem system = new TicketingSystem();
        System.out.println(":::::::Adding Tickets::::::::::::");
        system.addTicket("I cannot login to my account");
        system.addTicket("The payment is not processing");
        system.addTicket("The app crashes on startup");
        system.addTicket("Password reset is not working");
        system.addTicket("My order was not delivered");
        system.queue.forEach(System.out::println);
        System.out.println("\nView Next Ticket: " + system.viewNextTicket());
        system.queue.forEach(System.out::println);
        System.out.println("\nProcessing Ticket: " + system.processTicket());
        System.out.println("Processing Ticket: " + system.processTicket());
        system.queue.forEach(System.out::println);
        System.out.println("\nView Next Ticket: " + system.viewNextTicket());
        system.addTicket("My billing address is incorrect");
        system.queue.forEach(System.out::println);
    }
}
