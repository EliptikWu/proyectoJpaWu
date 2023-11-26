package DonacionesWu.domain.mapping.dto;

import DonacionesWu.domain.entities.Person;
import DonacionesWu.domain.entities.Transaction;
import DonacionesWu.domain.enums.PaymentType;

import java.time.LocalDate;

public record DonationDto(Integer idDonation,
                          LocalDate date,
                          String name,
                          Double amount,
                          PaymentType payment,
                          Transaction transaction) {
}
