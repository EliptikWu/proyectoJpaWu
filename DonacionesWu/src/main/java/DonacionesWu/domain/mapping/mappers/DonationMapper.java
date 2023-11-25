package DonacionesWu.domain.mapping.mappers;

import DonacionesWu.domain.entities.Donation;
import DonacionesWu.domain.mapping.dto.DonationDto;

public class DonationMapper {
    public static DonationDto mapFrom(Donation source){
        return new DonationDto(source.getIdDonation(),
                source.getDate(),
                source.getDonorName(),
                source.getPerson(),
                source.getTransaction()
                );
    }
    public static Donation mapFrom(DonationDto source){
        return new Donation(source.idDonation(),
                source.date(),
                source.donorName(),
                source.person(),
                source.transaction()
        );
    }
}
