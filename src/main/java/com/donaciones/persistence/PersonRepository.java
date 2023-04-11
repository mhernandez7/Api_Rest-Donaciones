package com.donaciones.persistence;

import com.donaciones.domain.PersonDto;
import com.donaciones.domain.repository.PersonDtoRepository;
import com.donaciones.persistence.crud.PersonCrudRepository;
import com.donaciones.persistence.entity.Person;
import com.donaciones.persistence.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonRepository implements PersonDtoRepository {

    @Autowired
    private PersonCrudRepository personCrudRepository;

    @Autowired
    private PersonMapper mapper;
    @Override
    public List<PersonDto> getAll() {
        List<Person> persons = (List<Person>) personCrudRepository.findAll();
        return mapper.toPersons(persons);
    }

    @Override
    public Optional<PersonDto> getById(int idPerson) {
        return personCrudRepository.findById(idPerson).map(person -> mapper.toPerson(person));
    }

    @Override
    public PersonDto save(PersonDto personDto) {
        Person person = mapper.toPersonDto(personDto);
        return mapper.toPerson(personCrudRepository.save(person));
    }

    @Override
    public void delete(int idPerson) {
        personCrudRepository.deleteById(idPerson);
    }
}
