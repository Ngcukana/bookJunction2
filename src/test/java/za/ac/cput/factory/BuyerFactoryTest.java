package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Buyer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuyerFactoryTest {

    @Test
    public void testCreateBuyerFactory() {
        // Test case
        String name = "Lucky Mkhetyeva";
        String email = "gatsby@gmail.com";
        String phoneNumber = "123456789";
        List<Book> interestedBooks = new ArrayList<>();

        // Create the Buyer using the factory

        Buyer buyer = BuyerFactory.createBuyer(name, email, phoneNumber,interestedBooks);

        // Assertions
        Assertions.assertNotNull(buyer);
        Assertions.assertEquals(name, buyer.getName());
        Assertions.assertEquals(email, buyer.getEmail());
        Assertions.assertEquals(phoneNumber, buyer.getPhoneNumber());
        Assertions.assertEquals(interestedBooks, buyer.getInterestedBooks());
        System.out.println(buyer.toString());

    }
}