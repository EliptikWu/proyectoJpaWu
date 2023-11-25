package DonacionesWu.domain.mapping.dto;

import DonacionesWu.domain.enums.PaymentType;

public record TransactionDto(Integer idTransaction,
                             PaymentType payment,
                             Double amount,
                             String user) {
}
