package com.donaciones.domain.repository;

import com.donaciones.domain.PersonDto;
import com.donaciones.domain.ToyDto;
import com.donaciones.persistence.entity.Person;
import com.donaciones.persistence.entity.Toy;

import java.util.List;
import java.util.Optional;

public interface ToyDtoRepository {

    List<ToyDto> getAll();
    Optional<ToyDto> getById(int idToy);
    Optional<List<ToyDto>> getByIdPerson(int idPerson);
    ToyDto save (ToyDto toyDto);
    void delete (int idToy);
}
