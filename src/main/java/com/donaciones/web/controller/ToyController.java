package com.donaciones.web.controller;

import com.donaciones.domain.ToyDto;
import com.donaciones.domain.service.ToyDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/juguetes")
public class ToyController {

    @Autowired
    private ToyDtoService toyDtoService;

    @GetMapping("/all")
    public ResponseEntity<List<ToyDto>> getAll(){

        return new ResponseEntity<>(toyDtoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idToy}")
    public ResponseEntity<ToyDto> getById(@PathVariable("idToy") int idToy){
        return toyDtoService.getById(idToy)
                .map(toyDto -> new ResponseEntity<>(toyDto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }
    @GetMapping("/person/{idPerson}")
    public ResponseEntity<List<ToyDto>> getByIdPerson(@PathVariable("idPerson")int idPerson){
        return toyDtoService.getByIdPerson(idPerson)
                .map(toyDtos -> new ResponseEntity<>(toyDtos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<ToyDto> save(@RequestBody ToyDto toyDto){

        return new ResponseEntity<>(toyDtoService.save(toyDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete (@PathVariable("id") int idToy){

        if(toyDtoService.delete(idToy)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
