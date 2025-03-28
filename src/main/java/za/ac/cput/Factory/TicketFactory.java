package za.ac.cput.Factory;

import za.ac.cput.domain.Ticket;
import java.time.LocalDate;

public class TicketFactory {

    // Method to create a standard ticket
    public static Ticket createStandardTicket(int ticketID, String visitorID, String exhibitionID, LocalDate purchaseDate) {
        return new Ticket.Builder()
                .setTicketID(ticketID)
                .setVisitorID(visitorID)
                .setExhibitionID(exhibitionID)
                .setPurchaseDate(purchaseDate)
                .setTicketType("Standard")
                .setPrice(20.00)
                .setExpiryDate(purchaseDate.plusDays(30)) // Valid for 30 days from purchase
                .build();
    }

    // Method to create a VIP ticket
    public static Ticket createVipTicket(int ticketID, String visitorID, String exhibitionID, LocalDate purchaseDate) {
        return new Ticket.Builder()
                .setTicketID(ticketID)
                .setVisitorID(visitorID)
                .setExhibitionID(exhibitionID)
                .setPurchaseDate(purchaseDate)
                .setTicketType("VIP")
                .setPrice(50.00)
                .setExpiryDate(purchaseDate.plusDays(30)) // Valid for 30 days from purchase
                .build();
    }


}