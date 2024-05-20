package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Location;
import za.ac.cput.repository.LocationRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LocationService implements ILocationService{

    private LocationRepository repository;
    @Autowired
    LocationService(LocationRepository repository){

        this.repository= repository;
    }

    @Override
    public Location create(Location location) {
        return repository.save(location);
    }

    @Override
    public Location read(String id) {

        return repository.findById(id)

                .orElseThrow(() -> new NoSuchElementException("Location not found with id: " + id));
    }

    @Override
    public Location update(Location location) {

        return repository.save(location);
    }



    @Override
    public List<Location> getall() {

        return repository.findAll();
    }
}