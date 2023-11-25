package DonacionesWu.domain.mapping.dto;

import DonacionesWu.domain.entities.Person;
import DonacionesWu.domain.entities.Transaction;

import java.time.LocalDate;

public record DonationDto(Integer idDonation,
                          LocalDate date,
                          String donorName,
                          Person person,
                          Transaction transaction) {
}
