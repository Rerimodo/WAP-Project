package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StatisticsRepository extends CrudRepository<Statistics, Integer> {

    List<Statistics> findAll();
    Optional<Statistics> findById(int id);
    List<Statistics> findByTeam(Team team);
    List<Statistics> findByStage(Stage stage);

    List<Statistics> findAllByWinsLesserThanEqual(int wins);
    List<Statistics> findAllByWinsGreaterThanEqual(int wins);
    List<Statistics> findAllByLossesLesserThanEqual(int losses);
    List<Statistics> findAllByLossesGreaterThanEqual(int losses);
}




