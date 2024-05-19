package za.ac.cput.factory;

import za.ac.cput.domain.Book;
import za.ac.cput.domain.Seller;
import za.ac.cput.util.Helper;

import java.util.List;


public class SellerFactory {
    public static Seller createSeller(String name, String email, String phoneNumber) {
        List<Book> BooksForSale = List.of();
        if (Helper.isNullOrEmpty(String.valueOf(name)) || Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(BooksForSale.toString())) {
                return null;
            }
            return new Seller.Builder()
                    .setname(name)
                    .setemail(email)
                    .setphoneNumber(phoneNumber)
                    .setbooksForSale(BooksForSale)
                    .build();
        }

}

