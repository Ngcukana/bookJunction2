package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Author;
import za.ac.cput.repository.AuthorRepository;
import za.ac.cput.service.AuthorRepository.AuthorRepository;

import java.util.List;
@Service

public class AuthorService implements IAuthorService{

    private static IAuthorService service=null;
    private AuthorRepository repository;

    @Autowired
    private AuthorService(AuthorRepository repository){
        this.repository = repository;
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
    public Author read(String firstName) {
        return repository.findbyFirstName(firstName);
    }

    @Override
    public Author update(Author author) {
        return repository.update(author);
    }

    @Override
    public List<Author> getall() {
        return repository.findAll();
    }

}
