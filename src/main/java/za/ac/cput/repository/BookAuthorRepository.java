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
        AuthorList = new ArrayList<>();
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
    public BookAuthor read(Long aLong) {
        for (BookAuthor bookAuthor : BookAuthorList) {
            if (Objects.equals(BookAuthor.getBookAuthorID(), bookAuthor)) {
            }
            return bookAuthor;
        }
        return null;
    }

    @Override
    public Author update(Author object) {
        Author existingBookAuthor = read(object.getBookAuthorID());
        if (existingBookAuthor!= null) {
            BookAuthorList.remove(existingBookAuthor);
            BookAuthorList.add(object);
            return object;
        }
        return null;
    }
}
