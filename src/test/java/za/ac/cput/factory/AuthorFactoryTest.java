package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Author;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Seller;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthorFactoryTest {

    @Test
    void createAuthor() {
        String authorID = "221243526";
        String fisrtName = "Anathi";
        String lastName = "Mququ";
        String dateofbirth = "19921223";
        String emailAddress = "anathimququ526@gnail.com";
        String phoneNumber = "0726686746";
        String nationality = "South African";
        List<Book>  NewBook = new ArrayList<>();

        // Create the Seller using the factory

        Author author = AuthorFactory.createAuthor(authorID, firstName, lastName, dateofbirth, emailAddress, phoneNumber, nationality);

        // Assertions
        Assertions.assertNotNull(author);
        Assertions.assertEquals(authorID, author.getAuthorID());
        Assertions.assertEquals(firstName, author.getFirstName());
        Assertions.assertEquals(lastName, author.getLastName());
        Assertions.assertEquals(dateofbirth, author.getDateofbirth());
        Assertions.assertEquals(phoneNumber, author.getPhoneNumber());
        Assertions.assertEquals(nationality, author.getNationality());
        Assertions.assertEquals(NewBook, author.NewBook());
        System.out.println(author.toString());
    }
}