package za.ac.cput.service;


import za.ac.cput.domain.Cart;

import java.util.List;

public interface ICartService extends IService<Cart,String> {
    List<Cart> getall();
}
