package DonacionesWu.domain.service.impl;

import DonacionesWu.domain.entities.Transaction;
import org.springframework.stereotype.Service;
import DonacionesWu.domain.repositories.TransactionRepository;
import DonacionesWu.domain.service.TransactionService;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository repository;

    public TransactionServiceImpl(TransactionRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Transaction> list() {
        return (List<Transaction>)repository.findAll();
    }

    @Override
    public Transaction byId(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Transaction save(Transaction transaction) {
        return repository.save(transaction);
    }

    @Override
    public Transaction delete(Transaction transaction) {
        return repository.save(transaction);
    }
}
