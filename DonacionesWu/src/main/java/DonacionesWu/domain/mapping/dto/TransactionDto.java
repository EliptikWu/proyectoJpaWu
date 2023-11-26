package DonacionesWu.domain.mapping.dto;

import DonacionesWu.domain.enums.PaymentType;

public record TransactionDto(Integer idTransaction,
                             String nameF,
                             String gmailF) {
}
