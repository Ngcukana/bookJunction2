package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Author;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.BookAuthor;
import za.ac.cput.factory.BookAuthorFactory;
import za.ac.cput.factory.BookFactory;

import static org.junit.jupiter.api.Assertions.*;

class BookAuthorServiceTest {
    private BookAuthorService bookAuthorService;
    private static BookAuthor bookAuthor1;
    private static BookAuthor bookAuthor2;


    @Test
    void getService() {
        bookAuthor1 = BookAuthorFactory.buildBookAuthor("331243","221324",2235);
        assertNotNull(bookAuthor1);
        System.out.println(bookAuthor1);
        bookAuthor2 = BookAuthorFactory.buildBookAuthor("331244", "221325",2236);
        assertNotNull(bookAuthor2);
        System.out.println(bookAuthor2);
    }

    @Test
    void create() {
        BookAuthor created1 = bookAuthorService.create(bookAuthor1);
        assertNotNull(created1);
        System.out.println(created1);
        BookAuthor created2 = bookAuthorService.create(bookAuthor2);
        assertNotNull(created2);
        System.out.println(created2);
    }

    @Test
    void read() {
        BookAuthor read = bookAuthorService.read(bookAuthor1.getBookAuthorID());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        BookAuthor newBookAuthor = new BookAuthor.Builder().copy(bookAuthor2).setBookAuthorID(331245).build();
        BookAuthor updated = bookAuthorService.update(newBookAuthor);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getall() {System.out.println(bookAuthorService.getall());}
    }
