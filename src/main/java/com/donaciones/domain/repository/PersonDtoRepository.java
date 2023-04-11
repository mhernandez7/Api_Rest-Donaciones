package com.donaciones.domain.repository;

import com.donaciones.domain.PersonDto;
import com.donaciones.persistence.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonDtoRepository {

    List<PersonDto> getAll();
    Optional<PersonDto> getById(int idPerson);
    PersonDto save (PersonDto personDto);
    void delete (int idPerson);
}
