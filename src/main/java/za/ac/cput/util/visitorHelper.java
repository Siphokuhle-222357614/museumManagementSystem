package za.ac.cput.util;
import java.util.regex.Pattern;
/*
public class visitorHelper {

    public static boolean isValidEmail(String email)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (email == null)
            return false;
        return pattern.matcher(email).matches();
    }

    public static boolean isPhoneNumber(String visitorPhoneNumber) {
        String sPhoneNumber = visitorPhoneNumber;

        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(sPhoneNumber);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

/*        // Helper method to validate email format using regex
        public static boolean isValidEmail(String email) {
            String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(emailRegex);
            return pattern.matcher(email).matches();
        }

        // Helper method to validate phone number format (simple format: digits only)
        public static boolean isValidPhoneNumber(String phoneNumber) {
            String phoneRegex = "^[0-9]{10}$";
            Pattern pattern = Pattern.compile(phoneRegex);
            return pattern.matcher(phoneNumber).matches();
        }
*/

    /*  public static String formatVisitorInfo(Visitor visitor) {
        return String.format("Visitor ID: %d, Name: %s %s, Email: %s, Phone: %s, Tickets: %d",
                visitor.getVisitorId(),
                visitor.getVisitorFirstName(),
                visitor.getVisitorLastName(),
                visitor.getVisitorEmail(),
                visitor.getVisitorPhoneNumber(),
                visitor.getTicketPurchased());
    }


}
*/
