package za.ac.cput.service;

import za.ac.cput.domain.Location;

import java.util.List;

public interface ILocationService extends IService<Location, String>{
    List<Location> getall();
}
