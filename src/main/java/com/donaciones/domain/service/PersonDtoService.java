package com.donaciones.domain.service;

import com.donaciones.domain.PersonDto;
import com.donaciones.domain.repository.PersonDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonDtoService {

    @Autowired
    private PersonDtoRepository personDtoRepository;

    public List<PersonDto> getAll(){

        return personDtoRepository.getAll();
    }

    public Optional<PersonDto> getById(int idPerson){

        return personDtoRepository.getById(idPerson);
    }

    public PersonDto save (PersonDto personDto){

        return  personDtoRepository.save(personDto);
    }

    public boolean delete (int idPerson){

        return getById(idPerson).map(personDto -> {
            personDtoRepository.delete(idPerson);
            return true;
        }).orElse(false);
    }
}
