package za.ac.cput.repository;

import za.ac.cput.domain.Book;

import java.util.List;

public interface BookRepository extends IRepository<Book, Long> {
    List<Book> getAll();
}
