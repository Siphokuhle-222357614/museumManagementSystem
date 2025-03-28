package za.ac.cput;



import za.ac.cput.domain.Ticket;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Ticket ticket = new Ticket.Builder()
                .setTicketID(01)
                .setVisitorID("0000")
                .setExhibitionID("EGO")
                .setPurchaseDate(LocalDate.now()) // Current date
                .setTicketType("Adult")
                .setPrice(20.00)
                .setExpiryDate(LocalDate.now().plusDays(30))
                .build();

        System.out.println(ticket);
    }
}
