package za.ac.cput.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Buyer;
import za.ac.cput.domain.Seller;
import za.ac.cput.factory.BuyerFactory;
import za.ac.cput.factory.SellerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.service.BuyerServiceTest.*;

class SellerServiceTest {
    private SellerService sellerService;
    private static Seller seller1;
    private static Seller seller2;


    void setup(){
        seller1 = SellerFactory.createSeller("lizo","lucky@gmail.com","0633915467");
        assertNotNull(seller1);
        System.out.println(seller1);
        seller2 = SellerFactory.createSeller("Zintle", "zintle@gmail.com","0835965950");
        assertNotNull(seller2);
        System.out.println(seller2);
    }
    @Test
    void create() {
        Seller created1 = (Seller) sellerService.create(seller1);
        assertNotNull(created1);
        System.out.println(created1);
        Seller created2 = (Seller) sellerService.create(seller2);
        assertNotNull(created2);
        System.out.println(created2);
    }

    @Test
    void read() {
        Seller read = (Seller) sellerService.read(seller1.getEmail());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Seller newSeller = new Seller.Builder().copy(seller2).setname("Zinathi").build();
        Seller updated = (Seller) sellerService.update(newSeller);
        assertNotNull(updated);
        System.out.println(updated);

    }

    @Test
    void getall() {
        List<Seller> all = (List<Seller>) sellerService.getall();
    }
}
