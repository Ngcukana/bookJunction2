package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.Transaction;
import za.ac.cput.repository.BookRepository;
import za.ac.cput.repository.TransactionRepository;

import java.util.List;

public class TransactionService implements ITransactionService{
    private static ITransactionService service=null;
    private TransactionRepository repository;

    @Autowired
    private TransactionService(){

    }

    public static ITransactionService getService() {
        if (service == null){
            service = new TransactionService();
        }
        return service;
    }

    @Override
    public Transaction create(Transaction transaction) {
        return repository.save(transaction);
    }

    @Override
    public Transaction read(String transactionDate) {
        return repository.findByTransactionDate(transactionDate);
    }

    @Override
    public Transaction update(Transaction transaction) {
        return repository.save(transaction);
    }

    @Override
    public List<Transaction> getall() {
        return repository.findAll();
    }

}
