/*Author: Yanga Jilaji
 * Due Date: 28 March 2015*/
package za.ac.cput.util;

import java.time.LocalDate;
import java.util.Date;

public class Helper {

    public static boolean isNullOrEmpty(String s){
        if(s.isEmpty() || s == null)
            return true;
        return false;
    }



    }

//LocateDate  = date(){
//    LocalDate date = LocalDate.of(2020, 1, 8);
//}


//public static LocalDate getDateOfOrigin(String dateOfOrigin){
//    int year = Integer.parseInt(dateOfOrigin.substring(0,2));
//    int month = Integer.parseInt(dateOfOrigin.substring(2,4));
//    int day = Integer.parseInt(dateOfOrigin.substring(4,6));
//            LocalDate date = LocalDate.of(year, month, day);
//            return date;
//}
