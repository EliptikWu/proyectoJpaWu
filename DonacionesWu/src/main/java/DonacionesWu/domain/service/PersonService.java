package DonacionesWu.domain.service;

import DonacionesWu.domain.entities.Donation;
import DonacionesWu.domain.entities.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    List<Person> list();
    Person byId(int id);
    void save(Person t);
    void delete(int id);
}
