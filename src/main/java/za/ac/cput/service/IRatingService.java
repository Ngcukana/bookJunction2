package za.ac.cput.service;

import za.ac.cput.domain.Rating;

import java.util.List;

public interface IRatingService extends IService<Rating, String>{
    
    List<Rating> getall();
}
