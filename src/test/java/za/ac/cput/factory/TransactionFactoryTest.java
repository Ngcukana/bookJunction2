package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class TransactionFactoryTest {

    @Test
    void createTransaction() {
        int transactionID = 7643;
        int ISBN = 8754;
        int sellerID = 2548;
        int buyerID = 6376;
        String transactionDate = "09:02:2024";
        int quantity = 1;
        double totalPrice = 1690;
        String transactionStatus = "Pending";



        Transaction transaction = TransactionFactory.createTransaction(transactionID,ISBN,sellerID,buyerID,transactionDate,quantity,totalPrice,transactionStatus);

        Assertions.assertNotNull(transaction);
        Assertions.assertEquals(transactionID, transaction.getTransactionID());
        Assertions.assertEquals(ISBN, transaction.getISBN());
        Assertions.assertEquals(sellerID, transaction.getSellerID());
        Assertions.assertEquals(buyerID, transaction.getBuyerID());
        Assertions.assertEquals(transactionDate, transaction.getTransactionDate());
        Assertions.assertEquals(quantity, transaction.getQuantity());
        Assertions.assertEquals(totalPrice, transaction.getTotalPayment());
        Assertions.assertEquals(transactionStatus, transaction.getTransactionStatus());
        System.out.println(transaction.toString());
    }
    }
