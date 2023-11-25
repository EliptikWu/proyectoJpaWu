package DonacionesWu.domain.mapping.mappers;

import DonacionesWu.domain.entities.Transaction;
import DonacionesWu.domain.mapping.dto.TransactionDto;

public class TransactionMapper {

    public static TransactionDto mapFrom(Transaction source){
        return new TransactionDto(source.getIdTransaction()
                , source.getPayment()
                , source.getAmount()
                , source.getUser());
    }

    public static Transaction mapFrom(TransactionDto source){
        return new Transaction(source.idTransaction()
                , source.payment()
                , source.amount()
                , source.user());
    }
}
