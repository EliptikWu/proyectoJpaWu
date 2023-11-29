package DonacionesWu.domain.service;

import DonacionesWu.domain.entities.Donation;
import DonacionesWu.domain.entities.Person;
import DonacionesWu.domain.mapping.dto.PersonDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    List<PersonDto> list();
    PersonDto byId(int id);
    void save(PersonDto t);
    void delete(int id);
}
