package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Rating;



class RatingFactoryTest {

    @Test
    void builder() {
        String reviewID = "SJ2";
        String firstName = "Amanda";
        String lastName ="Jacobs";
        String review = "The book is in good condition";

        Rating rate = RatingFactory.Builder(reviewID,firstName,lastName,review);
        System.out.println(rate.toString());
    }
}