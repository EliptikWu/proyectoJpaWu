package DonacionesWu.domain.service.impl;


import DonacionesWu.domain.entities.Person;
import DonacionesWu.domain.mapping.dto.PersonDto;
import DonacionesWu.domain.mapping.mappers.PersonMapper;
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
    public List<PersonDto> list() {
        List<Person> person = (List<Person>) repository.findAll();
        List<PersonDto> personDto = PersonMapper.mapFrom(person);
        return personDto;
    }

    @Override
    public PersonDto byId(int id) {
        Person person = repository.findById(id).orElseThrow();
        PersonDto personDto = PersonMapper.mapFrom(person);
        return personDto;
    }

    @Override
    public void save(PersonDto t) {
        Person person = PersonMapper.mapFrom(t);
        repository.save(person);
    }

    @Override
    public void delete(int id) {

    }
}