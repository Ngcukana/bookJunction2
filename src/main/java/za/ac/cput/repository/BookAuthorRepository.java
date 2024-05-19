package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Author;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.BookAuthor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public interface BookAuthorRepository extends JpaRepository<BookAuthor, String> {
    BookAuthor findByBookAuthorID(String bookAuthor);
}