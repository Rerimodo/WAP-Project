package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AwardRepository extends CrudRepository<Award, Integer> {

    List<Award> findAll();
    Optional<Award> findById(int id);
    Optional<Award> findByAwardname(String name);

}