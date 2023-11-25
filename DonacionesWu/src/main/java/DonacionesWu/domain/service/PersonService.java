package DonacionesWu.domain.service;

import DonacionesWu.domain.entities.Donation;
import DonacionesWu.domain.entities.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    List<Person> list();
    Person byId(int id);
    Person save(Person person);
    Person delete(Person person);
}
