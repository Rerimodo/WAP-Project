package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    List<Person> findAll();
    Optional<Person> findById(int id);
    List<Person> findByCountry(Country country);
    List<Person> findByName(String name);

    List<Person> findAllByBirthdateLesserThanEqual(sql.Date birthDate);
    List<Person> findAllByBirthdateThanEqual(sql.Date birthDate);

    List<Person> findAllByHeightLesserThanEqual(int height);
    List<Person> findAllByHeightGreaterThanEqual(int height);
    List<Person> findAllByWeightLesserThanEqual(int weight);
    List<Person> findAllByWeightGreaterThanEqual(int weight);
}