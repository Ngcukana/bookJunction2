package za.ac.cput.factory;

import za.ac.cput.domain.Author;
import za.ac.cput.domain.Book;
import za.ac.cput.util.Helper;

public class AuthorFactory {
    public static Author createAuthor(String authorID, String firstName, String lastName, String dateofbirth, String emailAddress, String phoneNumber, String nationality){
        if (Helper.isNullOrEmpty(authorID) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)
                || Helper.isNullOrEmpty(dateofbirth) || Helper.isNullOrEmpty(emailAddress)
                || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(nationality))
            return null;

        return new Author.Builder()
                .setAuthorID(authorID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setDateofbirth(dateofbirth)
                .setEmailAddress(emailAddress)
                .setPhoneNumber(phoneNumber)
                .setNationality(nationality)
                .build();
    }

}

