package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import za.ac.cput.domain.Cart;
import za.ac.cput.factory.CartFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CartServiceTest {
    private CartService cartService;
    private static Cart cart1;
    private static Cart cart2;

    @Order(1)
    @Test
    void setup(){
        cart1 = CartFactory.createCart(6353,92746,8346, 1, 167.89, 167.89);
        assertNotNull(cart1);
        System.out.println(cart1);
        cart2 = CartFactory.createCart(2235, 7373,8376,2, 670.00,670.00);
        assertNotNull(cart2);
        System.out.println(cart2);
    }

    @Order(2)
    @Test
    void create() {
        Cart createc1 = cartService.create(cart1);
        assertNotNull(createc1);
        System.out.println(createc1);
        Cart createc2 = cartService.create(cart2);
        assertNotNull(createc2);
        System.out.println(createc2);
    }

    @Order(3)
    @Test
    void read() {
        Cart read = cartService.read(cart1.getCartId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Order(4)
    @Test
    void update() {
        Cart newCart = new Cart.Builder().copy(cart2).setQuantity(2).build();
        Cart updated = cartService.update(newCart);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Order(5)
    @Test
    void getall() {
        System.out.println(cartService.getall());
    }
}
