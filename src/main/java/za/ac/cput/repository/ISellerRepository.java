package za.ac.cput.repository;


import za.ac.cput.domain.Seller;

import java.util.List;

public interface ISellerRepository extends IRepository<Seller, String> {
    List<Seller> getAll();
}

