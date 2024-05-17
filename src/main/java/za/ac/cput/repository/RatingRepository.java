package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.ac.cput.domain.Rating;


public interface RatingRepository extends JpaRepository <Rating, String> {

}


