package com.donaciones.domain.service;

import com.donaciones.domain.ToyDto;
import com.donaciones.domain.repository.ToyDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToyDtoService {

    @Autowired
    private ToyDtoRepository toyDtoRepository;

    public List<ToyDto> getAll(){
        return  toyDtoRepository.getAll();
    }

    public Optional<ToyDto> getById(int idToy) {

        return toyDtoRepository.getById(idToy);
    }
    public Optional<List<ToyDto>> getByIdPerson(int idPerson){

        return toyDtoRepository.getByIdPerson(idPerson);
    }
    public ToyDto save (ToyDto toyDto){

        return toyDtoRepository.save(toyDto);
    }
    public boolean delete (int idToy){

        return getById(idToy).map(toyDto -> {
            toyDtoRepository.delete(idToy);
         return true;
        }).orElse(false);
    }
}
