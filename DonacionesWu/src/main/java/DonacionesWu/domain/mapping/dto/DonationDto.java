package DonacionesWu.domain.mapping.dto;

import DonacionesWu.domain.enums.PaymentType;
import DonacionesWu.domain.enums.TransactionType;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record DonationDto(Integer idDonation,
                          LocalDate date,
                          String name,
                          Double amount,
                          PaymentType payment,

                          TransactionType transactionT) {
}
