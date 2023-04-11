package com.donaciones.persistence.crud;

import com.donaciones.persistence.entity.Clothes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClothesCrudRepository extends CrudRepository<Clothes, Integer> {

    List<Clothes> findByIdPerson(int idPerson);
}
