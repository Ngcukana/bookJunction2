package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Author;
import za.ac.cput.domain.BookAuthor;

import static org.junit.jupiter.api.Assertions.*;

class BookAuthorFactoryTest {

    @Test
    void buildBookAuthor() {
        String bookAuthorID = "221243526";
        String authorID = "Anathi";
        long bookID = 1234;

        BookAuthor bookAuthor = BookAuthorFactory.buildBookAuthor(bookAuthorID, authorID, bookID);
        Assertions.assertNotNull(bookAuthor);
        System.out.println(bookAuthor.toString());


    }
}