package za.ac.cput.factory;


import za.ac.cput.domain.Transaction;
import za.ac.cput.util.Helper;

public class TransactionFactory {
    public static Transaction createTransaction(int transactionID, int ISBN, int sellerID, int buyerID, String transactionDate, int quantity, double totalPayment, String transactionStatus
) {
        if (Helper.isNullOrEmpty(String.valueOf(transactionID)) || Helper.isNullOrEmpty(String.valueOf(ISBN))
                || Helper.isNullOrEmpty(String.valueOf(sellerID)) || Helper.isNullOrEmpty(String.valueOf(buyerID)) || Helper.isNullOrEmpty(transactionDate)
                || Helper.isNullOrEmpty(String.valueOf(quantity)) ||  Helper.isNullOrEmpty(String.valueOf(totalPayment)) ||  Helper.isNullOrEmpty(transactionStatus))
            return null;

        return new Transaction.Builder().setTransactionID(transactionID)
                .setISBN(ISBN)
                .setSellerID(sellerID)
                .setBuyerID(buyerID)
                .setTransactionDate(transactionDate)
                .setQuantity(quantity)
                .setTotalPayment(totalPayment)
                .setTransactionStatus(transactionStatus)
                .build();
    }
}



