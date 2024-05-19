package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.Author;
import za.ac.cput.repository.AuthorRepository;


import java.util.List;

public class AuthorService implements IAuthorService{

    private static IAuthorService service=null;
    private AuthorRepository repository;

    @Autowired
    private AuthorService(){

    }

    public static IAuthorService getService() {
        if (service == null){
            service = new AuthorService();
        }
        return service;
    }

    @Override
    public Author create(Author author) {
        return repository.save(author);
    }

    @Override
    public Author read(String authorID) {
        return repository.findByAuthorID(authorID);
    }

    @Override
    public Author update(Author author) {
        return repository.save(author);
    }

    @Override
    public List<Author> getall() {
        return repository.findAll();
    }

}
