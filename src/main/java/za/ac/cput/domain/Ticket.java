package za.ac.cput.domain;
import java.time.LocalDate;


public class Ticket {
    // Attributes
    private int ticketID;
    private String visitorID;
    private String exhibitionID;
    private LocalDate purchaseDate;
    private String ticketType; // e.g., adult, child
    private double price;
    private LocalDate expiryDate; // e.g., one-time, recurring

    public Ticket(){

    }
    // Constructor using Builder

    public Ticket(Builder builder) {
        this.ticketID = builder.ticketID;
        this.visitorID = builder.visitorID;
        this.exhibitionID = builder.exhibitionID;
        this.purchaseDate = builder.purchaseDate;
        this.ticketType = builder.ticketType;
        this.price = builder.price;
        this.expiryDate = builder.expiryDate;


        // Validation check (consider throwing exceptions for invalid values)
        if (this.price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }


    }



    // Getters

    public int getTicketID() {
        return ticketID;
    }

    public String getVisitorID() {
        return visitorID;
    }

    public String getExhibitionID() {
        return exhibitionID;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public String getTicketType() {
        return ticketType;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketID=" + ticketID +
                ", visitorID='" + visitorID + '\'' +
                ", exhibitionID='" + exhibitionID + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", ticketType='" + ticketType + '\'' +
                ", price=" + price +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }

    // Builder Pattern

    public static class Builder {
        private int ticketID;
        private String visitorID;
        private String exhibitionID;
        private LocalDate purchaseDate;
        private String ticketType;
        private double price;
        private LocalDate expiryDate;

        public Builder setTicketID(int ticketID) {
            this.ticketID = ticketID;
            return this;
        }

        public Builder setVisitorID(String visitorID) {
            this.visitorID = visitorID;
            return this;
        }

        public Builder setExhibitionID(String exhibitionID) {
            this.exhibitionID = exhibitionID;
            return this;
        }

        public Builder setPurchaseDate(LocalDate purchaseDate) {
            this.purchaseDate = purchaseDate;
            return this;
        }

        public Builder setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setExpiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }



        public Ticket build() {
            return new Ticket(this);
        }
    }
}