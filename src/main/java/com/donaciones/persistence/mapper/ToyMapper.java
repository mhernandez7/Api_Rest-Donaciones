package com.donaciones.persistence.mapper;

import com.donaciones.domain.ToyDto;
import com.donaciones.persistence.entity.Toy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PersonMapper.class})
public interface ToyMapper {

    @Mappings({

            @Mapping(source = "quantity",target = "quantityDto"),
            @Mapping(source = "person",target = "personDto")
    })
    ToyDto toToy (Toy toy);
    List<ToyDto> toToys(List<Toy> toys);
    @InheritInverseConfiguration
    Toy toToy(ToyDto toyDto);

}
