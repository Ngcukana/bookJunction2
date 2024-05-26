package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.jta.TransactionFactory;

import za.ac.cput.domain.Transaction;



import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TransactionTest {
    private TransactionService transactionService;
    private static Transaction transaction1;
    private static Transaction transaction2;

    @Order(1)
    @Test
    void setup(){
      //  transaction1 = TransactionFactory.createTrans(2234,"0-061-96436-0","Java Programming", "ninth", 1167.89, "24/;04/2024");
      //  assertNotNull(transaction1);
      //  System.out.println(transaction1);
      //  transaction2 = TransactionFactory.
                assertNotNull(transaction2);
        System.out.println(transaction2);
    }

    @Order(2)
    @Test
    void create() {
        Transaction createt1 = transactionService.create(transaction1);
        assertNotNull(createt1);
        System.out.println(createt1);
        Transaction createt2 = transactionService.create(transaction2);
        assertNotNull(createt2);
        System.out.println(createt2);
    }

    @Order(3)
    @Test
    void read() {
        Transaction read = transactionService.read(String.valueOf(transaction1.getTransactionID()));
        assertNotNull(read);
        System.out.println(read);
    }

    @Order(4)
    @Test
    void update() {
        Transaction newTransaction = new Transaction.Builder().copy(transaction2).setQuantity(2).build();
        Transaction updated = transactionService.update(newTransaction);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Order(5)
    @Test
    void getall() {
        System.out.println(transactionService.getall());
    }
}
