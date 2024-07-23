package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Book;
import za.ac.cput.repository.BookRepository;

import java.util.List;

@Service
public class BookService implements IBookService{

    private static IBookService service=null;
    @Autowired
    private BookRepository repository;


    private BookService(){

    }

    public static IBookService getService() {
        if (service == null){
            service = new BookService();
        }
        return service;
    }

    @Override
    public Book create(Book book) {
        return repository.save(book);
    }

    @Override
    public Book read(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public Book update(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> getall() {
        return repository.findAll();
    }

}
