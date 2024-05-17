package za.ac.cput.repository;

;

import za.ac.cput.domain.Seller;

import java.util.List;

    public interface ISellerRepository {



        void addSeller(Seller seller);
        void removeSeller(Seller seller);
        List<Seller> getAllSellers();
        Seller findSellerByEmail(String email);

        Seller findSellerById(String Email);
    }

