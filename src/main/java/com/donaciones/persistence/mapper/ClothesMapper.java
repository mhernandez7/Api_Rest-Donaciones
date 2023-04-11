package com.donaciones.persistence.mapper;

import com.donaciones.domain.ClothesDto;
import com.donaciones.persistence.entity.Clothes;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PersonMapper.class})
public interface ClothesMapper {

    @Mapping(source = "personC", target = "personDto")
    ClothesDto toclothesDto (Clothes clothes);
    List<ClothesDto> toclothessDto (List<Clothes> clothes);
    @InheritInverseConfiguration
    Clothes toClothes (ClothesDto clothesDto);
}
