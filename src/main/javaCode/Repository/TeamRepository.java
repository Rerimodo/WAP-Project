package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TeamRepository extends CrudRepository<Team, Integer> {

    List<Team> findAll();
    Optional<Team> findById(int id);
    Optional<Team> findByName(String name);
    List<Team> findByDivision(Division division);
    List<Team> findByCity(City city);
    List<Team> findByArena(Arena arena);

    List<Team> findAllByFoundationdateLesserThanEqual(sql.Date foundationDate);
    List<Team> findAllByFoundationdateGreaterThanEqual(sql.Date foundationDate);
    List<Team> findAllByEntrydateLesserThanEqual(sql.Date entryDate);
    List<Team> findAllByEntrydateGreaterThanEqual(sql.Date entryDate);
}




