package DonacionesWu.domain.entities;

import DonacionesWu.domain.enums.PaymentType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTransaction;
    @Enumerated(EnumType.STRING)
    public PaymentType payment;
    public Double amount;
    public String user;

}
