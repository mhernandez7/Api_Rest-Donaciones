package com.donaciones.persistence.crud;

import com.donaciones.persistence.entity.Toy;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToyCrudRepository extends CrudRepository<Toy, Integer> {

    List<Toy> findByIdPerson(int idPerson);
}
