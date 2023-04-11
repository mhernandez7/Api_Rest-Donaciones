package com.donaciones.domain.repository;

import com.donaciones.domain.FoodDto;

import java.util.List;
import java.util.Optional;

public interface FoodDtoRepository {

    List<FoodDto> getAll();
    Optional<FoodDto> getById(int idFood);
    Optional<List<FoodDto>> getByIdPerson(int idPerson);
    FoodDto save (FoodDto foodDto);
    void delete (int idFood);
}
