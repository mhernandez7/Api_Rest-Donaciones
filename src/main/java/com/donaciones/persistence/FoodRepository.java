package com.donaciones.persistence;

import com.donaciones.domain.FoodDto;
import com.donaciones.domain.repository.FoodDtoRepository;
import com.donaciones.persistence.crud.FoodCrudRepository;
import com.donaciones.persistence.entity.Food;
import com.donaciones.persistence.mapper.FoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FoodRepository implements FoodDtoRepository {
    @Autowired
    private FoodCrudRepository foodCrudRepository;
    @Autowired
    private FoodMapper mapper;

    @Override
    public List<FoodDto> getAll() {
        List<Food> foods = (List<Food>) foodCrudRepository.findAll();
        return mapper.toFoodsDto(foods);
    }

    @Override
    public Optional<FoodDto> getById(int idFood) {
        return foodCrudRepository.findById(idFood).map(food -> mapper.toFoodDto(food));
    }

    @Override
    public Optional<List<FoodDto>> getByIdPerson(int idPerson) {
        List<Food> foods = (List<Food>) foodCrudRepository.findByIdPerson(idPerson);
        return Optional.of(mapper.toFoodsDto(foods));
    }

    @Override
    public FoodDto save(FoodDto foodDto) {
        Food food = mapper.toFood(foodDto);
        return mapper.toFoodDto(foodCrudRepository.save(food));
    }

    @Override
    public void delete(int idFood) {
        foodCrudRepository.deleteById(idFood);
    }
}
