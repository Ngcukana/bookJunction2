package za.ac.cput.factory;

import za.ac.cput.domain.Book;
import za.ac.cput.domain.Buyer;
import za.ac.cput.util.Helper;

import java.util.List;

public class BuyerFactory {
  public static Buyer createBuyer(String name, String email, String phoneNumber, List<Book>interestedBooks){
      Object List = new Object();
      double Book = 0;
      if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(email)
              || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(interestedBooks.toString()))  {

          return null;
      }
      return new Buyer.Builder()
              .name(name)
              .email(email)
              .phoneNumber(phoneNumber)
              .interestedBooks(interestedBooks)
              .build();
  }
}
