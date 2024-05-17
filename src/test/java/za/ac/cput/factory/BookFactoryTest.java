package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Buyer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookFactoryTest {

    @Test
    void createBook() {
        long bookID = 2256;
        String ISBN = "ISBN-10 3-88053-108-0";
        String title = "Java programming";
        String edition = "ninth editition";
        Double price = 1258.99;
        String datePosted = "13/04/2024";

        Book book = BookFactory.createBook(bookID,ISBN,title,edition,price,datePosted);

        Assertions.assertNotNull(book);
        System.out.println(book.toString());

    }
}