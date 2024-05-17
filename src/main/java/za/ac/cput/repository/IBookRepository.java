package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Book;

import java.util.List;

public interface IBookRepository extends IRepository<Book, Long> {
    List<Book> getAll();
}
