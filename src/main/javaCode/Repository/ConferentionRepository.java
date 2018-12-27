package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ConferentionRepository extends CrudRepository<Conferention, Integer> {

    List<Conferention> findAll();
    Optional<Conferention> findById(int id);
    Optional<Conferention> findByConfname(String name);

}