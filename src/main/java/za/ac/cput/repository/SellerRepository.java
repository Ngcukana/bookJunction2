package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Buyer;
import za.ac.cput.domain.Seller;

    public interface SellerRepository  extends JpaRepository<Seller, String> {
        Seller findByEmail(String email);
    }


