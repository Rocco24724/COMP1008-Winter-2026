public class Main {
    public static void main(String[] args) {
        Ticketing_Event concert = new Ticketing_Event("Rock Concert", 50.0, 2000.0);

        //Event Details
        System.out.println("=== Event Created ===");
        System.out.println("Event Name: " + concert.getEventName());
        System.out.println("Ticket Cost: $" + concert.getTicketCost());
        System.out.println("Host Cost: $" + concert.getHostCost());
        System.out.println("Attendees: " + concert.getNumberOfAttendees());
        System.out.println("Total Revenue: $" + concert.getTotalRevenue());

        //Ticket Sales pt1
        System.out.println("\n=== First Wave of Ticket Sales ===");
        concert.buyTickets(100);
        System.out.println("100 tickets sold");
        System.out.println("Attendees: " + concert.getNumberOfAttendees());
        System.out.println("Total Revenue: $" + concert.getTotalRevenue());
        
        //Ticket Sales pt2
        System.out.println("\n=== Second Wave of Ticket Sales ===");
        concert.buyTickets(75);
        System.out.println("75 more tickets sold");
        System.out.println("Attendees: " + concert.getNumberOfAttendees());
        System.out.println("Total Revenue: $" + concert.getTotalRevenue());
       
        //This is for processin refunds
        System.out.println("\n=== Processing Refunds ===");
        concert.refundTickets(25);
        System.out.println("25 tickets refunded");
        System.out.println("Attendees: " + concert.getNumberOfAttendees());
        System.out.println("Total Revenue: $" + concert.getTotalRevenue());
        
        //This calculates and displays the profit or loss
        System.out.println("\n=== Final Summary ===");
        double profit = concert.getTotalRevenue() - concert.getHostCost();
        System.out.println("Total Revenue: $" + concert.getTotalRevenue());
        System.out.println("Host Cost: $" + concert.getHostCost());
        System.out.println("Profit/Loss: $" + profit);
    }
}