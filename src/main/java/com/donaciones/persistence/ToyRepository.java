package com.donaciones.persistence;

import com.donaciones.domain.ToyDto;
import com.donaciones.domain.repository.ToyDtoRepository;
import com.donaciones.persistence.crud.ToyCrudRepository;
import com.donaciones.persistence.entity.Toy;
import com.donaciones.persistence.mapper.ToyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ToyRepository implements ToyDtoRepository {

    @Autowired
    private ToyCrudRepository toyCrudRepository;

    @Autowired
    private ToyMapper mapper;
    @Override
    public List<ToyDto> getAll() {

        List<Toy> toys = (List<Toy>) toyCrudRepository.findAll();
        return mapper.toToys(toys);
    }
    @Override
    public Optional<ToyDto> getById(int idToy) {

        return toyCrudRepository.findById(idToy).map(toy -> mapper.toToy(toy));
    }
    @Override
    public Optional<List<ToyDto>> getByIdPerson(int idPerson) {
        List<Toy> toys = toyCrudRepository.findByIdPerson(idPerson);
        return Optional.of(mapper.toToys(toys));
    }
    @Override
    public ToyDto save(ToyDto toyDto) {

        Toy toy = mapper.toToy(toyDto);
        return mapper.toToy(toyCrudRepository.save(toy));
    }
    @Override
    public void delete(int idToy) {
        toyCrudRepository.deleteById(idToy);
    }
}
