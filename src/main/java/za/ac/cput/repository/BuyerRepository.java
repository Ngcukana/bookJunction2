package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import za.ac.cput.domain.Buyer;

public interface BuyerRepository  extends JpaRepository<Buyer, String> {
    Buyer findByEmail(String email);
}
