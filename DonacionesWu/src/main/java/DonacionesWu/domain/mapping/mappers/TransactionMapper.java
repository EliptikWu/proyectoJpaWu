package DonacionesWu.domain.mapping.mappers;

import DonacionesWu.domain.entities.Transaction;
import DonacionesWu.domain.mapping.dto.TransactionDto;

public class TransactionMapper {

    public static TransactionDto mapFrom(Transaction source){
        return new TransactionDto(source.getIdTransaction()
                , source.getNameF()
                , source.getGmailF());
    }

    public static Transaction mapFrom(TransactionDto source){
        return new Transaction(source.idTransaction()
                , source.nameF()
                , source.gmailF());
    }
}
