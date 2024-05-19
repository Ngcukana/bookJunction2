package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {

    Rating findByReviewID(String reviewID);

}
