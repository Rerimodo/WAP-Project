package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DivisionRepository extends CrudRepository<Division, Integer> {

    List<Country> findAll();
    Optional<Country> findById(int id);
    Optional<Country> findByDivname(String name);
    List<Country> findByConf(Conferention conf);

}