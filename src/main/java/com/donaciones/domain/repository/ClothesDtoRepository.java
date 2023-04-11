package com.donaciones.domain.repository;

import com.donaciones.domain.ClothesDto;

import java.util.List;
import java.util.Optional;

public interface ClothesDtoRepository {

    List<ClothesDto> getAll();

    Optional<ClothesDto>getById(int idClothes);

    Optional<List<ClothesDto>> getByIdPerson(int idPerson);

    ClothesDto save (ClothesDto clothesDto);

    void delete (int idClothes);
}
