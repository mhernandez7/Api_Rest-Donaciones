package com.donaciones.persistence.crud;

import com.donaciones.persistence.entity.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodCrudRepository extends CrudRepository<Food, Integer> {

    List<Food> findByIdPerson(int idPerson);

}
