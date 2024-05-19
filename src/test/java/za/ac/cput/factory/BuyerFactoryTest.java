package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Buyer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuyerFactoryTest {

    @Test
    public void testCreateBuyerFactory() {
        // Test case
        String name = "Lucky Mkhetyeva";
        String email = "gatsby@gmail.com";
        String phoneNumber = "123456789";

        // Create the Buyer using the factory

        Buyer buyer = BuyerFactory.createBuyer(name, email, phoneNumber);

        // Assertions
        Assertions.assertNotNull(buyer);
        assertEquals(name, buyer.getName());
        assertEquals(email, buyer.getEmail());
        assertEquals(phoneNumber, buyer.getPhoneNumber());
        System.out.println(buyer.toString());
    }

}