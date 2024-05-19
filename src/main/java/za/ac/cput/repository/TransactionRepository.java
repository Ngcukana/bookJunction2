package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
    Transaction findByTransactionDate(String transactionDate);
}
