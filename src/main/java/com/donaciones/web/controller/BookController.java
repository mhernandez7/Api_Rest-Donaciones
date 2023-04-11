package com.donaciones.web.controller;

import com.donaciones.domain.BookDto;
import com.donaciones.domain.service.BookDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("libros")
public class BookController {

    @Autowired
    private BookDtoService bookDtoService;

    @GetMapping("/all")
    public ResponseEntity<List<BookDto>> getAll(){

        return new ResponseEntity<>(bookDtoService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{idBook}")
    public ResponseEntity<BookDto> getById(@PathVariable("idBook") int idBook){

        return bookDtoService.getById(idBook)
                .map(bookDto -> new ResponseEntity<>(bookDto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/donante/{idPerson}")
    public ResponseEntity<List<BookDto>> getByIdPerson(@PathVariable("idPerson") int idPerson){

        return bookDtoService.getByIdPerson(idPerson)
                .map(bookDto -> new ResponseEntity<>(bookDto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<BookDto> save (@RequestBody BookDto bookDto){

        return new ResponseEntity<>(bookDtoService.save(bookDto), HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{idBook}")
    public ResponseEntity<BookDto> delete (@PathVariable("idBook") int idBook){

        if(bookDtoService.delete(idBook)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
