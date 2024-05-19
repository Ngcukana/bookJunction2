package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.cput.domain.Book;
import za.ac.cput.domain.Cart;
import za.ac.cput.repository.BookRepository;
import za.ac.cput.repository.CartRepository;

import java.util.List;

@Service
public class CartService implements ICartService {
    private static za.ac.cput.service.ICartService service=null;
    private CartRepository repository;

    @Autowired
    private CartService(){

    }

    public static ICartService getService() {
        if (service == null){
            service = new CartService();
        }
        return service;
    }

    @Override
    public Cart create(Cart cart) {
        return repository.save(cart);
    }

    @Override
    public Cart read(String cartId) {
        return repository.findByCartId(cartId);
    }

    @Override
    public Cart update(Cart cart) {
        return repository.save(cart);
    }

    @Override
    public List<Cart> getall() {
        return repository.findAll();
    }
}
