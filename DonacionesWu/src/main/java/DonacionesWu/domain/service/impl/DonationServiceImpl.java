package DonacionesWu.domain.service.impl;

import DonacionesWu.domain.entities.Donation;
import org.springframework.stereotype.Service;
import DonacionesWu.domain.repositories.DonationRepository;
import DonacionesWu.domain.service.DonationService;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService {
    private final DonationRepository repository;

    public DonationServiceImpl(DonationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Donation> list() {
        return (List<Donation>)repository.findAll();
    }

    @Override
    public Donation byId(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Donation save(Donation donation) {
        return repository.save(donation);
    }

    @Override
    public Donation delete(Donation donation) {
        return repository.save(donation);
    }
}
