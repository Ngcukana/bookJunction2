package za.ac.cput.repository;

import za.ac.cput.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookRepository implements IBookRepository{
    private static BookRepository repository = null;
    private List<Book> BookList;
    private BookRepository() {
        BookList = new ArrayList<>();
    }

    public static IBookRepository getRepository() {
        if (repository == null) {
            repository = new BookRepository();
        }
        return repository;
    }

    @Override
    public List<Book> getAll() {
        return BookList;
    }

    @Override
    public Book create(Book object) {
        if (BookList.add(object)) {
            return object;
        }
        return null;
    }

    @Override
    public Book read(Long aLong) {
        for (Book book : BookList) {
            if (Objects.equals(book.getBookID(), book)) {
            }
            return book;
        }
        return null;
    }

    @Override
    public Book update(Book object) {
        Book existingBook = read(object.getBookID());
        if (existingBook != null) {
            BookList.remove(existingBook);
            BookList.add(object);
            return object;
        }
        return null;
    }

}
