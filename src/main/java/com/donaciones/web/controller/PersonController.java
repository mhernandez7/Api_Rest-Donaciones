package com.donaciones.web.controller;

import com.donaciones.domain.PersonDto;
import com.donaciones.domain.service.PersonDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donante")
public class PersonController {
    @Autowired
    private PersonDtoService personDtoService;

    @GetMapping("/all")
    public ResponseEntity<List<PersonDto>> getAll(){

        return new ResponseEntity<>(personDtoService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{idPerson}")
    public ResponseEntity<PersonDto> getById(@PathVariable("idPerson") int idPerson){

        return personDtoService.getById(idPerson)
                .map(personDto -> new ResponseEntity<>(personDto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<PersonDto> save (@RequestBody PersonDto personDto){
        return new ResponseEntity<>(personDtoService.save(personDto), HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{idPerson}")
    public ResponseEntity delete (@PathVariable("idPerson") int idPerson){

        if(personDtoService.delete(idPerson)){
            return new ResponseEntity(HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
