package za.ac.cput.repository;

import za.ac.cput.domain.Cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CartRepository implements ICartRepository{
    public static CartRepository repository = null;
    private List<Cart>cartList;

    private CartRepository() {
        cartList = new ArrayList<>();
    }

    public static ICartRepository getRepository() {
        if (repository == null) {
            repository = new CartRepository();
        }
        return repository;
    }

    @Override
    public Cart create(Cart cart) {
        if (cartList.add(cart)) {
            return cart;
        }
        return null;
    }

    @Override
    public Cart read(String cartId) {
        return null;
    }

    @Override
    public Cart read(int cartId) {
        for (Cart cart : cartList) {
            if (Objects.equals(cart.getCartId(), cart)) {
                return cart;
            }
        }
        return null;
    }
    @Override
    public Cart update(Cart cart) {
        Cart existingCart = read(cart.getCartId());
        if (existingCart != null) {
            cartList.remove(existingCart);
            cartList.add(cart);
            return cart;
        }
        return null;
    }

}
