package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends CrudRepository<City, Integer> {

    List<City> findAll();
    Optional<City> findById(int id);
    List<City> findByCountry(Country country);
    Optional<City> findByCityname(String cityName);

}