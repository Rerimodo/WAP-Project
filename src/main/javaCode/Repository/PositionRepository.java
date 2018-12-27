package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PositionRepository extends CrudRepository<Position, Integer> {

    List<Position> findAll();
    Optional<Position> findById(int id);
    Optional<Position> findByShortname(String shortName);
    Optional<Position> findByPosname(String posName);
}