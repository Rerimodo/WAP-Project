package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StageTypeRepository extends CrudRepository<StageType, Integer> {

    List<StageType> findAll();
    Optional<StageType> findById(int id);
    Optional<StageType> findByAwardname(String name);

}