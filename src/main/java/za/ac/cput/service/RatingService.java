package za.ac.cput.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.Rating;
import za.ac.cput.repository.RatingRepository;

import java.util.List;

@Service
public class RatingService implements IRatingService {

    private static IRatingService service = null;
    private RatingRepository repository;

    @Autowired
    private RatingService(){}
    public static IRatingService getService() {
        if (service == null){
            service = new RatingService();
        }
        return service;
    }

    @Override
    public Rating create(Rating obj) {
        return repository.save(obj);
    }

    @Override
    public Rating read(String reviewId) {
        return repository.findByReviewID(reviewId);    }

    @Override
    public Rating update(Rating obj) {
        return repository.save(obj);
    }

    @Override
    public List<Rating> getall() {
        return repository.findAll();
    }
}
