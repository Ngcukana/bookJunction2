package za.ac.cput.service;

import za.ac.cput.domain.BookAuthor;

import java.util.List;

public interface IBookAuthorService extends IService<BookAuthor,String> {
    List<BookAuthor> getall();
}

