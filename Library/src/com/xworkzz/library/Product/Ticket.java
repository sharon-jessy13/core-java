package com.xworkzz.library.Product;

public class Ticket {

    public int ticketId;
    public String passengerName;
    public String source;
    public String destination;
    public double fare;

    @Override
    public boolean equals(Object obj) {

        Ticket ticket = (Ticket) obj;

        if (this.ticketId == ticket.ticketId
                && this.passengerName.equals(ticket.passengerName)
                && this.source.equals(ticket.source)
                && this.destination.equals(ticket.destination)
                && this.fare == ticket.fare) {

            return true;
        }

        return false;
    }
}
