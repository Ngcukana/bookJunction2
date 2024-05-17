package za.ac.cput.factory;

import za.ac.cput.domain.Book;
import za.ac.cput.domain.Category;
import za.ac.cput.util.Helper;

public class BookFactory {
    public static Book createBook(long bookID, String ISBN, String title, String edition, Category category, Double price, String datePosted){
        if (Helper.isNullOrEmpty(String.valueOf(bookID)) || Helper.isNullOrEmpty(ISBN) || Helper.isNullOrEmpty(title)
            || Helper.isNullOrEmpty(edition) || Helper.isNullOrEmpty(String.valueOf(category))
            || Helper.isNullOrEmpty(String.valueOf(price)) || Helper.isNullOrEmpty(datePosted))
            return null;

        return new Book.Builder().setBookID(bookID)
                .setISBN(ISBN)
                .setTitle(title)
                .setEdition(edition)
                .setCategory(category)
                .setPrice(price)
                .setDatePosted(datePosted)
                .build();
    }

}
