public class Ticketing_Event {
    private String eventName;
    private double ticketCost;
    private int numberOfAttendees;
    private double hostCost;
    private double totalRevenue;

    //Just setting a default constructor
    public Ticketing_Event() {
        this.eventName = "";
        this.ticketCost = 0.0;
        this.numberOfAttendees = 0;
        this.hostCost = 0.0;
        this.totalRevenue = 0.0;
    }

    //Constructor that is using 3 arguments for the event name, ticket cost, and host cost
    public Ticketing_Event(String eventName, double ticketCost, double hostCost) {
        this.eventName = eventName;
        this.ticketCost = ticketCost;
        this.numberOfAttendees = 0;
        this.hostCost = hostCost;
        this.totalRevenue = 0.0;
    }

    //This is taking the number of attendees converting that to number of tickets sold and then using that to calculate total revenue
    public void buyTickets(int numberOfTickets) {
        if (numberOfTickets <= 0) return;
        this.numberOfAttendees += numberOfTickets;
        this.totalRevenue += numberOfTickets * this.ticketCost;
    }

    //This is processing refunds by reducing the number of attendnees minus that from the number of tickets and then uses that to calculate the new revenue
    public void refundTickets(int numberOfTickets) {
        if (numberOfTickets <= 0 || numberOfTickets > this.numberOfAttendees) return;
        this.numberOfAttendees -= numberOfTickets;
        this.totalRevenue -= numberOfTickets * this.ticketCost;
        if (this.totalRevenue < 0) this.totalRevenue = 0.0;
    }

    //Getters/Setters
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }

    public double getTicketCost() { return ticketCost; }
    public void setTicketCost(double ticketCost) { this.ticketCost = ticketCost; }

    public int getNumberOfAttendees() { return numberOfAttendees; }
    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = Math.max(0, numberOfAttendees);
    }

    public double getHostCost() { return hostCost; }
    public void setHostCost(double hostCost) { this.hostCost = hostCost; }

    public double getTotalRevenue() { return totalRevenue; }
    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = Math.max(0.0, totalRevenue);
    }
}