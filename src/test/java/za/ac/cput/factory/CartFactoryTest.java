package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Cart;

import static org.junit.jupiter.api.Assertions.*;

class CartFactoryTest {

    @Test
    void createCart() {
         int cartId = 34657;
         int userId = 5432;
         int bookId = 2548;
         int quantity = 2;
         double price = 346.25;
        double totalPrice = 567;


        Cart cart = CartFactory.createCart(cartId,userId,bookId,quantity,price,totalPrice);

        Assertions.assertNotNull(cart);
        Assertions.assertEquals(cartId, cart.getCartId());
        Assertions.assertEquals(userId, cart.getUserId());
        Assertions.assertEquals(bookId, cart.getBookId());
        Assertions.assertEquals(quantity, cart.getQuantity());
        Assertions.assertEquals(price, cart.getPrice());
        Assertions.assertEquals(totalPrice, cart.getPrice());
        System.out.println(cart.toString());
    }
}