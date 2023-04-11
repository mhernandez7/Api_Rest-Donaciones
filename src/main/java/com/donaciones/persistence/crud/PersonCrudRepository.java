package com.donaciones.persistence.crud;

import com.donaciones.persistence.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonCrudRepository extends CrudRepository<Person, Integer > {


}
