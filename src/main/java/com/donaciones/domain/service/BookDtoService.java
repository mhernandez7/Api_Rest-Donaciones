package com.donaciones.domain.service;

import com.donaciones.domain.BookDto;
import com.donaciones.domain.repository.BookDtoRepository;
import com.donaciones.persistence.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookDtoService {

    @Autowired
    private BookDtoRepository bookDtoRepository;

    public List<BookDto> getAll(){

        return bookDtoRepository.getAll();
    }

    public Optional<BookDto> getById(int idBook){

        return bookDtoRepository.getById(idBook);

    }
    public Optional<List<BookDto>> getByIdPerson(int idPerson){

        return bookDtoRepository.getByIdPerson(idPerson);
    }
    public BookDto save (BookDto bookDto){

        return  bookDtoRepository.save(bookDto);
    }
    public Boolean delete (int idBook){
        return getById(idBook).map(bookDto -> {
            bookDtoRepository.delete(idBook);
            return true;
        }).orElse(false);
    }

}
