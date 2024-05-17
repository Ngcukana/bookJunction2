package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Buyer;
import za.ac.cput.domain.Seller;

import java.util.ArrayList;
import java.util.List;

class SellerFactoryTest {

    @Test
    public void testCreateSellerFactory() {
        // Test case
        String name = "Zubenathi Smith";
        String email = "zube@gmail.com";
        String phoneNumber = "123456234";
        List<Book> BooksForSale = new ArrayList<>();

        // Create the Seller using the factory

        Seller seller = SellerFactory.createSeller(name, email, phoneNumber, BooksForSale);

        // Assertions
        Assertions.assertNotNull(seller);
        Assertions.assertEquals(name, seller.getName());
        Assertions.assertEquals(email, seller.getEmail());
        Assertions.assertEquals(phoneNumber, seller.getPhoneNumber());
        Assertions.assertEquals(BooksForSale, seller.getBooksForSale());
        System.out.println(seller.toString());


    }
}
