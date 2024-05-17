package za.ac.cput.repository;

import za.ac.cput.domain.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TransactionRepository implements ITransactionRepository {
    private static TransactionRepository repository = null;
    private List<Transaction> transactionList;

    private TransactionRepository() {
        transactionList = new ArrayList<>();
    }

    public static ITransactionRepository getRepository() {
        if (repository == null) {
            repository = new TransactionRepository();
        }
        return repository;
    }

    @Override
    public Transaction create(Transaction transactiont) {
        if (transactionList.add(transactiont)) {
            return transactiont;
        }
        return null;
    }

    @Override
    public Transaction read(String transactionID) {
        return null;
    }

    @Override
    public Transaction read(int transactionID) {
        for (Transaction transaction : transactionList) {
            if (Objects.equals(transaction.getTransactionID(), transaction)) {

            }
            return transaction;
        }

        return null;

    }
    @Override
    public Transaction update(Transaction transaction) {
        Transaction existingTransaction = read(transaction.getTransactionID());
        if (existingTransaction != null) {
            transactionList.remove(existingTransaction);
            transactionList.add(transaction);
            return transaction;
        }
        return null;
    }
}
