package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Author;
import za.ac.cput.domain.Book;
import za.ac.cput.factory.AuthorFactory;
import za.ac.cput.factory.BookFactory;

import static org.junit.jupiter.api.Assertions.*;

class AuthorServiceTest {
    private AuthorService authorService;
    private static Author author1;
    private static Author author2;


    @Test
    void getService() {
        author1 = AuthorFactory.createAuthor("221243","Locus","Smayile", "10/10/1980", "", "0630265184","South African");
        assertNotNull(author1);
        System.out.println(author1);
        author2 = AuthorFactory.createAuthor("221244", "Jazz","Mei","03/03/1983","locussmayile@gmail.com","0630268451","South African");
        assertNotNull(author2);
        System.out.println(author2);
    }

    @Test
    void create() {
        Author created1 = authorService.create(author1);
        assertNotNull(created1);
        System.out.println(created1);
        Author created2 = authorService.create(author2);
        assertNotNull(created2);
        System.out.println(created2);
    }

    @Test
    void read() {
        Author read = authorService.read(author1.getAuthorID());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Author newAuthor = new Author.Builder().copy(author2).setNationality("American").build();
        Author updated = authorService.update(newAuthor);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getall() {System.out.println(authorService.getall());
    }
    }
