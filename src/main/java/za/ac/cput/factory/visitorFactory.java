package za.ac.cput.factory;

import za.ac.cput.domain.Visitor;
import java.time.LocalDate;

public class visitorFactory {

    public static Visitor createVisitor(int visitorId, String visitorFirstName, String visitorLastName, String visitorEmail, String visitorPhoneNumber) {
        if (visitorId.isNullOrEmpty(visitorId)){
            return null;
        }
        if (Helper.isNullOrEmpty(visitorFirstName) || Helper.isNullOrEmpty(visitorLastName) || isEmpty(visitorPhoneNumber) || Helper.isNullOrEmpty(visitorEmail) || !Helper.isPhoneNumber(visitorPhoneNumber)) {
            return null;
        }

        String customerId = Helper.generateId();

        if (!Helper.isValidEmail(visitorEmail)) {
            return null;
        }

        return new Visitor.Builder()
                .visitorFirstName(visitorFirstName)
                .visitorLastName(visitorLastName)
                .visitorEmail(visitorEmail)
                .visitorPhoneNumber(visitorPhoneNumber)
                .build();

    /*
    public static Visitor createVisitor(int visitorId, String visitorFirstName, String visitorLastName, String email, String phoneNumber) {
        if (visitorFirstName == null || visitorFirstName.trim().isEmpty() ) {
            throw new IllegalArgumentException("Visitor name cannot be empty.");
        }
        if (visitorLastName == null || visitorLastName.trim().isEmpty() ) {
            throw new IllegalArgumentException("Visitor last name cannot be empty.");
        }

        if (email == null || !isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }


        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }

        return new Visitor.Builder()
                .visitorId(visitorId)
                .visitorFirstName(visitorFirstName)
                .visitorLastName(visitorLastName)
                //.email(email)
                //.phoneNumber(phoneNumber)
                .build();
    }
/*
    private static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

 */
    }

}
