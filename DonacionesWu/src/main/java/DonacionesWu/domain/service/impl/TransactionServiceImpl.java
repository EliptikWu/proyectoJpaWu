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
    public void save(Transaction t) {
         repository.save(t);
    }

    @Override
    public void delete(int id) {

    }
}
