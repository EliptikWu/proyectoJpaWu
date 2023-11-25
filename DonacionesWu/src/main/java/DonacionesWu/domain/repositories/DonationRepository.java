package DonacionesWu.domain.repositories;

import DonacionesWu.domain.entities.Donation;
import org.springframework.data.repository.CrudRepository;

public interface DonationRepository extends CrudRepository<Donation,Integer> {
}
