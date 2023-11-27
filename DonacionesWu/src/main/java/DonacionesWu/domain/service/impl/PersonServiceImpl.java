package DonacionesWu.domain.service.impl;


import DonacionesWu.domain.entities.Person;
import org.springframework.stereotype.Service;
import DonacionesWu.domain.repositories.PersonRepository;
import DonacionesWu.domain.service.PersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> list() {
        return (List<Person>)repository.findAll();
    }

    @Override
    public Person byId(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(Person t) {
         repository.save(t);
    }

    @Override
    public void delete(int id) {

    }
}