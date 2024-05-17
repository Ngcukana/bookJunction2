package za.ac.cput.repository;

import za.ac.cput.domain.Author;

import java.util.List;

public interface IAuthorRepository extends IRepository<Author, String>{
    List<Author> getall();
}
