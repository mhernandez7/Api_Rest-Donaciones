package com.donaciones.domain.service;

import com.donaciones.domain.FoodDto;
import com.donaciones.domain.repository.FoodDtoRepository;
import com.donaciones.persistence.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodDtoService {

    @Autowired
    private FoodDtoRepository foodDtoRepository;

    public List<FoodDto> getAll(){

        return foodDtoRepository.getAll();
    }
    public Optional<FoodDto> getById(int idFood){

        return  foodDtoRepository.getById(idFood);
    }
    public Optional<List<FoodDto>> getByIdPerson(int idPerson){
        return  foodDtoRepository.getByIdPerson(idPerson);
    }

    public FoodDto save (FoodDto foodDto){
        return  foodDtoRepository.save(foodDto);
    }

    public Boolean delete (int idFood){

        return getById(idFood).map(foodDto -> {
            foodDtoRepository.delete(idFood);
            return true;
        }).orElse(false);
    }

}
