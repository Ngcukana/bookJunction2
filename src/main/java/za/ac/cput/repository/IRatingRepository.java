package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.ac.cput.domain.Rating;


public interface IRatingRepository extends JpaRepository <Rating, String> {

   @Override
    findBy(){

   }

}


