package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Rating;
import za.ac.cput.repository.RatingRepository;

import java.util.List;

@Service
public class RatingService implements IRatingService {

    private static IRatingService service = null;
    private RatingRepository repository;

    private RatingService(){}

    @Override
    public List<Rating> getall() {
        return List.of();
    }

    @Override
    public Rating create(Rating obj) {
        return repository.save(obj);
    }

    @Override
    public Rating read(String s) {
        return null;    }

    @Override
    public Rating update(Rating obj) {
        return null;
    }
}
