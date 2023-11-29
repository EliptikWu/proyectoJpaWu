package DonacionesWu.domain.mapping.mappers;

import DonacionesWu.domain.entities.Donation;
import DonacionesWu.domain.mapping.dto.DonationDto;

import java.util.List;
import java.util.stream.Collectors;

public class DonationMapper {
    public static DonationDto mapFrom(Donation source){
        return new DonationDto(source.getIdDonation(),
                source.getDate(),
                source.getName(),
                source.getAmount(),
                source.getPayment(),
                source.getTransactionT()
                );
    }
    public static Donation mapFrom(DonationDto source){
        return new Donation(source.idDonation(),
                source.date(),
                source.name(),
                source.amount(),
                source.payment(),
                source.transactionT()
        );
    }
    public static List<DonationDto> mapFrom(List<Donation> source){
        return source.stream().map(DonationMapper::mapFrom).collect(Collectors.toList());
    }

}
