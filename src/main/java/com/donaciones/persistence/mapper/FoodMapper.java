package com.donaciones.persistence.mapper;

import com.donaciones.domain.FoodDto;
import com.donaciones.persistence.entity.Food;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PersonMapper.class})
public interface FoodMapper {

    @Mappings({
            @Mapping(source = "personF",target = "personDto")
    })
    FoodDto toFoodDto (Food food);
    List<FoodDto> toFoodsDto (List<Food> foods);
    @InheritInverseConfiguration
    Food toFood (FoodDto foodDto);
}
