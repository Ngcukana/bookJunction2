package za.ac.cput.repository;

import za.ac.cput.domain.Buyer;

import java.util.List;

public interface IBuyerRepository extends IRepository<Buyer, String> {
    List<Buyer> getAll();

}

