package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Integer> {

    List<Country> findAll();
    Optional<Country> findById(int id);
    Optional<Country> findByCountryname(String name);

}