package DonacionesWu.domain.service;

import DonacionesWu.domain.entities.Donation;
import DonacionesWu.domain.mapping.dto.DonationDto;

import java.util.List;

public interface DonationService {

  List<DonationDto> list();
  DonationDto byId(int id);

  void save(DonationDto t);
  void delete(int id);
}
