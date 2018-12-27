package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ArenaRepository extends CrudRepository<Arena, Integer> {

    List<Arena> findAll();
    Optional<Arena> findById(int id);
    Optional<Arena> findByName(String name);
    List<Arena> findAllByCity(City city);
    List<Arena> findAllByCapacityGreaterThanEqual(int capacity);
    List<Arena> findAllByCityAndCapacityGreaterThanEqual(City city, int capacity);

}