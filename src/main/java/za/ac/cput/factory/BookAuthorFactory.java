package za.ac.cput.factory;

import za.ac.cput.domain.BookAuthor;
import za.ac.cput.util.Helper;

public class BookAuthorFactory {
    public static BookAuthor buildBookAuthor(String bookAuthorID, String authorID, long bookID) {
        if (Helper.isNullOrEmpty(bookAuthorID) ||
                Helper.isNullOrEmpty(authorID) ||
                Helper.isNullOrEmpty(String.valueOf(bookID)))
            return null;

        return new BookAuthor.Builder()
                .setBookAuthorID(Integer.parseInt(bookAuthorID))
                .setAuthorID(authorID)
                . setBookID(bookID)
                .build();
    }
}
