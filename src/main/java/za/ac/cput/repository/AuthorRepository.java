package za.ac.cput.repository;

import za.ac.cput.domain.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AuthorRepository implements IAuthorRepository{
    private static AuthorRepository repository = null;
    private List<Author> AuthorList;
    private AuthorRepository() {
        AuthorList = new ArrayList<>();
    }

    public static IAuthorRepository getRepository() {
        if (repository == null) {
            repository = new AuthorRepository();
        }
        return repository;
    }

    @Override
    public List<Author> getAll() {
        return AuthorList;
    }

    @Override
    public Author create(Author object) {
        if (AuthorList.add(object)) {
            return object;
        }
        return null;
    }

    @Override
    public Author read(Long aLong) {
        for (Author author : AuthorList) {
            if (Objects.equals(author.getAuthorID(), author)) {
            }
            return author;
        }
        return null;
    }

    @Override
    public Author update(Author object) {
        Author existingAuthor = read(object.getAuthorID());
        if (existingAuthor != null) {
            AuthorList.remove(existingAuthor);
            AuthorList.add(object);
            return object;
        }
        return null;
    }