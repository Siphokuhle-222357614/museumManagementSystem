
/*Aunthor: Bonke Bulana - 220539995
 * Due Date: 28-03-25*/
package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.regex.Pattern;

public class Helper {

    public static boolean isNullOrEmpty(String str) {
        if(str.isEmpty() || str == null){
          return false;
        }

    public static boolean isValidEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if(email == null)
            return false;
        return pattern.matcher(email).matches();
    }

//    public static boolean isValidEmail(String email) {
//        EmailValidator emailValidator = EmailValidator.getInstance();
//        if(emailValidator.isValid(email)){
//            return true;
//    }else{
//            return false;
//        }

//    public static boolean isValidEmail(String email) {
//        if(email == null) {
//            System.out.println("Email is invalid" + email);
//            return false;
//        }
//        EmailValidator emailValidator = EmailValidator.getInstance();
//        return emailValidator.isValid(email);
        //ToDo
        //throw new UnsupportedOperationException();
    }
