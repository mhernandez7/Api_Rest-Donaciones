package com.donaciones.web.controller;

import com.donaciones.domain.ClothesDto;
import com.donaciones.domain.service.ClothesDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ropa")
public class ClothesController {

    @Autowired
    private ClothesDtoService clothesDtoService;

    @GetMapping("/all")
    public ResponseEntity<List<ClothesDto>> getAll(){
        return new ResponseEntity<>(clothesDtoService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{idClothes}")
    public ResponseEntity<ClothesDto> getById(@PathVariable("idClothes") int idClothes){

        return clothesDtoService.getById(idClothes)
                .map(clothesDto -> new ResponseEntity<>(clothesDto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/person/{idPerson}")
    public ResponseEntity<List<ClothesDto>> getByIdPerson(@PathVariable("idPerson") int idPerson){
        return clothesDtoService.getByIdPerson(idPerson)
                .map(clothesDtos -> new ResponseEntity<>(clothesDtos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<ClothesDto> save (@RequestBody ClothesDto clothesDto){
        return new ResponseEntity<>(clothesDtoService.save(clothesDto),HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{idClothes}")
    public ResponseEntity<ClothesDto> delete(@PathVariable("idClothes") int idClothes){
        if(clothesDtoService.delete(idClothes)){

            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
