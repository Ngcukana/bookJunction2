package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Book;
import za.ac.cput.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/Book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public Book create(@RequestBody Book book){ return bookService.create(book);}

    @GetMapping("/read/{title}")
    public Book read(@PathVariable String title){return bookService.read(title);}

    @PostMapping("/update")
    public Book update(@RequestBody Book book){return bookService.update(book);}

    @GetMapping("/getall")
    public List<Book> getall(){return bookService.getall();}

}
