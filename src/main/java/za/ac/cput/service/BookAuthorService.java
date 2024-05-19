package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.BookAuthor;
import za.ac.cput.repository.BookAuthorRepository;

import java.util.List;

@Service
public class BookAuthorService implements IBookAuthorService{

    private static IBookAuthorService service=null;
    private BookAuthorRepository repository;

    @Autowired
    private BookAuthorService(){

    }

    public static IBookAuthorService getService() {
        if (service == null){
            service = new BookAuthorService();
        }
        return service;
    }

    @Override
    public BookAuthor create(BookAuthor bookAuthor) {
        return repository.save(bookAuthor);
    }

    @Override
    public BookAuthor read(String bookAuthorID) {
        return repository.findByBookAuthorID(bookAuthorID);
    }

    @Override
    public BookAuthor update(BookAuthor bookAuthor) {
        return repository.save(bookAuthor);
    }

    @Override
    public List<BookAuthor> getall() {
        return repository.findAll();
    }

}