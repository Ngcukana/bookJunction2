package za.ac.cput.factory;

import za.ac.cput.domain.Buyer;
import za.ac.cput.util.Helper;

import java.util.Collections;

public class BuyerFactory {
    public static <ProcessHandleImpl> Buyer createBuyer(String name, String email, String phoneNumber) {
        Object List = new Object();
        double Book = 0;
        ProcessHandleImpl interestedBooks = null;
        if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(interestedBooks.toString())) {

            return null;
        }
        return new Buyer.Builder()
                .setname(name)
                .setemail(email)
                .setphoneNumber(phoneNumber)
                .setinterestedBooks(Collections.singletonList(interestedBooks))
                .build();
    }
}
