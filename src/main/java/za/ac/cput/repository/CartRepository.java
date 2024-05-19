package za.ac.cput.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Cart;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, String> {
    Cart findByCartId(String cartId);

}
