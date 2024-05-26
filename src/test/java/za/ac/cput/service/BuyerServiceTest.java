package za.ac.cput.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import za.ac.cput.domain.Buyer;
import za.ac.cput.factory.BuyerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Sql(scripts = "classpath:schema.sql") // Optional: Add if you have an SQL schema script to set up the database schema
class BuyerServiceTest {

    @Autowired
    private BuyerService buyerService;

    private Buyer buyer1;
    private Buyer buyer2;

    @BeforeEach
    void setup() {
        buyer1 = BuyerFactory.createBuyer("Lucky", "mkhetyevalucky@gmail.com", "0633917535");
        assertNotNull(buyer1);
        System.out.println(buyer1);

        buyer2 = BuyerFactory.createBuyer("Zintle", "zintle@gmail.com", "0835965950");
        assertNotNull(buyer2);
        System.out.println(buyer2);
    }

    @Test
    void create() {
        Buyer created1 = buyerService.create(buyer1);
        assertNotNull(created1);
        System.out.println(created1);

        Buyer created2 = buyerService.create(buyer2);
        assertNotNull(created2);
        System.out.println(created2);
    }

    @Test
    void read() {
        buyerService.create(buyer1);
        Buyer read = buyerService.read(buyer1.getEmail());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        buyerService.create(buyer2);
        Buyer newBuyer = new Buyer.Builder().copy(buyer2).setName("Zipho").build();
        Buyer updated = buyerService.update(newBuyer);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getAll() {
        buyerService.create(buyer1);
        buyerService.create(buyer2);
        List<Buyer> all = buyerService.getAll();
        assertNotNull(all);
        assertFalse(all.isEmpty());
        System.out.println(all);
    }
}
