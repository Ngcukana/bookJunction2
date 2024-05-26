package za.ac.cput.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Book;
import za.ac.cput.factory.BookFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private final String BASE_URL ="http://localhost:8080/bookjunction/book";

    private static Book book;

    @BeforeAll
    public static void setup(){
        book = BookFactory.createBook(2124,"124-7572-7836-09","Software Engineering", "4th", 456.98,"12/05/2024");
    }

    @Test
    void create() {
        String url = BASE_URL +"/create";
        ResponseEntity<Book> postResponse = restTemplate.postForEntity(url, book, Book.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }

    @Test
    void read() {
        String url = BASE_URL +"/read/" + book.getTitle();
        System.out.println("URL: " + url);
        ResponseEntity<Book> response = restTemplate.getForEntity(url,Book.class);
        assertEquals(book.getTitle(), response.getBody().getTitle());
        System.out.println("Read: " + response.getBody());
    }

    @Test
    void update() {
        String url = BASE_URL + "/update";
        Book newBook = new Book.Builder().copy(book).setEdition("6th").build();
        ResponseEntity<Book> postResponse = restTemplate.postForEntity(url, newBook, Book.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Book bookUpdated = postResponse.getBody();
        assertEquals(newBook.getBookID(), bookUpdated.getBookID());
        System.out.println("Updated Field: " +bookUpdated);
    }

    @Test
    void getall() {
        String url = BASE_URL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show all: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}