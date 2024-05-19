package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Buyer;
import za.ac.cput.factory.BuyerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuyerServiceTest {
    private BuyerService buyerService;
    private static Buyer buyer1;
    private static Buyer buyer2;


    void setup(){
        buyer1 = BuyerFactory.createBuyer("Lucky","mkhetyevalucky@gmail.com","0633917535");
        assertNotNull(buyer1);
        System.out.println(buyer1);
        buyer2 = BuyerFactory.createBuyer("Zintle", "zintle@gmail.com","0835965950");
        assertNotNull(buyer2);
        System.out.println(buyer2);
    }
    @Test
    void create() {
        Buyer created1 = (Buyer) buyerService.create(buyer1);
        assertNotNull(created1);
        System.out.println(created1);
        Buyer created2 = (Buyer) buyerService.create(buyer2);
        assertNotNull(created2);
        System.out.println(created2);
    }

    @Test
    void read() {
        Buyer read = (Buyer) buyerService.read(buyer1.getEmail());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Buyer newBuyer = new Buyer.Builder().copy(buyer2).setname("Zipho").build();
        Buyer updated = (Buyer) buyerService.update(newBuyer);
        assertNotNull(updated);
        System.out.println(updated);

    }

    @Test
    void getall() {
        List<Buyer> all = (List<Buyer>) buyerService.getall();
    }
}