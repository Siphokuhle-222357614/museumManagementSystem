/*Aunthor: Bonke Bulana - 220539995
 * Due Date: 28-03-25*/
package za.ac.cput.factory;
import za.ac.cput.domain.Curator;

import za.ac.cput.util.Helper;

import static za.ac.cput.util.Helper.isValidEmail;

public class CuratorFactory {

    public static Curator createCurator( String firstName, String lastName, String email) {

        if(Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName))
            return null;

        if(!Helper.isValidEmail(email))
            return null;


        return new Curator.Builder().setFirstName(firstName).setLastName(lastName)
                .setEmail(email)
                .build();

    }

//    public static Curator createCurator(long curatorID, String firstName, String lastName, String email,
//                                         String phoneNumber, String specification, String hireDate) {
//
//        if(Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email))
//            return null;
//
//
//        return new Curator.Builder().setFirstName(firstName).setLastName(lastName)
//                .setEmail(email)
//                .build();
//
//    }
}
