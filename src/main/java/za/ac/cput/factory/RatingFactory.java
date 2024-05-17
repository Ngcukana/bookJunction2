package za.ac.cput.factory;

import za.ac.cput.domain.Rating;
import za.ac.cput.util.Helper;

public class RatingFactory {

   public static Rating Builder(String reviewID, String firstName, String lastName, String review){
       if(Helper.isNullOrEmpty(reviewID)||
       Helper.isNullOrEmpty(firstName)||
       Helper.isNullOrEmpty(lastName)||
       Helper.isNullOrEmpty(review)){
           return null;
       }
       return new Rating.Builder()
               .setReviewID(reviewID)
               .setFirstName(firstName)
               .setLastName(lastName)
               .setReview(review)
               .myBuilder();


   }

}
