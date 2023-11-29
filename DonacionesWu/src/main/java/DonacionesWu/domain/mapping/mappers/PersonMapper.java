package DonacionesWu.domain.mapping.mappers;

import DonacionesWu.domain.entities.Person;
import DonacionesWu.domain.mapping.dto.PersonDto;

import java.util.List;
import java.util.stream.Collectors;

public class PersonMapper {
    public static PersonDto mapFrom(Person source){
        return new PersonDto(source.getIdPerson(),
                source.getName(),
                source.getPassword(),
                source.getGmail()
        );
    }
    public static Person mapFrom(PersonDto source){
        return new Person(source.idPerson(),
                source.name(),
                source.password(),
                source.gmail()
        );
    }
    public static List<PersonDto> mapFrom(List<Person> source){
        return source.stream().map(PersonMapper::mapFrom).collect(Collectors.toList());
    }
}
