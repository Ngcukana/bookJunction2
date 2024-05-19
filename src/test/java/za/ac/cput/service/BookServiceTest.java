package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Book;
import za.ac.cput.factory.BookFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookServiceTest {
    private BookService bookService;
    private static Book book1;
    private static Book book2;

    @Order(1)
    @Test
    void setup(){
        book1 = BookFactory.createBook(2234,"0-061-96436-0","Java Programming", "ninth", 1167.89, "24/;04/2024");
        assertNotNull(book1);
        System.out.println(book1);
        book2 = BookFactory.createBook(2235, "978-545-01022-1","Psychology 101","fifth", 670.00,"16/05/2024");
        assertNotNull(book2);
        System.out.println(book2);
    }

    @Order(2)
    @Test
    void create() {
        Book created1 = bookService.create(book1);
        assertNotNull(created1);
        System.out.println(created1);
        Book created2 = bookService.create(book2);
        assertNotNull(created2);
        System.out.println(created2);
    }

    @Order(3)
    @Test
    void read() {
        Book read = bookService.read(book1.getTitle());
        assertNotNull(read);
        System.out.println(read);
    }

    @Order(4)
    @Test
    void update() {
        Book newBook = new Book.Builder().copy(book2).setEdition("seventh").build();
        Book updated = bookService.update(newBook);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Order(5)
    @Test
    void getall() {
        System.out.println(bookService.getall());
    }
}