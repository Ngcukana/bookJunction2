package za.ac.cput.domain;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rating {
    @Id
    private String reviewID;
    private String firstName;
    private String lastName;
    private String review;

    protected Rating(){}

    private Rating(Builder myBuilder){
        this.reviewID = myBuilder.reviewID;
        this.firstName = myBuilder.firstName;
        this.lastName = myBuilder.lastName;
        this.review = myBuilder.review;

    }

    public String getReviewID() {
        return reviewID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getReview() {
        return review;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return Objects.equals(reviewID, rating.reviewID) && Objects.equals(firstName, rating.firstName) && Objects.equals(lastName, rating.lastName) && Objects.equals(review, rating.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewID, firstName, lastName, review);
    }

    @Override
    public String toString() {
        return "Rating{" +
                "reviewID='" + reviewID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
    public static class Builder{
        private String reviewID;
        private String firstName;
        private String lastName;
        private String review;

        public Builder setReviewID(String reviewID) {
            this.reviewID = reviewID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setReview(String review) {
            this.review = review;
            return this;
        }
        public Builder copy(Rating n) {
            this.reviewID = n.reviewID;
            this.firstName = n.firstName;
            this.lastName = n.lastName;
            this.review = n.review;
            return this;
        }
        public Rating myBuilder(){
            return new Rating(this);
        }
    }
}
