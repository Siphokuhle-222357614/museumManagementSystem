package za.ac.cput.util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class visitorHelper {

    public static boolean isValidEmail(String visitorEmail)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (visitorEmail == null)
            return false;
        return pattern.matcher(visitorEmail).matches();
    }

    public static boolean isPhoneNumber(String visitorPhoneNumber) {

        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(visitorPhoneNumber);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

/*
     public static String formatVisitorInfo(Visitor visitor) {
        return String.format("Visitor ID: %d, Name: %s %s, Email: %s, Phone: %s, Tickets: %d",
                visitor.getVisitorId(),
                visitor.getVisitorFirstName(),
                visitor.getVisitorLastName(),
                visitor.getVisitorEmail(),
                visitor.getVisitorPhoneNumber(),
                visitor.getTicketPurchased());
    }
*/

}

