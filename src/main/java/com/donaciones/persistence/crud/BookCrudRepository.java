package com.donaciones.persistence.crud;

import com.donaciones.persistence.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookCrudRepository extends CrudRepository<Book, Integer> {

    List<Book> findByIdPerson(int idPerson);
}
