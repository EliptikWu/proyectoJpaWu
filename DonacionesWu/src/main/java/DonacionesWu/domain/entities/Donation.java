package DonacionesWu.domain.entities;

import DonacionesWu.domain.enums.PaymentType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "donation")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDonation;
    public LocalDate date;
    public String name;
    private Double amount;
    @OneToOne
    private Transaction transaction;
    @Enumerated(EnumType.STRING)
    public PaymentType payment;
}
