package DonacionesWu.domain.repositories;

import DonacionesWu.domain.entities.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction,Integer> {
}