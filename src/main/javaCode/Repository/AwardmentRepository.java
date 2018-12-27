package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AwardmentRepository extends CrudRepository<Awardment, Integer> {

    List<Awardment> findAll();
    List<Awardment> findByPersonAndAward(Person person, Award award);
    List<Awardment> findByPersonAndSeason(Person person, Season season);
    List<Awardment> findByAwardAndSeason(Award award, Season season);

}