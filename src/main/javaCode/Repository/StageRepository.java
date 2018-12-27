package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StageRepository extends CrudRepository<Stage, Integer> {

    List<Stage> findAll();
    Optional<Stage> findById(int id);
    List<Stage> findBySeason(Season season);
    List<Stage> findByStagetype(StageType stageType);

    List<Stage> findAllByStartLesserThanEqual(sql.Date start);
    List<Stage> findAllByStartGreaterThanEqual(sql.Date start);
    List<Stage> findAllByEndLesserThanEqual(sql.Date end);
    List<Stage> findAllByEndGreaterThanEqual(sql.Date end);

    @Query("select s from Stage as s where s.start >= ?1 and s.end <= ?2")
    List<Stage> findBetweenDates(sql.Date start, sql.Date end);
}




