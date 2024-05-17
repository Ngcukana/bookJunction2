package za.ac.cput.repository;

import za.ac.cput.domain.Author;
import za.ac.cput.domain.BookAuthor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookAuthorRepository implements IBookAuthorRepository {
    private static BookAuthorRepository repository = null;
    private List<BookAuthor> BookAuthorList;
    private BookAuthorRepository() {
        BookAuthorList = new ArrayList<>();
    }

    public static IBookAuthorRepository getRepository() {
        if (repository == null) {
            repository = new BookAuthorRepository();
        }
        return repository;
    }

    @Override
    public List<BookAuthor> getAll() {
        return BookAuthorList;
    }

    @Override
    public BookAuthor create(BookAuthor object) {
        if (BookAuthorList.add(object)) {
            return object;
        }
        return null;
    }

    @Override
    public BookAuthor read(String String) {
        for (BookAuthor bookAuthor : BookAuthorList) {
            if (String.equals(BookAuthor.getAuthorID(), bookAuthor)) {
            }
            return bookAuthor;
        }
        return null;
    }

    @Override
    public Author update(Author String) {
        Author existingBookAuthor = read(String.getAuthorID());
        if (existingBookAuthor!= null) {
            BookAuthorList.remove(existingBookAuthor);
            BookAuthorList.add();
            return String;
        }
        return null;
    }
}
