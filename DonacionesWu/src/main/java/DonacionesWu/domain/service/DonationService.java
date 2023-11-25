package DonacionesWu.domain.service;

import DonacionesWu.domain.entities.Donation;

import java.util.List;

public interface DonationService {

  List<Donation> list();
  Donation byId(int id);

  Donation save(Donation donation);
  Donation delete(Donation donation);
}
