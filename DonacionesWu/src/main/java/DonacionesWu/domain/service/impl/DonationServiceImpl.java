package DonacionesWu.domain.service.impl;

import DonacionesWu.domain.entities.Donation;
import DonacionesWu.domain.mapping.dto.DonationDto;
import DonacionesWu.domain.mapping.mappers.DonationMapper;
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
    public List<DonationDto> list() {
        List<Donation> donation = (List<Donation>) repository.findAll();
        List<DonationDto> donationDto = DonationMapper.mapFrom(donation);
        return donationDto;
    }

    @Override
    public DonationDto byId(int id) {
        Donation donation = repository.findById(id).orElseThrow();
        DonationDto donationDto = DonationMapper.mapFrom(donation);
        return donationDto;
    }

    @Override
    public void save(DonationDto t) {
        Donation donation = DonationMapper.mapFrom(t);
        repository.save(donation);
    }

    @Override
    public void delete(int id) {
    }
}
