package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {
    Author findByAuthorID(String author);
}

