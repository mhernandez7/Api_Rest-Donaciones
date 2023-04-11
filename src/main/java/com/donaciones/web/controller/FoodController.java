package com.donaciones.web.controller;

import com.donaciones.domain.FoodDto;
import com.donaciones.domain.service.FoodDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alimentos")
public class FoodController {
    @Autowired
    private FoodDtoService foodDtoService;

    @GetMapping("/all")
    public ResponseEntity<List<FoodDto>> getAll(){
        return new ResponseEntity<>(foodDtoService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{idFood}")
    public ResponseEntity<FoodDto> getById(@PathVariable("idFood") int idFood){
        return  foodDtoService.getById(idFood).map(foodDto -> new ResponseEntity<>(foodDto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/donante/{idPerson}")
    public ResponseEntity<List<FoodDto>> getByIdPerson(@PathVariable("idPerson") int idPerson){

        return foodDtoService.getByIdPerson(idPerson)
                .map(foodDtos -> new ResponseEntity<>(foodDtos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<FoodDto> save (@RequestBody FoodDto foodDto){

        return new ResponseEntity<>(foodDtoService.save(foodDto), HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{idFood}")
    public ResponseEntity<FoodDto> delete (@PathVariable("idFood") int idFood){

        if (foodDtoService.delete(idFood)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }

}
