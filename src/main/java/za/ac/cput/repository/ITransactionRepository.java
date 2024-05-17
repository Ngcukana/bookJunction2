package za.ac.cput.repository;


import za.ac.cput.domain.Transaction;


public interface ITransactionRepository {
    public static TransactionRepository repository = null;


    Transaction create(Transaction transactiont);

    Transaction read(String transactionID);

    Transaction read(int transactionID);

    Transaction update(Transaction transaction);
}
