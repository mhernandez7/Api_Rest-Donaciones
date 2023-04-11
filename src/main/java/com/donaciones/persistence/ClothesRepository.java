package com.donaciones.persistence;

import com.donaciones.domain.ClothesDto;
import com.donaciones.domain.repository.ClothesDtoRepository;
import com.donaciones.persistence.crud.ClothesCrudRepository;
import com.donaciones.persistence.entity.Clothes;
import com.donaciones.persistence.mapper.ClothesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClothesRepository implements ClothesDtoRepository {

    @Autowired
    private ClothesCrudRepository clothesCrudRepository;

    @Autowired
    private ClothesMapper mapper;

    @Override
    public List<ClothesDto> getAll() {
        List<Clothes> clothess = (List<Clothes>) clothesCrudRepository.findAll();
        return mapper.toclothessDto(clothess);
    }

    @Override
    public Optional<ClothesDto> getById(int idClothes) {
        return clothesCrudRepository.findById(idClothes).map(clothes -> mapper.toclothesDto(clothes));
    }

    @Override
    public Optional<List<ClothesDto>> getByIdPerson(int idPerson) {
        List<Clothes> clothess = (List<Clothes>) clothesCrudRepository.findByIdPerson(idPerson);
        return Optional.of(mapper.toclothessDto(clothess));
    }

    @Override
    public ClothesDto save(ClothesDto clothesDto) {
        Clothes clothes = mapper.toClothes(clothesDto);
        return mapper.toclothesDto(clothesCrudRepository.save(clothes));
    }

    @Override
    public void delete(int idClothes) {
        clothesCrudRepository.deleteById(idClothes);
    }
}
