package com.donaciones.domain.service;

import com.donaciones.domain.ClothesDto;
import com.donaciones.domain.repository.ClothesDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClothesDtoService {

    @Autowired
    private ClothesDtoRepository clothesDtoRepository;

    public List<ClothesDto> getAll(){
        return clothesDtoRepository.getAll();
    }

    public Optional<ClothesDto> getById(int idClothes){

        return clothesDtoRepository.getById(idClothes);
    }

    public Optional<List<ClothesDto>> getByIdPerson(int idPerson){

        return clothesDtoRepository.getByIdPerson(idPerson);
    }
    public ClothesDto save (ClothesDto clothesDto){

        return clothesDtoRepository.save(clothesDto);
    }
    public Boolean delete (int idClothes){

        return getById(idClothes).map(clothesDto -> {
            clothesDtoRepository.delete(idClothes);
            return true;
        }).orElse(false);

    }
}
