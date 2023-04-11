package com.donaciones.persistence.mapper;

import com.donaciones.domain.PersonDto;
import com.donaciones.persistence.entity.Person;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {



    @Mapping(source = "addres", target = "addresDto")
    PersonDto toPerson (Person person);
    List<PersonDto> toPersons(List<Person> persons);
    @InheritInverseConfiguration
    @Mapping(target = "toys", ignore = true)
    @Mapping(target = "foods", ignore = true)
    @Mapping(target = "books", ignore = true)
    @Mapping(target = "clothess", ignore = true)
    Person toPersonDto (PersonDto personDto);

}
