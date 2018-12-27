package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SeasonRepository extends CrudRepository<Season, Integer> {

    List<Season> findAll();
    Optional<Season> findById(int id);

    List<Season> findAllByStartLesserThanEqual(sql.Date start);
    List<Season> findAllByStartGreaterThanEqual(sql.Date start);
    List<Season> findAllByEndLesserThanEqual(sql.Date end);
    List<Season> findAllByEndGreaterThanEqual(sql.Date end);

    @Query("select s from Season as s where s.start >= ?1 and s.end <= ?2")
    List<Season> findBetweenDates(sql.Date start, sql.Date end);
}




