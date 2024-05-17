package za.ac.cput.repository;

import za.ac.cput.domain.Cart;

public interface ICartRepository {
    Cart create(Cart cart);

    Cart read(String cartId);

    Cart read(int cartId);

    Cart update(Cart cart);
}
