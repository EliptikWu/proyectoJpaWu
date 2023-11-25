package DonacionesWu.domain.service;

import DonacionesWu.domain.entities.Person;
import DonacionesWu.domain.entities.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> list();
    Transaction byId(int id);
    Transaction save(Transaction transaction);
    Transaction delete(Transaction transaction);
}
