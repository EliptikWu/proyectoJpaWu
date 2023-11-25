package DonacionesWu.domain.entities;

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
    public String donorName;
    @ManyToOne
    @JoinColumn(name = "idPerson")
    private Person person;
    @OneToOne
    private Transaction transaction;

}
