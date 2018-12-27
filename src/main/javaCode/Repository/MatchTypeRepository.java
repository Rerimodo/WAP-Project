package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MatchTypeRepository extends CrudRepository<MatchType, Integer> {

    List<MatchType> findAll();
    Optional<MatchType> findById(int id);
    Optional<MatchType> findByMatchname(String name);

}