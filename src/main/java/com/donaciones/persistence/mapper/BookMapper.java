package com.donaciones.persistence.mapper;

import com.donaciones.domain.BookDto;
import com.donaciones.persistence.entity.Book;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PersonMapper.class})
public interface BookMapper {

    @Mapping(source = "personB", target = "personDto")
    BookDto toBookDto (Book book);
    List<BookDto> toBooksDto( List<Book> books);
    @InheritInverseConfiguration
    Book toBook (BookDto bookDto);
}
