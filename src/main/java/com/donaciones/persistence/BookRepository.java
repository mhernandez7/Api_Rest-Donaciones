package com.donaciones.persistence;

import com.donaciones.domain.BookDto;
import com.donaciones.domain.repository.BookDtoRepository;
import com.donaciones.persistence.crud.BookCrudRepository;
import com.donaciones.persistence.entity.Book;
import com.donaciones.persistence.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository implements BookDtoRepository {

    @Autowired
    private BookCrudRepository bookCrudRepository;
    @Autowired
    private BookMapper mapper;

    @Override
    public List<BookDto> getAll() {
        List<Book> books = (List<Book>)  bookCrudRepository.findAll();
        return mapper.toBooksDto(books);
    }

    @Override
    public Optional<BookDto> getById(int idBook) {
        return bookCrudRepository.findById(idBook).map(books -> mapper.toBookDto(books));
    }

    @Override
    public Optional<List<BookDto>> getByIdPerson(int idPerson) {
        List<Book> books = (List<Book>) bookCrudRepository.findByIdPerson(idPerson);
        return Optional.of(mapper.toBooksDto(books));
    }

    @Override
    public BookDto save(BookDto bookDto) {
        Book book = mapper.toBook(bookDto);
        return mapper.toBookDto(bookCrudRepository.save(book));
    }

    @Override
    public void delete(int idBook) {
        bookCrudRepository.deleteById(idBook);

    }
}
