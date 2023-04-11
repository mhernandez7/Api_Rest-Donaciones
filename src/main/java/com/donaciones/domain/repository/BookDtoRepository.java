package com.donaciones.domain.repository;

import com.donaciones.domain.BookDto;

import java.util.List;
import java.util.Optional;

public interface BookDtoRepository {

    List<BookDto> getAll();
    Optional<BookDto> getById(int idBook);
    Optional<List<BookDto>> getByIdPerson(int idPerson);
    BookDto save (BookDto bookDto);
    void delete (int idBook);

}
